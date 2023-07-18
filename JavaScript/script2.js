"use strict";

function logger() {
  console.log("My name is Sneha");
}
//Calling, invoking or running the function
logger();
logger();
logger();

function fruitProcessor(apples, oranges) {
  console.log(apples, oranges);
  const juice = `Juice with ${apples} apples and  ${oranges} oranges.`;
  return juice;
}

const appleJuice = fruitProcessor(5, 0);
console.log(appleJuice);

//Function Calling.
function calcAge1(birthYear) {
  return 2023 - birthYear;
}
const age1 = calcAge1(2004);

//Function Expression.
const calcAge2 = function (birthYear) {
  return 2023 - birthYear;
};
const age2 = calcAge2(2004);

//Function Arrow.
const calcAge3 = (birthYear) => 2023 - birthYear;
const age3 = calcAge3(2004);
console.log(age1, age2, age3);

//Declaring Arrays -->

const friends = ["Micheal", "Steven", "Peter"];
console.log(friends);
const years = new Array(1991, 1984, 2008, 2020);
console.log(years);

//Mutating array

friends[2] = "Jay";
console.log(friends);

friends.push("peter"); //adds at last
console.log(friends);

friends.unshift("john"); //adds at first
console.log(friends);

const popped = friends.pop(); //removes last element
console.log(friends);
console.log(popped); //returns the removed element.

friends.shift(); //removes the first element.
console.log(friends);

const myArray = [
  "Sneha",
  "Pandit",
  2023 - 2004,
  "Student",
  ["Micheal", "Peter", "Steven"],
];

//Creating OBJECT having 7 PROPERTIES -->
const array = {
  firstName: "Sneha",
  lastName: "Pandit",
  Age: 2023 - 2004,
  Profession: "Student",
  friends: ["Micheal", "Peter", "Steven"],
  hasDriversLicense: true,
  calcAge: function () {
    console.log(this);
    return this.Age;
  },
};
// console.log(array);
console.log(array.lastName); // Dot Noation.
console.log(array["firstName"]); //Bracket Notation.

console.log(array.calcAge());
console.log(array["calcAge"]());

// Looping Arrays -->

for (let i = 0; i < myArray.length; i++) {
  console.log(myArray[i], typeof myArray[i]);
}

// continue and break statement -->

console.log(`--- Only STRINGS using continue ---`);
for (let i = 0; i < myArray.length; i++) {
  if (typeof myArray[i] !== "string") continue;
  console.log(myArray[i], typeof myArray[i]);
}

console.log(`--- Break with NUMBER ---`);
for (let i = 0; i < myArray.length; i++) {
  if (typeof myArray[i] === "number") continue;
  console.log(myArray[i], typeof myArray[i]);
}

// WHILE LOOP -->

let dice = Math.trunc(Math.random() * 6) + 1;
while (dice !== 6) {
  console.log(`You rolled a ${dice}`);
  dice = Math.trunc(Math.random() * 6) + 1;
}
