<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Demo STS</title>
</head>
<body>
<table>
	<tr>
		<th>Ma Nhan Vien</th>
		<th>Ten Nhan Vien</th>
		<th>CMND</th>
		<th>Gioi Tinh</th>
		<th><a href='<c:url value="/themNV"></c:url>'>Them Moi</a></th>
	</tr>
	<c:forEach var="ds" items="${dsnv}">
	<tr>
		<td>${ds.maNV}</td>
		<td>${ds.tenNV}</td>
		<td>${ds.cmnd}</td>
		<td>${ds.gioitinh}</td>
		<td><a href='<c:url value="/xoa/${ds.maNV}"></c:url>' onclick="return confirm('Xoa Nhan Vien')">Xoa</a></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>
