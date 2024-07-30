import React, { Component } from 'react'

export default class ClassComponent extends Component {

    counter: number = 0;

  render() {
    return (
      <div>
        <h2>Class Component</h2>
      </div>
    )
  }


  componentDidMount(): void {
      console.log("I just mounted to the page!");
  }
}
