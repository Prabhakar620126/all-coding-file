function count(first , last){
    var sum=0;
    for(var i=first; i<last; i++){
        sum+=i;
    }
    return sum;
}

function printaftergiventime(){
    console.log("this is called after given time ");
}
setTimeout(printaftergiventime, 20*1000);

var ans= count(1, 100);
console.log(ans);