from flask_app.config.mysqlconnection import connectToMySQL
# 


class Dojo:
    def __init__( self, data):
        self.id = data[ 'id' ]
        self.name = data[ 'name' ]
        self.created_at = data[ 'created_at' ]
        self.updated_at = data[ 'updated_at' ]


# query database all dojos & returns them in a list of dojo objects.
    @classmethod
    def get_all(cls):
        query = "SELECT * FROM dojos"
        results = connectToMySQL('dojos_ninjas_schema').query_db(query)
        dojos = []  # creating an empty list to append with dojo instances
        for dojo in results: # iterate over db results &  create instances of dojos with cls.
            dojos.append(cls( dojo ) )
        return dojos



    # method that gets called by (/new/dojo) route
    @classmethod
    def save(cls, data):
        query = 'INSERT INTO dojos (name) VALUES (%(name)s);'
        return connectToMySQL('dojos_ninjas_schema').query_db(query, data)
    
    
    @classmethod
    def get_one(cls, data):
        query = "SELECT * FROM dojos WHERE id = %(id)s;"
        
        result = connectToMySQL('dojos_ninjas_schema').query_db( query, data)
        
        if len( result ) > 0:
            return cls( result[0] )
        else:
            return None
        
    
    

    
