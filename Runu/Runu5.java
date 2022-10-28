//정수 입력

/*
try ~ catch ~ 사용
*/

//코드
import java.util.*;

public class HelloWorld{
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("num : ");
        
        try{
            int a = sc.nextInt();
            System.out.println(a);
        }catch(Exception e){
            System.out.println("not Integer");
        }
        
    }
}
