var userPrompt = document.querySelector("#prompt")
console.log(userPrompt)


userPrompt.addEventListener('submit', ()=> {
	var user = {
	"username" : userPrompt.value
}
	fetch('/welcome', {
	method : "POST",
	headers: {
		"Content:Type" : "application/json"
	},
	body: JSON.stringify(user)
})

})
	

