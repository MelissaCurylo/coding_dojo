from flask_app import app
from flask import redirect, render_template, request
from flask_app.models.dojo import Dojo
from flask_app.models.ninja import Ninja


# # (/dojos) - main page route (dojos.html)
# # (/dojo/show) - location show with newly added ninja (dojo_show.html)
# # (/create/ninja) - adding new ninja route redirects to ninja page (ninja.html)
# # (/new/dojo) - adding new dojo on (/dojos) route to (dojos.html)


@app.route('/')
def index():
    return redirect ('/dojos')


# # gets all dojos & returns them in a list of dojo objects.
@app.route('/dojos')
def main_page():
    return render_template('dojos.html', dojos=Dojo.get_all())



@app.route('/create/dojo', methods=['POST'])
def new_dojo():
    data = {
        "name" : request.form['name']
        }
    dojo_id = Dojo.save(data)
    return redirect('/dojos')





@app.route('/dojo/<int:id>')
def show_dojo(id):
    data = {
        "id" : id
    }
    dojo = Dojo.get_one( data )
    ninjas = Ninja.get_all_from_dojo(id)
    return render_template('dojo_show.html', dojo = dojo, ninjas = ninjas)

