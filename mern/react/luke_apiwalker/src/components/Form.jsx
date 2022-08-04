import React , { useState } from 'react'
import { useNavigate } from 'react-router-dom' 


export const Form = () => {
    const [ category, setCategory ] = useState("");
    const [id, setId ] = useState("");
    const navigate = useNavigate();

    const handleSubmit = e =>{
        e.preventDefault()
        navigate(`${category}/${id}`)
    }


  return (
    <div>
        <form  onSubmit ={handleSubmit}>  

            <label htmlFor='category'> Search for:  </label>
            <select name="category" value={category} id="category" 
                onChange={ e => setCategory(e.target.value)} >
                <option hidden > Select a category </option>
                <option value="people" > People </option>
                <option value="planet"> Planets </option>
            </select>

            <div>
            <label htmlFor='id'> ID: </label>
            <input type="number" name="id" value={id} id="category" onChange={ e => setId(e.target.value)} />
            <button type='submit'> Search </button>
            
            </div>




        </form>
   </div>
  )
}
