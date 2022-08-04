import React from 'react'

export const Input = ({ id, changed, value, label}) => (
        <label>{label}
            <input id={id} onChange={changed} value={value} />
        </label>
  );
  
export default Input;


