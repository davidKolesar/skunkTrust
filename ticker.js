function activateTicker() {
	//define callback	
	function callback(retVal){
 		console.log(retVal);
    }
	
	//send request to ticker API
	var response = queryTicker(callback);
		if (jsonResponse !== 'undefined' ) {
			console.log(JSON.parse(jsonResponse));
		}
}


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
	}
    xmlHttp.open("GET", tickerEndpoint, true); // boolean for asynchronous 
    xmlHttp.send(null);
}