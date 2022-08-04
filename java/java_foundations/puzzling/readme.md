Assignment: Puzzling

After you passed the first challenge, the company decided they wanted to give you a few puzzles to solve that apply to features the company uses in their client-side operations. As they put it: "The first challenge was just to check your familiarity with the language, now we want to see your problem-solving skills."

For this assignment, we are going to introduce a new class: Random. We are going to use it to create some chaos, okay, maybe not chaos, but to generate random values. 

Objectives:
    1. Implement different algorithms in java.
    2. Practice Array and ArrayList.
    3. Practice loops.
    4. Learn and use the Random class.
    5. Call methods from within other methods in the same class.

Assignment:
    Work on the puzzles below. Be sure to read through all the problem descriptions first before tackling them one-by-one. Make your code as clean as possible. The class name should be PuzzleJava; you will need to create methods for each of the tasks below and test them in the main method in a separate test file.

    Tip: To get a random integer, you can use the nextInt method of the Random class. Random Class documentation. Here's some example code for using the Random library to get you started.

    

    getTenRolls
        1. Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive. 


    getRandomLetter
        Write a method that will:
            1. Create an array within the method that contains all 26 letters of the alphabet (this array must have 26 values). 
            2. Generate a random index between 0-25, and use it to pull a random letter out of the array.
            3. Return the random letter.


    generatePassword
        1. Write a method that uses the previous method to create a random string of eight characters, and return that string.

    getNewPasswordSet
        1. Write a method that takes an int length as an argument and creates an array of random eight character words. The array should be the length passed in as an int.



    SENSEI BONUS: shuffleArray
        1. Write a method that takes an array and mixes up all the values in a pseudo-random way. Hint: use random indexes within the array, and swap values repeatedly. 


    To-Do:
        1. Implement the getTenRolls method
        2. Implement the getRandomLetter method
        3. Implement the generatePassword method
        4. Implement the getNewPasswordSet method
        5. SENSEI BONUS: Implement the shuffle method