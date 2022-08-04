const Jokes = require("./../models/jokes.model")

module.exports.testapi = (req, res) => {
    res.json({Status: "ok"})
}


// step 
// write controller functions 
// write routes



/// find all --> get all
module.exports.findAllJokes = ( req, res ) => {
    Jokes.find()
        .then( allJokes => res.json(allJokes )) 
        .catch( err => res.json( err ));
}



/// find one -> get one -> needs :id 
module.exports.findOneJoke = ( req, res ) => {
    Jokes.findOne({ _id : req.params.id })
        .then( oneJoke => res.json( oneJoke ))
        .catch( err => res.json( err ));
}



/// create -> post route
module.exports.createJoke = ( req, res ) => {
    Jokes.create(req.body)
        .then( newJoke => res.json( newJoke ) )   
        .catch( err => res.json( err ));
}

// alternative create seen in lecture
// module.exports.createJoke = ( req, res ) => {
//     const newJoke = req.body
//     Jokes.create(newJoke)
//         .then( newJoke => res.json( newJoke ))
//         .catch( err => res.json(err));
// }




/// update -> put route -> needs id
module.exports.updateJoke = ( req, res ) => {
    Jokes.findOneAndUpdate(
        { _id : req.params.id },
        req.body,
        { new : true, runValidators: true }
    )
        .then( updateJoke => res.json( updateJoke ))
        .catch( err => res.json( err ));
}



/// delete -> delete -> needs id
module.exports.deleteJoke = ( req, res ) => {
    Jokes.deleteOne({ _id : req.params.id })
        .then( result => res.json( result ))   
        .catch( err => res.json( err ));
}