var input = document.getElementById("input");
input.addEventListener("keyup", function(event) {
	if (event.keyCode === 13) {
		event.preventDefault();
		document.getElementById("terminalReturn").click();
	}
});

function sendJSON() {
	alert("goodbye, world.");
}


