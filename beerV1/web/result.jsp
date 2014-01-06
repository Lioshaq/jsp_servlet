<%@ page import="java.util.*" %>

<html>
<body>
<h1 align="center">Recommandation</h1>
<p>
<%
	List<String> styles = (ArrayList)request.getAttribute("styles");
	for(String style : styles) {
		out.print("<br>try: " + style);
	}
%>

</body>
</html>
