//가장 큰 수

/*
<문제>
0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 
순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
*/

/*
<제한사항>
- numbers의 길이는 1 이상 100,000 이하입니다.
- numbers의 원소는 0 이상 1,000 이하입니다.
- 정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
*/

/*
<입출력예>
[6, 10, 2]  ->  "6210" 
[3, 30, 34, 5, 9]  ->  "9534330" 
*/

//코드
import java.util.*;

class Solution {
    public String solution(int[] nums) {
        String answer = "";
        String[] arrNum = new String[nums.length];
        
        for (int i = 0; i < nums.length; i++){
            arrNum[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(arrNum, (o1, o2) -> {
            if(o1.charAt(0)>o2.charAt(0)) return -1;
            else if(o1.charAt(0)<o2.charAt(0)) return 1;
            else{
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        
        for(int i =0; i< arrNum.length; i++) {
            if(answer.equals("")){
                if(arrNum[i].equals("0")) continue;
            }
            answer += arrNum[i];
        }
        if(answer.equals("")) answer = "0";
        return answer;
    }
}
