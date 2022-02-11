






var sendMessage = document.querySelector("#comment")
var url = window.location.pathname;
var id = url.substring(url.lastIndexOf('/'))

sendMessage.addEventListener('keypress', function(e) {
	if(e.key ==='Enter'){
	
	let message = {
		'username': user.username,
		'message' : sendMessage.value,
		'userId' : user.userId
	}
	sendMessage.value = ""
	fetch('/messageReceived'+id,{
		method: 'POST',
		headers: {
			"Content-Type": "application/JSON"
		},
		body: message
	})
	.then((response) => response.json())
	.then((message) => {
		sessionStorage.setItem('messages',message)
})}})


