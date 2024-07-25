import React from 'react'
import './ListDemo.css' 

class Person {
    public firstName: string;
    public lastName: string;

    constructor(firstName: string, lastName: string){
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

const DUMMY_DATA: Array<Person> = [
    new Person("Mike", "Smith"),
    new Person("John", "Smith"),
    new Person("Jane", "Smith"),
    new Person("Emily", "Smith"),
];

function ListDemo() {
  return (
    <>
        {/* <div>{DUMMY_DATA[0].firstName} {DUMMY_DATA[0].lastName}</div>
        <div>{DUMMY_DATA[1].firstName} {DUMMY_DATA[1].lastName}</div>
        <div>{DUMMY_DATA[2].firstName} {DUMMY_DATA[2].lastName}</div>
        <div>{DUMMY_DATA[3].firstName} {DUMMY_DATA[3].lastName}</div> */}

        {
            DUMMY_DATA.map((obj: Person, index: number) => {
                return (
                    <div className='name-div' key={index}>
                        <div className='firstName-div'>{obj.firstName}</div>
                        <div className='lastName-div'>{obj.lastName}</div>
                        <button onClick={(event: any) => {console.log(event.target)}}>Person Button</button>
                    </div>
                );
            })
        }
    </>
  )
}

export default ListDemo