import React, { useState } from 'react'
import Child from '../Child/Child'

export function Parent() {

    let [state, setState] = useState({
        text: ""
    });

    /*
        Instead of directly passing in the update state function into the child, the parent component sets up a specific state handler to update the state in a safe way.

        This function is then passed into the child as a prop so that the child can then use that function in their own way to update the state in the parent component
    */
   
    function updateStateText(newText: string){
        setState({...state, text: newText})
    }

  return (
    <div>
        <h1>Parent</h1>
        <h2>Text: {state.text}</h2>
        <Child updateStateText={updateStateText} />
    </div>
  )
}