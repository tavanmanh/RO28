function generateRandomNumberEx3() {
    var randomNumber = Math.floor(Math.random() * 100000).toString();
    while (randomNumber.length < 5) {
        randomNumber = "0" + randomNumber;
    }
    console.log(randomNumber);
    return randomNumber.slice(-2);
}
console.log(generateRandomNumberEx3());
