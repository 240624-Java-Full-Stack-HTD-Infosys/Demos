class MyClass{
    #myField = 5;
    #anotherField = 10;

    constructor(num1, num2) {
        this.#myField = num1;
        this.#anotherField = num2;
    }

    myFunction() {

    }

    getMyField() {
        return this.#myField;
    }

    setMyField(num) {
        this.#myField = num;
    }

    getAnotherField() {
        return this.#anotherField;
    }

    setAnotherField(num) {
        this.#anotherField = num;
    }

}

let myParentObject = {
    parent: "Me",
    parentFunction: function() {
        console.log("This is in the parent");
    }
}

let myObject = new MyClass();

console.log(myObject.getMyField());



//Hypothesis: Javascript is pass-by-value
//Need to devise an expirament to test this

//pass a variable into constructor
//modify in the function
//print the value that we already had outside the class

class TestClass {
    myVariable;

    constructor(variable) {
        this.myVariable = variable;
    }

    getMyVariable() {
        return this.myVariable;
    }

    setMyVariable(variable) {
        this.myVariable = variable;
    }
}

let i = 1;

let obj = new TestClass(new TestClass(1));
obj.getMyVariable().setMyVariable(2);

console.log(obj);