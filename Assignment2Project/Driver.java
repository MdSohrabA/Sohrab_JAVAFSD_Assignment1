package Assignment2Project;

// Driver class
public class Driver {
    public static void main(String[] args) {
        AdminDepartment adminDept = new AdminDepartment();
        HrDepartment hrDept = new HrDepartment();
        TechDepartment techDept = new TechDepartment();

        // Displaying AdminDepartment functionalities
        System.out.println(adminDept.departmentName());
        System.out.println(adminDept.getTodaysWork());
        System.out.println(adminDept.getWorkDeadline());
        System.out.println(adminDept.isTodayAHoliday());

        System.out.println();

        // Displaying HrDepartment functionalities
        System.out.println(hrDept.departmentName());
        System.out.println(hrDept.getTodaysWork());
        System.out.println(hrDept.getWorkDeadline());
        System.out.println(hrDept.doActivity());
        System.out.println(hrDept.isTodayAHoliday());

        System.out.println();

        // Displaying TechDepartment functionalities
        System.out.println(techDept.departmentName());
        System.out.println(techDept.getTodaysWork());
        System.out.println(techDept.getWorkDeadline());
        System.out.println(techDept.getTechStackInformation());
        System.out.println(techDept.isTodayAHoliday());
    }
}
