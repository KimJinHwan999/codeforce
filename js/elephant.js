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
//test
