<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action="j_security_check" method="POST">
<table>
<tr><td>Identifiant : </td>
	<td><input type="text" name="j_username" /></td>
</tr>
<tr><td>Mot de passe : </td>
	<td><input type="password" name="j_password" /></td>
</tr>
<tr><td colspan="2"><input type="submit" value="ENVOYER" /></td></tr>
</table>
</form>
</body>
</html>