const loader = document.querySelector('.loader-wrapper');
const main = document.querySelector('.main')
const navBar = document.querySelector("nav"),
    menuBtns = document.querySelectorAll(".menu-icon"),
    overlay = document.querySelector(".overlay");

const dinApp = document.querySelector(".appFrame");

function init(){
    setTimeout(() => {
        loader.style.opacity = 0;
        loader.style.display = 'none';
        main.style.display = 'flex';
        setTimeout(() => (main.classList.toggle("show")), 1);
    }, 500);
}

init();

menuBtns.forEach((menuBtn) => {
    menuBtn.addEventListener("click", () => {
        navBar.classList.toggle("open");
        dinApp.classList.toggle("open");
    });
});

overlay.addEventListener("click", () => {
    navBar.classList.remove("open");
    dinApp.classList.remove("open");
});

