// Remember, we're gonna use strict mode in all scripts now!
'use strict';
/* PROBLEM
    given  array of temperatures of one day, calculate the temperature amplitude. Also keep in mind that sometimes there might be sensor errors.
*/

// Given array of temperatures -->

const temperatures = [3, -2, -6, -1, 'error', 9, 13, 17, 15, 14, 9, 5];

const calcTempAmplitude = function (temps) {
    let max = temps[0];
    let min = temps[0];
    for (let i = 0; i < temps.length; i++) {
        const curtemp = temps[i];
        if (typeof curtemp !== 'number') {
            continue; //  Ignoring error(string).
        }

        if (curtemp > max) {
            max = curtemp; //  Finding max value
        }

        if (curtemp < min) {
            min = curtemp; //  Finding min value.
        }
    }
    return max - min; //  Returning amplitude.
};

const amplitude = calcTempAmplitude(temperatures);
console.log(amplitude);

/* 
    PROBLEM
    the function should now recieve 2 arrays of temps.
*/
const calcTempAmplitudeNew = function (t1, t2) {
    const temps = t1.concat(t2);
    let max = temps[0];
    let min = temps[0];
    for (let i = 0; i < temps.length; i++) {
        const curtemp = temps[i];
        if (typeof curtemp !== 'number') {
            continue; //  Ignoring error(string).
        }

        if (curtemp > max) {
            max = curtemp; //  Finding max value
        }

        if (curtemp < min) {
            min = curtemp; //  Finding min value.
        }
    }
    return max - min; //  Returning amplitude.
};

const amplitudeNew = calcTempAmplitudeNew([3, 5, 1], [9, 0, 5]);
console.log(amplitudeNew);
