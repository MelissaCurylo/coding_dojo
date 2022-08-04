# import the function that will return an instance of a connection
from mysqlconnection import connectToMySQL
# model the class after the friend table from our database


# this class needs to match the schema from database (columns attributes).
# 
class User:  
    def __init__( self , data ):
        self.id = data['id']
        self.first_name = data['first_name']
        self.last_name = data['last_name']
        self.email = data['email']
        self.created_at = data['created_at']
        self.updated_at = data['updated_at']

    def full_name(self):  #used in show_user file as a function; an oop solution
        return f"{self.first_name} {self.last_name}"
#///////////////////////////////////////////////////////////////////



    # Class method that will 'get all' via querying database, putting data into instances of the class.
    @classmethod
    def get_all(cls):
        query = "SELECT * FROM users;" #sql query 
        # call to connectToMySQL function connecting schema and calling query_db to pass in query (parses data) returning a list of dictionaries. (Goal is to ouput as a list of user object for scalability, allowing for more functionality to data than a database can offer)
        results = connectToMySQL('users_schema').query_db(query)  # if unable to connect to database the naming of schema could be incorrect.
        # Create an empty list to append instances of users
        users = []
        # Iterate over the db results and create instances of friends with cls.
        for x in results:  # results will return as an array so use for loop; x is a row of a user
            users.append( cls(x) )
        return users



    # this method is the injection 
    # using f strings can be an access point for hackers to manipulate database.
    @classmethod 
    def save(cls, data):
        query = "INSERT INTO users (first_name,last_name,email) VALUES (%(first_name)s,%(last_name)s,%(email)s);" # keep on one line; prevents sql injection by adding this syntax --> %()s

        # returns a new row id 
        result = connectToMySQL('users_schema').query_db(query,data) # the data being passed in is already lined up from forms and database. 
        return result


#/////Adding Action column triggers

    @classmethod
    def get_one(cls,data):
        query  = "SELECT * FROM users WHERE id = %(id)s";
        result = connectToMySQL('users_schema').query_db(query,data)
        return cls(result[0])  #result is a list in python


    @classmethod
    def update(cls,data):
        query = "UPDATE users SET first_name=%(first_name)s,last_name=%(last_name)s,email=%(email)s,updated_at=NOW() WHERE id = %(id)s;"
        return connectToMySQL('users_schema').query_db(query,data)


    @classmethod
    def destroy(cls,data):
        query  = "DELETE FROM users WHERE id = %(id)s;"
        return connectToMySQL('users_schema').query_db(query,data)