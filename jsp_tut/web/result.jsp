<html><body>

	<jsp:useBean id="person" class="foo.Person" scope="request" />

	Name from standart action: <jsp:getProperty name="person" property="name" />

</body></html>
