from flask import Flask, render_template, request, redirect, session
app = Flask(__name__)
app.secret_key = "secret"

# code routes/endpoints here
@app.route("/")
def counter():
    if "num_of_visits" in session:   #if number of visits is ALREADY inside of sessions then =+1 else 1.
        session["num_of_visits"] += 1
    else:
        session["num_of_visits"] = 1
    return render_template( "index.html")


@app.route("/adjust_visits", methods=[ "POST" ])
def add_two():
    if request.form["change_value"] == "add_two":  
        session["num_of_visits"] += 1 
        # ^^^setting this at two is wrong, I tried and got the output for my counter to received 3 total; so value needs to be 1
    elif request.form["change_value"] == "reset":
        session["num_of_visits"] = 0  
        # ^^^setting this at one is wrong, I tried and got the output for my counter to received 2; so value needs to be zero
    return redirect( "/")


@app.route("/destroy_session")
def destroy():
    session.clear()
    return redirect("/")

# session.clear()		# clears all keys
# session.pop('key_name')		# clears a specific key




"""

Notes:

GET - read and display
    URL of the route to display all: the name of the list or dictionary we are about to display
    Example: "/todos"
    Example: "/users"

    URL of the route to display one: the name of the list in singlular that we are about to display followed by the id
    Example: "/todos/<int:id>"
    Example: "/users/todos<int:id>

POST - create

PUT - update

DELETE - remove

"""


if __name__ == "__main__":
    app.run(debug=True)
