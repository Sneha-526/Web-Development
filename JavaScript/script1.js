let js = 'amazing';

console.log(40 + 8 + 23 - 10);

const firstName = "Sneha"; 
const job = "Student";
const birthYear = 2004;
const year = 2023;
const sneha = "I am " + firstName + ", a " + (year - birthYear) + " year old " + job + "!";
console.log(sneha);

// Can also be written as String Template -->
const snehaNew = `I am ${firstName}, a ${(year - birthYear)} year old ${job}!`;
console.log(snehaNew);

//complicated way of changing line -->
console.log("String with \n\
multiple\n\
lines");

//simple way of changing line with grave accent (``) -->
console.log(`String with
multiple
lines`);

