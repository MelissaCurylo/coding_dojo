import React, { useState, useEffect } from 'react'
import axios from "axios"
import { useParams } from 'react-router-dom'



export const Planet = () => {

    const { id } = useParams()
    const [planet,  setPlanet ] = useState("")

    useEffect(() => {
      axios.get(`https://swapi.dev/api/planets/${id}`)
        .then( response => {
            setPlanet(response.data) })
        .catch(error => console.log(error))
    }, [id])



  return (

    <div>
        {
            planet ?
            <div > 
                <h1> {planet.name} </h1>
                <h3> Climate: {planet.climate} </h3>
                <h3> Mass: {planet.terrain} </h3>
                <h3> Surface Water: {planet.surface_water} </h3>
                <h3> Population: {planet.population} </h3>
            </div>:
            <div> 
                <h1> These aren't the droids you're looking for</h1>
                <iframe src="https://giphy.com/embed/3o7abpQzRWVA99CAI8" alt="obe"></iframe>

            </div>

        }

    </div>

  )
}
