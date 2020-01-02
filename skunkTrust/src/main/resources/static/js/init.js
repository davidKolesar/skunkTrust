document.getElementById("output").value = "SKUNKTRUST";



//audio
function sound(src) {
  this.sound = document.createElement("audio");
  this.sound.src = src;
  this.sound.setAttribute("preload", "auto");
  this.sound.setAttribute("controls", "none");
  this.sound.style.display = "none";
  document.body.appendChild(this.sound);
  this.play = function(){
    this.sound.play();
  }
  this.stop = function(){
    this.sound.pause();
  }
}


/**
*There's no true sleep in JavaScript as of 2019, you'll have to do it this way.
*What you can probably do is set your paragraphs as char arrays and have them go through the loop
*/
function sleep(ms) {
  return new Promise(resolve => setTimeout(resolve, ms));
}

async function executeSleep() {
	var story = "S K U N K T R U S T -- Type 'start' to begin."
	var oneSecond = 1000;
	var output = story.split('');
    var currentStory = "";
	var type = new sound("sounds/console.mp3");
	
  // Sleep in loop
  for (var i = 0; i < output.length; i++) {
	currentStory = currentStory + output[i];
	await sleep(100);
	type.play();
	document.getElementById("output").value = currentStory;
  }
}

executeSleep();