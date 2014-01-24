<html>
<body>
	
	<jsp:useBean id="person" type="foo.Person" class="foo.Employee">
		<jsp:setProperty name="person" property="name" param="name" />
		<jsp:setProperty name="person" property="empID" param="empID" />

	</jsp:useBean>

	<jsp:useBean id="person2" type="foo.Person" class="foo.Employee">
		<jsp:setProperty name="person" property="*" />
	</jsp:useBean>

	Pers 1 : <jsp:getProperty name="person" property="name" /> id <jsp:getProperty name="person" property="empID" />
	Pers 2 : <jsp:getProperty name="person2" property="name" /> <jsp:getProperty name="person2" property=empId" />

</body>
</html>
