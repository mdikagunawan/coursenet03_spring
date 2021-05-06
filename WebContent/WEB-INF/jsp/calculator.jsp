<!DOCTYPE html>

<!-- header -->
<div xmlns:th="http://www.w3.org/1999/xhtml"
	th:replace="header::top_area"></div>

<form xmlns:th="http://www.w3.org/1999/xhtml"
th:action="@{/proses_calculator}" method="post"
th:object="${data}">
	
	<p>CALCULATOR  </p>
	
	<div class="form-group">
	
		<input th:field="*{angka1}" required name="angka1" type="text" class="form-control" />
		
		<select th:field="*{operation}" required name="operation" class="form-control"> 
			<option selected value=""></option>
			<option value="+">+ </option>
			<option value="-">- </option>
			<option value="x">x </option>
			<option value="/">/ </option>
		</select>
	
		<input th:field="*{angka2}" required name="angka2" type="text" class="form-control" />
		
	</div>
	
		

	
	<button type="submit" class="btn btn-primary">
		<span class=""></span> =
	</button>

</form>

<!-- footer -->
<div xmlns:th="http://www.w3.org/1999/xhtml"
	th:replace="footer::bottom_area"></div>