import './App.css';
import PersonCardComponent from './components/PersonCardComponent';



function App() {
  return (
    <div className="App">

      
      {/* < dataHeader />   */}
      

      < PersonCardComponent 
      firstName = "Mel"
      lastName = "Curylo"
      age = {28}
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
