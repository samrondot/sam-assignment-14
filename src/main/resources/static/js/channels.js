var sendMessage = document.querySelector("#comment")
var url = window.location.pathname;
var id = url.substring(url.lastIndexOf('/'))
console.log(url)	
console.log(id)
sendMessage.addEventListener('keypress', function(e) {
	
	if(e.key ==='Enter'){
	var message = {
		"comment": comment.value}
		
	fetch('/messageSent'+id,{
		method: 'POST',
		headers: {
			"Content-Type": "application/JSON"
		},
		body: JSON.stringify(message)
		
		
	})
	.then((response) => response.json())
	.then((data) => {
		sessionStorage.setItem('message',JSON.stringify(message))
		
})}})


