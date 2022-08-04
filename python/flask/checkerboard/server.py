from re import X
from flask import Flask, render_template
app = Flask(__name__)       #global variable

###some code here for routes and endpoints
##create html and css first then add in support backend features


# 8x8 Checkerboard on localhost: 5000 in redundancy html file
@app.route( "/" )
def redundant():
    return render_template( "redundancy.html" )


# 8x4 Checkerboard on localhost: 5000/4 in refactoring_method.html
@app.route( "/" )
@app.route( "/4" )
def refactoring():
    return render_template( "refactoring_method.html" )


# 10x10 Checkerboard on localhost: rows,columns
@app.route( "/" )
@app.route( "/<rows>/<columns>" )
def passing_variables(rows, columns):
    return render_template( "index.html", rows= int(rows), columns= int(columns) )


if __name__ =="__main__":
    app.run(debug=True)
