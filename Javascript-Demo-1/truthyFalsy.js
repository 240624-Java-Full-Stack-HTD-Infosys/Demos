// console.log(typeof "Hello");
// console.log(typeof 5);
// console.log(typeof ("Hello" + " world"));
// console.log(typeof (5 + 10));
console.log((5 + "Hello"));
console.log(typeof (5 + "Hello"));
console.log((true + 5));
console.log(typeof (true + 5));

//truthy & falsy - there are exactly 6 falsy values, everything else is truthy
// false
// 0
// ""
// undefined
// null
// NaN

if(false || 0 || "" || undefined || null || NaN) {//these items are all falsy, so the predicate is false
    console.log("We shouldn't see this message");
}

//declaring variables
var x;//let there be x
var y = 5;
y = 7;
y += 9;
y += "Hello"; //y = y + "Hello"
console.log(y)
console.log(typeof y)
y += 10;
console.log(y)
console.log(typeof y)


//let, const, and block scoping
let z = 10;//basically the same as var
z = 12;
z = "goodbye";
z += " world.";

//can't do this! CAn't reassign a const.
// const a = 10;
// a = "hello";
// console.log(a);






