<html>
<head>
<script type="text/javascript">
        function printPage() {
            window.print();
        }
    </script>
</head>
<body text=black>
<center>
<table border=4px >
<h3><% result.ResultDataWritten rdw=(result.ResultDataWritten)request.getAttribute("WrittenResult"); 
       result.ResultDataPrac rdp=(result.ResultDataPrac)request.getAttribute("PracResult"); %>
Hall Ticket Number :<%= rdw.getHallticketnumber()%><br></h3>
<h4>
Student Name:<%= rdw.getName()%><br></h4>
<tr>
  <th>Subject</th>
  <th>Total Mark</th>
  <th>Written Total</th>
  <th>Written Mark</th>
  <th>Practical Total</th>
  <th>Practical Mark</th>
  <th>Obtain</th>
  
</tr>
<tr>
<td>C Programing</td>
<td>100</td>
<td>70</td>
<td><%= rdw.getcWritten()%></td>
<td>30</td>
<td><%= rdp.getcPrac()%></td>
<td><%= rdw.getcWritten()+rdp.getcPrac() %></td>
</tr>
</tr>
<tr>
<td>C++</td>
<td>100</td>
<td>70</td>
<td><%= rdw.getCppWritten()%></td>
<td>30</td>
<td><%= rdp.getCppPrac()%></td>
<td><%= rdw.getCppWritten()+rdp.getCppPrac() %></td>
</tr>
<tr>
<td>Java</td>
<td>100</td>
<td>70</td>
<td><%= rdw.getJavaWritten()%></td>
<td>30</td>
<td><%= rdp.getJavaPrac()%></td>
<td><%= rdw.getJavaWritten()+rdp.getJavaPrac() %></td>
</tr>
<tr>
<td>Web Technology</td>
<td>100</td>
<td>70</td>
<td><%= rdw.getWebtechnologyWritten()%></td>
<td>30</td>
<td><%= rdp.getWebtechnologyPrac()%></td>
<td><%= rdw.getWebtechnologyWritten()+rdp.getWebtechnologyPrac() %></td>
</tr>
<tr>
<td>DSA</td>
<td>100</td>
<td>70</td>
<td><%= rdw.getDsaWritten()%></td>
<td>30</td>
<td><%= rdp.getDsaPrac()%></td>
<td><%= rdw.getDsaWritten()+rdp.getDsaPrac() %></td>
</tr>
<tr>
<td>Digital Logic</td>
<td>100</td>
<td>70</td>
<td><%= rdw.getDigitallogicWritten()%></td>
<td>30</td>
<td><%= rdp.getDigitallogicPrac()%></td>
<td><%= rdw.getDigitallogicWritten()+rdp.getDigitallogicPrac() %></td>
</tr>
<tr>
<th colspan="6" style="text-align: left">Total</th>
<th><%= rdw.getTotalWritten()+ rdp.getTotalPrac()%></th>
</tr>
<tr>
<th colspan="6" style="text-align: left">Percentage</th>
<th><%= (rdw.getTotalWritten()+ rdp.getTotalPrac())*100/600%>%</th>
</tr>
</table><br>
<form action="index.jsp">
<button src="index.jsp" >Back</button>
<button onclick='printPage()'>Print</button>
</form>
</center>
</body>
</html>