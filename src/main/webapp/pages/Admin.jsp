<!DOCTYPE html>
<html lang="en">
<head>
    <link href="/resources/css/HomePage.css" type="text/css" rel="stylesheet">
    <script src="/resources/js/Admin.js" type="text/javascript"></script>
    <meta charset="UTF-8">
    <title>Admin Page</title>
</head>
<body onload="bodyLoad()">
<h1>Hello, Admin</h1>
<br>
<h2>Change user's role</h2>
<form name="changeRole">
    <input type="text" name="login" placeholder="User's login">
    <select name="role">
        <option>USER</option>
        <option>ADMINISTRATOR</option>
        <option>ANONYMOUS</option>
    </select>
    <input type="submit" value="Apply">
</form>
<br>
<a href="/"><button>Home</button></a>
<br>
<button id="showButton">Show All Users</button>
</body>
</html>
