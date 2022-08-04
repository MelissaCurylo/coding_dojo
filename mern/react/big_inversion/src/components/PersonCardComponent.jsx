// import React from 'react';
    

const PersonCardComponent = props => {

    return(
        <div>
            <h1>{ props.firstName } { props.lastName }</h1> 
            <ul class="list">
                <li> Age:  { props.age } </li>
                <li> Hair Color: { props.hairColor } </li>

                {/* <button onClick = {() => addAgeByOne()} >Add One to Age </button> */}
            </ul>
        </div>
    )

}
export default PersonCardComponent;