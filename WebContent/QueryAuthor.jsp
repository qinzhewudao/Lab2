<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>The Books Of The Author</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
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
	<br/><br/><br/>
	<div id="header"><h2 align="center">Books</h2></div>
	<div id="section">
	<center>
	<h3>点击书名可获得详细信息</h3>
	<br/><br/>
	<table border="1">
	<s:iterator value="lista" var="c">
		<tr>
		<td><a href="detail?title=<s:property value="#c.title"/>"> <s:property
				value="#c.title" /></a> </td>
		</tr>
	</s:iterator>
	</table>
	</center>
	</div>
	
	<div id="footer"><s:a href="index.jsp">返回主页</s:a> <br /> <br />
	        <h3>CopyRight By SY</h3>
        </div>
</body>
</html>