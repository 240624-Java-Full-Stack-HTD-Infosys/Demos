import React, { useState } from 'react'

function ExerciseFive() {
    // let counter: number = 0;
    const [counter, setCounter] = useState<number>(0);

    function increment(){
        // counter++;
        setCounter(counter + 1);
    }

  return (
    <div>
        <h1>Counter: {counter}</h1>
        <button onClick={increment}>Increment</button>
    </div>
  )
}

export default ExerciseFive