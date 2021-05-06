<!DOCTYPE html>

<!-- header -->
<div xmlns:th="http://www.w3.org/1999/xhtml"
	th:replace="header::top_area"></div>

<form xmlns:th="http://www.w3.org/1999/xhtml" method="post"
	th:action="@{/proses_register2}" th:object="${userLogin}">

	<div th:if="${#fields.hasErrors('*')}" style="opacity:100" class="toast" role="alert" aria-live="assertive"
		aria-atomic="true">
		<div class="toast-header">
			<img src="..." class="rounded mr-2" alt="..."> <strong
				class="mr-auto">Bootstrap</strong> <small>11 mins ago</small>
			<button type="button" class="ml-2 mb-1 close" data-dismiss="toast"
				aria-label="Close">
				<span aria-hidden="true">&times;</span>
			</button>
		</div>
		<div class="toast-body"><p th:each="error:${#fields.errors('*')}" th:text="${error}"></p></div>
	</div>

	<div class="alert alert-danger" th:if="${#fields.hasErrors('*')}">
		<p th:each="error:${#fields.errors('*')}" th:text="${error}"></p>
	</div>

	<div class="form-group">
		<label>Email</label> <input th:field="*{email}" type="text"
			class="form-control" autofocus /> <span class="text-danger"
			th:if="${#fields.hasErrors('email')}" th:errors="*{email}"></span>
	</div>

	<div class="form-group">
		<label>Password</label> <input th:field="*{password}" type="password"
			class="form-control" /> <span class="text-danger"
			th:if="${#fields.hasErrors('password')}" th:errors="*{password}"></span>
	</div>

	<div class="form-group">
		<label>Name</label> <input th:field="*{name}" type="text"
			class="form-control" /> <span class="text-danger"
			th:if="${#fields.hasErrors('name')}" th:errors="*{name}"></span>
	</div>

	<div class="form-group">
		<label>Gender</label> <select th:field="*{gender}"
			class="form-control">
			<option value="Pria">Male</option>
			<option value="Wanita">Female</option>
		</select> <span class="text-danger" th:if="${#fields.hasErrors('gender')}"
			th:errors="*{gender}"></span>
	</div>

	<div class="form-group">
		<label>Status</label> <input th:field="*{status}" type="radio"
			value="Single" checked>Single <input th:field="*{status}"
			type="radio" value="Married">Married <span
			class="text-danger" th:if="${#fields.hasErrors('status')}"
			th:errors="*{status}"></span>
	</div>

	<button type="submit" onclick='return confirm("Are you sure?")'
		class="btn btn-success">
		<span class="fa fa-check"></span> Submit
	</button>

</form>

<!-- footer -->
<div xmlns:th="http://www.w3.org/1999/xhtml"
	th:replace="footer::bottom_area"></div>