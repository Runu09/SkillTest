//숫자 문자열과 영단어

/*
<문제>
네오와 프로도가 숫자놀이를 하고 있습니다. 네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.

- 1478 → "one4seveneight"
- 234567 → "23four5six7"
- 10203 → "1zerotwozero3"

이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 `s`가 매개변수로 주어집니다. `s`가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.

참고로 각 숫자에 대응되는 영단어는 다음 표와 같습니다.
*/

/*
<제한사항>
- 1 ≤ `s`의 길이 ≤ 50
- `s`가 "zero" 또는 "0"으로 시작하는 경우는 주어지지 않습니다.
- return 값이 1 이상 2,000,000,000 이하의 정수가 되는 올바른 입력만 `s`로 주어집니다.
*/

class Solution {
    public int solution(String s) {
        int answer = 0;
				//배열에 담아서
        String[] Eng_num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
				//0부터 9까지의 영단어가 나오면 Replace로 해당 영단어를 i로 바꾸는 반복문 실행
        for(int i = 0; i < 10; i++ ){
            s = s.replace(Eng_num[i],Integer.toString(i));
        }
	
				//그 후 String을 Integer를 활용해 int로 변경
        answer = Integer.parseInt(s);
        return answer;
    }
}
