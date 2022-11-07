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


        while(!map.contains(s)) {
            if(s >= 0 && board[s] == m) {
                ending("magic");
            }
            hops++;
            map.add(s);
            s += board[s];
            if(s >= n) {
                ending("right");
            }
            if(s <= 0) {
                ending("left");

            }



        }

        ending("cycle");



    }

    public static void ending(String in) {
        switch (in) {
            case "magic" -> System.out.println("magic");
            case "left" -> System.out.println("left");
            case "right" -> System.out.println("right");
            default -> System.out.println("cycle");
        }

        System.out.println(hops);
        System.exit(0);
    }

}