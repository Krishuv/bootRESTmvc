<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:if test="${!list.isEmpty() }">

<table border=2px style="width=100%"> 
<thead>
<tr>
<td>id</td>
<td>name</td>


<td>designation</td>
<td>salary</td>
<td>Action</td>

</tr>

</thead>
<c:forEach   var="list" items="${list }"   >

<td><c:out value="${list.id }"></c:out>
<td><c:out value="${list.name }"></c:out>
<td><c:out value="${list.designation }"></c:out>
<td><c:out value="${list.salary }"></c:out>

<td><a href="update?id=${list.id }">edit</a>        </td>



</c:forEach>
</table>

</c:if>
</body>
</html>