package net.media.training.live.srp;

public class EmployeeToHtml {
    public static String toHtml(Employee employee) {
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + employee.getEmpID() + "'>" +
                "<span>" + employee.getName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";
        str += "<div class='right'><span>" + (employee.getLeavesStatus().totalLeaveAllowed - employee.getLeavesStatus().leaveTaken) + "</span>";
        str += "<span>" + convertSalary.convertMonthlySalaryToYearly(employee.getMonthlySalary()) + "</span>";
        if (employee.getManager() != null) str += "<span>" + employee.getManager() + "</span>";
        else str += "<span>None</span>";
        int years = 3;
        if (employee.getYearsInOrg() < 3) {
            years = employee.getThisYeard();
        }
        int totalLeaveLeftPreviously = employee.getLeavesStatus().calculateTotalLeaveLeftPreviously(years, employee.getYearsInOrg());
        str += "<span>" + totalLeaveLeftPreviously + "</span>";
        return str + "</div> </div>";
    }
}
