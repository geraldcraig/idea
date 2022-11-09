from flask import Flask, jsonify, request
from http import HTTPStatus

app = Flask(__name__)

audio_files = [
    {
        'id': 1,
        'name': 'Egg Salad',
        'description': 'This is a lovely egg salad recipe.'
    },
    {
        'id': 2,
        'name': 'Tomato Pasta',
        'description': 'This is a lovely tomato pasta recipe.'
    }
]


@app.route('/audiofile', methods=['GET'])
def get_audio_file():
    return jsonify({'data': audio_files})


@app.route('/audiofile', methods=['POST'])
def add_audio_file():
    data = request.get_json()

    name = data.get('name')
    description = data.get('description')

    recipe = {
        'id': len(audio_files) + 1,
        'name': name,
        'description': description
    }

    audio_files.append(recipe)

    return jsonify(recipe), HTTPStatus.CREATED


if __name__ == '__main__':
    app.run()
