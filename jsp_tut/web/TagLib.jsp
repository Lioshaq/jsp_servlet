<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html><body>

	Comments

	<c:if test="${requestScope.request.type eq 'member'}" >
		<jsp:include page="inputComments.jsp" />
	</c:if>

</body></html>
