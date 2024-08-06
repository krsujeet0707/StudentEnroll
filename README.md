# StudentEnroll
Assessment for techeazy

Step1: Clone this project on your local machine.
Step2: Import it into Eclipse.
Step3: Run this project as spring boot application.
Step4: Open h2 database console in browser using below link and username password
        Link: localhost:8080/h2-console
        User: sa
        Paswword: 
        Database: testdb
Step5: Run below insert script in h2 db console.
      INSERT INTO role (name) VALUES ('STUDENT');
      INSERT INTO role (name) VALUES ('ADMIN');
      INSERT INTO usertable (username, password) VALUES ('student1', 'pass1');
      INSERT INTO usertable (username, password) VALUES ('admin1', 'pass2');
      INSERT INTO user_roles (user_id, role_id) VALUES (1, 1);
      INSERT INTO user_roles (user_id, role_id) VALUES (2, 2);
Step6: Now you can generate jwt token using /api/authenticate API.
Step7: Use this token in subsequent request for any other APIs.

        
