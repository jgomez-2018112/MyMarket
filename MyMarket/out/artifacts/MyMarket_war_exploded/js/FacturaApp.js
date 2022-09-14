

function getText(obj) {
    return obj.textContent ? obj.textContent : obj.innerText;
}

function setText(obj, to) {
    obj.textContent ? obj.textContent = to : obj.innerText = to;
}

