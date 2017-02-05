<html xmlns="http://www.w3.org/1999/xhtml">
<head id="Head1" runat="server">
    <title>BP PGW Test</title>
    <link href="Css/Style.css" rel="stylesheet" type="text/css" />
</head>

<body>
    <form id="form1" runat="server">
    <table width="100%" cellspacing="0" cellpadding="0" align="center">
        <tr>
            <td>
                <table class="MainTable" cellspacing="5" cellpadding="1" align="center">
                    <tr class="HeaderTr">
                        <td colspan="2" align="center" height="25">
                            <span class="HeaderText">CallBack Params</span>
                        </td>
                    </tr>
                    <tr>
                        <td class="LabelTd">
                            <span>RefId</span>
                        </td>
                        <td>
                            <span><%= (request.getParameter("RefId") != null) ? request.getParameter("RefId") : ""%></span>
                        </td>
                    </tr>
                    <tr>
                        <td class="LabelTd">
                            <span>ResCode</span>
                        </td>
                        <td>
                            <span><%= (request.getParameter("ResCode") != null) ? request.getParameter("ResCode") : ""%></span>
                        </td>
                    </tr>
                    <tr>
                        <td class="LabelTd">
                            <span>SaleOrderId</span>
                        </td>
                        <td>
                            <span><%= (request.getParameter("SaleOrderId") != null) ? request.getParameter("SaleOrderId") : ""%></span>
                        </td>
                    </tr>
                    <tr>
                        <td class="LabelTd">
                            <span>SaleReferenceId</span>
                        </td>
                        <td>
                            <span><%= (request.getParameter("SaleReferenceId") != null) ? request.getParameter("SaleReferenceId") : ""%></span>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
    </form>
</body>
</html>
