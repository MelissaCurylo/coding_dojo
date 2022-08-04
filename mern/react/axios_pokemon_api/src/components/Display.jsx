import React from 'react'

export const Display = (props) => {



  return (
    
    
    <div>

        <h1>Display</h1>

        <> 
            {props.allPokemon.length > 0 && props.allPokemon.map((pokemon, index) => {
                return <div key={index}>  <ul>{pokemon.name}</ul>  </div>
            })}
        </>

    </div>
  )
}
