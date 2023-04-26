// Get the modal
var modal = document.getElementById("myModal");

// Get the button that opens the modal
window.onload = function() {
  modal.style.display = "block";
};

// Get the <span> element that closes the modal
var closeBtn = document.getElementsByClassName("close")[0];

// When the user clicks on the close button, close the modal
closeBtn.onclick = function() {
  modal.style.display = "none";
};

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
};

// Handle login and signup buttons
var loginBtn = document.getElementById("loginBtn");
var signupBtn = document.getElementById("signupBtn");

loginBtn.onclick = function() {
  // handle login button click
};

signupBtn.onclick = function() {
  // handle signup button click
};
