package Second;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        if(N >= 2 && N<=20){
            for(int i=1;i<=10;i++){
                int result=N*i;
                System.out.println(N +"* "+i +" = "+result);
            }


        }
    }
}
