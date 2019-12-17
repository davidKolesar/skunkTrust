alert("init connected");
document.getElementById("output").value = "SKUNKTRUST";


/*There's no true sleep in JavaScript as of 2019, you'll have to do it this way.
*
*What you can probably do is set your paragraphs as char arrays and have them go through the loop
*
*/


function sleep(ms) {
  return new Promise(resolve => setTimeout(resolve, ms));
}

async function demo() {
	var story = "I wish Jenn didn't hit me in the head with a pillow. It was quite inappropriate!"
	var twoSeconds = 2000;
	var output = story.split('');
    var currentStory = "";
	
  // Sleep in loop
  for (var i = 0; i < output.length; i++) {
	currentStory = currentStory + output[i];
	await sleep(50);
	document.getElementById("output").value = currentStory;
  }
}

demo();