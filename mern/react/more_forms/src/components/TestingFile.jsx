import React, { useState } from 'react';
    
    
const TestingFile = props => {
    const [state, setState] = useState({
        clickCount: 0
    });
 
    const handleClick = () => {
        setState({
            clickCount: state.clickCount + 1
        });
    }
 
    return (
        <div>
            <button onClick={ handleClick }> 
                You clicked the button { state.clickCount } times
            </button>
        </div>

        
    );
}
    
export default TestingFile;

