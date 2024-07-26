import React, { useEffect, useState } from 'react'
import { Pokemon } from './Pokemon';

/*
    What is a hook?
        - Extra methods that are added to functional components to provide the same functionality as class components
    
    useState()
        - Create state variables

*/



function Hooks() {
    // let counter: number = 16;

    // let [counter, setCounter] = useState(0);
    // let [visibility, setVisibility] = useState(true);

    let [state, setState] = useState(
        {
            counter: 0,
            visibility: false
        }
    );

    /*
        We are using a state variable to manage an API result
        This variable will be undefined until it has been loaded in asynchronously.

        While it is loading, we can set the state variable to be either undefined or the variable we expect as an interface. This interface should match the expected shape from whatever API you are trying to communicate with.

        Inside our return, we use a ternary operator to check if the value is truthy  or falsy. Based on that, we will decide what to show on the page
    */
    let [pokemon, setPokemon] = useState<Pokemon | undefined>(undefined);

    useEffect(() => {
        async function getPokemon(){
            let response = await fetch('https://pokeapi.co/api/v2/pokemon/ditto');
            let responseBody = await response.json();
            console.log(responseBody);
            setPokemon(responseBody)
        }
        getPokemon();
    }, []);



    function increment(){
        // setCounter(counter + 1);
        setState({...state, counter: state.counter + 1})
    }

    function toggleVisibility(){
        // setVisibility(!visibility);
        setState({...state, visibility: !state.visibility})
    }

  return (
    <div>
        {
            state.visibility ? <h1>Am I visible?</h1> : <></>
        }
        <button onClick={toggleVisibility}>Toggle Visibility</button>
        <h1>Counter</h1>
        <h2>{state.counter}</h2>
        <button onClick={increment}>Increment</button>
        
        {/* We are using <></> as our alternative when we are waiting for the data to display. For a better UI experience, consider adding a loading icon or component */}

        {
            pokemon ? pokemon.abilities.map((obj, index) => {
                return (
                <div key={index}>
                    <h1>{obj.ability.name}</h1>
                </div>)
            }) : <><h1>Loading Pokemon Abilities!</h1></>
        }

    </div>
  )
}

export default Hooks