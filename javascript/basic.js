function print(){
  console.log("don is here ");
  
}
console.log("Hello World");
var name = "prabhakar";
console.log(name);
var user = {
  name: "shubham",
  age: 20,
};
console.log(user); 
var users = [
  {name :"prabhakar", age: 21},
  {name: "shubham", age: 20}];
for(var i=0;i<users.length;i++){
  console.log(users[i]);
}
print();
const tolog = users[1].name +" 's age is " + users[1].age;
console.log(tolog);
console.log("atul and manish ");
console.log(users[0].name +" 's age is " + users[0].age);
print();