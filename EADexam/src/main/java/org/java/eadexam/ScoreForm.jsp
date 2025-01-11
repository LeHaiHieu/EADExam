<!DOCTYPE html>
<html lang="en">
<head>
    <title>Add Score</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h1 class="text-center mb-4">Add Score</h1>
    <form action="ScoreServlet" method="post" class="card p-4 shadow-sm">
        <div class="mb-3">
            <label for="studentId" class="form-label">Student ID</label>
            <input type="number" id="studentId" name="studentId" class="form-control" placeholder="Enter student ID" required>
        </div>
        <div class="mb-3">
            <label for="subjectId" class="form-label">Subject ID</label>
            <input type="number" id="subjectId" name="subjectId" class="form-control" placeholder="Enter subject ID" required>
        </div>
        <div class="mb-3">
            <label for="score1" class="form-label">Score 1</label>
            <input type="number" step="0.01" id="score1" name="score1" class="form-control" placeholder="Enter score 1" required>
        </div>
        <div class="mb-3">
            <label for="score2" class="form-label">Score 2</label>
            <input type="number" step="0.01" id="score2" name="score2" class="form-control" placeholder="Enter score 2" required>
        </div>
        <button type="submit" class="btn btn-primary w-100">Add Score</button>
    </form>
</div>
</body>
</html>
<jsp:include page="navbar.jsp" />
