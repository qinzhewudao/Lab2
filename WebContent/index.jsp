<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!--  test egit -->

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
#nav {
    background-color:#eeeeee;
    height:700px;
    width:1000px;
    float:left;
    padding:5px;	      
}
#section {
    height:700px;
    width:500px;
    float:right;
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

<title>The HomePage</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0"><%//清除缓存，刷新页面 %>

</head>

<body>
	<div id="header"><h1 align="center">Welcome To Book Library!</h1></div>
	<center>
        <div id="nav"><br /> <br /> <br />
		<s:form action="querybyname">
			<s:textfield name="name" label="查询该作者的所有著作"
				align="center" value="sheyang"/>
			<s:submit value="Search" />
		</s:form>
        </div>
        <div id="section">
		<br /> <br />
		<s:form action="Addnewauthor">
			<s:textfield name="name" label="查询该作者的详细信息"
				align="center" value="sheyang" />
			<s:submit value="Search" />
		</s:form>
	</div>
	<div id="footer">	
		<br /> <br />
	        <a href="showAuthor?">查看作者目录</a>
	        <br /> <br />
	        <h3>CopyRight By SY</h3>
	</div>
	</center>
</body>
</html>
