

def get_warning_message(parent_name, student_name, today_date):
    message = f"""
    Dear {parent_name},
        Your pal {student_name} has been identified for the violation of the college uniform code of conduct.  Which occurred on {today_date}. After two times violation, a fine of Rs 50/- will be deducted from your account for each violation for the month. Please inform your pal to maintain discipline. And also attached Violation image for the day.

    Thanks and regards,

    AVpoly Smart Uniform Violation Detection System
    """
    return message


def get_deducted_message(parent_name, student_name, today_date):
    message = f"""
    Dear {parent_name},

        Your pal {student_name} has been identified for the violation of the college uniform code of conduct.  Which occurred on {today_date}. A fine of Rs 50/- is deducted from your account. For each of the pal's Violation Rs 50/-  will be deducted from your account. Please inform your pal to maintain discipline. And also attached Violation image for the day.

    Thanks and regards,

    AVpoly Smart Uniform Violation Detection System
    """
    return message

def get_not_deducted_message(parent_name, student_name, today_date):
    message = f"""
    Dear {parent_name},

        Your pal {student_name} has been identified for the violation of the college uniform code of conduct.  Which occurred on {today_date}. A fine of Rs 50/- is imposed on you. Please pay it before geeting the hall ticket for the semester exam. For each of the pal's Violation Rs 50/-  will be deducted from your account. Please inform your pal to maintain discipline. And also attached Violation image for the day.

    Thanks and regards,

    AVpoly Smart Uniform Violation Detection System
    """
    return message
