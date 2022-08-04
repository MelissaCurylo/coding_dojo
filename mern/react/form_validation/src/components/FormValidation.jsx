import React, { useReducer } from 'react';

export default function FormValidation() {
  const initialValues = {
    firstName: {
      value: '',
      // touched: false,
      // hasError: true,
      // error: "",
    },

    lastName: {
        value: '',
        // hasError: false,
        // error: null,
    },

    email: {
        value: '',
        // hasError: false,
        // error: null,
    },

    isFormValid: true
  }


  const [ formValues, setFormValues ] = useReducer (
    (currentValues, newValues) => ({ ...currentValues, ...newValues }), initialValues
    )

  const { firstName, lastName, email } = formValues;

  function handleInputChanges(e) {
    const { name, value} = e.target;
    setFormValues({ [name]: value })
  }


  return (

    <fieldset container="container">
      <form class="needs-validation" novalidate>

          <h3>Please Enter Your Information Below: </h3>

          <label class="inputBoxes" > First Name: 
            <input type="text"  name="firstName"  value={firstName.value} onChange= { handleInputChanges }  required />
          </label> 


          <label class="inputBoxes"> Last Name: 
            <input type="text"  name="lastName" value={lastName.value} onChange= { handleInputChanges } />
          </label>

          <label class="inputBoxes"> Email: 
            <input type="email"  name="email" value={email.value} onChange= { handleInputChanges } />
          </label>

          <button type="submit"> Submit </button>

      </form>
    </fieldset>

  )


}