import React, { Component } from 'react'


export class Main extends Component {
  render() {
    return (
      <div class="mainContainer" >
        { this.props.children }
      </div>
    )
  }
}

export default Main