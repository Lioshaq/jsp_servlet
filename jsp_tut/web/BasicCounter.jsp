<html>
<body>
	<! static int count = 0; %>
	The page count is
	<%
		out.println(foo.Counter.getCount());
	%>

	The same count only using declarations
	<%= ++count %>

</body>
</html>
