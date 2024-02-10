package DSA.C_Sorting;

import java.util.*;

public class factorSort {
    public static int factor(int a){
        int NoOfFactor = 0;
        for(int i = 1; i * i <= a; i++){
            if(a % i == 0){
                NoOfFactor += 2;
            }
            if(i * i == a){
                NoOfFactor -= 1;
            }
        }
        System.out.println(a + " factors =  " + NoOfFactor);
        return  NoOfFactor;
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(6);
        arr.add(8);
        arr.add(9);

/*        arr.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                int a = factor(x);
                int b = factor(y);
                if(a == b) return 0;
                else if(a < b) return -1;
                else return 1;
                return Integer.compare(a, b);
            }
        });*/

       // Statement lambda expression;
        arr.sort ((a, b) ->{
                return Integer.compare(factor(a), factor(b));
        });

        System.out.println(arr);
    }
}
