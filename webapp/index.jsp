<html>
<head>
<link rel="stylesheet" href="style.css"> 
<link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
</head>
<body>
 <div class="wrapper">
 <span class="bg-animate"></span>
  <div class="form-box login">
  <h2>Result Sheet</h2>
   <form action="resultservlet">
     <div class="input-box">
       <input type="text" name="hno" required>
       <label>Hall Ticket No:</label>
       <i class='bx bxs-pencil'></i>
     </div>
     <input type="submit" class="btn" value="Submit">
     <input type="reset" class="btn" value="Clear">
   </form>
  </div>
  <div class="info-text login">
 <% String s=(String)request.getAttribute("message");
if(s!=null)
	{%>
<p class="alert"><%= s %></p>
<%}
else
{%>
	<h2>All The Best!</h2>
	 <p>Make your parents proud...</p>
<%}
application.setAttribute("message",null);
%>
   
  </div>
 </div>
</body>
</html>