import mysql.connector

def fetch_account_balance(account_number):
    try:
        # Connect to database
        connection = mysql.connector.connect(
            host="localhost",          # change if needed
            user="root",               # your username
            password="root",  # your password
            database="uniform"         # your schema name
        )

        cursor = connection.cursor(dictionary=True)

        # SQL Query
        query = """
        SELECT balance
        FROM bank_account_info
        WHERE account_number = %s 
        """

        cursor.execute(query, (account_number,))
        result = cursor.fetchone()
                
        if result:
            
            balance = result['balance']
            
            return balance
            
        else:
            print("No Customer Account found.")
        #print(total_finecount)
        

    except mysql.connector.Error as err:
        print("Error:", err)

    finally:
        if connection.is_connected():
            cursor.close()
            connection.close()

def insert_penalty(erp, today_date, current_time, id_status, shirt_status, pant_status, fine):
    try:
        connection = mysql.connector.connect(
            host="localhost",
            user="root",
            password="root",
            database="uniform"
        )

        cursor = connection.cursor()

        query = """
        INSERT INTO penalizing_info 
        (erp, date, time, id_status, shirt_status, pant_status, fine_status)
        VALUES (%s, %s, %s, %s, %s, %s, %s)
        """

        # today_date = date.today()
        # current_time = datetime.now().time()

        values = (erp, today_date, current_time,
                  id_status, shirt_status, pant_status, fine)

        cursor.execute(query, values)
        connection.commit()

        print("Penalty record inserted successfully.")
        return 1
    except mysql.connector.Error as err:
        print("Error:", err)
        return 0

    finally:
        if connection.is_connected():
            cursor.close()
            connection.close()
            
            
def fetch_student_by_erp(erp_value):
    try:
        # Connect to database
        connection = mysql.connector.connect(
            host="localhost",          # change if needed
            user="root",               # your username
            password="root",  # your password
            database="uniform"         # your schema name
        )

        cursor = connection.cursor(dictionary=True)

        # SQL Query
        query = """
        SELECT ERP, StudentName, StudentMobileNumber, StudentEmail,
               ParentName, ParentMobileNumber, ParentEmail,
               parentAC, Bank, Photo, admission_date
        FROM student_info
        WHERE ERP = %s
        """

        cursor.execute(query, (erp_value,))
        result = cursor.fetchone()

        if result:
            print("Student Details:")
            for key, value in result.items():   # ✅ directly use result
                print(f"{key}: {value}")
            print("-" * 40)
            
        else:
            print("No student found with this ERP.")
            
        return result

    except mysql.connector.Error as err:
        print("Error:", err)

    finally:
        if connection.is_connected():
            cursor.close()
            connection.close()


def fetch_penalty_count_by_erp(erp_value, penalty_date):
    try:
        # Connect to database
        connection = mysql.connector.connect(
            host="localhost",          # change if needed
            user="root",               # your username
            password="root",  # your password
            database="uniform"         # your schema name
        )

        cursor = connection.cursor(dictionary=True)

        # SQL Query
        query = """
        SELECT fine_status
        FROM penalizing_info
        WHERE erp = %s and date = %s
        """

        cursor.execute(query, (erp_value,penalty_date,))
        result = cursor.fetchall()
        total_finecount = 0
        
        if result:
            
            for row in result:
                print("Penalty Details:")
                for key, value in row.items():
                    print(f"{key}: {value}")
                    total_finecount = total_finecount+1
                print("-" * 40)
            print("Total Fine:", total_finecount)
            
        else:
            print("No student found with this ERP.")
        #print(total_finecount)
        return total_finecount

    except mysql.connector.Error as err:
        print("Error:", err)

    finally:
        if connection.is_connected():
            cursor.close()
            connection.close()

            


def deduct_fine_from_account(account_number, fine_amount):
    try:
        connection = mysql.connector.connect(
            host="localhost",
            user="root",
            password="root",
            database="uniform"
        )

        cursor = connection.cursor()

        # Deduct fine safely
        query = """
        UPDATE bank_account_info
        SET balance = balance - %s
        WHERE account_number = %s
        """

        cursor.execute(query, (fine_amount, account_number))
        connection.commit()

        if cursor.rowcount > 0:
            print("Account updated successfully.")
            
        else:
            print("ERP not found.")

    except mysql.connector.Error as err:
        print("Error:", err)

    finally:
        if connection.is_connected():
            cursor.close()
            connection.close()

# Example usage
# fetch_student_by_erp("016975")   # Replace with actual ERP number
# fetch_penalty_count_by_erp("016975", "21-02-2026")
# fetch_account_balance("1234")
# deduct_fine_from_account("1234","50")