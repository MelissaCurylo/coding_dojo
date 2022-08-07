Assignment: CareSoft Interfaces

Background Story:
You’ve joined a team of developers that has built the software for a healthcare clinic management system called CareSoft. The codebase is already fully developed, but they are working on standardizing some of their business logic to streamline reporting requirements for the Healthcare Insurance Portability and Accountability Act (HIPAA) and maintain the security of electronic Personal Health Information (PHI or ePHI).


Objectives:
- Become more comfortable using Spring Tool Suite (STS) tools
- Practice using packages and become more familiar with reverse domain name convention
- Review examples of how multiple classes may interact in a practical business scenario.
- Recognize classes and class interactions without explicitly knowing how each class is implemented
- Become more comfortable analyzing and contributing to a codebase with unfamiliar elements.
- Implement existing interfaces in existing classes
- Understand how interfaces and implementing interfaces differs from inheritance and extending another class.



New Interfaces:
Related to feature requests from the business, two interfaces have been added to the application, and they have asked you to start implementing them in the appropriate classes (also provided):

- HIPAACompliantUser
- HIPAACompliantAdmin


Assignment: 
Your task is to implement two given interfaces, HIPAACompliantUser and  HIPAACompliantAdmin as described in two given classes, Physician and AdminUser.




Set up
1. Create a new Java project in STS and a package in your src folder with the reverse domain name: com.caresoft.clinicapp 
2. Next, in STS, in the package you just created, make a new interface called HIPAACompliantUser, empty for now.
3. Then in that same package, create the HIPAACompliantAdmin interface, also empty for now.
4. Create the following 3 classes, empty for now, that will implement these new interfaces.
- User - None. (Leave as is, no implementations)
- Physician - Will implement  HIPAACompliantUser and extend User
- AdminUser - Will implement both  HIPAACompliantUser and HIPAACompliantAdmin and extend User
- Tip: Try using STS to inherit and extend when you make your classes! It will autogenerate some code for you. You can also auto-generate getters, setters and constructors by going to the "Source" menu. Yay STS! 

5. Copy and paste the given code for each interface below.
6. Copy and paste the code examples for each class file, but keep the method stubs created by STS. 
7. Follow the guidelines for writing the implemented methods in your classes.
8. Created a Test file and use the testing code provided to test all your implementations.


HIPAACompliantUser Interface:
The complete code to put inside the HIPAACompliantUser interface is given (below), and does not need to be altered.

HIPAACompliantAdmin Interface:
HIPAACompliantAdmin interface is also given, and does not need to be altered.

User.java:
All you'll need to add to the User class is getters and setters and a constructor.



Your Task: Implement Some Interfaces!
- The codebase you are given includes two files that you'll be working in: PhysicianandAdminUser. You'll be adding code for the methods each class should implement from a respective interface.

Physician: Physician.java
The  Physician class implements the HIPAACompliantUser interface in the following ways:

- boolean assignPIN(int) ->	Pin must be exactly 4 digits, returns false if not. Expected to assign the pin to the user (as a member variable)
- boolean accessAuthorized(Integer)	Checks the physician's id against the given id; returns true if they are a match, otherwise false.



AdminUser: AdminUser.java
- The AdminUser class implements the HIPAACompliantUser interface in the following ways:

- boolean assignPIN(int) ->	Pin must be 6 digits or more; returns false if not expected to assign the pin to the user (as a member variable)
- boolean accessAuthorized(Integer) ->	Compares the ids, and if they are not a match, creates an incident report using the  authIncident method,  Returns true if ids match, false if not.

- The AdminUser class implements the HIPAACompliantAdmin interface in the following ways:
- ArrayList<String> reportSecurityIncidents() ->	Returns a list of strings (incidents reported)


Test.java - Copy and paste
  
  
To-Do Check List:
- Reminder: Ask Questions!
 - In your first role as an engineer, this kind of task is fairly typical of junior developers. These two classes would have many more methods, member variables and imports that would be unrelated to your task, and they would be part of a much larger code base. Sometimes they will give you enough background information to accomplish the task, but if not, it's okay to ask questions, after you feel you've done some digging to figure it out and don't find much to go on. For this assignment, be sure to follow that 20 minute rule, and be sure to ask if it's unclear or you hit a dead end!

1. Create all the necessary interfaces and classes
2. Auto-generated constructors, setters and getters using STS, and implement as necessary.
3. In the Physician class, implement the assignPin(int) method.
4. In the Physician class, implement the accessAuthorized(Integer) method.
5. In the AdminUser class, implement the assignPin(int) method.
6. In the AdminUser class, implement the accessAuthorized(Integer) method.
6. In the AdminUser class, implement the ArrayList reportSecurityIncidents() method.
8. Test and debug till all the test cases pass.



