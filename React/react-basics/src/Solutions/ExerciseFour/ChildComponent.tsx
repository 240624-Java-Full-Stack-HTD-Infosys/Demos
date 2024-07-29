import React from 'react'

/*
let props = {
    message: "hello",
    color: "red"
}

*/

interface ChildComponentProps {
    message: string;
    color: string;
}

function ChildComponent(props: ChildComponentProps) {
  return (
    <div>
        <h1 style={{backgroundColor: props.color}}>{props.message}</h1>
    </div>
  )
}

export default ChildComponent