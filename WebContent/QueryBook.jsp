<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<Title>The Detail of The Book</Title>

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
	<br/><br/><br/><br/>
	<div id="header"><h1 align="center">Details</h1></div>
	<div id="section"><table border="1" align="center">
		<tr>
			<th>ISBN</th>
			<th>Title</th>
			<th>AuthorID</th>
			<th>Publisher</th>
			<th>PublishDate</th>
			<th>Price</th>
			<th>Name</th>
			<th>Age</th>
			<th>Country</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>	
	<s:iterator value="lista" var="c">
		<tr>
			<td><s:property value="#c.ISBN" /></td>
			<td><s:property value="#c.Title" /></td>
			<td><s:property value="#c.AuthorID" /></td>
			<td><s:property value="#c.Publisher" /></td>		
			<td><s:property value="#c.PublishDate" /></td>		
			<td><s:property value="#c.Price" /></td>		
			<td><s:property value="#c.Name" /></td>		
			<td><s:property value="#c.Age" /></td>		
			<td><s:property value="#c.Country" /></td>		
			<td><a href="deleteone?AuthorID=<s:property value="#c.AuthorID"/>">delete</a></td>	
			<td><a href="updateone?">update</a></td>
		</tr>		
	</s:iterator>	
	</table>
	</div>
	<div id="footer"><s:a href="index.jsp">返回主页</s:a> <br /> <br />
	        <h3>CopyRight By SY</h3>
        </div>
</body>
</html>