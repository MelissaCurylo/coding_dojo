from flask import Flask, render_template, request, redirect
# import the class from friend.py
from users import User

app = Flask(__name__)


@app.route("/")
def index():
    return redirect("/users")



#method that is 'getting' the data and using oop to send objects into python
@app.route("/users")
def users():
    # call the get all classmethod to get all users
    users = User.get_all()
    print(users)
    return render_template("users.html", users = users)



@app.route('/user/new')
def new():
    return render_template("new_user.html")



@app.route('/user/create',methods=['POST']) # never render on a post, only redirect.
def create():
    print(request.form) # will show an immutable dictionary in command but not yet in application
    User.save(request.form) # dictionary was already lined up from front end to database so no need to add the dictionary again. This line of code links to the user class method under users.py
    return redirect('/users') # redirecting to /users because post was never rendered on.



#/////Adding Action column triggers////////////////////////

#renders the form 
@app.route('/user/edit/<int:id>')  
def edit(id):
    data ={ 
        "id":id # data object being created here
    }
    return render_template("edit_user.html",user=User.get_one(data))



@app.route('/user/show/<int:id>')
def show(id):
    data ={ 
        "id":id
    }
    return render_template("show_user.html",user=User.get_one(data))


@app.route('/user/return/')
def return_to_user_list():
    User.save(request.form)
    return redirect('/users')



@app.route('/user/edit/',methods=['POST'])
def update():
    User.update(request.form)
    return redirect('/users')



@app.route('/user/destroy/<int:id>')
def destroy(id):
    data ={
        'id': id
    }
    User.destroy(data)
    return redirect('/users')




if __name__ == "__main__":
    app.run(debug=True)