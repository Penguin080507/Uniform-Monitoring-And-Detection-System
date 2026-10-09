from reportlab.platypus import SimpleDocTemplate, Paragraph, Spacer, Image
from reportlab.lib.styles import getSampleStyleSheet
from reportlab.lib import colors
from reportlab.lib.units import inch
from reportlab.lib.pagesizes import letter

import os

def create_pdf(erp_number, dt, message, image_path):

    print("Image Path : ",image_path)
    pdf_filename = os.path.join("Generated_PDF",f"{erp_number}_{dt}.pdf")
    print(pdf_filename)
    doc = SimpleDocTemplate(pdf_filename, pagesize=letter)
    elements = []

    styles = getSampleStyleSheet()

    # Title Style
    title_style = styles["Heading1"]
    title_style.textColor = colors.grey

    # Body Style
    body_style = styles["Normal"]
    body_style.fontSize = 12

    # Title
    elements.append(Paragraph("Automatic AVPOLY Uniform Vigilance System", title_style))
    elements.append(Spacer(1, 0.3 * inch))

    # Message (auto wraps properly)
    elements.append(Paragraph(message, body_style))
    elements.append(Spacer(1, 0.5 * inch))

    # Add Image
    
    if os.path.exists(image_path):
        img = Image(image_path, width=3*inch, height=3*inch)
        elements.append(img)

    # Build PDF
    doc.build(elements)
    print("PDF Generated Successfully.")
    print(pdf_filename)
    return pdf_filename
