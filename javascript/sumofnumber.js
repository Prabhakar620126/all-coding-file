// sum of number from 0 to 100
function sumall(start, endindex) {
  var sum = 0;
  for (var i = start; i < endindex; i++) {
    //sum+=i;
    sum = sum + i;
  }
  return sum;
}
function sum(index1, index2) {
  return index1 + index2;
}
function multiply(index1, index2) {
  return index1 * index2;
}

function divide(index1, index2) {
  return index1 / index2;
}
function doarthimic(index1, index2, arthimethicFn) {
  if (arthimethicFn == "sum") {
    return sum(index1, index2);
  }
  if (arthimethicFn == "multiply") {
    return multiply(index1, index2);
  }
}
/*
 *
 **
 ***
 ****
 */
function patternprinting(row) {
  for (var i = 0; i < row; i++) {
    var stringto = " ";
    for (var j = 0; j < i + 1; j++) {
      stringto = stringto + "*";
    }
    console.log(stringto);
  }
}

function patternprint(row) {
  for (var i = 0; i < row; i++) {
    var stringto = " ";
    for (var j = 0; j < 2 * (i + 1); j++) {
      stringto = stringto + "*";
    }
    console.log(stringto);
  }
}
function patternprint1(row) {
  for (var i = 0; i < row; i++) {
    var stringto = " ";
    for (var j = 0; j < row - i; j++) {
      stringto = stringto + " ";
    }
    for (var j = 0; j < 2 * i - 1; j++) {
      stringto = stringto + "*";
    }
    console.log(stringto);
  }
}

var sum = sumall(1, 100);
console.log(sum);

var ans = multiply(1, 5);
console.log(ans);
var answer = doarthimic(1, 2, sum);
console.log(answer);
patternprinting(2);
console.log("new pattern");
patternprint(3);
console.log("new pattern");
patternprint1(5);

 