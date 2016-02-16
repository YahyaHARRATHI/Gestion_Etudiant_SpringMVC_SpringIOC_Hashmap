<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/Style.css"/>
<title>Gestion des Etudiants</title>
</head>
<body>

<div id="formulaire">
<f:form method="post" action="saveEtudiant" modelAttribute="etudiant">
<table>
<tr>
<td> Cin : </td> <td><f:input path="cin"/></td><td><f:errors path="cin" cssClass="error"></f:errors></td>
</tr>

<tr>
<td>Nom : </td> <td><f:input path="nom"/></td> <td><f:errors path="nom" cssClass="error"></f:errors></td>
</tr>
<tr>
<td>Prenom : </td> <td><f:input path="prenom" /></td> <td><f:errors path="prenom" cssClass="error"></f:errors>
</tr>

<tr>
<td>Téléphone : </td> <td><f:input path="telephone" /></td> <td><f:errors path="telephone" cssClass="error"></f:errors>
</tr>
<tr><td><input type="submit" value="Ajouter"/></td></tr>
</table>
</f:form>
</div>
<div id="affichage">
<table class="table1">
<tr>
<th>CIN : </th><th>Nom :</th><th>Prenom :</th><th>Téléphone :</th>
</tr>
<tr>
<c:forEach items="${etudiants}" var="e">
<tr>
<td>${e.cin }</td><td>${e.nom }</td><td>${e.prenom }</td>
<td>${e.telephone}</td><td><a href="Supprimer?cin=${e.cin }">Supprimer</a></td><td><a href="Modifier">Modifier</a></td>


</tr>
</c:forEach>
</tr>


</table>
</div>
</body>
</html>