function httpGetAsync( callback)
{
	var tickerEndpoint = "https://api.alternative.me/v2/ticker/"
    var xmlHttp = new XMLHttpRequest();
    xmlHttp.onreadystatechange = function() { 
        if (xmlHttp.readyState == 4 && xmlHttp.status == 200)
            callback(xmlHttp.responseText);
    }
    xmlHttp.open("GET", tickerEndpoint, true); // boolean for asynchronous 
    xmlHttp.send(null);
}