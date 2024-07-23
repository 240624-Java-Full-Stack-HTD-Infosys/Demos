class Animal{
    name;

    constructor() {
        this.name;
    }

    breathe() {
        console.log(this.name + " is breathing...");
    }
}

class Dog extends Animal {
    constructor(name) {
        super(name);
    }
}

let myDogZia = new Dog("Zia");
console.log(myDogZia);
myDogZia.breathe();