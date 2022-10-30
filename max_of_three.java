import java.util.*;
public class max_of_three {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            if(a>b && a>c){
                System.out.println("max is" +a );
            
            }
            else if ( b>a && b>c){
                System.out.println("max is "+ b);
            }
            else {
                System.out.println("max is"+ c);
             
            }
        }

        
    }
    
}
