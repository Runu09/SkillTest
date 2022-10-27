//배우 이름으로 영화 찾기

//코드
import java.util.*;

public class HelloWorld{
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        String[][] actor = { 
            {"[송]", "박쥐", "괴물", "관상"}, 
            {"[김]", "도둑들", "수상한 그녀", "은밀하게 위대하게"}, 
            {"[이]", "지아이조", "레드", "광해"} 
        };
        
        int cnt = 0;
        System.out.print("Name : ");
        String name = sc.next();
        
        for(int i = 0; i < actor.length; i++){
		
        	if(actor[i][0].equals("[" + name + "]")){
        			
        		for(int j = 0; j < actor[i].length; j++){
        			System.out.println(actor[i][j]);
        		}	//inner for

        	}else{
        		cnt++;

        		if(cnt >= actor.length){
        			System.out.println("No actor");
        		} //if

        	} //else
        				
        } //for
    }
}
