let a = 5;
let b = 'hello';
console.log(a+b);
console.log(typeof(a+b));

if('5' == 5) {
    //This type of equality check does coercion.
    console.log("'5' and 5 are equivalent")
}

if('5' === 5) {
    //This type of equality does not allow coercion
    //this equality operator is strict and checks for types
    //if the two operands are of different types, this is just false.
    console.log("'5' and 5 are equal")
}

//The strict equality checking with === does basically the following:
if((typeof '5' == typeof 5) && '5' == 5) {
    console.log("This predicate is equivalent to the strict equality checking");
}
