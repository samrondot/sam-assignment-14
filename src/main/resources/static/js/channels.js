var sendMessage = document.querySelector("#textArea")

sendMessage.addEventListener('keypress', () =>{
	var message = {
		"textArea": textArea.value}
	fetch('/messageSent'), {
		method: 'POST',
		headers: {
			"Content-Type": "application/JSON"
		},
		body: JSON.stringify(message)
		
	}
	.then((response) => response.json())
	.then((data) => {
		console.log(data)
	})
})