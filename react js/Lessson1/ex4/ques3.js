function getGreeting(firstName, lastName) {
    function greeting() {
        return "".concat(firstName, " ").concat(lastName);
    }
    return greeting();
}
console.log(getGreeting("John", "Doe"));
