from flask_app import app
from flask import render_template,redirect,request
from flask_app.models.users import User
# from users import database_users

@app.route("/")
def index():
    return redirect("/users")


@app.route("/users")
def users():
    users = User.get_all()
    print(users)
    return render_template("users.html", users = users)



@app.route('/user/new')
def new():
    return render_template("new_user.html")



@app.route('/user/create',methods=['POST']) 
def create():
    print(request.form) 
    User.save(request.form) 
    return redirect('/users') 


@app.route('/user/edit/<int:id>')  
def edit(id):
    data ={ 
        "id":id 
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

