from flask import Flask, render_template,request, redirect, session

app = Flask(__name__)
app.secret_key = "ray of clouds"


#root route to show form request
@app.route( "/" )
def form():
    return render_template( "index.html" )


# route to direct inputs via POST/session/request/url_for
@app.route( "/form/new", methods=['POST'] )
def form_details():
    # print (request.form)
    if request.method == "POST":
        session["details"] = {
            "name" : request.form["name"],
            "location" : request.form["location"],
            "language" : request.form["language"],
            "comments" : request.form["comments"],
            "toggle" : request.form["toggle"],
            "tickbox" : request.form["tickbox"],
        }
    return redirect( "/form/results" )


# route to display inputs -- connection to html form information
@app.route( "/form/results")
def results():
    return render_template("results.html")



if __name__ =="__main__":
    app.run(debug = True)
