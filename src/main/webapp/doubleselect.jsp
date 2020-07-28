<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>

<body>
<h1>Struts 2 &lt;s:doubleselect&gt; example</h1>

<s:form action="resultAction" namespace="/">

<s:doubleselect label="Fruits (OGNL) "
name="fruit1" list="{'fruit','meat'}"
doubleName="fruit2"
doubleList="top == 'fruit' ? {'apple', 'orange','banana'} : {'chicken', 'pig'}" />


<s:submit value="submit" name="submit" />

</s:form>

</body>
</html>