import React, { useState } from "react";
// import { useId } from "react-id-generator";
import './App.css';

function App() {
  
  const [ newTodo, setNewTodo ] = useState("")
  const [todos, setTodos ] = useState([]);





  const handleNewTodoSubmit = (e) => 
    { e.preventDefault();

      if (newTodo.length == 0) {
        return;
      }

      const todoItem = {
        text: newTodo,
        complete: false
      }

      // if ( !newTodo.text || /^\s*$/.test(newTodo.text)) {
      //   return;
      // }

      setTodos([...todos, todoItem ]);
      setNewTodo("");
    };


  const deleteTodo = (deleteIndex ) => 
    { const filteredTodos = todos.filter((_todo, index) => {
      return index !== deleteIndex;
    });
    setTodos(filteredTodos);
  }

  const handleTickBox = (index) => {
    const updatedList = todos.map((todo, index) => {
      if (index === index ) {
        todo.complete = !todo.complete;
        // const updatedList = { ...todo, complete: !todo.complete };
        // return updatedList;

      // const todoClasses = (e) => {
      // if (todo.complete) {
      //     todoClasses.push("completeLineStrike");}
      }
      return todo;
    });
    setTodos(updatedList);
  }


  return (

  <div className="todoMain">
    <h1> To-Do List: </h1>

      <form  className="todoForm" onSubmit={(e) => { handleNewTodoSubmit(e);}} >
          <input 
            type="text" 
            placeholder="Add Your To-Do Here"
            value={newTodo}
            className="todoEntry"
            onChange={( e ) => { setNewTodo ( e.target.value ); }} 
          />

          <button  className="todoBtn" > Add </button>
      </form>


  {todos.map((todo, index) => {
      // <div className={todo.isComplete ? 'todo-row complete' : 'todo-row'} key={index} />
      // const todoClasses = [];
      //   if (todo.complete) {
      //     todoClasses.push("complete");
      //   } 

          return ( 
            <div key={index}> 

            <input 
              type="checkbox"  
              onChange={(e) => { handleTickBox(index); }} checked={todo.complete} 
            />

            <span className="complete"> {todo.text} </span>

            <button onClick={(e) => { deleteTodo(index); }}> Delete </button>

            </div> ); 
  })}

  </div>
  )
}

export default App;
