<!DOCTYPE html>

	<!-- header -->
	<div xmlns:th="http://www.w3.org/1999/xhtml" th:replace="header::top_area"></div>
	
	<p xmlns:th="http://www.w3.org/1999/xhtml" th:text="${data.email}"></p>
	<p xmlns:th="http://www.w3.org/1999/xhtml" th:text="${data.name}"></p>
	<p xmlns:th="http://www.w3.org/1999/xhtml" th:text="${data.gender}"></p>
	<p xmlns:th="http://www.w3.org/1999/xhtml" th:text="${data.status}"></p>
	
	<!-- footer -->
	<div xmlns:th="http://www.w3.org/1999/xhtml" th:replace="footer::bottom_area"></div>