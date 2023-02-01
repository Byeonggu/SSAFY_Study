import java.util.Scanner;

public class d2_날짜계산기 {
	 public static int[] days= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        StringBuilder sb = new StringBuilder();
	        int T = sc.nextInt();
	        for(int testCase=0; testCase<T; testCase++) {
	            int sum=1;
	            int startM = sc.nextInt();
	            int startD = sc.nextInt();
	            int endM = sc.nextInt();
	            int endD = sc.nextInt();
	            if(startM==endM) {
	                sb.append("#"+(testCase+1) +" "+((endD-startD)+1)+"\n");
	            }else if(startM<endM){
	                 
	                for(int i=startM-1; i<endM-1; i++) {
	                     
	                    sum+=days[i];
	                }
	                sum=sum+endD-startD;
	                sb.append("#"+(testCase+1) +" "+(sum)+"\n");
	            }
	            //else if(startM>endM) {
	                //System.out.println("해야뎀");
	                 
	            //}
	        }
	        System.out.println(sb);
	    }
}
