from flask import session, request, render_template, redirect, flash
from flask_app import app
from flask_app.models.reg_model import Users
from flask_bcrypt import Bcrypt

bcrypt = Bcrypt( app )

@app.route("/")
def index():
    return render_template("reg.html")



@app.route("/user/new", methods=['POST'])
def add_user():
    if Users.validate_register( request.form ) == True:
        data = {
            "first_name" : request.form[ 'first_name' ],
            "last_name" : request.form[ 'last_name' ],
            "email" : request.form[ 'email' ],
            "password" : bcrypt.generate_password_hash( request.form[ 'password' ] )
        }
        
        
        result = Users.get_one( data )
        if result != None: 
            flash( "Email already used.", "error_register_email")
            return redirect( "/" )
        else:
            user_id = Users.create( data )
            session[ 'first_name' ] = request.form[ 'first_name' ]
            session[ 'last_name' ] = request.form[ 'last_name' ]
            session[ 'email' ] = request.form[ 'email' ]
            session[ 'user_id'] = user_id
            return redirect("/dashboard")
    else:
        return redirect("/")
            


@app.route("/dashboard")
def display_dashboard():
    return render_template("dashboard.html")


@app.route("/login", methods=['POST'])
def login():
        data = {
            "email" : request.form[ 'email' ]
        }
        if Users.validate_login( request.form ) == True:
            result = Users.get_one( data )
            
            if result == None: 
                flash( "Wrong email credentials.", "error_login")
                return redirect( "/" )
            else: 
                if not bcrypt.check_password_hash( result.password, request.form[ 'password' ] ):
                    flash( "Incorrect password.", "error_login_password")
                    return redirect ( "/" )
                else:
                    session[ 'email' ] = result.email
                    session[ 'first_name' ] = result.first_name
                    session[ 'last_name' ] = result.last_name
                    session[ 'user_id'] = result.id
                return redirect("/dashboard")
        return redirect ( "/" )
    
    
    
    
    


@app.route("/logout", methods=['POST'])
def logout():
    session.clear()
    return redirect("/")