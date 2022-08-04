Assignment: Cafe Business Logic

Objectives:
1. Write methods to solve basic logic problems in Java.
2. Practice Array and ArrayList.
3. Practice loops.
4. Understand the difference between printing and returning a value from a method.
5. Create your own methods file
6. Write a test file, and create an instance of another class to test the functionality.


CafeUtil File and TestCafe File
    For this assignment you will have two files,  CafeUtil.java and  TestCafe.java. You will be writing all your 
    methods inside the CafeUtil class. The second file is a test file, TestCafe.java that includes the main method. 
    We have provided the code in its entirety for testing, and you can copy and paste from it from the bottom of this module, 
    but be sure to instantiate your class in the testing file!

Assignment:
    Implement the four methods below. Important: Code all of the following methods in your CafeUtil.java file. 

    1. int getStreakGoal()
        Cafe Java wants to implement a reward system for customers who always buy more drinks than they did the week before. To 
        calculate how many drinks they need after 10 weeks, write a method that sums together every consecutive integer from 
        1 to 10 and returns the sum. In other words, add 1 + 2 + 3.. and so on up to 10 and return the result.
        Test your code before moving on! Don't forget to make an instance of your CafeUtil class to use in the test file. The number printed should be 55.

        1a. Ninja Bonus:  Add a parameter, numWeeks so that an admin can change the number from 10 to whatever they want.


    2. double getOrderTotal(double[] prices)
        Given an array of item prices from an order, sum all of the prices in the array and return the total. 
        Don't forget to test your code! Find the lines of test code for this method in TestCafe.java and uncomment it before you compile and run.


    3. void displayMenu(ArrayList<String> menuItems)
        Given an ArrayList of menu items (strings), print out each index and menu item. 
        Sample output given an  ArrayList with the items "drip coffee",  "cappuccino",  "latte" and  "mocha"
                0 drip coffee
                1 cappuccino
                2 latte
                3 mochacopy

        
    4. Re-cap of ArrayList Syntax:
                Use Code:
            String name = myArray.get(0); // to access an element in an ArrayList using an index

   5. addCustomer(ArrayList<String> customers)
        Inside this method:
        1. Print this string to the console: "Please enter your name:"
        2. Then add this line of code to get user input from the terminal and store it in the 
           variable  userName: String userName = System.console().readLine();
        3. Next print the userName to the console, saying "Hello, [user name here]!"
        4. Next print "There are ___ people in front of you" using the number for how many people are ahead of them (how many items already in the array)
        5. Then, add the customer's name to the given customers list. And print the list.
        6. No need to return anything.
        7. Re-cap of ArrayList Syntax: Re-cap of ArrayList Syntax: myArray.add("Heidi"); // to add an item to an ArrayList
                    
     6. How to Test: Test Early and Test Often
            Write and test each method one at a time. A good strategy for developing software is to code only a little and test. 
            As they say, "Test early and test often." Go ahead and use the following code in your TestCafe.java file to test your methods by 
            uncommenting the method you are testing. Test one at a time.
            
            Note:   // are for single line comments and   /* ...comments... */  are for multi-line comments.   
            
            
    Ninja Bonuses!
        void printPriceChart(String product, double price, int maxQuantity)
        
        Given a product, price and a maxQuantity, create a method that prints the cost for buying 1, then the price for buying 2, then for 3.. 
            and so on, up to the max. For example, if the product is "Columbian Coffee Grounds" with a price of 15.0 and maxQuantity of 3, you should print:

                        Columbian Coffee Grounds
                        1 - $15.00
                        2 - $30.00
                        3 - $45.00
                        Tip: You can use the escape character \n within your string for line breaks.

    Sensei bonus:  Format the prices as currency. Hint: https://docs.oracle.com/javase/tutorial/java/data/numberformat.html

    Senpai Bonus: Take $0.50 more off of the original price every time the quantity increases. Example: Given a $2.00 price and 4 max, where the 
                    prices would normally be $2, $4, $6 and $8, the discount would yield $2, $3.50, $5, and $6.50, progressively taking off $0.50, 
                    then $1, then $1.50 from the group tag price:

                            1 - $2.00
                            2 - $3.50 
                            3 - $5.00 
                            4 - $6.50copy
                            boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices)

                Let's overload the display menu! Given 2 arrays, an ArrayList of menu items (strings), and an ArrayList of prices (doubles) print a menu! 
                However, first check:  if the arrays are not the same size, immediately return false.
                To print the menu, iterate from 0 to the last index. Each time through, print on the same line:
                a.) The index
                b.) The menu item at that index, and c.) The price at that index. 
                Finally, return true.
                
                Sample output:
                        0 drip coffee -- $1.50
                        1 cappucino -- $3.50
                        2 latte -- $4.50
                        3 mocha -- $3.50 copy
    
    
    Sensei Bonus!
    Make a method addCustomers where a barista can enter multiple customers. 
    Hint: You can use a while loop and ask the user to type "q" when they are finished entering names.


Assignment Tasks:
  1. Create a CafeUtil class and a testing file.
  2. Implement the getStreakGoal method and test.
  3. Implement the printPriceChart method and test.
  4. Implement the getOrderTotal method and test.
  5. Implement the displayMenu method and test.
  6. Implement the addCustomer method and test.
