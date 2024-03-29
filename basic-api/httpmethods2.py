from flask import Flask
from flask import request

app = Flask(__name__)


def do_the_login():
    return 'login successful'


def show_the_login_form():
    return 'please login'


@app.get('/login')
def login_get():
    return show_the_login_form()


@app.post('/login')
def login_post():
    return do_the_login()


if __name__ == '__main__':
    app.run()
