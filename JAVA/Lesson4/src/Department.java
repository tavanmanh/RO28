public class Department {
    public int id;
    public String DepartmentName;
    public Department() {
    }
    public Department(String name) {
        this.id = 0;
        this.DepartmentName = name;
    }
    //Question 1
    public static void main(String[] args) {
        Department dep = new Department();
        Department dep1 = new Department("Dep1");
    }
}


