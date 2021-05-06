<!DOCTYPE html>

<!-- header -->
<div xmlns:th="http://www.w3.org/1999/xhtml"
	th:replace="header::top_area"></div>

<table class="table table-bordered table-striped"
	xmlns:th="http://www.w3.org/1999/xhtml">
	<thead>
		<tr>
			<th>Nama</th>
			<th>Email</th>
			<th>Gender</th>
			<th>Status</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
	</thead>
	<tbody>
		<tr th:each="data:${data}">
			<td th:text="${data.name}"></td>
			<td th:text="${data.email}"></td>
			<td th:text="${data.gender}"></td>
			<td th:text="${data.status}"></td>
			<td>
				<a th:href="@{'/edit_user/' + ${data.id}}" class="btn btn-success">
					<span class="fa fa-pencil"></span> Edit
				</a>
			</td>
			<td>
				<form method="post" th:action="@{/delete_user}">
					<input type="hidden" name="id" th:value="${data.id}" />
					<button type="submit" class="btn btn-danger">
						<span class="fa fa-trash"></span> Delete!
					</button>
				</form>
			</td>
	</tbody>
</table>

<!-- footer -->
<div xmlns:th="http://www.w3.org/1999/xhtml"
	th:replace="footer::bottom_area"></div>