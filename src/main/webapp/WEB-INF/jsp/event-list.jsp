<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<div class="well">
    <logic:iterate name="eventForm" property="events" id="event">

        <bean:write name="event" property="name"/><br>

        <bean:write name="event" property="rate"/><br>

    </logic:iterate>

    <a href="<c:url value="/loginPage.do"/>" role="button" class="btn btn-default">login</a><br/>
    <html:link action="/register.do">REGISTER</html:link><br>
</div>