/*
  Write a function `isAnagram` which takes 2 parameters and returns true/false if those are anagrams or not.
  What's Anagram?
  - A word, phrase, or name formed by rearranging the letters of another, such as spar, formed from rasp.

  Once you've implemented the logic, test your code by running
  - `npm run test-anagram`
*/

function isAnagram(str1, str2) {
    // replacing  str to therir loower case 
    var lostr1=str1.toLowerCase();
    var lostr2=str2.toLowerCase();

    // sorting the lostr
    var sostr1= lostr1.split('').sort().join('');
    var sostr2= lostr2.split('').sort().join('');

    //comparing 

    if(sostr1==sostr2){
        return true;
    }else{
        return false;
    }


}

var result = isAnagram("spar", "rasp");
console.log(result);


/*
  2.Implement a function `calculateTotalSpentByCategory` which takes a list of transactions as parameter
  and return a list of objects where each object is unique category-wise and has total price spent as its value.
  Transaction - an object like { itemName, category, price, timestamp }.
  Output - [{ category1 - total_amount_spent_on_category1 }, { category2 - total_amount_spent_on_category2 }]

  Once you've implemented the logic, test your code by running
  - `npm run test-expenditure-analysis`
*/

function calculateTotalSpentByCategory(transactions) {
    return [];
  }
  
  module.exports = calculateTotalSpentByCategory;
