function activateTicker() {
queryTicker();
}


// pre ES6 way to perform GET request in JS
function queryTicker()
{	
	var tickerEndpoint = "https://api.alternative.me/v2/ticker/?convert=EUR"
	let xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function(callback) {
		if (this.readyState === 4 && this.status === 200) {
		  let response = JSON.parse(this.responseText);
			console.log(response);
			callback(response);
		}
	  	}
	xhr.open("GET", "https://cors-anywhere.herokuapp.com/" + tickerEndpoint);
	xhr.setRequestHeader("Accept", 'application/json');
    xhr.send();
}


//define callback for old GET request method
function callback(response){
 	console.log(JSON.parse(response));
}
