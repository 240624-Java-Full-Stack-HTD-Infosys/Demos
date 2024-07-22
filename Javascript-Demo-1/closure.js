function getFunction() {
    let name = "Kyle"; 

    function getName() {
      return name;
    }

    let getname = () => {}

    return getName;
  }


let getName = getFunction();

console.log(getName());