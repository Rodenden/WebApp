'use strict';

function bodyLoad() {
    let loginForm = document.forms.login;
    loginForm.onsubmit = function () {
        event.preventDefault();
        let formData = new FormData(loginForm);
        let dataToJSON = {};
        formData.forEach((value, key) => dataToJSON[key] = value);
        post('/loginAction', dataToJSON).then(function (value) {
            if (value != 200) document.body.append("Login/password incorrect");
            else document.body.append("OK");
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