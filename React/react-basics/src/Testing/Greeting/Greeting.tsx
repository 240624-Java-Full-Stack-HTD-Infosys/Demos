import React, { useState } from 'react'
import Output from './Output';

function Greeting() {

    const [changedText, setChangedText] = useState<boolean>(false);

    const changeTextHandler = () => {
        setChangedText(true);
    }

  return (
    <div>
        <h2>Hello World</h2>
        {!changedText && <Output message={"It's nice to meet you"}/>}
        {changedText && <Output message={"I have been changed"}/>}

        <button onClick={changeTextHandler}>Change Text!</button>
    </div>
  )
}

export default Greeting