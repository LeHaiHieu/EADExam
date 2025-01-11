<!DOCTYPE html>
<html lang="en">
<head>
    <title>Student Scores</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h1 class="text-center mb-4">Student Scores and Grades</h1>
    <table class="table table-bordered table-hover table-striped shadow-sm">
        <thead class="table-dark">
        <tr>
            <th>Student Code</th>
            <th>Full Name</th>
            <th>Subject</th>
            <th>Score 1</th>
            <th>Score 2</th>
            <th>Grade</th>
            <th>Grade Letter</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="score" items="${studentScores}">
            <tr>
                <td>${score.studentCode}</td>
                <td>${score.fullName}</td>
                <td>${score.subjectName}</td>
                <td>${score.score1}</td>
                <td>${score.score2}</td>
                <td>${score.grade}</td>
                <td>${score.gradeLetter}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
<jsp:include page="navbar.jsp" />
