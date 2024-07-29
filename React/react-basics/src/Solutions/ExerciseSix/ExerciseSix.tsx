import React, { useEffect, useState } from 'react'

function ExerciseSix() {

    const [counter, setCounter] = useState<number>(0);

    useEffect(() => {
        console.log(counter)
    }, [counter]);

  return (
    <div>
        <button onClick={() => setCounter(counter + 1)}>Increment</button>
    </div>
  )
}

export default ExerciseSix