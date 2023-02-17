function createMathFunction(operation) {
    if (operation === "square") {
      return function(x) {
        return x * x;
      };
    } else if (operation === "sqrt") {
      return function(x) {
        return Math.sqrt(x);
      };
    } else {
      throw new Error("Invalid operation");
    }
  }
  
  const square = createMathFunction("square");
  console.log(square(5));
  
  const sqrt = createMathFunction("sqrt");
  console.log(sqrt(25));