let user = prompt('Enter your name') 
		fetch("/welcome/createuser", {
		method : "POST",
		headers: {
			"Content-Type" : "application/json"
		},
		body: user
		
	})
	.then((response) => console.log(response.json()))
		.then(data => 
			sessionStorage.setItem('user', JSON.stringify(user)),
			console.log(user))
	 		