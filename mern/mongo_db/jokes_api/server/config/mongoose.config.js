const mongoose = require("mongoose");

mongoose.connect("mongodb://localhost/jokes_db", {
    useNewUrlParser: true,
    useUnifiedTopology: true
})

    .then(() => console.log("Establised a connection to the database"))
    .catch(err => console.log("Something went wrong when connecting to the database", err));