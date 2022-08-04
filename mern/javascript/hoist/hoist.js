// Rewrite code blocks as interpreter would read :



// #1 
console.log(hello);
var hello = 'world';

// After hoisting by interpreter:
// var hello;               // declaration will get hoisted by itself to the top
// console.log(hello);      // logs undefined
// var hello = 'world'      // assignment will stay exactly where it was



// #2
var needle = 'haystack';
test();
function test(){
    needle = 'magnet';
    console.log(needle);
}

// After hoisting by interpreter
// var needle;                   // declaration gets hoisted to top
// function test(){              // fucntion test gets hoisted to top
//  var needle;                  // gets hoisted to the top of it's scope
//  needle = 'magenet';
//  console.log(needle)          // function value needle = magnet is output
// }
// needle = 'haystack';     // assignment remains assigned but moves to the bottom
// test();                      // test call moves to bottom



// #3
var brendan = 'super cool';   
function print(){
    brendan = 'only okay';
    console.log(brendan);
}
console.log(brendan);

// After hoisting by interpreter
// var brendan                       // declaration gets hoisted to top
// function print(){                  // function test gets hoisted to top
//  var brendan                      // gets hoisted to the top of it's scope
//  brendan = 'only okay';
//  console.log(brendan)              // 
// }
// brendan = 'super cool';       // assignment remains assigned but moves to the bottom
// console.log(brendan);             //

// output is 'super cool' because nothing is calling the function print.



// # 4
var food = 'chicken';
console.log(food);
eat();
function eat(){
    food = 'half-chicken';
    console.log(food);
    var food = 'gone';
}

// After hoisting
// var food;
// function eat(){
//     var food;
//     food = 'half-chicken';
//     console.log(food);
//     food = 'gone';
// }
// food = 'chicken';
// console.log(food);
// eat();

// output = chicken then half chicken



// #5 
// mean();
// console.log(food);
// var mean = function() {
//     food = "chicken";
//     console.log(food);
//     var food = "fish";
//     console.log(food);
// }
// console.log(food);

// After hoisting
// var mean;
// var mean = function() {
//     var food;
//     food = "chicken"
//     console.log(food);
//     food = "fish";
//     console.log(fish);
// }
// console.log(food)
// mean();
// console.log(food)

// Eror message -- TypeError because mean is not defined globally


// #6
console.log(genre);  // undefined
var genre = "disco";
rewind();
function rewind() {
    genre = "rock";
    console.log(genre);  // rock
    var genre = "r&b";
    console.log(genre);  // r & b
}
console.log(genre);

// after hoisting
// var genre;
// function rewind() {
//    var genre;
//    genre = "rock";
//    console.log(genre);
//    genre - "r&b";
//    console.log(genre);
// }
// console.log(genre);
// genre = "disco";
// rewind();
// console.log(genre);

// output  undefined, rock, r & b



// #7 
dojo = "san jose";  // undefined -- ReferenceError
console.log(dojo);   // undefined
learn();
function learn() {
    dojo = "seattle";
    console.log(dojo);
    var dojo = "burbank";
    console.log(dojo);
}
console.log(dojo);

// after hoisting
// would stop right away because dojo isn't defined properly. 
// output = undefined 



// # 8 
console.log(makeDojo("Chicago", 65)); // reassigning dojo name to Chicago and students to 65
console.log(makeDojo("Berkeley", 0)); // reassigning dojo name to Berkeley and students to 0
function makeDojo(name, students){
    const dojo = {};
    dojo.name = name;
    dojo.students = students;
    if(dojo.students > 50){
        dojo.hiring = true;
    }
    else if(dojo.students <= 0){
        dojo = "closed for now";  // this will error out for second function call TypeError
    }
    return dojo;
}

// after hoisting
//function(makeDojo(name, student)) {
// const dojo;
// dojo.name = name;
// dojo.students = students;
//    ....
// return dojo;
// }
// output =  true plus dojo  then  second output is TypeError because assignment to constant variable