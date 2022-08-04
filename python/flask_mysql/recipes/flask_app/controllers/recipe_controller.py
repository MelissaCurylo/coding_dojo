from flask import session, request, render_template, redirect, flash
from flask_app import app
from flask_app.models.recipe_model import Recipe
from flask_app.models.user_model import User


# @app.route( "/display/recipe" )
# def display_recipe():
#     if User.validate_session():
#         return render_template( "recipe.html" )
#     else:
#         return redirect( "/" )


@app.route( "/dashboard" )
def get_recipes():
    if User.validate_session():
        recipes = Recipe.get_all()
        return render_template( "dashboard.html", recipes = recipes )
    else:
        return redirect( "/" )




@app.route( "/recipe/new" )
def display_recipe():
    if User.validate_session():
        return render_template( "recipe.html" )
    else:
        return redirect( "/" )


@app.route("/recipe/add", methods=['POST'])
def create_recipe():
    if Recipe.validate_recipe(request.form) == True:
        data = {
            "name" : request.form['name'],
            "description" : request.form['description'],
            "instructions" : request.form['instructions'],
            "under_thirty" : request.form['under_thirty'],
            "created_at" : request.form['created_at'],
            "user_id" : session['user_id']
            }
        
        Recipe.create( data )
        
        return redirect( "/dashboard" )
    else:
        return redirect ("/recipe/new")



@app.route( "/recipe/<int:id>")
def recipe_get_one( id ):
    if User.validate_session():
        data = {
            "id" : id
        }
        
        recipe = Recipe.get_one( data )
        
        return render_template( "displayRecipe.html", recipe = recipe )
    else:
        return redirect ("/")




@app.route( "/recipe/delete/<int:id>" )
def delete_recipe( id ):
    data = {
        "id" : id
    }
    
    Recipe.delete_one( data )
    
    return redirect( "/dashboard" )




@app.route( "/recipe/edit/<int:id>" )
def display_recipe_edit( id ):
    if User.validate_session():
        data = {
            "id" : id
        }
        
        recipe = Recipe.get_one( data )
        
        return render_template( "/displayEditRecipe.html", recipe = recipe )
    else:
        return redirect( "/dashboard" )
    
    

@app.route( "/recipe/update/<int:id>", methods = ['POST'] )
def update_recipe( id ):
    if Recipe.validate_recipe(request.form) == True:
        data = {
            "id" : id,
            "name" : request.form[ 'name' ],
            "description" : request.form[ 'description' ],
            "instructions" : request.form[ 'instructions' ],
            "under_thirty" : request.form[ 'under_thirty' ],
            "created_at" : request.form[ 'created_at' ],
            "user_id" : session[ 'user_id' ]
        }
        
        Recipe.update_one( data )
        
        return redirect( "/dashboard" )
    else:
        return redirect("/recipe/edit/" + str(id))


