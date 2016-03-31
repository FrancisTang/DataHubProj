<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleMySQLAccessProxyid" scope="session" class="com.wbtc.dao.MySQLAccessProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleMySQLAccessProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleMySQLAccessProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleMySQLAccessProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.wbtc.dao.MySQLAccess getMySQLAccess10mtemp = sampleMySQLAccessProxyid.getMySQLAccess();
if(getMySQLAccess10mtemp == null){
%>
<%=getMySQLAccess10mtemp %>
<%
}else{
        if(getMySQLAccess10mtemp!= null){
        String tempreturnp11 = getMySQLAccess10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String parm1_1id=  request.getParameter("parm116");
            java.lang.String parm1_1idTemp = null;
        if(!parm1_1id.equals("")){
         parm1_1idTemp  = parm1_1id;
        }
        String parm2_2id=  request.getParameter("parm218");
            java.lang.String parm2_2idTemp = null;
        if(!parm2_2id.equals("")){
         parm2_2idTemp  = parm2_2id;
        }
        sampleMySQLAccessProxyid.insertDataIntoDataHub(parm1_1idTemp,parm2_2idTemp);
break;
case 20:
        gotMethod = true;
        sampleMySQLAccessProxyid.testDataBase();
break;
case 23:
        gotMethod = true;
        String lastName_4id=  request.getParameter("lastName28");
            java.lang.String lastName_4idTemp = null;
        if(!lastName_4id.equals("")){
         lastName_4idTemp  = lastName_4id;
        }
        String firstName_5id=  request.getParameter("firstName30");
            java.lang.String firstName_5idTemp = null;
        if(!firstName_5id.equals("")){
         firstName_5idTemp  = firstName_5id;
        }
        %>
        <jsp:useBean id="com1wbtc1beans1Person_3id" scope="session" class="com.wbtc.beans.Person" />
        <%
        com1wbtc1beans1Person_3id.setLastName(lastName_4idTemp);
        com1wbtc1beans1Person_3id.setFirstName(firstName_5idTemp);
        sampleMySQLAccessProxyid.insertPersonIntoDataHub(com1wbtc1beans1Person_3id);
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>