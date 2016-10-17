<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">

<style>
#header {
    background-color:black;
    color:white;
    text-align:center;
    padding:5px;
}

#section {
    height:700px;
    text-align:center;
    padding:5px;	 	 
}

#footer {
    background-color:black;
    color:white;
    clear:both;
    text-align:center;
   padding:5px;	 	 
}
</style>
</head>

<body>
	<br/>
	<div id="header"><h2 align="center">Add A New Book </h2></div>
	<div id="section">
	<center>
	<br/><br/><br/>
	<s:form action="addonebook">
		<s:textfield name="ISBN" label="ISBN"></s:textfield>
		<s:textfield name="AuthorID" label="AuthorID"></s:textfield>
		<s:textfield name="Title" label="Title"></s:textfield>
		<s:textfield name="Publisher" label="Publisher"></s:textfield>
		<s:textfield name="PublishDate" label="PublishDate"></s:textfield>
		<s:textfield name="Price" label="Price"></s:textfield>

		<s:submit></s:submit>
	</s:form>
	</center>
	</div>
	<div id="footer"><s:a href="index.jsp">返回主页</s:a> <br /> <br />
	        <h3>CopyRight By SY</h3>
	</div>
</body>
</html>
