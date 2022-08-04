import React, { useState } from 'react'
import Display from './Display';

const UserForm = (props) => {
    const [firstName, setFirstName] = useState("");
    const [lastName, setLastName] = useState("");
    const [email, setEmail] = useState("");
    const [password, setPassword] = useState("");
    const [passwordConfirm, setpasswordConfirm] = useState("");
    
    
    const [isSubmitted, setIsSubmitted] = useState(false)


    // const createUser = (e) => {
    //     e.preventDefault();
    //     const newUser = { firstName, lastName, email, password, passwordConfirm };
    //     console.log( "Welcome", newUser); }

    const handlePassword = e => { setPassword(e.target.value) }

    const handleSubmit = (e) => {
        e.preventDefault()
        if( firstName.length > 2 
                && lastName.length > 2
                && lastName.length > 2
                && email.length > 2
                && password.length > 8
                && passwordConfirm.length == password.length
                && password == passwordConfirm ) {
            console.log({ firstName, lastName, email, password, passwordConfirm })
            setIsSubmitted( true );
        }
        else{
            alert( "Please make sure all fields are filled out" )
        }
    }


    const formMessage = () => { 
        if( isSubmitted ) {
            return "Thank you for submitting the form!"
        } 
        else {
            return "Please fill the form below:"
        }
    }



    return(

        <fieldset>
            <legend>Welcome!</legend>
        {
            ! isSubmitted &&  
             // this ternary funciton makes form disapper after submitting - wrap whole form body//


            <form className="fieldEntry" onSubmit={ handleSubmit }>
                <h3>Welcome to the User Form!</h3>

                <h4> { formMessage() } </h4>

                <p class="inputBoxes">
                    <label> First Name: </label> 
                    <input type="text" name="firstName" value={firstName}
                        onChange={ (e) => setFirstName(e.target.value) } />
                </p>

                {
                    firstName.length < 3 ?
                    <span style={{ color: "red" }} >
                        Entry must be greater than 3 characters in length.
                    </span> : ""
                }

                <p class="inputBoxes">
                    <label> Last Name: </label>
                    <input type="text" name="lasttName" value={lastName}
                        onChange={ (e) => setLastName(e.target.value) } />
                </p>
                
                    {
                        lastName.length < 3 ?
                        <span style={{ color: "red" }} >
                            Entry must be greater than 3 characters in length.
                        </span> : ""
                    }

                <p class="inputBoxes">
                    <label> Email: </label>
                    <input type="text" name="email" value={email} 
                        onChange={ (e) => setEmail(e.target.value) } />
                </p>
                    {
                        email.length < 3 ?
                        <span style={{ color: "red" }} >
                            Entry must be greater than 3 characters in length.
                        </span> : ""
                    }


                <p class="inputBoxes">
                    <label> Password: </label>
                    <input type="password" name="password" value={password} 
                        onChange={ handlePassword } />
                </p>

                    {
                        password.length < 8 ?
                        <span style={{ color: "red" }} >
                            Entry must be greater than 8 characters in length.
                        </span> : ""
                    }


                <p class="inputBoxes">
                    <label> Confirm Password: </label>
                    <input type="password" name="passwordConfirm" value={passwordConfirm}
                        onChange={ (e) => setpasswordConfirm(e.target.value) } />
                </p>

                    {
                        passwordConfirm.length < 8 ?
                        <span style={{ color: "red" }} >
                            Entry must be greater than 8 characters in length.
                        </span> : ""
                    }

                    {
                        passwordConfirm != password ?
                        <span style={{ color: "red" }} >
                            Passwords to not match, please correct.
                        </span> : ""
                    }

                
                <div>
                    <button> Submit </button>
                </div>


            </form>
        }

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