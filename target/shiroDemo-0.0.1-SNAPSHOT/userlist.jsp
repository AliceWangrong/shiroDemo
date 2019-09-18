<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
       <h4>用户信息表</h4>
       <table cellpadding="1" border="1">
           <tr>
               <td>id</td>
               <td>用户名</td>
               <td>密码</td>
               <td>拥有角色</td>
           </tr>
           <c:forEach items="${userList}" var="user">
           <tr>
               <td>${user.id}</td>
               <td>${user.username}</td>
               <td>${user.password}</td>
               <td>${user.roleId}</td>
           </tr>
           </c:forEach>
       </table>
</body>
</html>
