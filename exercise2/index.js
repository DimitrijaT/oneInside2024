const URL = "https://official-joke-api.appspot.com/random_joke"

async function fetchJoke() {
    try {
        const response = await fetch(URL)
        const joke = await response.json()

        const flashcard = document.getElementById("flashcard")

        flashcard.textContent = joke["setup"]

        flashcard.addEventListener("click", function () {
            flashcard.textContent = joke["punchline"] + " 😂😂"
        });

        console.log(joke)

    } catch (error) {
        console.error(`Error Occurred! ${error}`)
    }
}


document.addEventListener("DOMContentLoaded", fetchJoke)