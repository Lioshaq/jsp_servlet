<html>
<body>
	<jsp:useBean id="person" class="foo.Person" scope="page">
		<jsp:setProperty name="person" property="name" value="Fred" />
	</jsp:useBean>

	Name : <jsp:getProperty name="person" property="name" />
	
</body>
</html>
