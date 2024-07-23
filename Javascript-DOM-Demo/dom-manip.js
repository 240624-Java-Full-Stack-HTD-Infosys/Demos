let bodyElement = document.getElementsByTagName("body")[0];
let divElement = document.getElementById("div1");
let paraElement = document.getElementById("para1");
let deleteButton = document.getElementById("deleteButton");
let addButton = document.getElementById("addButton");


function deleteStuff() {
    paraElement.remove();
}

function addSomething() {
    let newElement = document.createElement("p");
    newElement.innerHTML = "This is a new paragraph";
    divElement.appendChild(newElement);
}

deleteButton.addEventListener("click", deleteStuff, false)
addButton.addEventListener("click", addSomething, false);
