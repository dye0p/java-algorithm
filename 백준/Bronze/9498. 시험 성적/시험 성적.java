import java.io.IOException;
import java.util.*;
class Main {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        if(100 >= score && score >= 90) {
            System.out.println('A');
        }
 
        else if(89 >= score && score >= 80) {
            System.out.println('B');
        }

        else if(79 >= score && score >= 70) {
            System.out.println('C');
        }

        else if(69 >= score && score >= 60) {
            System.out.println('D');
        }

        else {
            System.out.println('F'); 
        }
    }
}