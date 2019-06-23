//ES6 method to to GET requests
function activateTicker() {
queryTicker();
}


//define callback for old GET request method
function callback(retVal){
 	console.log(JSON.parse(retVal));
}


// old school way to perform GET request in JS
function queryTicker(callback)
{	
	var tickerEndpoint = "https://api.alternative.me/v2/ticker/?convert=EUR"
  let xhr = new XMLHttpRequest();
  xhr.onreadystatechange = function() {
    if (this.readyState === 4 && this.status === 200) {
      let response = JSON.parse(this.responseText);
      callback(response);    }
  }
  xhr.open("GET", tickerEndpoint);
  xhr.setRequestHeader("Accept", 'application/json');
  xhr.send();
}
}

//endpoints to consider: https://api.cryptowat.ch/markets/summaries

