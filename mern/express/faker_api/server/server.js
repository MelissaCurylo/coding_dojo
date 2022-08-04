//installs/imports:  
    // npm init -y (json package)
    // npm i express (express framework - node modules)
        //import express via require way.
    //  npm install @faker-js/faker --save-dev
        // import faker via require way.
    // nodemon server.js (turn on server)
    // port kill if needed: sudo kill -9 $(sudo lsof -t -i:8000)



const express = require("express")
const app = express()
const { faker } = require('@faker-js/faker');


// Express config:
app.use( express.json() );
app.use( express.urlencoded({ extended: true }) )



//faker company
const createCompany = () => {
    const newCompany = {
        _id: faker.database.mongodbObjectId(),
        company: faker.company.companyName(),
        address: {
            street : faker.address.streetAddress(false),
            city : faker.address.city(),
            state : faker.address.stateAbbr(), 
            zip : faker.address.zipCodeByState(), 
            country : faker.address.country()}
    }
    return newCompany;
};



const newFakeCompany = createCompany();
console.log(newFakeCompany);

// console.log(newFakeCompany.address.state)



//faker user
const createUser = () => {
    const newUser = {
        password: faker.internet.password(20, true),
        email: faker.internet.email(),
        phoneNumber: faker.phone.number(),
        lastName: faker.name.lastName(),
        firstName: faker.name.firstName(),
        employer: createCompany(),
        _id: faker.database.mongodbObjectId()
    }
    return newUser;
};


const newFakeUser = createUser();
console.log(newFakeUser);


// console.log([newFakeUser, newFakeCompany])


// create = GET 
app.get("/api/newCompany", (req, res) =>{
    res.json(createCompany())
})

app.get("/api/newUser", (req, res) =>{
    res.json(createUser())
})



app.listen(8000, () => console.log("Listening to port 8000"))