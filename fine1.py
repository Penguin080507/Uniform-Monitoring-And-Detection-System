from deepface import DeepFace
import cv2
import os

# Path to database folder
db_path = "faces"

# Open webcam
cap = cv2.VideoCapture(0)

print("Press Q to quit...")

while True:
    ret, frame = cap.read()
    if not ret:
        break

    try:
        # Find match in database
        results = DeepFace.find(
            img_path=frame,
            db_path=db_path,
            model_name="Facenet",
            enforce_detection=False
        )

        if len(results) > 0 and len(results[0]) > 0:
            identity_path = results[0].iloc[0]['identity']
            name = os.path.basename(identity_path).split('.')[0]
        else:
            name = "Unknown"

    except:
        name = "Unknown"

    # Display name on frame
    cv2.putText(frame, name, (50, 50),
                cv2.FONT_HERSHEY_SIMPLEX,
                1, (0, 255, 0), 2)

    cv2.imshow("Face Recognition", frame)

    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

cap.release()
cv2.destroyAllWindows()
