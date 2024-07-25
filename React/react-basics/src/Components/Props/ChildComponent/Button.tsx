import React from 'react'

/*
    props = {
        background_color: "red",
        message: "hello"
    }

    What are Props?
        - Stands for properties
        - Allows us to retrieve data from the parent component to the child component
        - It is read only from the childs side, and it is read as an object
*/

interface ButtonProps {
    background_color: string;
    message: string;
    isRound: boolean;
}

function Button(props: ButtonProps) {
    
    console.log(props.background_color);
    console.log(props.message);

  return (
    <button style={{
        backgroundColor: props.background_color,
        color: "white",
        border: "none",
        borderRadius: props.isRound ? "8px" : "0px",
        padding: "8px",
        fontSize: "20px"
    }}>
        {props.message}
    </button>
  )
}

export default Button