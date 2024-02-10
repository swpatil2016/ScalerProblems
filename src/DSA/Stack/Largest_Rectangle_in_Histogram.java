package DSA.Stack;

import java.util.ArrayList;
import java.util.Stack;

public class Largest_Rectangle_in_Histogram {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 3};
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> nearestMax = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            int a = arr[i];
            while (!stack.isEmpty() && a < arr[stack.peek()]){
                stack.pop();
            }
            stack.push(i);
            nearestMax.add(stack.peek());
        }
        int maxArea = 0;
        System.out.println(nearestMax);
        for(int i = 0; i < arr.length; i++){
            int height = arr[nearestMax.get(i)];
            int width = i - nearestMax.get(i) + 1;
            int area = height * width;
            maxArea = Math.max(maxArea, area);
        }
        System.out.println(maxArea);
    }
}
