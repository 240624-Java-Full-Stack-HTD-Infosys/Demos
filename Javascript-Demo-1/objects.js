//no classes yet, just objects.
//classes weren't part of the language
//we just built 'bare objects'

let myParentObject = {
    parent: "Me"
}

let myObject = {//inside the block is just JSON!!
    "name":"value",
    "name2":"value2",
    "numberVal":5,
    "booleanVal": true,
    dontQuoteMe: "quotes aren't necessary here like they are in JSON",
    myFunction: function(a, b) {
        console.log("This is a funciton");
        return a+b;
    }
};

delete myObject.name2;
myObject.somethingNew = "This didn't exist before right here";
myObject.__proto__=myParentObject;//set up the proto chain

let sum = myObject.myFunction(2,5);
console.log(sum)

console.log(myObject);//console log everything! Kyle calls this fact finding