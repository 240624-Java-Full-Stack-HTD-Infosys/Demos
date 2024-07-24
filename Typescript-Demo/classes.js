var User = /** @class */ (function () {
    function User() {
        //no-args constructor
    }
    Object.defineProperty(User.prototype, "firstName", {
        get: function () {
            return this._firstName;
        },
        set: function (firstName) {
            this._firstName = firstName;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(User.prototype, "lastName", {
        get: function () {
            return this._lastName;
        },
        set: function (lastName) {
            this._lastName = lastName;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(User.prototype, "username", {
        get: function () {
            return this._username;
        },
        set: function (username) {
            this._username = username;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(User.prototype, "password", {
        get: function () {
            return this._password;
        },
        set: function (password) {
            this._password = password;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(User.prototype, "fullName", {
        get: function () {
            return this._lastName + ", " + this._firstName;
        },
        enumerable: false,
        configurable: true
    });
    return User;
}());
var user = new User();
function myFunction(thing) {
    console.log(thing);
}
var user2 = { username: "kplu", password: "pass", firstName: "kfdfg", lastName: "asdf" };
console.log(user2);
var obj = { firstName: "sdlkfjgn", lastName: "dfjgbnskdgf" };
myFunction(user);
function aliasFunction(thing) {
    console.log(thing);
}
aliasFunction("Hello");
aliasFunction(4);
user.firstName = "Kyle";
user.lastName = "Plummer";
var fullName = user.fullName;
console.log(fullName);
console.log(user);
