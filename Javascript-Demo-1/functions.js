let a = 2;
let b = 5;


function function1(a, b) {
    //standard function syntax we all know and love
    return a+b;
}
console.log(function1(a, b));

let function2 = function(a, b) {
    //slightly different, but does the same exact thing
    return a+b;
}
console.log(function2(a,b));

let function3 = (a, b) => {
    //arrow function definition, assigned into a variable, basically the same thing as abnove
    return a+b;
}
console.log(function3(a,b));





