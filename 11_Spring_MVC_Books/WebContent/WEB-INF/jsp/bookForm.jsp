<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Form</title>
</head>
<body>
   <form:form modelAttribute="book" method="POST" action="addBook">
         Book Registration
              Book ID<form:input path="bookId"/><br>
              Book NAME<form:input path="bookName"/><br>
              Book AUTH<form:input path="bookAuth"/><br>
              Book Pub<form:input path="bookPub"/><br>
              Email<form:input path="email"/><br>
              <input type="submit" value="Add Book">
     </form:form>
</body>
</html>