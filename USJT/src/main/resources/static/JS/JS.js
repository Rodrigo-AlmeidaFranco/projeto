function show(modalClass){
	 document.getElementById('perfil').style.display ="none";
	 document.getElementById('metodosPagto').style.display ="none";
	 document.getElementById('suporte').style.display ="none";
	 document.getElementById('devolucao').style.display ="none";
	 document.getElementById('trakcer').style.display ="none";
	
	var div = document.getElementById(modalClass);
	div.style.display = "block";
}
