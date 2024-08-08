import java.util.*;

public class Main {
    public static class pair {
        int i;
        String s;
        pair(int i, String s){
            this.i = i;
            this.s = s;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
//        ArrayList<pair> list = new ArrayList<pair>();
        pair[] list = new pair[t];
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();

            list[i] = new pair(n, str);
            System.out.println(str);
        }
        Arrays.sort(list, new Comparator<pair>() {
            @Override
            public int compare(pair o1, pair o2) {
                return o1.i - o2.i;
            }
        });
        for(int i = 0; i < t; i++){
            System.out.println(list[i].i + " " + list[i].s);
        }
    }
}