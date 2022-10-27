//입력 받은 문자에 소문자 ‘a’의 개수 구하기

//코드
import java.util.*;

public class HelloWorld{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("key : ");
        String key = sc.next();
        
        int a = 0;
        
        for(int i = 0; i < key.length(); i++){
            if(key.charAt(i) == 'a'){
                a++;
            }
        }
        
        System.out.println("=================");
        
        System.out.println("key : " + key);
        System.out.println("CNT a = " + a);
        
     }
}
