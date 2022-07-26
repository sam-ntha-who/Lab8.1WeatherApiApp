<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Weather</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
</head>
<body>
<h1>This is the weather.</h1>
<h2>Location: ${weather.getLocation().areaDescription}</h2>
<h2>Observation time stamp: ${weather.getCurrentObservation().date}</h2>
<h2>Current visibility: ${weather.getCurrentObservation().visibility}</h2>
<h2>Current wind chill: ${weather.getCurrentObservation().windChill}</h2>

<h2>This Week's Forecast:</h2>
<table>

<tr>

<c:forEach items="${weather.getTime().startPeriodName}" var="times" >
<td>${times} </td>
</c:forEach>
</tr>

<tr>

<c:forEach items="${weather.getData().text}" var="data">
<td>${data} </td>
</c:forEach>
</tr>


</table>
</body>
</html>