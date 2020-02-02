function bodyLoad() {
    let showButton = document.querySelector("#showButton");
    showButton.onclick = async function () {
        let response = await fetch('/allUsers');
        if (response.ok) {
            document.body.append(await response.text());
        }
    };
}