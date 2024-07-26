import React from 'react'

function Child(props: any) {

    function inputHandler(event:any){
        props.updateStateText(event.target.value);
    }
  return (
    <div>
        <h4>Child</h4>
        <input type="text" onChange={inputHandler}></input>
    </div>
  )
}

export default Child