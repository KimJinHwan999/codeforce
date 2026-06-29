//var input = require("fs").readFileSync("example.txt").toString().split(" "); //로컬용
var input = require("fs").readFileSync(0, "utf8").toString().split(" ");
var a = Number(input[0]);
var b = Number(input[1]);
let i = 0;
while (a <= b) {
  i++;
  a *= 3;
  b *= 2;
}

console.log(i);
