Assignment: Hopper's Receipt

Background:
Grace Hopper is giving a talk at MIT. But first she needs to order some thin metal wires to represent nanoseconds to help her audience understand the speed of signals. As it happens, Market2, a new third-party purchasing app has all her needs covered, as well as anyone else who needs to order from a small local business. 


- Assignment: For this assignment we will take data from our controller and render it to show a receipt for a single item purchase. 


- Quick Tips for Debugging:
1. Check that you've added the correct dependencies for rendering JSP and JSTL in both your pom.xml and index.jsp files:
    	<dependency>
                <groupId>org.apache.tomcat.embed</groupId>
                <artifactId>tomcat-embed-jasper</artifactId>
        </dependency>
		    <dependency>
                <groupId>javax.servlet</groupId>
                <artifactId>jstl</artifactId>
        </dependency>

2. Dependency for index.jsp: 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>copy


3. Be sure you have a WEB-INF folder within your webapp folder, and that it is added to the configurations in your application.properties file so Tomcat knows where to look:  spring.mvc.view.prefix=/WEB-INF/copy


4. Double check the @Controller annotation in your controller is present.
5. Check your imports.
6. If values aren't showing up on the page, double check the key value pair names from your controller to the variable names used in your template (index.jsp) and also double-check the c:out tag syntax.



To-Do Check List:
1. Create a new Spring Starter Project.
2. Create a controllers package and a controller within it
3. Go through all the set up requirements for adding JSP and JSTL to your project
4. Render the purchase information on the page.
5. Change the variable values from "Grace Hopper" etc. to other values to thoroughly test your code.
