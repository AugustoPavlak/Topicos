<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Atividade 2</title>
</head>
<body>
	<h1>Produtos</h1>
	<table style="border: solid 1px #000">
			<thead>
				<tr>
					<th></th>
					<th>ID</th>
					<th>Nome</th>
					<th>Preço</th>
					<th>Descricao</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="produto" items="${produtos}">
					<tr>
						<td><img href="${produto.image_url}" styles="width:50px;height:50px" /></td>
						<td>${produto.id}</td>
						<td>${produto.name}</td>
						<td>${produto.price}</td>
						<td>${produto.description}</td>
					</tr>
				
				</c:forEach>
			</tbody>
	</table>
</body>
</html>