from flask import Flask, render_template
app = Flask(__name__)

users = [
   {'first_name' : 'Melissa', 'last_name' : 'Curylo'},
   {'first_name' : 'Monty', 'last_name' : 'Supsupin'},
   {'first_name' : 'Julien', 'last_name' : 'Guillen'},
   {'first_name' : 'KB', 'last_name' : 'Tonel'}
]


##routes here
@app.route("/")
def users_list():
    return render_template("index.html", users = users )


if __name__=="__main__":
    app.run(debug=True)