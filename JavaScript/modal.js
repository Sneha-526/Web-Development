'use strict';

const modal = document.querySelector('.modal');
const overLay = document.querySelector('.overlay');
const btn = document.querySelector('.close-modal');
const show = document.querySelectorAll('.show-modal');

const open = function () {
    modal.classList.remove('hidden');
    overLay.classList.remove('hidden');
};

const close = function () {
    modal.classList.add('hidden');
    overLay.classList.add('hidden');
};

for (let i = 0; i < show.length; i++) show[i].addEventListener('click', open);

btn.addEventListener('click', close);
overLay.addEventListener('click', close);
document.addEventListener('keydown', function (keyboard) {
    if (keyboard.key === 'Escape' && !modal.classList.contains('hidden')) {
        close();
    }
});
