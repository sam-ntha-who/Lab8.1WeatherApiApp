<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
<h1>Weather Search</h1>
 <form class="form" action="/weather-display" method="post">
       
        <table>
       
       		<tr><td>Latitude: </td><td><input type="text" name="latitude" placeholder="ex 45.1235"/></td></tr>
       		<tr><td>Longitude: </td><td><input type="text" name="longitude" placeholder="ex -82.4523"/></td></tr>
       		
       		
			
        	
	       </table>
      	<br>
      	<br>
        <input class="button" type="submit"/>
        <input class="button" type="reset" value="Reset" />
       

        </form> 
</body>
</html>