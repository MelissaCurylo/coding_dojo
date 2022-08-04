from flask import Flask  # Import Flask to allow us to create our app

app = Flask(__name__)    # Create a new instance of the Flask class called "app"


# #1
@app.route('/')          # base URL The "@" decorator associates this route with the function immediately following
def hello_world():       # methods
    return 'Hello World!'  # Return the string 'Hello World!' as a response

# #2
@app.route('/dojo')
def hello_dojo():
    return 'Dojo!'

# #3
@app.route('/say/<string:flask>')  # <string:flask> allows us to type any string in the url after /say/
def hello_flask(flask):
    return f"Hi {flask}!" #remember when passing path variable need curly brackets


# #4
@app.route('/repeat/<int:num>/<string:variety>') # <string:flask> allows us to type any string with a number variable in the url after /repeat/
def hello(num, variety):
    return f"{variety * num}" # use curly brackets to pass function




if __name__=="__main__":   # Ensure this file is being run directly and not from a different module    
    app.run(debug=True)    # Run the app in debug mode. app.run(debug=True) should be the very last statement.