import React, { useState, useEffect } from 'react'
import axios from "axios"
import { useParams } from 'react-router-dom'


export const People = () => {
    const { id } = useParams()
    const [person,  setPerson ] = useState("")

    useEffect(() => {
      axios.get(`https://swapi.dev/api/people/${id}`)
        .then( response => {
            setPerson(response.data) })
        .catch(error => console.log(error))
    }, [id])
    

  return (
    <div>
        {
            person?
            <div > 
                <h1> {person.name} </h1>
                <h3> Height: {person.height} </h3>
                <h3> Mass: {person.mass} </h3>
                <h3> Hair Color: {person.hair_color} </h3>
                <h3> Skin Color: {person.skin_color} </h3>
                </div>:
            <div> 
                <h1> These aren't the droids you're looking for: </h1>
                <iframe src="https://giphy.com/embed/3o7abpQzRWVA99CAI8" alt="obe"></iframe>

            </div>

        }

    </div>

  )
}
