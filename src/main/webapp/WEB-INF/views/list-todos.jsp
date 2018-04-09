<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Todos</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<style>
.footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 60px;
	background-color: #f5f5f5;
}
</style>
</head>

<body>

	<nav class="navbar navbar-default">

		<a href="/" class="navbar-brand">Brand</a>

		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
			<li><a href="list-todos.do">Todos</a></li>
			<li><a href="http://www.thereimlearningjava.com">TILJ</a></li>
		</ul>

		<ul class="nav navbar-nav navbar-right">
			<li><a href="logout.do">Logout</a></li>
		</ul>

	</nav>

	<div class="container">
		<H1>Welcome ${name}</H1>

		<table class="table table-striped">
			<caption>Your todos are:</caption>
			<thead>
				<th>Description</th>
				<th>Category</th>
				<th>Actions</th>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.name}</td>
						<td>${todo.category}</td>
						<td><a class="btn btn-danger"
							href="delete-todo.do?id=${todo.id}">Delete</a></td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
		<button class="btn btn-success" href="add-todo.do"
			onclick="location.href = 'add-todo.do';">
			Add new</a>
		</button>
	</div>

	<footer class="footer">
		<p>Alex Sergeenko, 2018</p>
	</footer>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>

</html>