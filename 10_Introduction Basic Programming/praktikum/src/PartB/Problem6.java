package PartB;

public class Problem6 {
    private static float Mean(float[] numbers){
        float sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        float[] value = {1, 2, 3, 4};
        System.out.println(Mean(value));
    }
}
