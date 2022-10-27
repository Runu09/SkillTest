//거스름돈 구하기

/*
<문제점>
물건 가격의 1의 자릿수가 ‘0’일 경우는 잘나옴.
다만, 1의 자릿수가 ‘0’이 아니라면 조금 이상함…ㅎㅎ
*/

//코드 1
//좀 더 간결한 코드는 아래에 있음.
import java.util.*;

public class HelloWorld{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in); //사용자에게 값을 입력받는다.
        
        System.out.println("How many items?"); //몇 개의 물건을 사는지
        int item = sc.nextInt(); //물건의 갯수를 입력받는다.
        int[] items = new int[item]; //입력 받은 물건의 갯수로 배열의 길이 설정
        
        System.out.println("Items price?"); //물건 각각의 가격
        for(int k = 0; k < item; k++){ //반복문을 통해서 물건의 가격을 배열에 넣는다.
            items[k] = sc.nextInt();
        }
        
        System.out.println("How much do you have?"); //현재 가지고 있는 돈
        int money = sc.nextInt();
        
        int sum = 0;
        for(int i = 0; i < items.length; i++){ //물건의 갯수만큼 가격을 더한다.
            sum += items[i];
        }
        
        int Total_Change = money - sum; //총 거스름돈
        int Change = money - sum; //어떻게 거슬러줘야하는지에 대한 변수 생성
        
        System.out.println("Money : " + money); //현재 가지고 있는 돈
        System.out.println("Total Price : " + sum); //물건의 총 가격
        
				//50000원, 10000원, 5000원, 1000원, 500원, 100원, 50원, 10원
				//어떻게 거슬러줘야하는지
        int C50000, C10000, C5000, C1000, C500, C100, C50, C10;
        C50000 = Change / 50000;
        System.out.println("Change 50000 : " + C50000);
        
        Change = Change % 50000;
        C10000 = Change / 10000;
        System.out.println("Change 10000 : " + C10000);
        
        Change = Change % 10000;
        C5000 = Change / 5000;
        System.out.println("Change 5000 : " + C5000);
        
        Change = Change % 5000;
        C1000 = Change / 1000;
        System.out.println("Change 1000 : " + C1000);
        
        Change = Change % 1000;
        C500 = Change / 500;
        System.out.println("Change 500 : " + C500);
        
        Change = Change % 500;
        C100 = Change / 100;
        System.out.println("Change 100 : " + C100);
        
        Change = Change % 100;
        C50 = Change / 50;
        System.out.println("Change 50 : " + C50);
        
				//총 거스름돈
        System.out.println("Total Change : " + Total_Change);
     }
}


/*
너무 복잡해보여서 조금 간결하게 수정을 진행함.
하지만, 1의 자릿수가 0이 아닐 때의 상황은 똑같음

어차피 1원 단위는 없으니~~~ 상관없겠지 
*/

//코드 2
import java.util.*;

public class HelloWorld{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("How many items?"); 
        int item = sc.nextInt();
        int[] items = new int[item]; 
        
        System.out.println("Items price?"); 
        for(int k = 0; k < item; k++){ 
            items[k] = sc.nextInt();
        }
        
        System.out.println("How much do you have?");
        int money = sc.nextInt();
        
        int sum = 0;
        for(int i = 0; i < items.length; i++){
            sum += items[i];
        }
        
        int Total_Change = money - sum;
        int Change = money - sum; 
        
        System.out.println("Money : " + money);
        System.out.println("Total Price : " + sum); 
        
				//수정한 부분
        int CArr[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        for(int i = 0; i < CArr.length; i++) {
            if(Change / CArr[i] > 0) {
                System.out.println(CArr[i] + " => " + Change/CArr[i]);
                Change %= CArr[i];
            }
        }
        
        System.out.println("Total Change : " + Total_Change);
     }
}
