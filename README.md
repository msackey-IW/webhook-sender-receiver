# WEBHOOK SENDER RECEIVER

## Overview
This Spring Boot project implements simple webhook demonstration application. The application mimic a sender and receiver of messages using webhook based communication.

## Setup
### Prerequisites
- An IDE ( [Visual Studio Code](https://code.visualstudio.com/download) or [intellij IDEA](https://www.jetbrains.com/idea/download/?source=google&medium=cpc&campaign=APAC_en_AU_IDEA_Branded&term=intellij+idea&content=602143185772&gclid=EAIaIQobChMI-f3uuYnegwMVwqRmAh0_ewXKEAAYASABEgImY_D_BwE&section=windows) )
- [Postman API](https://www.postman.com/downloads/)
- [Java](https://www.oracle.com/java/technologies/downloads/) 17 at minimum installed on your local machine.
- An account with https://pipedream.com/requestbin

### Clone the Repository
- Open a terminal or command prompt (Powershell on Windows and Terminal or linux or macOs)
- Navigate to the directory you want to clone the project. e.g. `cd path/to/your/directory`
- Run `git clone [github.com:msackey-IW/webhook-sender-receiver.git](https://github.com/msackey-IW/webhook-sender-receiver.git)`
- Run cd `webhook-sender-receiver`
### Run the Receiver
- Change directory into the receiver folder
- Run `mvn clean spring-boot:run`
### Run the Sender
- Open the `webhook-sender-receiver` folder in another window of your IDE.
- Change direction into the sender folder
- Run  `mvn clean spring-boot:run`

### Testing with Postman
- Open and run POSTMAN API
- Send a `POST` request to `http://localhost:8080/send-webhook`
- You should receive a `200 Ok` status code saying the request has been completed.
- In the IDE running the receiver, a message will be printed in the terminal acknowledging the webhook message being received.



 
