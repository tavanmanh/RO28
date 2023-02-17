function generateRandomNumber() {
    let randomNumber = Math.floor(Math.random() * 100000).toString();
    while (randomNumber.length < 5) {
      randomNumber = "0" + randomNumber;
    }
    return randomNumber;
  }
  
  console.log(generateRandomNumber());