import React from "react";
import Button from "../ChildComponent/Button";

function Parent() {
  return (
    <div>
      <h1>This is the parent</h1>
      <Button background_color="blue" message="hello" isRound={false} />
      <Button background_color="lightblue" message="there" isRound={true} />
    </div>
  );
}

/*
    Props are objects that are passed into a child by a parent via attributes/properties attached to the child component

    Within the JSX or TSX, it looks like this:

    <Button background_color="lightblue"/>

    The actual property name "background_color" is not specific to anything, it is like a reference name
    The value itself is what is important, however, in typescript, you have to describe the shape of the property object

    props = {
        background_color: "red",
        message: "hello"
    }
*/

export default Parent;
