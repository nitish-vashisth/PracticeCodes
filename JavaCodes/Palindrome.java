import java.io.BufferedReader;
import java.io.InputStreamReader;
 
class Palindrome {
    
    public static void main(String[] args) throws Exception{
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int Test = Integer.parseInt(br.readLine());
 
        StringBuilder bru = new StringBuilder();
        for(int i=0;i<Test;i++){
            
             String s = br.readLine();
            bru.append(s);
            bru.reverse();
            String sr= bru.toString();
            
            if(s.equals(sr)){
                if(s.length()%2==0)
                    System.out.println("YES EVEN");
                else
                    System.out.println("YES ODD");
            }
            else{
             System.out.println("NO");
            }
            
            bru = new StringBuilder();
        }
      
    }
}