<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleLoadDataHubProxyid" scope="session" class="com.wbtc.webservice.LoadDataHubProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleLoadDataHubProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleLoadDataHubProxyid.getEndpoint();
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
        sampleLoadDataHubProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.wbtc.webservice.LoadDataHub getLoadDataHub10mtemp = sampleLoadDataHubProxyid.getLoadDataHub();
if(getLoadDataHub10mtemp == null){
%>
<%=getLoadDataHub10mtemp %>
<%
}else{
        if(getLoadDataHub10mtemp!= null){
        String tempreturnp11 = getLoadDataHub10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String transactionType_1id=  request.getParameter("transactionType16");
            java.lang.String transactionType_1idTemp = null;
        if(!transactionType_1id.equals("")){
         transactionType_1idTemp  = transactionType_1id;
        }
        String transactionData_2id=  request.getParameter("transactionData18");
            java.lang.String transactionData_2idTemp = null;
        if(!transactionData_2id.equals("")){
         transactionData_2idTemp  = transactionData_2id;
        }
        java.lang.String loadDataToDataHub13mtemp = sampleLoadDataHubProxyid.loadDataToDataHub(transactionType_1idTemp,transactionData_2idTemp);
if(loadDataToDataHub13mtemp == null){
%>
<%=loadDataToDataHub13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(loadDataToDataHub13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 20:
        gotMethod = true;
        String firstName_3id=  request.getParameter("firstName23");
            java.lang.String firstName_3idTemp = null;
        if(!firstName_3id.equals("")){
         firstName_3idTemp  = firstName_3id;
        }
        String lastName_4id=  request.getParameter("lastName25");
            java.lang.String lastName_4idTemp = null;
        if(!lastName_4id.equals("")){
         lastName_4idTemp  = lastName_4id;
        }
        java.lang.String loadPersonToDataHub20mtemp = sampleLoadDataHubProxyid.loadPersonToDataHub(firstName_3idTemp,lastName_4idTemp);
if(loadPersonToDataHub20mtemp == null){
%>
<%=loadPersonToDataHub20mtemp %>
<%
}else{
        String tempResultreturnp21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(loadPersonToDataHub20mtemp));
        %>
        <%= tempResultreturnp21 %>
        <%
}
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