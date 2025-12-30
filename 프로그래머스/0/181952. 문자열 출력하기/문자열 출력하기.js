const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = [line];
}).on('close',function(){
    str = input[0];
    console.log(str);
});

/**
먼저 readline 모듈을 가져온 다음, readline.createInterface 함수를 사용하여 rl 객체를 생성합니다. 이 객체는 입력과 출력 스트림을 설정하는 데 사용됩니다. process.stdin은 사용자로부터의 입력을 받는 스트림을 나타내고, process.stdout은 출력을 표시하는 스트림을 나타냅니다.

그리고 on('line', console.log)을 통해 'line' 이벤트가 발생할 때마다 console.log 함수가 호출되도록 설정하고 있습니다. 이벤트가 발생하는 경우에는 사용자가 한 줄의 입력을 완료하면 해당 입력이 console.log를 통해 콘솔에 출력됩니다.
*/