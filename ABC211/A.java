import java.util.*;
import java.util.regex.Pattern;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double ans = (A-B)/3+B;
        
        
        System.out.println(ans);
    }
}
