<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel='stylesheet' href='./css/bootstrap.css'/>
<link rel='stylesheet' href='./css/style.css'/>
<script src="./js/jquery-3.1.1.min.js" type="text/javascript"></script>
<script src="./js/bootstrap.min.js" type="text/javascript"></script>
<link rel="shortcut icon" href="favicon.ico" type="image/x-icon" />
<title>family-net.ch</title>
</head>
<body>
<div class="row" id="redtop">

<div class="col-sm-3 col-md-offset-6"><h5 style="font-size: 1.1em; font-weight:small; text-align:right;"><a style="color:white">de</a><a style="color:white"> | Beratersuche | </a><a style="color:white">Notfall</a><a style="color:white"> | E-Banking</a></h5></div>
<div class="col-sm-2">
    <div class="input-group input-group-sm" style="margin-top:1.5%;">
    <input type="text" class="form-control" placeholder="Suchbegriff...">
      <span class="input-group-btn">
        <button type="button" class="btn btn-default" aria-label="Left Align">
  <span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
      </span>
      
</div><!-- /input-group -->
</div><!-- /.col-lg-6 -->


</div>
<div class= "container">
<div class="row" style="margin-top:2%">



<div class="col-md-4" style="padding-left:1px"><img alt="" style="height:36px;width:180px;" src="./images/family-net_logo.png"></div>
<div class ="col-md-4 col-md-offset-4"><h4 style="text-align:right"><span class="glyphicon glyphicon-earphone" aria-hidden="true" style="color:#ce002f"></span>
+41 31 666 68 98</h4><h6 style="text-align:right">Wir sind gerne für Sie da!</h6></div>

</div>

<div class="row" style="margin-top:1%">
<nav class="navbar navbar-default navbar-static-top">
  <div class="container">
    <ul class="nav navbar-nav">
        <li><a style="color:black; font-size:1.1em" href="#">BERATUNG</a></li>
        <li><a style="color:black; font-size:1.1em" href="#">ONLINE SERVICES</a></li>
        <li><a style="color:black; font-size:1.1em" href="">ZAHLEN</a></li>
        <li><a style="color:black; font-size:1.1em" href="">SPAREN</a></li>
        <li><a style="color:black; font-size:1.1em" href="">ANLEGEN</a></li>
        <li><a style="color:black; font-size:1.1em" href="">VORSORGEN</a></li>
        <li><a style="color:black; font-size:1.1em" href="">FINANZIEREN</a></li>
        </ul>
       
  </div>
</nav>
</div>
<div class="row">
<div class="col-md-4">
<h2>Willkommen</h2>
</div>
<div class="col-md-4 col-md-offset-4" style="padding-right:0px;margin-top:1%">
<!-- Button trigger modal -->
<div style="text-align:right">
<span id="Popup" style="display:none" data-toggle="modal" data-target="#myModal">
<button type="button" id="popbutton" class="btn btn-default"  data-toggle="tooltip" data-placement="left" title="Interesse an einem Banking Package?">Information</button>
</span>
</div>
</div>
</div>
<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Banking Package</h4>
      </div>
      <div class="modal-body">
      
     <div id="textDiv">
    <div id="nested"></div>
	</div>
     
     
      </div>
      <div class="modal-footer">
        <button id="Button1" type="button" class="btn btn-default" data-dismiss="modal" onclick="send(1)"></button>
        <button id="Button2" type="button" class="btn btn-primary" data-dismiss="modal" onclick="send(2)"></button>
        <button id="Button3" type="button" class="btn btn-primary" data-dismiss="modal" onclick="send(3)"></button>
      </div>
    </div>
  </div>
</div>   
        
        <!-- Server responses get written here -->
        <div id="messages"></div>
       
        <!-- Script to utilise the WebSocket -->
        <script type="text/javascript">
        	var outputtext;
                       
            
            
                
                
                // Create a new instance of the websocket
              var webSocket = new WebSocket('ws://' + window.document.location.host + '/FamilyNet/WebSocketIndexPage');
                 
                /**
                 * Binds functions to the listeners for the websocket.
                 */
                 
            		
            		
                 
                 
                webSocket.onopen = function(event){
                    // For reasons I can't determine, onopen gets called twice
                    // and the first time event.data is undefined.
                    // Leave a comment if you know the answer.
					
					
  
                    if(event.data === undefined){
                        return;
                   }
                   else{   
                   websocket.send(event.data);
                      }
 
 				
                   
                };
 
                webSocket.onmessage = function(event){
                    
                    var tmp = JSON.parse(event.data);
                    
                    console.log(tmp);
                    writeResponse(tmp);
                    
                };
 
                webSocket.onclose = function(event){
                    //writeResponse("Connection closed");
                };
            
           
            /**
             * Sends the value of the text input to the server
             */
			 
			 function send(text){
                webSocket.send(text);
                $( "#Popup" ).fadeOut( 2000, function() {});
                closeSocket();
            }
            
           
            function closeSocket(){
                webSocket.close();
            }
 
            function writeResponse(object){
               // messages.innerHTML += "<br/>" + text;
                
                
                
            	var div = document.getElementById("textDiv");
            	var nestedDiv = document.getElementById("nested");
				nestedDiv.textContent = object.message;
				document.getElementById("Button1").innerText = object.button1;
				document.getElementById("Button2").innerText = object.button2;
				document.getElementById("Button3").innerText = object.button3;
				console.log(object.message);
			
			

                
            	$( "#Popup" ).fadeIn( 3000, function() {});
           		//closeSocket(); 
                
            }
			
			
            
            
            
            
            
            
            
            //JQuery on Site
			
        
		 
		 
		 


$('#myModal').on('shown.bs.modal', function () {
  $('#myInput').focus()
})

$(function () {
  $('[data-toggle="tooltip"]').tooltip()
})
                 </script>
         

</div>



		




</body>
</html>