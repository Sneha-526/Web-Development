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

// Type Conversion -->
const inputYear = '1991';
console.log(Number(inputYear), inputYear);
console.log(inputYear + 18);
console.log(Number(inputYear) + 18);

console.log(Number('Sneha'));
console.log(typeof NaN);

// Type Coercion -->
console.log("I'am " + 19 + " years old."); // converting number 19 to string implicitally.
console.log('23' - '10' - 3); // converting string to number implicitally.
console.log('23' + '10' + 3); // converting number to string implicitally.

let n = '1' + 1; // '11'
n = n - 1; // '10'
console.log(n);

// Truthy and Falsy Values -->
let money = 0;
if(money){
    console.log("Don't spend it all :)");
}
else{
    console.log("You should get a job");
}

let height = 0;
if(height){
    console.log("Height is dedfined");
}
else{
    console.log("Height is undefined");
}
const age = 18;
if(age === 18) console.log("strict equality");
if(age == 18) console.log("loose equality");

const favourite = prompt("What is your favourie number");
console.log(favourite);
