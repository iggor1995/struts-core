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
    <table>
          <tr>
            <th>NAME</th>
            <th>PRICE</th>
            <th>DATE</th>
            <th>BASE PRICE</th>
            <th>Auditorium</th>
          </tr>
          <logic:iterate name="eventForm" property="events" id="event">
              <tr>
                 <td><bean:write  name="event" property="name"/><br/></td>
                 <td><bean:write  name="event" property="rate"/><br/></td>
                 <td><bean:write  name="event" property="dateTime"/><br/></td>
                 <td><bean:write  name="event" property="auditorium.name"/><br/></td>
              </tr>
          </logic:iterate>
    </table>
    </body>
</html>