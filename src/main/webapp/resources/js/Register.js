function bodyLoad() {
    let addForm = document.querySelector('#addForm');
    addForm.onsubmit = function () {
        event.preventDefault();
        let formData = new FormData(document.forms.addForm);
        let data = {};
        formData.forEach((value, key) => data[key] = value);

        post('/addUser', data).then(function (value) {
            if (value != 200) document.body.append("This login is used yet");
        });
    };

    async function post(requestUrl, body) {
        let result = await fetch(requestUrl, {
            method: 'POST',
            headers: {
                "Content-type": "application/json;charset=UTF-8"
            },
            body: JSON.stringify(body)
        });
        return result.status;
    }
}