**Assignment: Rendering Books**


**Objectives:**
Add JSP templates and rendering views to your project.
Become more comfortable using path variables
Learn how to render data from the database in a readable format.
Set up the edit and delete anchor tags for upcoming assignments.



**Assignment**
First, create a second controller called BookController. Next, create a new .jsp file in webapp/WEB-INF called show.jsp. Don't forget to include the relevant JSP and JSTL dependencies (see the Spring Templating lesson). In this assignment, you will continue to build your CRUD web application by implementing the show method. For example, when the user visits '/books/1', you are to respond with a view page that has all the information about a specific book.



**To-Do Check List:** 
1. Create a second controller in your books project called BookController that will have the @Controller annotation.
2. Create a new JSP file called show.jsp inside your WEB-INF folder
3. Include all the necessary dependencies and settings for using JSP.
4. Add a route in your controller for "/books/3", where the number is a variable for the ID of the book.
5. Render the JSP with the book information. To test, manually enter the ID of the book in the url. You can use Workbench to see what IDs exist.
