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
<form method="get" action="AddLeave.jsp">
       Employ no:
        <input type="number" name="empno"/><br/><br/>
       LeaveStartDate :
        <input type="date" name="leaveStartDate"/><br/><br/>
       LeaveEndDate :
        <input type="date" name="leaveEndDate"/><br/><br/>
       LeaveReason :
        <input type="text" name="leaveReason"/><br/><br/>
        <input type="submit" value="ApplyLeave"/>
     
     </form>
      <jsp:useBean id="beanDao"  class="com.infinite.pay.PayRollDAO" />
      <jsp:useBean id="leave" class="com.infinite.pay.LeaveTable"/>
     <c:if test="${param.empno!=null}">
      <c:set var="sdate" value="${beanDao.convertDate(param.leaveStartDate)}"/>
      <c:set var="edate" value="${beanDao.convertDate(param.leaveEndDate)}" />
      <jsp:setProperty property="empno" name="leave" value="${param.empno}"/>
      <jsp:setProperty property="leaveStartDate" name="leave" value="${sdate}"/>
      <jsp:setProperty property="leaveEndDate" name="leave" value="${edate}"/>
      <jsp:setProperty property="leaveReason" name="leave" value="${param.leaveReason}"/>
      <c:out value="${beanDao.addLeave(leave)}"/>
     </c:if>

</body>
</html>