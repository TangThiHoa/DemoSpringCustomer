<%--
  Created by IntelliJ IDEA.
  User: AE
  Date: 6/9/2022
  Time: 2:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach items="${cus}" var="customer">
    <h2>${customer.id},${customer.name},${customer.age}
    </h2>
</c:forEach>
</body>
</html>
