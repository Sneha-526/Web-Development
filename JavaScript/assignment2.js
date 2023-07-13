function describeCountry(country, population, capitalCity){
    const line = `${country} has ${population} million people and its capital city is ${capitalCity}`;
    return line;
}
const descPortugal = describeCountry('Portugal', 10, 'Lisbon');
const descGermany = describeCountry('Germany', 83, 'Berlin');
const descIndia = describeCountry('India', 114, 'Delhi');
console.log(`${descGermany}
${descPortugal}
${descIndia}`);