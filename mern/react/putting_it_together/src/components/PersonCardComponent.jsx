import React, { Component } from 'react';
    
    
class PersonCardComponent extends Component {
    constructor(props){     // declared constructor to override defaultand set state object
        super(props);       // super gives all functionality that comes with Component
        this.state = {      // state = change
            age : props.age         // age changing here -- attributes for comparison
        }
    }

    render(){
        const { firstName, lastName, hairColor } = this.props;
        const addAgeByOne = () => { this.setState({ age : this.state.age +1 }) } // state = change
        return(
            <div>
                <div>
                {/* <header class="data_header"> { dataHeader }</header> */}
                </div>
                <h1>{ firstName } { lastName }</h1> 
                <ul class="list">
                    <li> Age:  { this.state.age } </li>
                    <li> Hair Color: { hairColor } </li>

                    <button onClick = {() => addAgeByOne()} >  Add One to Age </button>

                </ul>
            </div>
        )
    }
}

export default PersonCardComponent;