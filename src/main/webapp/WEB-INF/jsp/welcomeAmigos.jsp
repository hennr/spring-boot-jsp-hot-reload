<!DOCTYPE html>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<body>
<center>
	<br>
	${message}
	<br> <br> <br>
	<fmt:formatDate value="${time}" pattern="HH:mm:ss" />
</center>
</body>

</html>
