<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="/resource/css/bootstrap.min.css">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
	function cc(){
		$(".dd").each(function(){
			this.checked=!this.checked;
		})
		
	}
</script>
</head>
<body>
${object2}
	
<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col"><input type="button"  onclick="cc()"  value="反选"></th>
      <th scope="col">商品名称</th>
      <th scope="col">规格</th>
      <th scope="col">分类</th>
      <th scope="col">单价</th>
      <th scope="col">库存</th>
      <th scope="col">数量</th>
    </tr>
   
  </thead>
   <tbody>
   <c:forEach items="${object}" var="a" >
	 		<tr>
	 		<td scope="row"><input type="checkbox" class="dd" value="${a.id }" ></td>
		 		
		 		<td>${a.name }</td>
		 		<td>${a.size }</td>
		 		<td>${object2}</td>
		 		<td>${a.plice }</td>
		 		<td>${a.num }</td>
		 		<td>${a.num }</td>
		 	 </tr>
	 	</c:forEach>
  </tbody>
</table>


</body>
</html>