<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
    <head>
        <style>
        table {
            font-family: arial, sans-serif;
            border-collapse: collapse;
            width: 100%;
        }

        td, th {
            border: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        tr:nth-child(even) {
            background-color: #dddddd;
        }
        </style>
    </head>

    <body>
        <html:form  action="/login.do">
            <table>
                  <tr>
                    <th>NAME</th>
                    <th>EMAIL</th>
                    <th>PASSWORD</th>
                    <th>BIRTHDAY</th>
                  </tr>
                  <logic:iterate name="eventForm" property="events" id="event">
                      <tr>
                         <td><html:text name="registerForm" property="name" /><br/></td>
                         <td><html:text name="registerForm" property="email" /><br/></td>
                         <td><html:text name="registerForm" property="password" /><br/></td>
                         <td><html:date name="registerForm" property="birthday" /><br/></td>
                      </tr>
                  </logic:iterate>
            </table>
        </html:form>
    </body>
</html>