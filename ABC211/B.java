import java.util.*;
import java.util.regex.Pattern;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String ans = "No";
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("H",1);
        map.put("2B",2);
        map.put("3B",3);
        map.put("HR",4);

        for(int i = 0; i < 4;i++){
            String A = sc.nextLine();
            if(map.containsKey(A)){
                map.remove(A);
            }
        }
        if(map.size() == 0){
            ans = "Yes";
        }
        System.out.println(ans);
    }
}
