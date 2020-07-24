<%--
  Created by IntelliJ IDEA.
  User: giannisc
  Date: 7/5/20
  Time: 4:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Search Form</title>
</head>
<body>

<s:form action="tutorials/getTutorial">
    <s:textfield label="Make your pick" key="language"/>
    <s:submit/>
</s:form>

</body>
</html>
