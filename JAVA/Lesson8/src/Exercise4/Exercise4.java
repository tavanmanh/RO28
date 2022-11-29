package Exercise4;

public class Exercise4 {

    public static <T extends Comparable>  T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z; // z is the largest
        }
        return max;
    }
    public static <T extends Number> T sum(T[] arr){
        T tong =0 Object T;
        for (int i=0;i< arr.length;i++){
            tong=tong+arr[i].doubleValue();
        }
        return tong;
    }
    public static void main(String[] args) {
        // question1
        Salary<Float> salary = new Salary<Float>(5.75f);
        System.out.println(salary);

        // question2
        MyNumber<Double> number = new MyNumber<Double>(7939.2);
        System.out.println(number);

        int max = maximum(5,10,3);
        System.out.println(max);
        float max1 = maximum(5.5f,10.2f,3.7f);
        System.out.println(max1);

        Integer[] arr={1,2,3,4,5};
        Integer tong = sum(arr);
        System.out.println(tong);
    }
}
