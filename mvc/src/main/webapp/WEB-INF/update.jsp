<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://www.springframework.org/tags/form" prefix="a" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a:form  action="update" method="post"  modelAttribute="asst"    >
<a:input path="id"    readonly="true"/>
<a:input path="name"    />   
<a:input path="designation"/>
<a:input path="salary"/>
<input type="submit">
</a:form>












</body>
</html>