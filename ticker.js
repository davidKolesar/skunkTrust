function activateTicker() {
	//define callback	
	function callback(retVal){
 		console.log(retVal);
    }
	
	//send request to ticker API
	queryTicker(callback);
}



function queryTicker(callback)
{	
	console.log('connected');
	var tickerEndpoint = "https://api.alternative.me/v2/ticker/"
    var jsonResponse;
	var xmlHttp = new XMLHttpRequest();
    xmlHttp.onreadystatechange = function() { 
        if (xmlHttp.readyState == 4 && xmlHttp.status == 200)
          jsonResponse =  callback(xmlHttp.responseText);
    }
    xmlHttp.open("GET", tickerEndpoint, true); // boolean for asynchronous 
    xmlHttp.send(null);
}