const fs = require('fs');
function complexfn(n){
    var sum =0;
    for(var i=0; i<n; i++){
        sum+= i;
    }
    console.log(sum);
}

// var starttime= new Date().getTime();
// const a= complexfn(10000000);
// const b= complexfn(10000000);
// var endtime = new Date().getTime();
// console.log(endtime - starttime);
function file(err , content){
    complexfn(content);
    
}

fs.readFile("fileIsread.txt" ,'utf8', file);
