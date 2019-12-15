//setting button invisible
document.getElementById("terminalReturn").style.visibility="hidden";

//allow textbox to submit with return button (helps with other browsers)
var input = document.getElementById("terminalReturn");
input.addEventListener("keyup", function(event) {
  if (event.keyCode === 13) {
   event.preventDefault();
   document.getElementById("terminalReturn").click();
  }
});



function sendJSON() {
	alert("goodbye, world.");
}


