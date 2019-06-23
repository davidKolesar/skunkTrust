function activateTicker() {
queryTicker();
}


//define callback for old GET request method
function callback(retVal){
 	console.log(JSON.parse(retVal));
}

// pre ES6 way to perform GET request in JS
function queryTicker(callback)
{	
	var tickerEndpoint = "https://api.alternative.me/v2/ticker/?convert=EUR"
	let xhr = new XMLHttpRequest();
	xhr.onreadystatechange = function(callback) {
		if (this.readyState === 4 && this.status === 200) {
		  let response = JSON.parse(this.responseText);
		 return response;    
		}
	  	}
	xhr.open("GET", "https://cors-anywhere.herokuapp.com/" + tickerEndpoint);
	xhr.setRequestHeader("Accept", 'application/json');
    var test = xhr.send();
	console.log(JSON.parse(test));
}
