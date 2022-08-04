from flask import Flask, render_template

app = Flask(__name__)

@app.route('/play')  # base route
def level_1():   # method
    return render_template("index.html", num=3, color="blue") 


@app.route('/play/<int:num>')  # second endpoint of base route.
def level_2(num): # method is adding number that will need to be enterd in URL
    return render_template("index.html", num=num, color="blue")


@app.route('/play/<int:num>/<string:color>')  # third endpoint of base route.
def level_3(num, color): # method is adding number and color arguments that will need to be enterd in URL
    return render_template("index.html", num=num, color=color) # return sends the URL variables.


if __name__=="__main__":
    app.run(debug=True)