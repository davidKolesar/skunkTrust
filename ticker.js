//ES6 method to to GET requests
function activateTicker() {
	var url = "https://api.alternative.me/v2/ticker/?convert=EUR";
	var http_request;
http_request = new XMLHTTPRequest();
http_request.onreadystatechange = function () { /* .. */ };
http_request.open("GET", url);
http_request.withCredentials = true;
http_request.setRequestHeader("Content-Type", "application/json");
var response = http_request.send({ 'request': "authentication token" });

	console.log(JSON.parse(response));
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

//endpoints to consider: https://api.cryptowat.ch/markets/summaries