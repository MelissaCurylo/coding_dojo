from flask_app import app
from flask import redirect, render_template, request
from flask_app.models.ninja import Ninja
from flask_app.models.dojo import Dojo




# (/dojos) - main page route (dojos.html)
# (/dojo/show) - location show with newly added ninja (dojo_show.html)
# (/create/ninja) - adding new ninja route redirects to ninja page (ninja.html)
# (/new/dojo) - adding new dojo on (/dojos) route to (dojos.html)


@app.route('/')
def index_ninjas():
    return redirect ('/ninja')


# # gets & returns them in a list of dojo objects.
@app.route('/ninja')
def main_page_ninjas():
    return render_template('ninja.html', ninjas=Ninja.get_all(), dojos=Dojo.get_all())



@app.route('/create/ninja', methods=['POST'])
def add_ninja():
    data = {
        "dojo_id" : request.form['dojo_id'], #must match variables defined on page this one matches the dropdown id/name
        "first_name" : request.form['first_name'],
        "last_name" : request.form['last_name'],
        "age" : request.form['age']
        }
    Ninja.save(data)
    return redirect('/dojo/' + str(request.form['dojo_id']))
# ^^^ to pass numerical variable for dojo_id need to concat to string



# this redirects to dojo show