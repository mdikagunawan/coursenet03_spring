<!DOCTYPE html>

<!-- header -->
<div xmlns:th="http://www.w3.org/1999/xhtml"
	th:replace="header::top_area"></div>

<form xmlns:th="http://www.w3.org/1999/xhtml"
th:action="@{/proses_register}" method="post">

	<div class="form-group">
		<label>Email</label> 
		<!-- <input/> bisa disingkat, tidak ditutup karena ngga ada isinya, contoh lainnya yang sama <br/> -->
		<input minlength="3" maxlength="50" required name="email" type="email" class="form-control" />
	</div>

	<div class="form-group">
		<label>Password</label> 
		<input minlength="3" maxlength="50" required name="password" type="password" class="form-control" />
	</div>
	
	<div class="form-group">
		<label>Name</label> 
		<input minlength="3" maxlength="50" required name="name" type="text" class="form-control" />
	</div>
	
	<div class="form-group">
		<label>Gender</label> 
		<select required name="gender" class="form-control"> 
			<option selected value=""></option>
			<option value="Pria">Male </option>
			<option value="Wanita">Female </option>
		</select>
	</div>
	
	<div class="form-group">
		<label>Status</label> 
		<input checked type="radio" name="status" value="Single">Single
		<input type="radio" name="status" value="Married">Married
	</div>
	
	<button type="submit" class="btn btn-primary">
		<span class="fas fa-check"></span> Submit
	</button>

</form>

<!-- footer -->
<div xmlns:th="http://www.w3.org/1999/xhtml"
	th:replace="footer::bottom_area"></div>