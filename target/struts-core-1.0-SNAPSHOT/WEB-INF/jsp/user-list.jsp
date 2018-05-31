<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

YA TUT
<div class="well">
    <logic:iterate name="userForm" property="users" id="user">
        <%--<bean:message key="user.name"/><br/>--%>
        <bean:write name="user" property="name"/><br>
    </logic:iterate>
</div>