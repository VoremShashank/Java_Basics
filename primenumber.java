import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int temp=0;
            for(int i=2;i<=n-1;i++){
                if(n%i==0){
                    temp=temp+1;
                    
                }
            }
            if(temp>0){
                System.out.println("not a prime number");
            }
            else{
                System.out.println("is a prime number");
            }
        }
        
    }
    
}
