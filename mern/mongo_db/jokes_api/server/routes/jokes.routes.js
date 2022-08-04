const JokesController = require('../controllers/jokes.controller');
 
module.exports = app => {
    app.get("/api/test", JokesController.testapi)
    app.get("/api/jokes", JokesController.findAllJokes)
    app.get("/api/jokes/:id", JokesController.findOneJoke)
    app.post("/api/jokes", JokesController.createJoke)
    app.put("/api/jokes/:id", JokesController.updateJoke)
    app.delete("/api/jokes/:id", JokesController.deleteJoke)
}
