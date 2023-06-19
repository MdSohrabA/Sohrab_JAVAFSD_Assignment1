package Assignment2Project;

// HrDepartment class
class HrDepartment extends SuperDepartment {
    @Override
    public String departmentName() {
        return "Welcomt to HR Department";
    }

    public String doActivity() {
        return "team Lunch";
    }
    
    @Override
    public String getTodaysWork() {
        return "Fill today’s timesheet and mark your attendance";
    }

    @Override
    public String getWorkDeadline() {
        return "Complete by EOD";
    }
  
}