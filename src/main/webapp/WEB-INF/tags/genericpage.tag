<%@tag description="Szablon glowny strony" pageEncoding="UTF-8"%>
<%@attribute name="sidebar" fragment="true" %>
<%@attribute name="links" fragment="true" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="css/style.css" >
	<jsp:invoke fragment="links"/>
	<title>EVENT DAY</title>
</head>

<body>
	<div class="page">
		<header>
			<div id="title">
			<h1>EVENT DAY</h1>
			</div>
			<!-- <div id="log">
			   
			</div>-->
			<nav>
				<ul id="menu">
					<li><a href="http://przyklad.com">Wyloguj</a> </li>
					<li><a href="szukaj.jsp">Szukaj</a> </li>
					<li><a href="http://przyklad.com">Kalendarz</a> </li>
					<li><a href="twojeEventy.jsp">Twoje Eventy</a> </li>
					<li><a href="profil.jsp">Profil</a> </li>
				</ul>
			</nav>
		</header>
					
		<section id="sidebar">
			<jsp:invoke fragment="sidebar"/>
		</section>
						
		<section id="main">	
			<jsp:doBody/>
		</section>
		
		<footer>
			stopka
		</footer>
	</div>
</body>
</html>