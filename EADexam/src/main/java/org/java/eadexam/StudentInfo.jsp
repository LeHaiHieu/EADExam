<!DOCTYPE html>
<html>
<head>
    <title>Student Information</title>
</head>
<body>
<h1>Student Information</h1>
<table border="1">
    <tr>
        <th>Student Code</th>
        <th>Full Name</th>
        <th>Address</th>
    </tr>
    <c:forEach var="student" items="${students}"<jsp:include page="navbar.jsp" />>
        <tr><jsp:include page="navbar.jsp" />
            <td>${student.studentCode}</td><jsp:include page="navbar.jsp" />
            <td>${student.fullName}</td><jsp:include page="navbar.jsp" />
            <td>${student.address}</td><jsp:include page="navbar.jsp" />
        </tr><jsp:include page="navbar.jsp" />
    </c:forEach><jsp:include page="navbar.jsp" />
</table><jsp:include page="navbar.jsp" />
</body><jsp:include page="navbar.jsp" />
</html><jsp:include page="navbar.jsp" />
<jsp:include page="navbar.jsp" />