from flask import Flask
from flask import request

app = Flask(__name__)


def do_the_login():
    return 'login successful'


def show_the_login():
    return 'please login'


@app.route('/login', methods=['GET', 'POST'])
def login():
    if request.method == 'POST':
        return do_the_login()
    else:
        return show_the_login()


if __name__ == '__main__':
    app.run()
