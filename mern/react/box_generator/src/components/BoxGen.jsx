import React, {useState} from 'react'

export const BoxGen = (props) => {

    const [ boxColor, setBoxColor ] = useState("");
    const [ boxSize, setBoxSize ] = useState("");
    const [ boxList, setBoxList ] = useState([])


    const createBox = (e) => {
        e.preventDefault();
        const newBox = { boxColor, boxSize };
        setBoxList([newBox, ...boxList]);
        console.log(boxList)
    }

  return (

    <form onSubmit = { createBox } >

        <h1> Design Your Boxes </h1>

        <input 
            className="boxColor"
            type="text"  
            name ="boxColor"  
            value={ boxColor }
            placeholder="Type a color in this box!" 
            onChange= { (e) => setBoxColor( e.target.value ) } >
        </input>


        <input 
            className="boxSize"
            type="number"  
            name ="boxSize"  
            value={ boxSize } 
            placeholder="Type a size in this box!" 
            onChange= { (e) => setBoxSize( parseInt( e.target.value)) }>
        </input> 

        <button> Submit </button>


    <div className="boxFlow">
        {boxList.map 
            (( box,i) => 
                <div key={i} style= {{
                    backgroundColor: box.boxColor, 
                    height: box.boxSize, 
                    width: box.boxSize }}/>
            )}
    </div>
</form>

  )
}
//lifting state (via props)--separate degree of elements. ie. boxList as parent, 
// add key with index