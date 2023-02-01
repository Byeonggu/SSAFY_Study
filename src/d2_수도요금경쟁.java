import java.util.Scanner;

public class d2_수도요금경쟁 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();
        for(int testCase=0; testCase<T; testCase++) {
            int chargeA =sc.nextInt();
            int baseB = sc.nextInt();
            int limitB = sc.nextInt();
            int chargeB = sc.nextInt();
            int useW = sc.nextInt();
             
            int sum = chargeA*useW;
            if(useW<=limitB) {
                sum=Math.min(sum, baseB);
                sb.append("#"+(testCase+1)+" "+sum+"\n");
                continue;
            }
             
            if(useW>limitB) {
                int num=baseB;
                num+=(useW-limitB)*chargeB;
                sum=Math.min(sum, num);
            }
            sb.append("#"+(testCase+1)+" "+sum+"\n");
        }
        System.out.println(sb);
    }
}
