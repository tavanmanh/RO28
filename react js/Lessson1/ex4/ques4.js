var i = 1;
var intervalId = setInterval(function () {
    console.log(i);
    i++;
    if (i > 6) {
        clearInterval(intervalId);
    }
}, 1000);
