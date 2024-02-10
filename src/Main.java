import java.util.ArrayList;
import java.util.Arrays;


public class Main { // Java pass by value
    public static Integer solve(int a, int b, Integer c, ArrayList<Integer> list){
        a = 40;
        b = 50;
        c = 200;
        list.add(4);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(list);
        return c;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        Integer c = 100;
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));

        Main.solve(a, b, c, list);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(list);
    }
}
