<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
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

<title>Add New Author</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">

</head>

<body>
	<br/>
	<div id="header"><h2 align="center">Please Add A New Author!</h2></div>
	<div id="section">
	<center>
	<br/><br/><br/>
	
	<s:form action="addoneauthor" >
		<s:textfield name="AuthorID" label="AuthorID"></s:textfield>
		<s:textfield name="Name" label="Name"></s:textfield>
		<s:textfield name="Age" label="Age"></s:textfield>
		<s:textfield name="Country" label="Country"></s:textfield>
		<s:submit value="Add" />
	</s:form>
	</center>
	</div>
	<div id="footer"><s:a href="index.jsp">返回主页</s:a> <br /> <br />
	        <h3>CopyRight By SY</h3>
	</div>
	
</body>
</html>
