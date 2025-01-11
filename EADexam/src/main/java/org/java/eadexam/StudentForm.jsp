<!DOCTYPE html>
<html lang="en">
<head>
    <title>Add Student</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-5">
    <h1 class="text-center mb-4">Add Student</h1>
    <form action="StudentServlet" method="post" class="card p-4 shadow-sm">
        <div class="mb-3">
            <label for="studentCode" class="form-label">Student Code</label>
            <input type="text" id="studentCode" name="studentCode" class="form-control" placeholder="Enter student code" required>
        </div>
        <div class="mb-3">
            <label for="fullName" class="form-label">Full Name</label>
            <input type="text" id="fullName" name="fullName" class="form-control" placeholder="Enter full name" required>
        </div>
        <div class="mb-3">
            <label for="address" class="form-label">Address</label>
            <input type="text" id="address" name="address" class="form-control" placeholder="Enter address">
        </div>
        <button type="submit" class="btn btn-primary w-100">Add Student</button>
    </form>
</div>
</body>
</html>
<jsp:include page="navbar.jsp" />
