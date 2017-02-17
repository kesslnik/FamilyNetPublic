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
<div class="row">
<div id="top">
<div class="row" id="redtop">

<div class="col-sm-3 col-md-offset-6"><h5 style="font-size: 1.1em; font-weight:small; text-align:right;"><a style="color:white">de</a><a style="color:white"> | Beratersuche | </a><a style="color:white">Notfall</a><a style="color:white"> | E-Banking</a></h5></div>
<div class="col-sm-2">
    <div class="input-group input-group-sm" style="margin-top:1.5%;">
    <input type="text" class="form-control" placeholder="Suchbegriff...">
      <span class="input-group-btn">
        <button type="button" class="btn btn-default" aria-label="Left Align">
  <span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
      </span>
      
</div>
</div>
</div>

<div class= "container" style="position:relative">
<div class="row" style="margin-top:2%">

<div class="col-md-4" style="padding-left:10px;margin-top:1%"><img alt="" style="height:36px;width:180px;" src="./images/family-net_logo.png"></div>
<div class ="col-md-4 col-md-offset-4"><h4 style="text-align:right"><span class="glyphicon glyphicon-earphone" aria-hidden="true" style="color:#ce002f"></span>
+41 31 666 68 98</h4><h6 style="text-align:right">Wir sind gerne für Sie da!</h6></div>

</div>

<div class="row" style="margin-top:1%">
<nav class="navbar navbar-default navbar-static-top" >
  <div class="container">
    <ul class="nav navbar-nav">
    
    
     <li class="dropdown" id="xy">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color:black; font-size:1.1em">HYPOTHEK</a>
          <ul class="dropdown-menu">
            <li><a href="#">Festhypotheken</a></li>
            <li><a href="#">Variable Hypothek</a></li>
            <li><a href="#">Hypothekarzins</a></li>
            <li><a href="#">Voraussetzungen</a></li>
            <li><a href="#">Hypothekenrechner</a></li>
            <li><a href="#">Finanzierungsanfrage</a></li>
            <li><a href="#">Häufige Fragen</a></li>
           
          </ul>
        </li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color:black; font-size:1.1em">VORSORGE</a>
          <ul class="dropdown-menu">
            <li><a href="#">Häufige Fragen</a></li>
          </ul>
        </li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color:black; font-size:1.1em">VERSICHERUNG</a>
          <ul class="dropdown-menu">
            <li><a href="#">Haushalt- und Gebäudeversicherung</a></li>
            <li><a href="#">Lebensversicherung</a></li>
            <li><a href="#">Häufige Fragen</a></li>
          </ul>
        </li>
          <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color:black; font-size:1.1em">MAGAZIN</a>
          <ul class="dropdown-menu">
            <li><a href="#">Häufige Fragen</a></li>
          </ul>
        </li>
          <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" style="color:black; font-size:1.1em">ÜBER UNS</a>
          <ul class="dropdown-menu">
            <li><a href="#">Kontakt</a></li>
            <li><a href="#">Beratersuche</a></li>
            <li><a href="#">Häufige Fragen</a></li>
          </ul>
        </li>
        
        
        
        
</ul>
<ul class="nav navbar-nav navbar-right" style="display:none" id="Popup">
<li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="color:black; font-size:1.1em">KONTAKT</a>
         <ul class="dropdown-menu">
         <div class="row" style="text-align:center">
         <div id="nested" style="padding:15px;text-align:center"></div></div>
    <div class="row">
    	<button id="Button1" type="button" class="btn btn-default" onclick="send(1)"></button>
        <button id="Button2" type="button" class="btn btn-primary" onclick="send(2)"></button>
        <button id="Button3" type="button" class="btn btn-primary" onclick="send(3)"></button>
    </div>
	
          </ul>
        <li>
</ul>
  </div>
</nav>
</div>   
</div>
</div>
</div>
<div class="row" style="margin-top:15%">
<div class="container">
<img id="indeximg" src="./images/Hypothek.jpg">
</div>
</div>
<div class="row" style="margin-top:3%">
<div class="container">
<h3 style="margin:10px">family.net > Hypothek</h3>
<div class="col-md-8" style="position:static"><div style="padding:15px;background-color:white">
<div ><h1>Hypothek</h1>
<p>Erfahren Sie mehr über unsere wählbaren Hypothekarmodelle oder berechnen Sie die Tragbarkeit Ihrer Wunschhypothek.</p>
<h2>Wählen Sie die Hypothek, die zu Ihnen passt.</h2>
<p>Zwei Hypothekarmodelle stehen zur Auswahl. Nachfolgend werden diese vorgestellt.</p>
<a>Zu den Festhypotheken</a>
<a>Zur variablen Hypothek</a>
<h2>aktuelle Zinssätze</h2>
<p>Möchten Sie mehr erfahren über die aktuellen Zinssätze für feste und variable Hypotheken? Hier finden Sie alle wichtigen Informationen über Konditionen, Berechnungen und Tragbarkeit.</p>
<a>Zu den aktuellen Zinssätzen</a>
<h2>Sie haben Ihr Traumobjekt gefunden?</h2>
<p>Gerne prüfen wir Ihre Anfrage und setzen uns mit Ihnen in Verbindung.</p>
<a>Zur Finanzierungsanfrage</a>
</div>
</div>
</div>
<div class="col-md-4" style="position:static"><div style="padding:15px;background-color:white"><img id="articleimg" src="./images/Berater.jpg">
<div style="margin:5px"><h2>Berater</h2>
<p>Finden Sie eine Beraterin oder einen Berater in Ihrer Nähe.</p>
<div style="text-align:center"><button type="button" style="background-color:#ce002f;color:white" class="btn btn">Zur Beratersuche</button></div>
</div>
</div>
</div>
<div class="col-md-4"style="position:static;margin-top:10px;margin-bottom:15px"><div style="padding:15px;background-color:white"><img id="articleimg" src="./images/konditionen.jpg">
<div ><h2>Aktuelle Zinssätze</h2>
<p>family-net bietet Festzins­hypotheken von 2 bis 15 Jahren Laufzeit sowie variable Hypotheken an.</p>
<div style="text-align:center"><button type="button" style="background-color:#ce002f;color:white" class="btn btn">Offerte anfordern</button></div>
</div>
</div>
</div>
</div>
</div>
<div class="row">
<div id="graybottom1">
<div class="container">
<div class="col-md-3">
<p>family-net.ch ist ein Partnerangebot der Mobiliar und der Berner Kantonalbank AG</p>
</div>
<div class="col-md-3">
<p>Legal Disclaimer: Bitte beachten Sie die wichtigen rechtlichen Hinweise und die Ausführungen zum Datenschutz der BEKB.
Diese Website benutzt Google Analytics, einen Webanalysedienst der Google Inc. ("Google"). Weitere Informationen unter folgendem Link.</p>
</div>
<div class="col-md-3">
<h4 style="color:white">Registrierung Newsletter</h4>
<div class="input-group input-group-sm" style="margin-top:1.5%;">
    <input type="text" class="form-control" placeholder="E-Mail-Adresse">
      <span class="input-group-btn">
        <button type="button" class="btn btn-default" aria-label="Left Align">
  <span class="glyphicon glyphicon-envelope" aria-hidden="true"></span></button>
      </span>
</div>
</div>
<div class="col-md-3">
<img src="./images/BEKBgrau.jpg">
<img src="./images/logo-mobiliar.jpg">
</div>

</div>
</div>
<div id="graybottom2"></div>
</div>
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
                
                
                
            	var nestedDiv = document.getElementById("nested");
				nestedDiv.textContent = object.message;
				document.getElementById("Button1").innerText = object.button1;
				document.getElementById("Button2").innerText = object.button2;
				document.getElementById("Button3").innerText = object.button3;
				console.log(object.message);
			
			

                
            	$( "#Popup" ).fadeIn( 3000, function() {});}
           	//closeSocket();  
            //JQuery on Site
			
        
            $('ul.nav li.dropdown').hover(function() {
  $(this).find('.dropdown-menu').stop(true, true).delay(50).fadeIn(200);
}, function() {
  $(this).find('.dropdown-menu').stop(true, true).delay(50).fadeOut(200);
});
            
$('#myModal').on('shown.bs.modal', function () {
  $('#myInput').focus()
})

$(function () {
  $('[data-toggle="tooltip"]').tooltip()
})

</script>
</body>
</html>