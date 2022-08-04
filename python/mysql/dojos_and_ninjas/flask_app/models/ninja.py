from flask_app.config.mysqlconnection import connectToMySQL


class Ninja:
    def __init__( self, data):
        self.id = data[ 'id' ]
        self.dojo_id = data[ 'dojo_id' ]
        self.first_name = data[ 'first_name' ]
        self.last_name = data[ 'last_name' ]
        self.age = data[ 'age' ]
        self.created_at = data[ 'created_at' ]
        self.updated_at = data[ 'updated_at' ]

    @classmethod
    def get_all(cls):
        query = 'SELECT * FROM ninjas;'
        results = connectToMySQL('dojos_ninjas_schema').query_db(query)
        ninjas = [] 
        
        if len( results ) > 0:
            for ninja in results:
                ninjas.append(cls( ninja ) )
            return ninjas
        return None


    # method that gets called by () route
    @classmethod
    def save(cls, data):
        query = 'INSERT INTO ninjas (dojo_id, first_name, last_name, age) VALUES (%(dojo_id)s, %(first_name)s, %(last_name)s, %(age)s);'
        return connectToMySQL('dojos_ninjas_schema').query_db(query, data)
    
    
    @classmethod
    def get_all_from_dojo(cls, dojo_id):
        query = "SELECT * FROM ninjas WHERE dojo_id = "+  str(dojo_id) + ";"
        results = connectToMySQL('dojos_ninjas_schema').query_db(query)
        ninjas = [] 
        
        if len( results ) > 0:
            for ninja in results:
                ninjas.append(cls( ninja ) )
            return ninjas
        return None