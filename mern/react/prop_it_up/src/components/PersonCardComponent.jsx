import React, { Component } from 'react';
    
    
class PersonCardComponent extends Component {
    render(){
        const { firstName, lastName, age, hairColor } = this.props;
        return(
            <div>
                <h1>{ firstName } { lastName }</h1> 
                <ul class="list">
                    <li> Age:  {age } </li>
                    <li> Hair Color: { hairColor } </li>
                </ul>
            </div>
        )
    }
}

export default PersonCardComponent;