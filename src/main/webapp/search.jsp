<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Search Form XSS</title>
</head>
<body>

<s:form action="searchForm">
    <s:textfield label="input" key="input"/>
    <s:submit/>
</s:form>


</body>
</html>
