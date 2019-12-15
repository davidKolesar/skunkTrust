console.log("Oh! Look what you found!");


//Remember, client-side validation is nothing more than a convenience to the user!
function validateInput() {
	var input = document.getElementById("input");
	
	/*
	 * Checks if values are "truthy." This includes checks for:
	 * - null
	 * - undefined
	 * - NaN
	 * - empty string ("")
	 * - 0
	 * - false
	 */
	if(input){
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
	console.log(input);
	alert(input);
	
	        var restEndpoint
            let result = document.querySelector('.result'); 
            let name = document.querySelector('#name'); 
            let email = document.querySelector('#email'); 
               
            // Creating a XHR object 
            let xhr = new XMLHttpRequest(); 
        
            // open a connection 
            xhr.open("POST", restEndpoint, true); 
  
            // Set the request header i.e. which type of content you are sending 
            xhr.setRequestHeader("Content-Type", "application/json"); 
  
            // Create a state change callback 
            xhr.onreadystatechange = function () { 
                if (xhr.readyState === 4 && xhr.status === 200) { 
  
                    // Print received data from server 
                    result.innerHTML = this.responseText; 
  
                } 
            }; 
  
            // Converting JSON data to string 
            var data = JSON.stringify({ "name": name.value, "email": email.value }); 
  
            // Sending data with the request 
            xhr.send(data); 
}


