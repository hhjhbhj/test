<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2016/5/20
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%
  // 重定向到真正的首页
  response.sendRedirect(request.getContextPath() + "/home");
%>
</html>
