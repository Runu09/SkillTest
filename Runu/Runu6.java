//빵 만들기

//Method를 만들어서 출력을 하도록 구현

//코드
import java.util.*;

public class HelloWorld{
    Scanner sc = new Scanner(System.in);
    
    //1. 그냥 빵 만들기
    public static void makeBread(){
        System.out.println("Make a bread!");
    }
    
    //2. 몇개의 빵을 만들건지
    public static void makeBread1(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        for(int i = 0; i < a; i++){
            System.out.println("Make a bread!");
        }
        System.out.println("");
        System.out.println("Total " + a + " bread!");
    }
    
    //3. 무슨 빵을 몇개 만들건지
    public static void makeBread2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("num : ");
        int a = sc.nextInt();
        
        System.out.print("what : ");
        String b = sc.next();
        
        for(int i = 0; i < a; i++){
            System.out.println("Make a " + b + " bread!");
        }
        System.out.println("");
        System.out.println("Total " + a + " bread!");
    }
		
		//메인
    public static void main(String []args){
        
        makeBread();
        
        System.out.println("");
        System.out.println("=============================");
        System.out.println("");
        
        makeBread1();
        
        System.out.println("");
        System.out.println("=============================");
        System.out.println("");
        
        makeBread2();
    }
}
