import smtplib
from email.mime.multipart import MIMEMultipart
from email.mime.application import MIMEApplication
import os


def sendEmail(to, subject, pdfpath):

    sender_address = "dataliked1@gmail.com"
    sender_pass = "pgqh iqlt oidk izrk"   

    # Setup MIME
    message = MIMEMultipart()
    message['From'] = sender_address
    message['To'] = to
    message['Subject'] = subject

    # # Attach Email Body
    # message.attach(MIMEText(body, 'plain'))

    # Attach PDF File
    if pdfpath and os.path.exists(pdfpath):
        with open(pdfpath, "rb") as pdf_file:
            pdf_attachment = MIMEApplication(pdf_file.read(), _subtype="pdf")
            pdf_attachment.add_header(
                "Content-Disposition",
                "attachment",
                filename=os.path.basename(pdfpath)
            )
            message.attach(pdf_attachment)
    else:
        print("PDF path invalid or file not found.")
        return 0

    try:
        # Create SMTP Session
        session = smtplib.SMTP('smtp.gmail.com', 587)
        session.starttls()
        session.login(sender_address, sender_pass)

        session.sendmail(sender_address, to, message.as_string())
        session.quit()

        print("Mail Sent Successfully")
        return 1

    except Exception as e:
        print("Error sending mail:", e)
        return 0
