<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="AddEmploy.jsp">
<center>
Employ Name :
<input type="text" name="ename" /><br/><br/>
 Select Gender :
<input type="radio" name="gender" value="MALE">MALE<br/><br/>
<input type="radio" name="gender" value="FEMALE">FEMALE<br/><br/>
Salary :
<input type="text"  name="salary" /><br/><br/>
<input type="submit"  value="AddEmploy" />
</center>
</form>
<c:if test="${param.empno!= null }">
Employ Name :
<input type="text" name="ename" /><br/><br/>
 Select Gender :
<input type="radio" name="gender" value="MALE">MALE<br/><br/>
<input type="radio" name="gender" value="FEMALE">FEMALE<br/><br/>
Salary :
<input type="number"  name="salary" /><br/><br/>
<input type="submit"  value="AddEmploy" />
</c:if>
</center>
<c:if test="${param.salary!=null }">
		<jsp:useBean id="employ" class="com.infinite.pay.Employ"/>
		<jsp:useBean id="beanDAO" class="com.infinite.pay.PayRollDAO"/>
				<jsp:setProperty property="ename" name="employ"/>		
				<jsp:setProperty property="gender" name="employ"/>
				<jsp:setProperty property="salary" name="employ"/>
				<jsp:setProperty property="*" name="employ"/>				
		<c:out value="${beanDAO.addEmploy(employ)}"/>
	</c:if>
</body>
</html>