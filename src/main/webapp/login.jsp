<%--
  Created by IntelliJ IDEA.
  User: giannisc
  Date: 7/5/20
  Time: 3:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Search Form</title>
</head>
<body>

<s:form action="loginForm">
    <s:textfield label="LoginID" key="userID"/>
    <s:password label="Password" key="password"/>
    <s:submit/>
</s:form>


</body>
</html>
