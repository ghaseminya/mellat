<%@ page import="com.bps.sw.pgw.service.IPaymentGateway" %>
<%@ page import="com.bps.sw.pgw.service.PaymentGatewayImplService" %>
<%@ page import="java.util.StringTokenizer" %>
<html>
<head>
    <title>Behpardakht PGW Test</title>
    <link href="Css/Style.css" rel="stylesheet" type="text/css"/>

    <script language="javascript" type="text/javascript">
        function postRefId(refIdValue) {
            var form = document.createElement("form");
            form.setAttribute("method", "POST");
            form.setAttribute("action", "https://bpm.shaparak.ir/pgwchannel/startpay.mellat");
            form.setAttribute("target", "_self");
            var hiddenField = document.createElement("input");
            hiddenField.setAttribute("name", "RefId");
            hiddenField.setAttribute("value", refIdValue);
            form.appendChild(hiddenField);
            document.body.appendChild(form);
            form.submit();
            document.body.removeChild(form);
        }

        function initData() {
            document.getElementById("PayDate").value = "20100517";
            document.getElementById("PayTime").value = "140000";
            document.getElementById("PayAmount").value = "10";
            document.getElementById("PayOrderId").value = "1";
            document.getElementById("PayAdditionalData").value = "No Data";
            document.getElementById("PayCallBackUrl").value = "http://localhost:8080/melat/callback.jsp";
            document.getElementById("PayPayerId").value = "0";
        }
    </script>
</head>

<body>
<form name="form1" method="post" preservedata="true">
<table width="100%" cellspacing="0" cellpadding="0" align="center">
<tr>
<td>
<table class="InputTable" cellspacing="5" cellpadding="1" align="center">
<tr>
<td>
<table class="MainTable" cellspacing="5" cellpadding="1" align="center">
    <tr class="HeaderTr">
        <td colspan="2" align="center" height="25">
            <span class="HeaderText">BPM PGW Method Call</span>
        </td>
    </tr>
    <tr>
        <td class="LabelTd">
            <span>TerminalId</span>
        </td>

        <td>
            <input type="text" name="TerminalId"
                   value="XXXX">
        </td>
    </tr>
    <tr>
        <td class="LabelTd">
            <span>UserName</span>
        </td>
        <td>
            <input type="text" name="UserName"
                   value="XXXX">
        </td>
    </tr>
    <tr>
        <td class="LabelTd">
            <span>UserPassword</span>
        </td>
        <td>
            <input type="text" name="UserPassword"
                   value="XXXX">
        </td>
    </tr>
</table>
<hr/>
<table class="MainTable" cellspacing="5" cellpadding="1" align="center">
    <tr class="HeaderTr">
        <td colspan="2" align="center" height="25">
            <span class="HeaderText">Pay Request Method Call</span>
        </td>
    </tr>
    <tr>
        <td class="LabelTd">
            <span>LocalDate</span>
        </td>
        <td>
            <input type="text" name="PayDate" id="PayDate"
                   value="<%= (request.getParameter("PayDate") != null) ? request.getParameter("PayDate") : ""%>">
        </td>
    </tr>
    <tr>
        <td class="LabelTd">
            <span>LocalTime</span>
        </td>
        <td>
            <input type="text" name="PayTime" id="PayTime"
                   value="<%= (request.getParameter("PayTime") != null) ? request.getParameter("PayTime") : ""%>">
        </td>
    </tr>
    <tr>
        <td class="LabelTd">
            <span>Amount</span>
        </td>
        <td>
            <input type="text" name="PayAmount" id="PayAmount"
                   value="<%= (request.getParameter("PayAmount") != null) ? request.getParameter("PayAmount") : ""%>">
        </td>
    </tr>
    <tr>
        <td class="LabelTd">
            <span>OrderId</span>
        </td>
        <td>
            <input type="text" name="PayOrderId" id="PayOrderId"
                   value="<%= (request.getParameter("PayOrderId") != null) ? request.getParameter("PayOrderId") : ""%>">
        </td>
    </tr>
    <tr>
        <td class="LabelTd">
            <span>AdditionalData</span>
        </td>
        <td>
            <input type="text" name="PayAdditionalData" id="PayAdditionalData"
                   value="<%= (request.getParameter("PayAdditionalData") != null) ? request.getParameter("PayAdditionalData") : ""%>">
        </td>
    </tr>
    <tr>
        <td class="LabelTd">
            <span>CallBackUrl</span>
        </td>
        <td>
            <input type="text" name="PayCallBackUrl" id="PayCallBackUrl"
                   value="<%= (request.getParameter("PayCallBackUrl") != null) ? request.getParameter("PayCallBackUrl") : ""%>">
        </td>
    </tr>
    <tr>
        <td class="LabelTd">
            <span>PayerId</span>
        </td>
        <td>
            <input type="text" name="PayPayerId" id="PayPayerId"
                   value="<%= (request.getParameter("PayPayerId") != null) ? request.getParameter("PayPayerId") : ""%>">
        </td>
    </tr>
    <tr class="HeaderTr">
        <td colspan="2" align="center">
            <input type="submit" CssClass="PublicButton" name="PayRequestButton" value="Pay"/>
        </td>
    </tr>
</table>
<hr/>
<table class="MainTable" cellspacing="5" cellpadding="1" align="center">
    <tr class="HeaderTr">
        <td colspan="2" align="center" height="25">
            <span class="HeaderText">Verify Request Method Call</span>
        </td>
    </tr>
    <tr>
        <td class="LabelTd">
            <span>OrderId</span>
        </td>
        <td>
            <input type="text" name="VerifyOrderId"
                   value="<%= (request.getParameter("VerifyOrderId") != null) ? request.getParameter("VerifyOrderId") : ""%>">
        </td>
    </tr>
    <tr>
        <td class="LabelTd">
            <span>SaleOrderId</span>
        </td>
        <td>
            <input type="text" name="VerifySaleOrderId"
                   value="<%= (request.getParameter("VerifySaleOrderId") != null) ? request.getParameter("VerifySaleOrderId") : ""%>">
        </td>
    </tr>
    <tr>
        <td class="LabelTd">
            <span>SaleReferenceId</span>
        </td>
        <td>
            <input type="text" name="VerifySaleReferenceId"
                   value="<%= (request.getParameter("VerifySaleReferenceId") != null) ? request.getParameter("VerifySaleReferenceId") : ""%>">
        </td>
    </tr>
    <tr class="HeaderTr">
        <td colspan="2" align="center">
            <input type="submit" CssClass="PublicButton" name="VerifyRequestButton" value="Verify"/>
        </td>
    </tr>
</table>
<hr/>
<table class="MainTable" cellspacing="5" cellpadding="1" align="center">
    <tr class="HeaderTr">
        <td colspan="2" align="center" height="25">
            <span class="HeaderText">Inquiry Request Method Call</span>
        </td>
    </tr>
    <tr>
        <td class="LabelTd">
            <span>OrderId</span>
        </td>
        <td>
            <input type="text" name="InquiryOrderId"
                   value="<%= (request.getParameter("InquiryOrderId") != null) ? request.getParameter("InquiryOrderId") : ""%>">
        </td>
    </tr>
    <tr>
        <td class="LabelTd">
            <span>SaleOrderId</span>
        </td>
        <td>
            <input type="text" name="InquirySaleOrderId"
                   value="<%= (request.getParameter("InquirySaleOrderId") != null) ? request.getParameter("InquirySaleOrderId") : ""%>">
        </td>
    </tr>
    <tr>
        <td class="LabelTd">
            <span>SaleReferenceId</span>
        </td>
        <td>
            <input type="text" name="InquirySaleReferenceId"
                   value="<%= (request.getParameter("InquirySaleReferenceId") != null) ? request.getParameter("InquirySaleReferenceId") : ""%>">
        </td>
    </tr>
    <tr class="HeaderTr">
        <td colspan="2" align="center">
            <input type="submit" CssClass="PublicButton" name="InquiryRequestButton" value="Inquiry"/>
        </td>
    </tr>
</table>
<hr/>
<table class="MainTable" cellspacing="5" cellpadding="1" align="center">
    <tr class="HeaderTr">
        <td colspan="2" align="center" height="25">
            <span class="HeaderText">Reversal Request Method Call</span>
        </td>
    </tr>
    <tr>
        <td class="LabelTd">
            <span>OrderId</span>
        </td>
        <td>
            <input type="text" name="ReversalOrderId"
                   value="<%= (request.getParameter("ReversalOrderId") != null) ? request.getParameter("ReversalOrderId") : ""%>">
        </td>
    </tr>
    <tr>
        <td class="LabelTd">
            <span>SaleOrderId</span>
        </td>
        <td>
            <input type="text" name="ReversalSaleOrderId"
                   value="<%= (request.getParameter("ReversalSaleOrderId") != null) ? request.getParameter("ReversalSaleOrderId") : ""%>">
        </td>
    </tr>
    <tr>
        <td class="LabelTd">
            <span>SaleReferenceId</span>
        </td>
        <td>
            <input type="text" name="ReversalSaleReferenceId"
                   value="<%= (request.getParameter("ReversalSaleReferenceId") != null) ? request.getParameter("ReversalSaleReferenceId") : ""%>">
        </td>
    </tr>
    <tr class="HeaderTr">
        <td colspan="2" align="center">
            <input type="submit" CssClass="PublicButton" name="ReversalRequestButton" value="Reversal"/>
        </td>
    </tr>
</table>
<hr/>
<table class="MainTable" cellspacing="5" cellpadding="1" align="center">
    <tr class="HeaderTr">
        <td colspan="2" align="center" height="25">
            <span class="HeaderText">Settle Request Method Call</span>
        </td>
    </tr>
    <tr>
        <td class="LabelTd">
            <span>OrderId</span>
        </td>
        <td>
            <input type="text" name="SettleOrderId"
                   value="<%= (request.getParameter("SettleOrderId") != null) ? request.getParameter("SettleOrderId") : ""%>">
        </td>
    </tr>
    <tr>
        <td class="LabelTd">
            <span>SaleOrderId</span>
        </td>
        <td>
            <input type="text" name="SettleSaleOrderId"
                   value="<%= (request.getParameter("SettleSaleOrderId") != null) ? request.getParameter("SettleSaleOrderId") : ""%>">
        </td>
    </tr>
    <tr>
        <td class="LabelTd">
            <span>SaleReferenceId</span>
        </td>
        <td>
            <input type="text" name="SettleSaleReferenceId"
                   value="<%= (request.getParameter("SettleSaleReferenceId") != null) ? request.getParameter("SettleSaleReferenceId") : ""%>">
        </td>
    </tr>
    <tr class="HeaderTr">
        <td colspan="2" align="center">
            <input type="submit" CssClass="PublicButton" name="SettleRequestButton" value="Settle"/>
        </td>
    </tr>
</table>
</td>
</tr>
</table>
</td>
</tr>
</table>
</form>
</body>

<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        IPaymentGateway service = new PaymentGatewayImplService().getPaymentGatewayImplPort();
        String responseMessage = "";
%>
<% ///////////////// PAY REQUEST
    if (request.getParameter("PayRequestButton") != null) {
        long terminalId = Long.valueOf((String) request.getParameter("TerminalId")).longValue();
        String userName = request.getParameter("UserName");
        String userPassword = request.getParameter("UserPassword");
        long orderId = Long.valueOf((String) request.getParameter("PayOrderId")).longValue();
        long amount = Long.valueOf((String) request.getParameter("PayAmount")).longValue();
        String localDate = request.getParameter("PayDate");
        String localTime = request.getParameter("PayTime");
        String additionalData = request.getParameter("PayAdditionalData");
        String callBackUrl = request.getParameter("PayCallBackUrl");
        long payerId = Long.valueOf((String) request.getParameter("PayPayerId")).longValue();

        try {
            responseMessage = service.bpPayRequest(terminalId, userName, userPassword,
                    orderId, amount, localDate, localTime, additionalData, callBackUrl, payerId);
        } catch (Exception e) {
%>
<script language='javascript' type='text/javascript'>alert('<%= e.getStackTrace().toString()  %>');</script>
<%
    }
%>
<script language='javascript' type='text/javascript'>alert('Pay Response is : ' + '"<%= responseMessage  %>"');</script>
<%
    StringTokenizer stringTokenizer = new StringTokenizer(responseMessage, ",");
    String[] results = new String[2];

    // push all the words to the stack one by one
    int i = 0;
    while (stringTokenizer.hasMoreTokens()) {
        results[i] = (String) stringTokenizer.nextElement();
        i++;
    }
    if (results[0].equals("0")) {
%>
<script language='javascript' type='text/javascript'>postRefId('<%= results[1]  %>');</script>
<%
} else {
%>
<%--<script language='javascript' type='text/javascript'>postRefId('<%= responseMessage  %>');</script>--%>
<%
        }

    }
    ///////////////// PAY REQUEST
%>

<% ///////////////// VERIFY REQUEST
    if (request.getParameter("VerifyRequestButton") != null) {
        long terminalId = Long.valueOf((String) request.getParameter("TerminalId")).longValue();
        String userName = request.getParameter("UserName");
        String userPassword = request.getParameter("UserPassword");
        long orderId = Long.valueOf((String) request.getParameter("VerifyOrderId")).longValue();
        long saleOrderId = Long.valueOf((String) request.getParameter("VerifySaleOrderId")).longValue();
        long saleReferenceId = Long.valueOf((String) request.getParameter("VerifySaleReferenceId")).longValue();

        try {
            responseMessage = service.bpVerifyRequest(terminalId, userName, userPassword,
                    orderId, saleOrderId, saleReferenceId);
        } catch (Exception e) {
%>
<script language='javascript' type='text/javascript'>alert('<%= e.getStackTrace().toString()  %>');</script>
<%
    }
%>
<script language='javascript'
        type='text/javascript'>alert('Verify Response is : ' + '"<%= responseMessage  %>"');</script>
<%
    }
    ///////////////// VERIFY REQUEST
%>

<% ///////////////// INQUIRY REQUEST
    if (request.getParameter("InquiryRequestButton") != null) {
        long terminalId = Long.valueOf((String) request.getParameter("TerminalId")).longValue();
        String userName = request.getParameter("UserName");
        String userPassword = request.getParameter("UserPassword");
        long orderId = Long.valueOf((String) request.getParameter("InquiryOrderId")).longValue();
        long saleOrderId = Long.valueOf((String) request.getParameter("InquirySaleOrderId")).longValue();
        long saleReferenceId = Long.valueOf((String) request.getParameter("InquirySaleReferenceId")).longValue();

        try {
            responseMessage = service.bpInquiryRequest(terminalId, userName, userPassword,
                    orderId, saleOrderId, saleReferenceId);
        } catch (Exception e) {
%>
<script language='javascript' type='text/javascript'>alert('<%= e.getStackTrace().toString()  %>');</script>
<%
    }
%>
<script language='javascript'
        type='text/javascript'>alert('Inquiry Response is : ' + '"<%= responseMessage  %>"');</script>
<%
    }
    ///////////////// INQUIRY REQUEST
%>

<% ///////////////// REVERSAL REQUEST
    if (request.getParameter("ReversalRequestButton") != null) {
        long terminalId = Long.valueOf((String) request.getParameter("TerminalId")).longValue();
        String userName = request.getParameter("UserName");
        String userPassword = request.getParameter("UserPassword");
        long orderId = Long.valueOf((String) request.getParameter("ReversalOrderId")).longValue();
        long saleOrderId = Long.valueOf((String) request.getParameter("ReversalSaleOrderId")).longValue();
        long saleReferenceId = Long.valueOf((String) request.getParameter("ReversalSaleReferenceId")).longValue();

        try {
            responseMessage = service.bpReversalRequest(terminalId, userName, userPassword,
                    orderId, saleOrderId, saleReferenceId);
        } catch (Exception e) {
%>
<script language='javascript' type='text/javascript'>alert('<%= e.getStackTrace().toString()  %>');</script>
<%
    }
%>
<script language='javascript'
        type='text/javascript'>alert('Reversal Response is : ' + '"<%= responseMessage  %>"');</script>
<%
    }
    ///////////////// REVERSAL REQUEST
%>

<% ///////////////// SETTLE REQUEST
    if (request.getParameter("SettleRequestButton") != null) {
        long terminalId = Long.valueOf((String) request.getParameter("TerminalId")).longValue();
        String userName = request.getParameter("UserName");
        String userPassword = request.getParameter("UserPassword");
        long orderId = Long.valueOf((String) request.getParameter("SettleOrderId")).longValue();
        long saleOrderId = Long.valueOf((String) request.getParameter("SettleSaleOrderId")).longValue();
        long saleReferenceId = Long.valueOf((String) request.getParameter("SettleSaleReferenceId")).longValue();

        try {
            responseMessage = service.bpSettleRequest(terminalId, userName, userPassword,
                    orderId, saleOrderId, saleReferenceId);
        } catch (Exception e) {
%>
<script language='javascript' type='text/javascript'>alert('<%= e.getStackTrace().toString()  %>');</script>
<%
    }
%>
<script language='javascript'
        type='text/javascript'>alert('Settle Response is : ' + '"<%= responseMessage  %>"');</script>
<%
    }
    ///////////////// SETTLE REQUEST
%>

<%
} else {
%>
<script>initData();</script>
<%
    }
%>

</html>