package Exercise3;

public class Question1 {
    public static  <T> void printByT_Type(T var) {
        System.out.println("In bởi T_Generic: " + var);
    }
    public static <E> void printByE_Type(E[] arr) {
        System.out.println("Phần tử trong mảng là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Student<Integer> student1 = new Student<Integer>(1, "Dang ");
        Student<Float> student2 = new Student<Float>(2.0f, "Hai ");
        Student<Double> student3 = new Student<Double>(3.0, "Duy ");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);


        //Question 2
        printByT_Type(4.0f);
        printByT_Type(student1);
        printByT_Type(4);

        //Question 4
        Integer[] intArray = { 1, 5, 2, 7, 8 };
        Float[] floatArray = { 1.2f, 5.3f, 2f, 7.8f, 8.2f };
        Double[] doubleArray = { 1.2, 5.3, 2.2, 7.8, 8.2 };
        String[] arrStr={"manh","ta","van"};
        printByE_Type(intArray);
        printByE_Type(arrStr);

        //Question 5
        Employee<Integer> employee1 = new  Employee<Integer>( "Dang ",intArray);
        Employee<Float> employee2 = new  Employee<Float>( "kha ",floatArray);
        Employee<Double> employee3 = new  Employee<Double>( "ng ",doubleArray);
        System.out.println(employee1.getLastSalary());
        System.out.println(employee2.getLastSalary());
        System.out.println(employee3.getLastSalary());

        MyMap<Integer, String> StudentMyMap1 = new MyMap<Integer, String>(1, "Student");
        MyMap<Integer, String> StudentMyMap2 = new MyMap<Integer, String>(1, "Student2");
        System.out.println(StudentMyMap1);
        System.out.println(StudentMyMap2);
        System.out.println("Lấy Value trong MyMap: " + StudentMyMap1.getValue());
        System.out.println("Lấy key trong MyMap: " + StudentMyMap1.getKey());

    }
}
