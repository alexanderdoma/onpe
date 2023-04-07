var nroMesaInput = document.getElementById("nroMesa");
nroMesaInput.addEventListener("keydown", function(event) {
    if (event.key === "Enter") {
        event.preventDefault();
        enviar();
    }
});


function enviar() {
    var valorDelId = document.getElementById("nroMesa").value;
    if(valorDelId.length != 6){
		return alert("No es un número de acta válido")
	}
	window.location.href = "actas_numero/" + valorDelId;
}

function recibirGrupoVotacion(){
	
}