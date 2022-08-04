import React, { useState } from 'react'
import axios from 'axios' 
import { Display } from './Display';

const ListPokemon = () => {

    const [ allPokemon, setAllPokemon ] = useState([]);


    const handleFetch = async() => {
        const response = await axios.get(`https://pokeapi.co/api/v2/pokemon?limit=100000&offset=0`)
        setAllPokemon(response.data.results)
    };



  return (
    <div className="DisplayLoadContainer">

        <h1>All Pokemon Listed Below: </h1>
        <button onClick={handleFetch}> Fetch All Pokemon </button>
        <Display allPokemon={allPokemon}/>

    
    </div>
  )
}

export default ListPokemon