import React, { useState } from 'react'
import Display from './Display';

const UserForm = (props) => {
    const [firstName, setFirstName] = useState("");
    const [lastName, setLastName] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [passwordConfirm, setpasswordConfirm] = useState("");

    const createUser = (e) => {
        e.preventDefault();
        const newUser = { firstName, lastName, email, password, passwordConfirm };
        console.log( "Welcome", newUser); }

    const handlePassword = e => { setPassword(e.target.value) }


    
    return(

        //    {/* //
        //     ## Notes:
        //     ## // useState("") = initital state
        //     ##  Chaning the initial state is through the value={fistName}  communicates with useState("") 
        //     ## useState("") --> the parantheses value will store the
        //     ##  typing input triggers onChange event 
        //     ##  Clean forms such as keeping things that will change (useState) variables and those that do not change display props)
        //     */}


        <fieldset onSubmit={ createUser }>
            <legend> User Form </legend>

            <p class="inputBoxes">
                <label> First Name: </label> 
                <input type="text" name="firstName" value={firstName}
                    onChange={ (e) => setFirstName(e.target.value) } />
            </p>


            <p class="inputBoxes">
                <label> Last Name: </label>
                <input type="text" name="lasttName" value={lastName}
                    onChange={ (e) => setLastName(e.target.value) } />
            </p>


            <p class="inputBoxes">
                <label> Email: </label>
                <input type="text" name="email" value={email} 
                    onChange={ (e) => setEmail(e.target.value) } />
            </p>


            <p class="inputBoxes">
                <label> Password: </label>
                <input type="password" name="password" value={password} 
                    onChange={ handlePassword } />
            </p>


            <p class="inputBoxes">
                <label> Confirm Password: </label>
                <input type="password" name="passwordConfirm" value={passwordConfirm}
                    onChange={ (e) => setpasswordConfirm(e.target.value) } />
            </p>

            <Display 
                firstName= { firstName } 
                lastName= { lastName }
                email=    { email }
                password= { password }
                passwordConfirm = { passwordConfirm }
            />

        </fieldset>
    )
}

export default UserForm