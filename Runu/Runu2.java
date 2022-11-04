//두 수 사이의 숫자들의 합 계산

/*
먼저 입력하는 숫자가 커도 잘 나와야함.
*/

//코드
import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("int n1 : ");
        int n1 = sc.nextInt();
        
        System.out.print("int n2 : ");
        int n2 = sc.nextInt();
        
        int sum = 0;
        
        if(n1 > n2){ //ex) n1 = 2, n2 = 5
            int n3 = n1; // n3 = 2
            n1 = n2; //     n1 = 5
            n2 = n3; //     n2 = 2
        }
        
        for(int i = n1; i <= n2; i++){
            sum += i;
        }
        System.out.println(sum);
     } 
}
