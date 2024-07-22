//When JS first came out there were only two scopes: global, and function.


//When does something begin to exist? - when it is declared
//except with hoisting (tm) in Javasript.
var x = 6

//When does something cease to exist? - when it falls out of scope


//======================================================================
//This is global scope
let a = 5;
function myFunction() {

    //this is function scope
    let b = 5;
    //a and b are in scope here

    {
        //this is block scope
        let c = 5;
        //a, b, and c are all in scope here
    }

    //we are back to function scope now
    //c is no longer in scope, a, and b still are
    //console.log("this should error out: ", c);

}

//now we are back to global scope, and only a is still valid here
myFunction();
