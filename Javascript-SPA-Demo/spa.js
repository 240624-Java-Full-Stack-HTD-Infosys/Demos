let usernameValue = "";
let passwordValue = "";

let bodyElement = document.getElementById("body");
let loginView = document.createElement("div");
loginView.innerHTML =
`<label>username: </label>
<input type="text" id="username"></input>
<br>
<label>password: </label>
<input type="password" id="password"></input>
<br>
<button id="submitButton" onclick="submit()">Submit</button>`



let profileView = document.createElement("div");


bodyElement.appendChild(loginView);

async function submit() {
    let url = "http://localhost:8080/authenticate";
    let dto = {
        username: usernameValue,
        password: passwordValue
    }
    let headers = {
        "Content-Type": "application/json"
    }
    let req = {
        method:"POST",
        body: JSON.stringify(dto),
        headers: headers
    }
    let response = await fetch(url, req);
    console.log(response);

    let responseBody = await response.json();
    console.log(response);
    console.log(responseBody);
    console.log(response.status);


    if(response.status == 200) {
        loginView.remove();
        profileView.innerHTML = `<h1>Welcome to your profile, ${usernameValue}!</h1>`
        bodyElement.appendChild(profileView);
    }


}

function usernameInputEvent(event) {
    usernameValue = usernameField.value;
    //console.log(event, username);
    
}

function passwordInputEvent(event) {
    passwordValue = passwordField.value;
    //console.log(event, password);
    
}


let usernameField = document.getElementById("username");
usernameField.addEventListener("input", usernameInputEvent, false);

let passwordField = document.getElementById("password");
passwordField.addEventListener("input", passwordInputEvent, false);