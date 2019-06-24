var tickerData = "";

function activateTicker() 
{
	queryTicker();
}


// pre ES6 way to perform GET request in JS
function queryTicker(callback)
{	
	var tickerEndpoint = "https://api.alternative.me/v2/ticker/?convert=USD"
	let xhr = new XMLHttpRequest();
	
	xhr.onreadystatechange = function(callback) 
	{
		if (this.readyState === 4 && this.status === 200) 
		{
		  var response = JSON.parse(this.responseText);
			//handles asnyc xhr call
			if(response !== undefined) 
			{
				tickerData = response;
				displayData();
			}
		}
	}
	xhr.open("GET", "https://cors-anywhere.herokuapp.com/" + tickerEndpoint);
	xhr.setRequestHeader("Accept", 'application/json');
	tickerData = xhr.send();
}


function displayData()
{	
	var displayData = "";
	
	//get the first 10 cryptoCurrencies
	for(var i = 0; i < 9; i++) 
	{
		displayData = displayData + " --- " + document.getElementById("tickerText").innerHTML = tickerData.data[i].name  + " : $" + tickerData.data[i].quotes.USD.price;
	}
	return displayData;
}