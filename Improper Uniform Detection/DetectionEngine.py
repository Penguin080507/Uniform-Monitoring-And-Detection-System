import cv2
from deepface import DeepFace
from ultralytics import YOLO
import Penalizing_init_method
from mutagen.mp3 import MP3
from gtts import gTTS
import pyglet
import threading
from threading import Thread
import os, time
import operator
import collections
def playvoice(text):
    # Fetch project name
    
    playtext=text
    tts = gTTS(text=playtext, lang='en')
    ttsname = "voice.mp3"
    tts.save(ttsname)
    audio = MP3("voice.mp3")
    val = audio.info.length
    x = int(val) + 1
    print("Audio length", x)
    music = pyglet.media.load(ttsname, streaming=False)
    music.play()
    os.remove(ttsname)
    time.sleep(x)


def startEngine():
    matchedlist=[]
    
    modelpath="model/best.pt"
    cappath="Captured_images"
    db_path = "faces"
    
    model = YOLO(modelpath) 


    if not os.path.exists(cappath):
        os.makedirs(cappath)  
   
   
    
    # frame=cv2.imread("img1.jpg")
    
    # detect_params=model.predict(frame, conf=0.4, save=False)
    cap = cv2.VideoCapture(2)
    
    
    # if not cap.isOpened():
    #     print("Cannot open camera")
    #     exit()
    ncount=0 
    pcount=0
    
  
    while True:
        ret, frame = cap.read()
    
        if not ret:
            print("Can't receive frame (stream end?). Exiting ...")
            break
        dim = (1000, 600)
        frame = cv2.resize(frame, dim, interpolation=cv2.INTER_AREA)
       #print(model.predict("your_image.jpg", confidence=40, overlap=30).json())
        frame=frame[0:600,150:850]
        detect_params_crop = model.predict(source=[frame], conf=0.1, save=False)
       # detect_params_roadhumps = model_roadhump.predict(source=[frame], conf=0.1, save=False)
       
        id_status = ""
        shirt_status = ""
        pant_status = ""
        
        erp_number=""
    
      
        for box in detect_params_crop[0].boxes:
            clsID = box.cls.numpy()[0]
            conf = box.conf.numpy()[0]
            bb = box.xyxy.numpy()[0]
        
            x1 = int(bb[0])
            x2 = int(bb[2])
            y1 = int(bb[1])
            y2 = int(bb[3])
           
             
            
            class_text = model.names[clsID] 
            value=round(conf, 3)
            #print("value ",value)0.5
           
            # class_value=int(clsID)
           
 
            if(value>=0.5):
                
               
                print(" Ncount  === " ,ncount)
                print(" Pcount  === " ,pcount)
                
                print("Class Name : ",class_text)
                flag = False
                b1,g1,r1=0,0,0
                b2,g2,r2=0,0,0
                if class_text == "college_pant":
                    pant_status = "yes"
                    cv2.rectangle(frame, (x1, y1), (x2, y2), (0, 255, 0), 3)
                    font = cv2.FONT_HERSHEY_COMPLEX
                    cv2.putText(frame, "✔ ", (x1, y1), font, 1, (0, 255, 0), 2)
                    
                    
                    # flag=True
                elif class_text == "other_pant":
                    pant_status = "no"
                    flag=True
                    cv2.rectangle(frame, (x1, y1), (x2, y2), (0, 0, 255), 3)
                    font = cv2.FONT_HERSHEY_COMPLEX
                    cv2.putText(frame, "X", (x1, y1), font, 1, (0, 0, 255), 2)
                    
                    
                    
                if class_text == "college_shirt":
                    shirt_status = "yes"
                    cv2.rectangle(frame, (x1, y1), (x2, y2), (0, 255, 0), 3)
                    font = cv2.FONT_HERSHEY_COMPLEX
                    cv2.putText(frame, "✔ ", (x1, y1), font, 1, (0, 255, 0), 2)
                    
                elif class_text == "other_shirt":
                    shirt_status = "no"
                    flag=True
                    cv2.rectangle(frame, (x1, y1), (x2, y2), (0, 0, 255), 3)
                    font = cv2.FONT_HERSHEY_COMPLEX
                    cv2.putText(frame, "X", (x1, y1), font, 1, (0, 0, 255), 2)
                    
                if class_text == "with_id":
                    id_status = "yes"
                    cv2.rectangle(frame, (x1, y1), (x2, y2), (0, 255, 0), 3)
                    font = cv2.FONT_HERSHEY_COMPLEX
                    cv2.putText(frame, "✔ ", (x1, y1), font, 1, (0, 255, 0), 2)
                    
                # else:
                #     id_status = "no"
                #     flag=True
                #     cv2.rectangle(frame, (x1, y1), (x2, y2), (0, 255, 0), 3)
                #     font = cv2.FONT_HERSHEY_COMPLEX
                #     cv2.putText(frame, class_text, (x1, y1), font, 1, (0, 255, 0), 2)
                 
                print("============================================== ")
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
                        erp_number = os.path.basename(identity_path).split('.')[0]
                    else:
                        erp_number = "Unknown"

                except:
                    erp_number = "Unknown"

                # Display name on frame
                cv2.putText(frame, erp_number, (50, 50),
                            cv2.FONT_HERSHEY_SIMPLEX,
                            1, (0, 255, 0), 2)
                if(erp_number != "" and flag):
                    ncount=ncount+1
                    print('N COUNT = ',ncount)
                    if(ncount==20):
                        
                       
                        imgpath = os.path.join("Captured_images", "sending.jpg")
                        cv2.imwrite(imgpath, frame)
                        Penalizing_init_method.penaliziing_init(erp_number, id_status, shirt_status, pant_status)
                        time.sleep(5)
                        ncount=0
                         
                        playvoice("MOVE ON")
          
                if(erp_number != "" and flag==False):
                    pcount=pcount+1
                    print('P COUNT = ',pcount)
                    if(pcount==20):
                        playvoice("MOVE ON")
                        pcount=0
                        
        
        
        
        if cv2.waitKey(1) == ord('q'):
            break
        cv2.imshow('Improper Uniform  Detection System', frame)
            
    
            
    
    # Release the capture and destroy all windows
    cap.release()
    cv2.destroyAllWindows()

startEngine()
