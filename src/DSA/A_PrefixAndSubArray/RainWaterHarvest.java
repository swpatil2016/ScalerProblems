package DSA.A_PrefixAndSubArray;

import java.util.Scanner;

public class RainWaterHarvest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of arr");
        int A = sc.nextInt();
        int[] height = new int[A];
        for(int i = 0; i < A; i++){
            height[i] = sc.nextInt();
        }
        // Prefix Max of arr
        int[] PrefixMax = new int[A];
        PrefixMax[0] = height[0];
        for (int i = 1; i < A; i++){
            PrefixMax[i] = Math.max(PrefixMax[i-1], height[i]);
        }
        //Suffix Max of arr
        int[] SuffixMax = new int[A];
        SuffixMax[A-1] = height[A - 1];
        for(int i = A-2; i >= 0; i--){
            SuffixMax[i] = Math.max(SuffixMax[i], height[i+1]);
        }
        int waterTrap = 0;
        // Leave First And Last Building;
        for (int i = 1; i < A-1; i++){
            int getListHeightBuilding = Math.min(PrefixMax[i], SuffixMax[i]);
            int AmountOfWaterOverBuilding = getListHeightBuilding - height[i];
            if(AmountOfWaterOverBuilding > 0){
                waterTrap += AmountOfWaterOverBuilding;
            }
        }
        System.out.println(waterTrap);
    }
}
