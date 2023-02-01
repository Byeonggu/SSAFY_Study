import java.util.Scanner;
import java.util.StringTokenizer;

public class d2_스도쿠검정 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
         
        int N = sc.nextInt();
        sc.nextLine();
        //입력값 저장
        for(int testCase=0; testCase<N; testCase++){
            int result = 1;
            int[][] arr = new int[9][9];
             
            for(int j=0; j<9; j++) {
                StringTokenizer st = new StringTokenizer(sc.nextLine());
                for(int d=0; d<9; d++) {
                    arr[j][d]=Integer.parseInt(st.nextToken());
                }
            }
//          for(int[] i : arr) {
//              System.out.println(Arrays.toString(i));
//          }
             
            //배열을 메서드에 넣기
            for(int i=0; i<9; i++) {
                //열 검사
                int[] tArr = new int[9];
                for(int j=0; j<9; j++) {
                    tArr[j]=arr[j][i];
//                  System.out.println("j:"+j+" i : "+i+" 값 : "+arr[j][i]);
                }
                if(!check(tArr)) {
//                  System.out.println("열에서 걸림  : "+i);
//                  System.out.println(Arrays.toString(tArr));
//                  System.out.println();
                    result=0;
                    break;
                }
                int[] xArr= new int[9];
                //행 검사
                xArr= arr[i];
                if(!check(xArr)) {
//                  System.out.println("행에서 걸림  : "+i);
                    result=0;
                    break;
                }
                 
                //3X3검사
                int[] bArr= new int[9];
                int x =0;
                int y = (i%3)*3;
                if(i/3 ==0) {
                    x= 0;
                }else if(i/3 ==1) {
                    x= 3;
                }else if(i/3 ==2) {
                    x= 6;
                }
                int cnt =0;
                while(cnt<9) {
                    //System.out.println("x :" +x+" y: "+ y+ " cnt : "+ cnt);
                    bArr[cnt]=arr[x][y];
                    cnt++;
                    if(cnt==3||cnt==6) {
                        x=x+1;
                        y=y-2;
                    }else {
                        y++;
                    }
                }
                if(!check(bArr)) {
                    //System.out.println("3X3에서 걸림  : "+i);
                    //System.out.println(Arrays.toString(tArr));
                    //System.out.println();
                    result=0;
                    break;
                }
            }
            sb.append("#"+(testCase +1)+" "+ result+"\n");
             
        }
        System.out.println(sb);
         
    }
     
    //배열을 받아서 유효성 체크
    public static boolean check(int[] arr) {
        boolean result = true;
        //Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        int sum=0;
        for(int i=0; i<9; i++) {
            sum+=arr[i];
        }
        if(sum!=45) { 
            result=false;
            }
        return result;
    }
}
