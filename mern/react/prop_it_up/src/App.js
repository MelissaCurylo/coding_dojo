import logo from './logo.svg';
import './App.css';

import PersonCardComponent from './components/PersonCardComponent';

import NewComponent from './components/NewComponent';


function App() {
  return (
    <div className="App">
    {/* < NewComponent /> */}

      < PersonCardComponent 
      firstName = "Mel"
      lastName = "Curylo"
      age = "A lady never shares ;-D"
      hairColor = "Blonde"
      />

      < PersonCardComponent 
      firstName = "Julia"
      lastName = "Roberts"
      age = {52}
      hairColor = "Brown"
      />

      < PersonCardComponent 
      firstName = "Mel"
      lastName = "Gibson"
      age = {62}
      hairColor = "Brown"
      />

      < PersonCardComponent 
      firstName = "Galileo"
      lastName = "Galilei"
      age = {458}
      hairColor = "Gray"
      />


      
    
    </div>
  );
}

export default App;
