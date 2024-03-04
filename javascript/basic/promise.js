

function promiseBody(resolve){
    setTimeout(resolve, 5000)
}
function medicine1Get(){
    var answer= new Promise(promiseBody);
    console.log("medicinePromise2");
    return answer;
}
function printThing(){
    console.log("medicine 1 recevied ")
}
var medicinePromise = medicine1Get();
console.log("medicinePromise");
medicinePromise.then(printThing())
//console.log("medicinePromise1");
