import React from 'react'

const FormPokemon = (props) => {

// const handleFetch = () => {

    // useEffect(() => {
    //     fetch(`https://pokeapi.co/api/v2/pokemon?limit=100000&offset=0`)
    //         .then(response => { 
    //             console.log(response) 
    //             return response.json()
    //         })
    //         .then(jsonResponse => {
    //             console.log(jsonResponse) 
    //             setAllPokemon(jsonResponse)
    //         })
    //         .catch(error => console.log(error))
    // }, [allPokemon]);


    // const handleFetch = () => {
    //     // const response = await 
    //     axios.get(`https://pokeapi.co/api/v2/pokemon?limit=100000&offset=0`)
    //     .then(response => { 
    //         console.log(response) 
    //         return response.json()
    //     })
    //     .then(jsonResponse => {
    //         console.log(jsonResponse) 
    //         setAllPokemon(jsonResponse)
    //     })
    //     .catch(error => console.log(error))
    // };


// }

  return (
    <div className="form">

        <form>

            {/* <button onClick={handleFetch}> Fetch All Pokemon </button> */}

            <div>
            <button >Gotta Catchem All</button>
            {/* onclick={handleCatchAPokemon} */}
            </div>

        </form>


    </div>
  )
}

export default FormPokemon