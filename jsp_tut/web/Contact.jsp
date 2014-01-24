<html>
<body>

	<jsp:include page="Header.jsp" >
		<jsp:param name="subTitle" value="Value of request parameter" />
	</jsp:include>
	<br>
	
	<em>We can help</em>
	Contact at ${initParam.mailEmail}

	<%@ include file="Footer.jsp" %>

</body>
</html>
