import React from "react";

function ExerciseTwo() {
  // function clickHandlerOne(){
  //     alert("Clicked");
  // }

  // function clickHandlerTwo(){
  //     console.log("Clicked")
  // }

  // function inputHandler(event: any){
  //     console.log(event.target.value)
  // }

  return (
    <div>
      <h1>Exercise Two - Events</h1>
      <button onClick={() => alert("Clicked")}>Click Me</button>
      <button onClick={() => console.log("Clicked")}>Click Me</button>
      <input
        type="text"
        onChange={(e: any) => console.log(e.target.value)}
      ></input>
    </div>
  );
}

export default ExerciseTwo;
