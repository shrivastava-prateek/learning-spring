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
              Book NAME<form:input path="bookName"/><font color="red"><form:errors path="bookName"/></font><br>
              Book AUTH<form:input path="bookAuth"/><font color="red"><form:errors path="bookAuth"/></font><br>
              Book Pub<form:input path="bookPub"/><font color="red"><form:errors path="bookPub"/></font><br>
              Email<form:input path="email"/><font color="red"><form:errors path="email"/></font><br>
              <input type="submit" value="Add Book">
     </form:form>
</body>
</html>