from flask_app.config.mysqlconnection import connectToMySQL
from flask_app import DATABASE 
from flask import flash, session
import re


EMAIL_REGEX = re.compile(r'^[a-zA-Z0-9.+_-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]+$') 



class User:
    def __init__(self, data):
        self.id = data[ 'id' ]
        self.first_name = data[ 'first_name' ]
        self.last_name = data[ 'last_name' ]
        self.email = data[ 'email' ]
        self.password = data[ 'password' ] 
        self.created_at = data[ 'created_at' ] 
        self.updated_at = data[ 'updated_at' ] 
        
    @classmethod
    def get_one( cls, data):
        query = "SELECT * "
        query += "FROM users "
        query += "WHERE email = %(email)s;"
        
        result = connectToMySQL( DATABASE ).query_db( query, data )
        
        if len( result ) > 0:
            return cls( result[0] ) # returns data as a list so need to use index but index 0 as we'll only have one result so always index 0
        else:
            return None
        
        
        
    @classmethod
    def create(cls, data):
        query = "INSERT INTO users( email, first_name, last_name, password )"
        query += "VALUES( %(email)s, %(first_name)s, %(last_name)s, %(password)s );"
            
        result = connectToMySQL( DATABASE ).query_db( query, data )


    @staticmethod
    def validate_register( data ):
        isValid = True
        
        if data['first_name'] == "":
            isValid = False
            flash( "Please enter your first name.", "error_register_first_name" )


        if len( data['first_name'] ) < 2:
            isValid = False
            flash( "Your first name must have atleast 2 characters", "error_register_first_name" )



        if data['last_name'] == "":
            isValid = False
            flash( "Please enter your last name.", "error_register_last_name" )


        if len( data['last_name'] ) < 2:
            isValid = False
            flash( "Your last name must have atleast 2 characters", "error_register_last_name" )



        if data['email'] == "":
            isValid = False
            flash( "Please enter your email.", "error_register_email" )


        if data['password'] != data['confirm_password']:
            isValid = False
            flash( "Passwords do not match.", "error_register_confirm_password" )



        if data['password'] == "":
            isValid = False
            flash( "Password field cannot be empty.", "error_register_password" )


        if data['confirm_password'] == "":
            isValid = False
            flash( "Confirm password field cannot be empty.", "error_register_confirm_password" )
            
        if not EMAIL_REGEX.match( data ['email'] ):
            flash( "Invalid email format.", "error_register_email")
            isValid = False
        return isValid



    @staticmethod
    def validate_session():
        if "user_id" not in session:
            return False
        else:
            return True