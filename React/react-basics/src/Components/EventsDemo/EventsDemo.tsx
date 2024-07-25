import React from 'react'

function EventsDemo() {

    function clickEventHandler(){
        console.log("click event triggered");
    }

    function hoverEventHandler(){
        console.log("hover event triggered");
    }

    function changeHandler(event: any){
        // console.log("I have been changed!");
        console.log(event.target.value);
    }

  return (
    <>
        {/* This is how you can write JS or TS inside your JSX or TSX fragment */}
        <button onClick={clickEventHandler}>Click Event</button>
        <button onMouseOver={hoverEventHandler}>Hover Event</button>
        <input type="text" placeholder="Username" onChange={changeHandler}></input>
    </>
  )
}

export default EventsDemo