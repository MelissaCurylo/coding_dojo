import './App.css';
import { Routes, Route, Link } from 'react-router-dom'
import { ErrorPage } from './views/ErrorPage';
import { People } from './views/People';
import { Planet } from './views/Planet';
import { Form } from './components/Form'


function App() {

  return (
    <div className="App">

      <h1> Star Wars API</h1>
      <Form/>
      
      <Routes>
        <Route path="/people/:id" element={ <People /> } />
        <Route path="/planet/:id" element={<Planet />}  />
        <Route path="*" element={<ErrorPage/>} />
      </Routes>
    
    </div>
  );
}

export default App;
