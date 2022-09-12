var hi = document.getElementById("msjHi");
var getDia = document.getElementById("dia");
var getFecha = document.getElementById("clockHeader");
var getHreloj= document.getElementById("horaBlock");
var getHminutos= document.getElementById("minutosBlock");

var fecha = new Date();
var year = fecha.getFullYear();

const semana = ["Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"];
const mes = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto","Septiembre","Octubre","Noviembre","Diciembre"]

var mesActual = mes[fecha.getMonth()];
var horaDia = fecha.getHours();


function initWelcome() {
    if (horaDia >= 2 && horaDia <= 11){
        hi.innerHTML = "<h1 class='welcome'>" + "Buenos dias " + ${usuario.getUsuario()} + "</h1>";
    } else if (horaDia >= 12 && horaDia <= 18){
        hi.innerHTML = "<h1 class='welcome'>" + "Buenas tardes " + "(usuario)" + "</h1>";
    } else if(horaDia >= 19 && horaDia <= 23){
        hi.innerHTML = "<h1 class='welcome'>" + "Buenas noches " + "(usuario)" + "</h1>";
    } else {
        hi.innerHTML = "<h1 class='welcome'>" + "Hola! " + "(usuario)" + "</h1>";
    }

    getFecha.innerHTML = "<span class='dia-estilo'>" + year + " de " +  mesActual + "<span>";
    
}

initWelcome();

function Clock() {
    var interval = (60 - (new Date()).getSeconds()* 1000 + 5);
    var timeNow = new Date();
    var horaActual = timeNow.getHours();
    var diaActual = semana[timeNow.getDay()];
    var minutoActual = timeNow.getMinutes();
    getDia.innerHTML = "<span>" + diaActual + "<span>";
    getHreloj.innerText = horaActual;
    getHminutos.innerHTML = "|" +  minutoActual;
    var intId = setTimeout(Clock, interval);
}

Clock();












