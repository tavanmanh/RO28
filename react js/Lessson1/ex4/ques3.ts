function getGreeting(firstName, lastName) {
    function greeting() {
      return `${firstName} ${lastName}`;
    }
  
    return greeting();
  }
  
  console.log(getGreeting("John", "Doe"));