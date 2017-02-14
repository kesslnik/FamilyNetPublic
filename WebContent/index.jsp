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
<div id="MAINY" style="position:absolute">
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
  </div>
</nav>
</div>

<div class="row">
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
</div>
</div>
</div>
<div class="row" style="margin-top:15%">
<img id="indeximg" src="./images/family-net-traumhaus-gefunden.jpg">
</div>
<div class="row" style="margin-top:3%">
<div class="container">
<div class="col-md-4" style="position:static"><div style="padding:15px;background-color:white"><img id="articleimg" src="./images/berechnungen.jpg">
<div ><h2>Hypotheken­rechner</h2>
<p>Wie hoch darf die Hypothek sein? Berechnen Sie die Tragbarkeit Ihrer Wunschhypothek gleich selbst.</p>
<div style="text-align:center"><button type="button" style="background-color:#ce002f;color:white" class="btn btn">Zum Hypothekenrechner</button></div>
</div>
</div>
</div>
<div class="col-md-4" style="position:static"><div style="padding:15px;background-color:white"><img id="articleimg" src="./images/konditionen.jpg">
<div style="margin:5px"><h2>Aktuelle Zinssätze</h2>
<p>family-net bietet Festzins­hypotheken von 2 bis 15 Jahren Laufzeit sowie variable Hypotheken an.</p>
<div style="text-align:center"><button type="button" style="background-color:#ce002f;color:white" class="btn btn">Zu den Zinssätzen</button></div>
</div>
</div>
</div>
<div class="col-md-4"style="position:static"><div style="padding:15px;background-color:white"><img id="articleimg" src="./images/hypotheken-angebot.jpg">
<div ><h2>Finanzierungs­anfrage</h2>
<p>family-net bietet Festzins­hypotheken von 2 bis 15 Jahren Laufzeit sowie variable Hypotheken an.</p>
<div style="text-align:center"><button type="button" style="background-color:#ce002f;color:white" class="btn btn">Kostenlos Offerte anfordern</button></div>
</div>
</div>
</div>
</div>
</div>
<div class=row>
<div class="container" style="padding:15px;padding-left:30px">
<h2>Finanzieren - Vorsorgen - Versichern</h2>
<p>family-net, ein Partnerangebot der Schweizerischen Mobiliar Versicherungs­gesellschaft AG und der Berner Kantonalbank AG, kombiniert Finanzieren, Vorsorgen und Versichern in einem Paket. Zusätzlich profitieren Sie von attraktiven Konditionen und Zusatzdienstleistungen.</p>
<ul>
<li>Attraktive Zinskonditionen für Ihre Hypothek</li>
<li>Analyse der Tragbarkeit und Vorsorge für Eigenheimbesitzer im Alter, bei Invalidität oder Tod</li>
<li>Einmaliger Kundenvorteil mit unserer Versicherung von max. CHF 400.-</li>
</ul>
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
                
                
                
            	var div = document.getElementById("textDiv");
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