Assignment: Orders & Items

Objectives:
    1. Use another class file to help store data related to the app in a more organized way.
    2. Understand the value of grouping data together in a class to perform similar operations.
    3. Set member variables inside a class file
    4. Be able to instantiate a new instance of a class (initialize a custom data type).




Let's make a new and improved Cafe app! Separate from your prior Cafe projects, create a new folder for this assignment. Next, create 2 new class files for an Order and an Item class. They should have the following member variables:

    Item class member variables:
        String name
        double price

    Order class member variables:
        String name
        double total
        boolean ready
        ArrayList<Item> items



    Of course, you will also need to demo its capabilities for the dev team, so make another testing file TestOrders class, with a  main  
    method to do this. Tip! When creating new instances don't forget the new keyword for instantiating objects!

    To-do:

    1. Create the Item class with the member variables listed above.

    2. Create the Order class with the member variables listed above.

    3. Create the testing file TestOrders and complete the rest of the tasks inside the testing file.

    4. Create 4 item variables of type Item and instantiate each as an Item object. Name them item1, item2 etc.

    5. Set the price and the name for each -- "mocha", "latte", "drip coffee" and "capuccino" (price is up to you!)

    6. Create 4 order variables of type Order and instantiate each as an Order object. Name them order1, order2 etc.

    7. Set each order's name -- "Cindhuri", "Jimmy", "Noah", "Sam".

    8. Print the order1 variable to the console to see what happens.

    9. Predict what will happen if you print order1.total

    10. Add item1 to order2's item list and increment the order's total.

    11. order3 ordered a cappucino. Add the cappuccino to their order list and to their tab.

    12. order4 added a latte. Update accordingly.

    13. Cindhuri’s order is now ready. Update her status.

    14. Sam ordered more drinks - 2 lattes. Update their order as well.

    15. Jimmy’s order is now ready. Update his status.
