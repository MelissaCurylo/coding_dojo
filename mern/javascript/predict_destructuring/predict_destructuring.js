// For the following five blocks of code, predict the output. If a line of code will throw an error, state the error.


// #1
const cars = ['Tesla', 'Mercedes', 'Honda']
const [ randomCar ] = cars
const [ ,otherRandomCar ] = cars
//Predict the output
console.log(randomCar)              // Tesla -- pulling first index and reassigning value to randomCar
console.log(otherRandomCar)         // Mercedes


// #2
const employee = {
    name: 'Elon',
    age: 47,
    company: 'Tesla'
}
const { name: otherName } = employee; // renmaing 'name' to 'otherName'
//Predict the output
// console.log(name);                  // Error --> ReferenceError -- name is no longer defined.
console.log(otherName);             // Elon



// #3
const person = {
    name: 'Phil Smith',
    age: 47,
    height: '6 feet'
}
const password = '12345';                       // declaring password
const { password: hashedPassword } = person;   // renaming declaration password to hashedPassword
//Predict the output
console.log(password);                        // ReferenceError - password no longer defined.
console.log(hashedPassword);                 // 12345
// Got this prediction wrong. After further review, the reason is that password is a constant and constants are immutable. Destructuring method cannot change the immutable name password; therefore, password remains declared while hashedPassword will be undefined. 



// #4
const numbers = [8, 2, 3, 5, 6, 1, 67, 12, 2];
const [,first] = numbers;                       // assigning first with 1st index  = 2
const [,,,second] = numbers;                    // assigning second with 3rd index = 5
const [,,,,,,,,third] = numbers;                // assigning third with 8th index = 2
//Predict the output
console.log(first == second);                   // boolean respons -> false
console.log(first == third);                    // boolean -> true


// #5
const lastTest = {
    key: 'value',
    secondKey: [1, 5, 1, 8, 3, 3]               // dictionary with array
}
const { key } = lastTest;                       // key = value 
const { secondKey } = lastTest;                 // assigning secondKey with lastTest values
const [ ,willThisWork] = secondKey;             // assigning willThisWork with 1st index = 5
//Predict the output
console.log(key);                               // output = value
console.log(secondKey);                         // output = [1, 5, 1, 8, 3, 3]
console.log(secondKey[0]);                      // output = 1
console.log(willThisWork);                      // output = 5