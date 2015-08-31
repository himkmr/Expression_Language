<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hello: ${sessionScope.user.name}<br>
Your ID: ${sessionScope.user.id}<br>
Your Email: ${sessionScope.user.email}<br>
Your Address: ${sessionScope.user.adr_obj.address}<br>
Your City: ${sessionScope.user.adr_obj.city}<br>
Your State: ${sessionScope.user.adr_obj.state}<br>
Your Zip: ${sessionScope.user.adr_obj.zip}<br>

</body>
</html>