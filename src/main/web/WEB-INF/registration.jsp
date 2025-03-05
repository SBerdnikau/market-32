
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
    <h2>Registration</h2>
    <form action="registration" method="post">
        <label for="firstName">First name:    </label><input type="text" id="firstName" name="firstName" required><br>
        <label for="secondName">Second name:  </label><input type="text" id="secondName" name="secondName" required><br>
        <label for="age">Age: </label><input id="age" type="number" name="age" required><br>
        <label for="email">Email:  </label><input id="email" type="text" name="email" required><br>
        <label for="gender">Gender:  </label><input id="gender" type="text" name="gender" required><br>
        <label for="telephoneNumber">Phone number:  </label><input type="text" id="telephoneNumber" name="telephoneNumber" required><br>
        <label for="login"></label>Login: <input type="text" id="login" name="login"required><br>
        <label for="password">Password: </label><input type="password" id="password" name="password"><br>
        <input type="submit" value="Registration">
    </form>
</body>
</html>
