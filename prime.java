import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ld;
        boolean found = false;
        for(int i=1;i<=n;i++){
            int count = 0;
            ld = n%10;
            for(int j=1;j<=n;j++){
                if(ld%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(ld + " is a prime number");
                found = true;
            }
            n = n/10;
        }
        if(found==false){
            System.out.println("No prime number found in given number" );
        }
    }
}
