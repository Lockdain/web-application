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
		<p>Add a new TODO:</p>
		<form method="POST" action="add-todo.do">
			<fieldset class="form-group">
				<label>Description:</label> <input class="form-control" type="text" name="todo" /> <BR />
			</fieldset>
			<fieldset class="form-group">
				<label>Category:</label> <input class="form-control" type="text" name="category" /><BR />
			</fieldset>
			<button class="btn btn-success" type="submit">Add new</button>
		</form>
	</div>

	<footer class="footer">
		<p>Alex Sergeenko, 2018</p>
	</footer>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>

</html>