<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation</title>
</head>
<body>
Airlines : ${flight.operatingAirlines}
Departure City : ${flight.departureCity}
Arrival City : ${flight.arrivalCity}

<form action="completeReservation" method="post">
<pre>
<h2>Passenger Details</h2>

First Name <input type="text" name="pFirstName">
Middle Name <input type="text" name="pMidddleName">
Last Name <input type="text" name="pLastName">
Email  <input type="text" name="pEmail">
Phone <input type="text" name="pPhone">

<input type="hidden" name="flightId" value="${flight.id}">
<input type="submit" value="Confirm">
</pre>

</form>

</body>
</html>