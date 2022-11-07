import java.util.ArrayList;
import java.util.Scanner;

public class MoreBooleanFun {

    public static int hops = 0;
    public static int[] board;
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt() - 1,m = sc.nextInt();
        board = new int[n];
        for(int i = 0;i < n;i++) {
            board[i] = sc.nextInt();
        }
        sc.close();

        ArrayList<Integer> map = new ArrayList<>();

        //Base state




        while(!map.contains(s)) {
            if( board[s] == m) {
                ending("magic");
            }
            hops++;
            map.add(s);

             {
                s += board[s];
            }
            if(s >= n) {
                ending("right");
            }
            if(s <= 0) {
                ending("left");

            }



        }

        ending("cycle");



    }

    public static void ending(String endingType) {
        switch (endingType) {
            case "magic" : System.out.println("magic");break;
            case "left" : System.out.println("left");break;
            case "right" : System.out.println("right");break;
            default : System.out.println("cycle");break;
        }

        System.out.println(hops);
        System.exit(0);
    }

}