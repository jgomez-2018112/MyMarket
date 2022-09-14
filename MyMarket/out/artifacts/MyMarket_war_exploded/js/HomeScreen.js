var hi = document.getElementById("msjHi");
var getDia = document.getElementById("dia");
var getFecha = document.getElementById("clockHeader");
var getHreloj = document.getElementById("horaBlock");
var getHminutos = document.getElementById("minutosBlock");

var fecha = new Date();
var year = fecha.getFullYear();

var diaN = fecha.getDate()

console.log(diaN);

const semana = ["Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"];
const mes = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"];

var mesActual = mes[fecha.getMonth()];
var horaDia = fecha.getHours();


console.log(mes);
console.log(mesActual);

function getText(obj) {
    return obj.textContent ? obj.textContent : obj.innerText;
}

function setText(obj, to) {
    obj.textContent ? obj.textContent = to : obj.innerText = to;
}


function initWelcome() {
    if (horaDia >= 2 && horaDia <= 11) {

        hi.innerHTML = "<h1 class='welcome'>" + "Buenos dias " + "</h1>";
    } else if (horaDia >= 12 && horaDia <= 18) {
        hi.innerHTML = "<h1 class='welcome'>" + "Buenas tardes " + "</h1>";
    } else if (horaDia >= 19 && horaDia <= 23) {
        hi.innerHTML = "<h1 class='welcome'>" + "Buenas noches " + "</h1>";
    } else {
        hi.innerHTML = "<h1 class='welcome'>" + "Hola! " + "</h1>";
    }

    getFecha.innerHTML = "<span class='dia-estilo'>" + diaN + " de " + mesActual + " " + year + "<span>";

}

initWelcome();

function Clock() {
    var interval = (60 - (new Date()).getSeconds() * 1000 + 5);
    var timeNow = new Date();
    var horaActual = timeNow.getHours();
    var diaActual = semana[timeNow.getDay()];
    var minutoActual = timeNow.getMinutes();
    getDia.innerHTML = "<span>" + diaActual + "<span>";
    getHreloj.innerText = horaActual;
    getHminutos.innerHTML = "|" + minutoActual;
    var intId = setTimeout(Clock, interval);

}

Clock();












