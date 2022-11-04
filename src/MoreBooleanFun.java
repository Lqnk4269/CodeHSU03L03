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

        ArrayList<Integer> map = new ArrayList<>();

        //Base state
        if(board[s] == m) {
            ending("magic");
        }

        while(!map.contains(s)) {
            hops++;
            map.add(s);
            s += board[s];
            if(s >= n) {
                ending("right");
            }


        }



    }

    public static void ending(String in) {
        if(in.equals("magic")) {
            System.out.println("magic");

        } else if(in.equals("left")) {
            System.out.println("left");
        } else if(in.equals("right")) {
            System.out.println("right");
        } else {
            System.out.println("cycle");
        }

        System.out.println(hops);
        System.exit(0);
    }

}