'use strict';

function logger(){
    console.log("My name is Sneha");
}
//Calling, invoking or running the function
logger();
logger();
logger();

function fruitProcessor(apples, oranges){
    console.log(apples, oranges);
    const juice = `Juice with ${apples} apples and  ${oranges} oranges.`;
    return juice;
}

const appleJuice = fruitProcessor(5,0);
console.log(appleJuice);

//Function Calling.
function calcAge1(birthYear){
    return 2023 - birthYear;
}
const age1 = calcAge1(2004);

//Function Expression.
const calcAge2 = function (birthYear){
    return 2023 - birthYear;
}
const age2 = calcAge2(2004);

//Function Arrow.
const calcAge3 = birthYear =>2023 - birthYear;
const age3 = calcAge3(2004);
console.log(age1, age2, age3);

//Declaring Arrays -->

const friends = ['Micheal', 'Steven', 'Peter'];
console.log(friends);
const years = new Array(1991,1984,2008,2020);
console.log(years);

//Mutating array

friends[2] = 'Jay';
console.log(friends);

friends.push('peter');  //adds at last
console.log(friends);

friends.unshift('john');    //adds at first
console.log(friends);

const popped = friends.pop();   //removes last element
console.log(friends);
console.log(popped);    //returns the removed element.

friends.shift();    //removes the first element.
console.log(friends);

