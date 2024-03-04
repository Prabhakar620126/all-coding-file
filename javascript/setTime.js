
var counter= 1;
function printCounter(){
    console.clear();
    console.log(counter);
    counter= counter+1;

}
setInterval(printCounter, 1000);  
var sum=0;
for(var i=0; i<1000; i++){
    sum+=i;

}
console.log(sum);