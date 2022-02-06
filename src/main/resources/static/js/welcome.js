var user = prompt('Enter your name') 
		fetch("/welcome/createuser", {
		method : "POST",
		headers: {
			"Content-Type" : "application/json"
		},
		body: user
		
	})
	.then((response) => console.log(response.json()))
		.then((data) => 
			sessionStorage.setItem('user', user))
			var userObj = JSON.stringify(sessionStorage.user)
	 		console.log(userObj)
			console.log('Hello')

