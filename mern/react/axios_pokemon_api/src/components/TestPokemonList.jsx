import React, { useEffect, useState } from 'react'

const TestPokemonList = () => {

// --- Testing pokemon list with useState hook pairs ---//
    const [allPokemon] = useState([
        {id: 1, name: "ivysaur"},
        {id: 2, name: "venusaur"},
        {id: 3, name: "charmander"},
        {id: 4, name: "charmeleon"},
        {id: 5, name: "charizard"},

    ])




  return (
    <div className="DisplayLoadContainer">

        <h1>Test List: (pokemon list) </h1>


        {/* mapping test list of allPokemon */}
        {allPokemon.map((pokemon) => 
                <div  key={`${pokemon.id}-${pokemon.name}`}>
                    <p>{pokemon.id}</p>
                    <p>{pokemon.name}</p>
                </div>
                    )}


    </div>
  )
}

export default TestPokemonList