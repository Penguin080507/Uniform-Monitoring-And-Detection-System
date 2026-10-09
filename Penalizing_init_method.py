import DBOperation
from datetime import datetime
import GenerateMessage
import EMAILSender
import os
import PDFMaker

def penaliziing_init(erp_number, id_status, shirt_status, pant_status):
    print("-"*40)
    print("erp_number = ", erp_number, "id_status = ", id_status, "shirt_status = ", shirt_status, "pant_status = ", pant_status)
    if (id_status!="yes" or shirt_status!="yes" or pant_status != "yes"):
        print("Missing")
        
        imgpath = os.path.join("Captured_images", "sending.jpg")
        
        #Calculating date time
        now = datetime.now()
        current_date = now.strftime("%d-%m-%Y")
        current_time = now.strftime("%H-%M-%S")
        current_date_time = current_date+"_"+current_time
        print("Formatted Date:", current_date)
        print("Formatted Time:", current_time)
        
        #Fetching total fine count
        total_finecount = DBOperation.fetch_penalty_count_by_erp(erp_number, current_date)
        print("total_finecount : ",total_finecount)
        
        if total_finecount < 3:
            print("Penality count is less than 3....")
            
            #adding penalty details in db
            value = DBOperation.insert_penalty(erp_number, current_date, current_time, id_status, shirt_status, pant_status, "Warning")
            if value == 1:
                
                #fetching student information
                student_info = DBOperation.fetch_student_by_erp(erp_number)       
                student_name = student_info.get("StudentName")
                parent_name = student_info.get("ParentName")
                parent_mail = student_info.get("ParentEmail")
                
                #Generating Message
                message = GenerateMessage.get_warning_message(parent_name, student_name, current_date)
                
                #creating pdf
                pdfpath = PDFMaker.create_pdf(erp_number, current_date_time, message, imgpath)
                
                #sending mail
                EMAILSender.sendEmail(parent_mail, "Uniform Code Violation Notice", pdfpath)
                
                
        else:
            print("Penality count is more than 3 ....")
            
            #fetching student information
            student_info = DBOperation.fetch_student_by_erp(erp_number)
            student_name = student_info.get("StudentName")
            parent_name = student_info.get("ParentName")
            parent_account_number = student_info.get("parentAC")
            parent_mail = student_info.get("ParentEmail")
            
            #fetching account balance
            parent_account_balance = DBOperation.fetch_account_balance(parent_account_number)
            print("Parent Account Balance:", parent_account_balance)
            
            if int(parent_account_balance) >= 50:
                
                #deducting fine from account
                DBOperation.deduct_fine_from_account(parent_account_number, "50")
                print("Fine Deducted..")
                
                #adding penalty details in db
                value = DBOperation.insert_penalty(erp_number, current_date, current_time, id_status, shirt_status, pant_status, "50 Rs Deducted")
                
                #Generating Message
                message = GenerateMessage.get_deducted_message(parent_name, student_name, current_date)
                
                #creating pdf
                pdfpath = PDFMaker.create_pdf(erp_number, current_date_time, message, imgpath)
                
                #sending mail
                EMAILSender.sendEmail(parent_mail, "Uniform Code Violation Alert – ₹50 Deducted", pdfpath)
            
            else:
                #adding penalty details in db
                value = DBOperation.insert_penalty(erp_number, current_date, current_time, id_status, shirt_status, pant_status, "50 Rs Imposed")
                
                #Generating Message
                message = GenerateMessage.get_not_deducted_message(parent_name, student_name, current_date)
                
                #creating pdf
                pdfpath = PDFMaker.create_pdf(erp_number, current_date_time, message, imgpath)
                
                #sending mail
                EMAILSender.sendEmail(parent_mail, "Uniform Code Violation Alert – ₹50 Imposed", pdfpath)
        
        #Removing Saved image
        # os.remove(imgpath)
        # 
    else:
        print("not missing")
        
# penaliziing_init("017034", "no", "no", "no")