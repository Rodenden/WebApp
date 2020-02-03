'use strict';
function bodyLoad() {
    let addForm = document.forms.addForm;
    addForm.onsubmit = function () {
        event.preventDefault();
        let formData = new FormData(addForm);
        let dataToJSON = {};
        formData.forEach((value, key) => dataToJSON[key] = value);
        post('/addUser', dataToJSON).then(function (value) {
            if (value != 200) document.body.append("This login is used yet");
        });
    };
}
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