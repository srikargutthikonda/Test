<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form method="POST" commandName="productForm">
<%-- Id : <form:input path="id"/><br/><br/> --%>
 Description : <form:input path="description"/><br/><br/>
 Price : <form:input path="price"/><br/><br/>
 ImageUrl : <form:input path="imageUrl"/><br/><br/>
 <input type="submit" value="Submit">
</form:form>