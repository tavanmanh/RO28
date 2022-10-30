import java.util.Locale;

public class Exercise5 {
    public static String LayTuCuoi(String str){
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        String[] words = str.split(" ");
        return words[words.length-1].toUpperCase(Locale.ROOT);
    }
    public static void main(String[] args) {
        //Question 1
        Department[] departments = new Department[5];
        Department department1 = new Department();
        department1.id = 1;
        department1.DepartmentName = "Accounting";
        Department department2 = new Department();
        department2.id = 2;
        department2.DepartmentName = "Boss of director";
        Department department3 = new Department();
        department3.id = 3;
        department3.DepartmentName = "Sale";
        Department department4 = new Department();
        department4.id = 4;
        department4.DepartmentName = "Marketing";
        Department department5 = new Department();
        department5.id = 5;
        department5.DepartmentName = "Waiting room";
        departments[0] = department1;
        departments[1] = department2;
        departments[2] = department3;
        departments[3] = department4;
        departments[4] = department5;
        System.out.println(departments[0].toString());

        //Question 2
        for (Department department : departments) {
            System.out.println(department);
        }
        //Question 4
        String x=departments[0].DepartmentName;
        System.out.println(x.equals("Phòng A"));

        //Question 5
        System.out.println(departments[0].DepartmentName.equals(departments[1].DepartmentName));

        //Question 6
        for (int i = 0; i < departments.length; i++) {
            for (int j = 0; j < departments.length - 1; j++) {
                if (departments[i].DepartmentName.compareTo(departments[j].DepartmentName) < 0) {
                    Department temp = departments[i];
                    departments[i] = departments[j];
                    departments[j] = temp;
                }
            }
        }
        for (Department department : departments) {
            System.out.println(department);
        }

        //Question 7
        for (int i = 0; i < departments.length; i++) {
            for (int j = 0; j < departments.length - 1; j++) {
                if (LayTuCuoi(departments[i].DepartmentName).compareTo(LayTuCuoi((departments[j].DepartmentName))) < 0) {
                    Department temp = departments[i];
                    departments[i] = departments[j];
                    departments[j] = temp;
                }
            }
        }
        for (Department department : departments) {
            System.out.println(department);
        }

    }
}
