const fs = require("fs");

const input = fs.existsSync("example.txt")
  ? fs.readFileSync("example.txt", "utf8")
  : fs.readFileSync(0, "utf8");

const arr = input.trim().split(/\s+/);

let idx = 0;

// 여기서부터 문제 풀이

/*
const n = Number(arr[idx++]); //숫자
const str = arr[idx++]; //문자열

const result = [];

result.push("YES");
result.push("NO");

console.log(result.join("\n")); //정답 여러개
*/

//elephant 0 friend x(x>0)

const move = Number(arr[idx]);
const step = Math.floor(move / 5);
const step1 = Number(move % 5 === 0 ? 0 : 1);
const step2 = step + step1;
console.log(step2);
