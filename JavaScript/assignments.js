//lecture 1 --> Q1.
const country = "India";
const continent = "Asia";
let population = 1406;
//Q2.
console.log(country);
console.log(continent);
console.log(population);

//Lecture 2 --> Q1.
let isLand = true;
let language;
//Q2.
console.log(typeof isLand);
console.log(typeof population);
console.log(typeof country);
console.log(typeof language);

//Lecture 3 Q1.
language = "Hindi";
//Q2. --> Changing variables to const
//Q3. --> trying to change values of const variables.
// continent = "Europe"

//Lecture 4 --> Q1.
// population /= 2;
//Q2.
population++;
console.log(population);
//Q3.
let populationFinland = 6;
console.log(population>populationFinland);
//Q4.
let avgPopulation = 33;
console.log(avgPopulation>population);
//Q5.
let description = country + " is in " + continent + ", and its " + population + " million people speaks " + language;
console.log(description);

//Lecture 5 --> Q1.
description = `${country} is in ${continent}, and its ${population} million people speaks ${language}.`;
console.log(description);

//Lecture 6 --> Q1 & Q2.
console.log('9' - '5');
console.log('19' - '13' + '17');
console.log('19' - '13' + 17);
console.log('123' < 57);
console.log(5 + 6 + '4' + 9 - 4 - 2);

//Lecture 7 --> Q1.
let numNeighbours = Number(prompt("How many neighbour countries does your country have?"));
if(numNeighbours === 1){
    console.log("only one border");
}
else if(numNeighbours>1){
    console.log("More than one border");
}
else{
    console.log("No Borders");
}
