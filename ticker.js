var tickerData;

function activateTicker() {
queryTicker();
	console.log(tickerData);
}


// pre ES6 way to perform GET request in JS
function queryTicker()
{	
	var tickerEndpoint = "https://api.alternative.me/v2/ticker/?convert=EUR"
	let xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function() {
		if (this.readyState === 4 && this.status === 200) {
		  var response = JSON.parse(this.responseText);
			console.log(response);
			return response;
	  	}
	xhr.open("GET", "https://cors-anywhere.herokuapp.com/" + tickerEndpoint);
	xhr.setRequestHeader("Accept", 'application/json');
	tickerData = xhr.send();
 
}

