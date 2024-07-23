function handleClick4(event) {
    console.log("click event 4")
    event.stopImmediatePropagation()
}

function handleClick1(event) {
    console.log("click event 1")
    event.stopImmediatePropagation()
}

function handleClick2(event) {
    console.log("click event 2")
    event.stopImmediatePropagation()
}

function handleClick3(event) {
    console.log("click event 3" )
    event.stopImmediatePropagation()
}


document.getElementById("para1").addEventListener("click", handleClick4)
document.getElementById("para1").addEventListener("click", handleClick1)
document.getElementById("para1").addEventListener("click", handleClick2)
document.getElementById("para1").addEventListener("click", handleClick3)

document.getElementById("div1").addEventListener("click", ()=>{console.log("div 1 event")})