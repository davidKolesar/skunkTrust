var tickerData;

function activateTicker() {
queryTicker();
	console.log(tickerData);
}


// pre ES6 way to perform GET request in JS
function queryTicker(callback)
{	
	var tickerEndpoint = "https://api.alternative.me/v2/ticker/?convert=EUR"
	let xhr = new XMLHttpRequest();
	
	xhr.onreadystatechange = function(callback) {
		if (this.readyState === 4 && this.status === 200) {
		  var response = JSON.parse(this.responseText);
			console.log(response);
		}
	  	}
	xhr.open("GET", "https://cors-anywhere.herokuapp.com/" + tickerEndpoint);
	xhr.setRequestHeader("Accept", 'application/json');
	tickerData = xhr.send();
}
