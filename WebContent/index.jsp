<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BEKB</title>
<link rel='stylesheet' href='./css/bootstrap.css'/>
<link rel='stylesheet' href='./css/style.css'/>
</head>
<body class="bckl">
  <div class="container-fluid text-center" style="margin-top: 20%">
      <h2 style="color:white">E-Bank Login</h2>
  <form class="form-group" action="index" method="POST">
      <div class="input-group col-md-4 col-md-offset-4" style="margin-bottom: 1%">
  <span class="input-group-addon" id="sizing-addon1">Username</span>
  <input type="text" name="uname" class="form-control" placeholder="Username" aria-describedby="sizing-addon1">
</div>

<div class="input-group col-md-4 col-md-offset-4" style="margin-bottom: 1%">
  <span class="input-group-addon" id="sizing-addon1">Password</span>
  <input type="password" class="form-control" placeholder="***********" aria-describedby="sizing-addon1">
</div>
      <div class="form-group">
          <div class="col-md-6 col-md-offset-3">
              <button type="submit" class="btn btn-large">Login</button>
          </div>
      </div>
    </form>
</div>
</body>
</html>