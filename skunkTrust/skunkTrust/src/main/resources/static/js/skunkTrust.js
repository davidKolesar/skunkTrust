console.log("Oh! Look what you found!");

//Remember, client-side validation is nothing more than a convenience to the user!
function validateInput() {
	var input = document.getElementById("input");
	//set it to empty
	document.getElementById("input").value = "";
	/*
	 * Checks if values are "truthy." This includes checks for:
	 * - null
	 * - undefined
	 * - NaN
	 * - empty string ("")
	 * - 0
	 * - false
	 */
	 if(input)
	 {
		sendJSON(input);
	 }
	 
}


function sendJSON(input) {
	
	/*
	* 1. Take input from terminalReturn
	* 1.5 client-side validation is performed
	* 2. Serialize it as JSON
	* 3. Send it to endpoint (serverside)
	* 4. Input gets sent to console IO (server-side validation / Sanitation)
	* 5. Gameplay business logic executed
	* 6. Response it output to terminal
	* 7. Terminal is refreshed
	*/	
	var http = new XMLHttpRequest();
	var url = 'skunktrust/gameController';
	var params = input;
	http.open('POST', url, true);

	//Send the proper header information along with the request
	http.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');

	http.onreadystatechange = function() {//Call a function when the state changes.
		if(http.readyState == 4 && http.status == 200) 
		{
			alert(http.responseText);
		}
	}
	
	http.send(params);
}

