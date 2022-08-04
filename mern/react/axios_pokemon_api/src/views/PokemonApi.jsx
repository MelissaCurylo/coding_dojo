import React, {useState} from 'react'
import ListPokemon from '../components/ListPokemon'
import { Mounting } from '../components/Mounting'

const PokemonApi = () => {

  return (

    <fieldset className="ParentContainer">

      <div>
        <ListPokemon/>
        <Mounting/>
      </div>

      {/* <div className="YourCatches"> <CaughtPokemon/> </div> */}

    </fieldset>




  )
}

export default PokemonApi