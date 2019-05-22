<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<header>
<table>
	<tr>
		<td>
			<a href = "./CheckServlet">Cart:${sessionScope.cart.size}</a>
		</td>
		<td>

	</tr>
</table>
</header>
<body>
	<center>
		<table>
		<tr>
				<c:forEach items="${checkList}" var="${str}">
				<td>
				<table>
				<tr>
				<td><img src="static/images/${str.id}.jpg"></td>
				</tr>
				<tr>
				<td>
					<p>
						<a>${str.name}</a>
					</p>
				</td>
				</tr>
				<tr>
				<td>
					<p>
						Price : <a>${str.price} UAH</a>
					</p>
				</td>
				</tr>
				<tr>
				<td>
					<p>
						Weight : <a>${str.weigth}</a>
					</p>	
				</td>
				</tr>
				<tr>
				<td>
					<p>
						<a href = "./CartServlet?dishID=${str.weight.id}">Buy</a>
					</p>	
				</td>
				</tr>
				</table>
				</td>
	</c:forEach>
			
		</tr>
		</table>
	</center>
</body>