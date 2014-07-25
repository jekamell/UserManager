<%@ page language="java" contentType="text/html;" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="author" content="JekaMell">
    <title>UserManager :: <tiles:insertAttribute name="title" ignore="true" /></title>
    <%--<link rel="stylesheet" href="/resources/css/bootstrap.min.css">--%>
    <link rel="stylesheet" type="text/css" href="/resources/css/bootstrap-theme.min.css">
    <link rel="stylesheet" type="text/css" href="/resources/css/style.css">

    <script src="/resources/js/jquery.min.js"></script>
    <script src="/resources/js/bootstrap.min.js"></script>


    <!-- Le HTML5 shim, for IE6-8 support of HTML elements -->
    <!--[if lt IE 9]>
    <script src="/resources/js/html5.js"></script>
    <![endif]-->

    <sb:head/>
    <s:head />
</head>
<body>
    <tiles:insertAttribute name="header" />
    <div class="container">
        <div class="starter-template">
            <tiles:insertAttribute name="body" />
        </div>
    </div>
</body>
</html>