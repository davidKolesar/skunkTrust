var tickerData = "";

function activateTicker() {
	queryTicker();
	return tickerData;
}


// pre ES6 way to perform GET request in JS
function queryTicker(callback)
{	
	var tickerEndpoint = "https://api.alternative.me/v2/ticker/?convert=USD"
	let xhr = new XMLHttpRequest();
	
	xhr.onreadystatechange = function(callback) {
		if (this.readyState === 4 && this.status === 200) {
		  var response = JSON.parse(this.responseText);
			//handles asnyc xhr call
			if(response !== undefined) {
				tickerData = response;	
			}
		}
	}
	xhr.open("GET", "https://cors-anywhere.herokuapp.com/" + tickerEndpoint);
	xhr.setRequestHeader("Accept", 'application/json');
	tickerData = xhr.send();
}


//access by tickerData.data[1].quotes.USD