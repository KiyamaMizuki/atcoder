import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.awt.List;
import java.util.ArrayList;



public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		int ans = 1000000007;
		String t = "chokudai";
		char[] NN = N.toCharArray();
		char[] tt = t.toCharArray();
		int val = N.length();
		int[][] list = new int[val+1][9];
		for(int i = 0;i < val+1;i++){
			list[i][0] = 1;
		}
		for(int i = 1;i < 9;i++){
			list[0][i] = 0;
		}
		
		for(int i = 1;i < 9;i++){
			for(int l = 1;l < val+1;l++){
				if(NN[l-1] == tt[i-1]){
					list[l][i] = (list[l-1][i-1]+list[l-1][i])%ans;
				}else{
					list[l][i] = list[l-1][i];
				}
			}
		}
      
		System.out.println(list[val][8]);
	}
}
