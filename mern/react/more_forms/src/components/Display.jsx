import React from 'react'

const Display = (props) => {

  return (

    
    
    <fieldset >
        
        <legend> New User: </legend>

        <p> First Name:         { props.firstName }        </p>
        <p> Last Name:          { props.lastName }         </p>
        <p> Email:              { props.email }            </p>
        <p> Password:           { props.password }         </p>
        <p> Confirm Password:   { props.passwordConfirm }  </p>

    </fieldset>

  )
}

export default Display