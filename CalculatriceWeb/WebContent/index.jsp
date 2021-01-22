<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="admin/admin.jsp">Administration du site</a><br />
<a href="compta/compta.jsp">Suivi de la comptabilité</a><br />
<a href="public/public.jsp">Partie publique du site</a><br />
<h2>Appel de l'EJB CalculetteBean</h2>
<form action="calculer" method="POST">
<table>
<tr><td>Calcul à effectuer </td>
	<td><select name='operation'>
			<option value="plus">additionner</option>
			<option value="sous">soustraire</option>
		</select></td></tr>
<tr><td>Nombre 1 : </td><td><input type="text" name="nb1" value="3" /></td></tr>
<tr><td>Nombre 2 : </td><td><input type="text" name="nb2" value="1" /></td></tr>
<tr><td><input type="reset" value="EFFACER" /></td><td><input type="submit" value="CALCULER" /></td></tr>
</table>
</form>
${message }
</body>
</html>