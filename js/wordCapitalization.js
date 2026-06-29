var input = require("fs").readFileSync("example.txt").toString().split(" "); //로컬용
//var input = require("fs").readFileSync(0, "utf8").toString().split(" ");
var word = input[0];

const wordArr = word.split("");

wordArr[0] = word.charAt(0).toUpperCase();

console.log(wordArr.join(""));
