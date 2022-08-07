Assignment: Daikichi Routes + Daikichi Path Variables (Part 1 and Part 2 combined)

<ins>Part 1: Daikichi Routes:</ins>

Background:
Daikichi (大吉) means "excellent luck" or "great blessing". We will be creating a website that will deliver a message of good fortune based on which url path is typed into the browser. For this assignment, you are going to practice routes in Spring Boot. The goal is to master writing method level @RequestMapping annotations and @RequestMapping class level annotation.

Objectives:
- Create a Spring Boot application using Spring Tool Suite.
- Create a controller using the @RestController annotation.
- Use request mapping and @RequestMapping annotations to have distinct URL endpoints return different messages.

Assignment:
Create an app that will show in the browser either a welcome message or a fortune, based on which URL is typed in the browser. Please note, you may show simple text without any html formatting.

To-Do Check List: 
1. Start a new Spring Starter Project and create a package for your controllers
2. Create a new controller called DaikichiController, and be sure you annotate it as a @RestController
3. Have an http GET request to 'http://localhost:8080/daikichi' display text that says 'Welcome!'
4. Have an http GET request to 'http://localhost:8080/daikichi/today' display text that says 'Today you will find luck in all your endeavors!'
5. Have an http GET request to 'http://localhost:8080/daikichi/tomorrow' display text that says 'Tomorrow, an opportunity will arise, so be sure to be open to new ideas!'


<ins>Part 2: Daikichi Path Variables:</ins>

Background:
Now that you have created the Hello Human application using query parameters, you're going to handle information sent through the url another way, through path variables to return varying computed string responses back to the client.

Objectives:
- Become familiar with creating a package in Spring Tool Suite.
- Use and understand @RestController annotation.
- Pass information from the client using @RequestMapping and URL path variables.
- Identify and use correctly the @PathVariable annotation and corresponding parameter declaration syntax.
- Use @RequestMapping to process information from the client to return conditional or varied responses.

Assignment:
- For this assignment we are going to add to our Daikichi Routes project. To review, the first three routes, from our Daikichi Routes assignment used the @RequestMapping annotation with static route urls. The last two routes will be dynamic, and use path variables, so you will also need to use the @PathVariable annotation.

- Adding request mappings to your Daikichi project, complete the assignment tasks given.


To-Do Check List:
1. Add 2 new routes with corresponding method definitions in your Daikichi Routes project that will accept path variables.
2. Have an http GET request to 'http://localhost:8080/daikichi/travel/kyoto' where the url will take any string for the city, and display text that says for example, 'Congratulations! You will soon travel to kyoto!'.
3. Have an http GET request to 'http://localhost:8080/daikichi/lotto/8', where the url will take any integer. If the number is even, display text that says 'You will take a grand journey in the near future, but be weary of tempting offers'. If it is odd, display text that says "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends."
