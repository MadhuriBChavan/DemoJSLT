<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored ="false" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
  <title>Product Details</title>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
  <h2>Product Details</h2>
  <table class="table">
   <thead>
       <tr class="success">
        <th>Product ID</th>
        <th>Product Name</th>
        <th>Price</th>
      </tr>
    </thead>
  
  <c:forEach items="${requestScope. products}" var="product">
 <tr>
 <td>
 <c:out value="${product.PID}"></c:out>
 </td>
<td>
<c:out value="${product.PName}"></c:out>
</td>
<td>
<c:out value="${product.PPrice}"></c:out>
</td>
</tr>
</c:forEach>

    <!--  <thead>
       <tr class="success">
        <th>Product ID</th>
        <th>Product Name</th>
        <th>Price</th>
      </tr>
    </thead>
    <tbody>
      <tr class="danger">
        <td>111</td>
        <td>Kajal</td>
        <td>200</td>
      </tr>
      <tr class="info">
        <td>112</td>
        <td>ponds</td>
        <td>320</td>
      </tr>
      <tr class="danger">
        <td>113</td>
        <td>Loreal</td>
        <td>888</td>
      </tr>
    </tbody>-->
  </table>
</div>

</body>
</html>


