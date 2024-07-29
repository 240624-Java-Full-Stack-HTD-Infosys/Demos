import React, { useState } from 'react'

function Counter() {
    const [counter, setCounter] = useState<number>(0);

    function increment() {
        setCounter(counter + 1);
    }
    function decrement() {
        setCounter(counter - 1);
    }

  return (
    <div>
        <h1>Count: {counter}</h1>
        <button onClick={increment}>Increment</button>
        <button onClick={decrement}>Decrement</button>
    </div>
    
  )
}

export default Counter