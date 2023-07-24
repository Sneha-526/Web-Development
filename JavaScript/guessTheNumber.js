'use strict';

let secretNumber = Math.trunc(Math.random() * 20) + 1;
let score = 20;
let highScore = 0;

const display = function (cls, message) {
    document.querySelector(cls).textContent = message;
};

document.querySelector('.check').addEventListener('click', function () {
    const guess = Number(document.querySelector('.guess').value);
    if (guess > 20 || guess < 1) {
        alert('Please enter the number between 1 to 20');
    }

    if (!guess) {
        display('.message', '🚫 No Number!');
    } else if (guess === secretNumber) {
        display('.message', '🎉 Correct Number!');
        document.querySelector('body').style.backgroundColor = '#39be61';
        document.querySelector('.number').style.width = '300px';
        display('.number', secretNumber);

        if (score > highScore) {
            highScore = score;
            display('.highscore', highScore);
        }
    } else if (guess !== secretNumber) {
        if (score > 1) {
            display(
                '.message',
                guess > secretNumber ? '📈 Too high!' : '📉 Too low!'
            );
            score--;
            display('.score', score);
        } else {
            display('.message', '🎇You Lost the Game!');
            display('.score', 0);
        }
    }
});

document.querySelector('.again').addEventListener('click', function () {
    score = 20;
    secretNumber = Math.trunc(Math.random() * 20) + 1;
    display('.message', 'Start guessing...');
    display('.score', score);
    display('.number', '?');
    document.querySelector('.number').style.width = '150px';
    document.querySelector('body').style.backgroundColor = '#1f5464';
    document.querySelector('.guess').value = '';
});
