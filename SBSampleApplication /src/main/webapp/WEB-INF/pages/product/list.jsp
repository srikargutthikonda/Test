<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:forEach items="${products}" var="prod">
 <c:out value="${prod.id}"/><br/><br/>
 <c:out value="${prod.description}"/><br/><br/>
 <c:out value="${prod.price}"/><br/><br/>
 <c:out value="${prod.imageUrl}"/><br/><br/>
</c:forEach>