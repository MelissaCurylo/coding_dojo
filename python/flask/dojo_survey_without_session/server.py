from flask import Flask, render_template, redirect, request
app = Flask(__name__)

@app.route("/")
def index():
    return render_template("index.html")


@app.route("/results/new", methods=['POST'])
def user_entry():
    # print ("Hello Test")
    name = request.form['name']
    location = request.form['location']
    language = request.form['language']
    toggle = request.form['toggle']
    comments = request.form['comments']
    tickbox = request.form['tickbox']
    print (name, location, language, toggle, comments, tickbox)
    return redirect("/results")


@app.route("/results")
def user_result():
    return render_template("results.html")


if __name__ =="__main__":
    app.run(debug = True)