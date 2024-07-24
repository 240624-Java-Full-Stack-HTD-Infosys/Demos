interface Principal{
    get username(): string;
    set username(username: string);
    get password(): string;
    set password(password: string);
}

class User implements Principal{
    _firstName: string;
    _lastName: string;
    _username: string;
    _password: string;

    constructor() {
        //no-args constructor
    }

    public get firstName(): string {
        return this._firstName;
    }
    
    public set firstName(firstName: string) {
        this._firstName = firstName;
    }

    public get lastName(): string {
        return this._lastName;
    }

    public set lastName(lastName: string) {
        this._lastName = lastName;
    }

    public get username(): string {
        return this._username;
    }

    public set username(username: string) {
        this._username = username;
    }

    get password(): string {
        return this._password
    }

    set password(password: string) {
        this._password = password;
    }

    public get fullName(): string{
        return this._lastName + ", " + this._firstName;
    }
}

let user: User = new User();

function myFunction(thing: {firstName: string, lastName: string}) {
    console.log(thing);
}

let user2: User = {username: "kplu", password: "pass", firstName: "kfdfg", lastName: "asdf"} as User;
console.log(user2);

let obj = {firstName: "sdlkfjgn", lastName: "dfjgbnskdgf"}

myFunction(user);

type myAlias = string | number;

function aliasFunction(thing: myAlias) {
    console.log(thing)
}

aliasFunction("Hello");
aliasFunction(4);




user.firstName = "Kyle";
user.lastName = "Plummer";
let fullName = user.fullName;
console.log(fullName);
console.log(user);