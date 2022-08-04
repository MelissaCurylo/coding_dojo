from flask_app.config.mysqlconnection import connectToMySQL
from flask_app import DATABASE
from flask import flash



class Recipe:
    def __init__(self, data):
        self.id = data[ 'id' ]
        self.name = data[ 'name' ]
        self.description = data[ 'description' ]
        self.instructions = data[ 'instructions' ]
        self.under_thirty = data[ 'under_thirty' ]
        self.created_at = data[ 'created_at' ]
        self.updated_at = data[ 'updated_at' ]
        self.user_id = data[ 'user_id' ]
        
        
    # Post class method  
    @classmethod
    def create( cls, data):
        query = "INSERT INTO recipes( name, description, instructions, under_thirty, created_at, user_id) " 
        query += "VALUES( %(name)s, %(description)s, %(instructions)s, %(under_thirty)s, %(created_at)s, %(user_id)s);"
        
        return connectToMySQL( DATABASE ).query_db( query, data )
     
     
    @classmethod
    def get_all( cls ):
        query = "SELECT * "
        query += "FROM recipes;"
        
        result = connectToMySQL( DATABASE ).query_db( query )
        recipes = []
        
        if len( result ) > 0:
            for recipe in result:   #can use for in range loop here instead
                recipes.append( cls( recipe ) )
        return recipes
        
        
        
        
    @classmethod
    def get_one( cls, data ):
        query = "SELECT * "
        query += "FROM recipes "
        query += "WHERE id = %(id)s;"
        
        result = connectToMySQL( DATABASE ).query_db( query, data)
        
        if len( result ) > 0:
            return cls( result[0] )
        else: 
            return None
        
        
        
    @classmethod
    def delete_one( cls, data ):
        query = "DELETE FROM recipes "
        query += "WHERE id = %(id)s;"
        
        return connectToMySQL( DATABASE ).query_db( query, data)
    
    
    
    
    @classmethod
    def update_one( cls, data):
        query = "UPDATE recipes " 
        query += "SET name = %(name)s, description = %(description)s, instructions = %(instructions)s, "
        query += "under_thirty = %(under_thirty)s, created_at = %(created_at)s, user_id = %(user_id)s "
        query += "WHERE id = %(id)s;"
        
        return connectToMySQL( DATABASE ).query_db( query, data )
    
    
    
    @staticmethod
    def validate_recipe( data ):
        isValid = True
        
        if data['name'] == "":
            isValid = False
            flash( "Please enter a name for recipe.", "error_recipe_name" )

        if data['description'] == "":
            isValid = False
            flash( "Please enter a description for recipe.", "error_recipe_description" )


        if data['instructions'] == "":
            isValid = False
            flash( "Please enter instructions for recipe.", "error_recipe_instructions" )


        if data['created_at'] == "":
            isValid = False
            flash( "Please select a date.", "error_recipe_date" )
        return isValid





