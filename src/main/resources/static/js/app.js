var nroMesaInput = document.getElementById("nroMesa");
nroMesaInput.addEventListener("keydown", function(event) {
    if (event.key === "Enter") {
        event.preventDefault();
        cargarContenido();
    }
});

/*function enviar() {
    var valorDelId = document.getElementById("nroMesa").value;
    if(valorDelId.length != 6){
		return alert("No es un número de acta válido")
	}
	window.location.href = "http://localhost:8080/onpe/actas/numero/" + valorDelId;
}*/

function cargarContenido(){
	codigo = document.getElementById("nroMesa").value;
	if(codigo.length != 6){
		return alert("No es un número de acta válido")
	}
	$.ajax({
		url: 'http://localhost:8080/onpe/actas/numero/' + codigo,
		success: function(response){
			$('#divDetalle').html(response);
		}
	})
}