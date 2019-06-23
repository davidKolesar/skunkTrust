//ES6 method to to GET requests
function activateTicker() {
	var url = "https://api.alternative.me/v2/ticker/?convert=EUR";
	fetch(url).then(function(response) {
	  return response.json();
	}).then(function(data) {
	  console.log(data);
	}).catch(function() {
	  console.log("Unable to retrieve ticker data -- ticker server is down.");
	});
}


//define callback for old GET request method
function callback(retVal){
 	console.log(retVal);
}


// old school way to perform GET request in JS
function queryTicker(callback)
{	
	console.log('connected to ticker');
	var tickerEndpoint = "https://api.alternative.me/v2/ticker/?convert=EUR"
    var jsonResponse;
	var xmlHttp = new XMLHttpRequest();
    xmlHttp.onreadystatechange = function() { 
        if (xmlHttp.readyState == 4 && xmlHttp.status == 200)
          jsonResponse =  callback(xmlHttp.responseText);
			}
    xmlHttp.open("GET", tickerEndpoint, true); // boolean for asynchronous 
    xmlHttp.send(null);
}