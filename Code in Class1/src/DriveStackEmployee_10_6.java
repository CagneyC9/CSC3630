

import java.util.ArrayDeque;
import java.util.Deque;

public class DriveStackEmployee_10_6 {
    public static void main(String[] args) {
        Deque<Employee> employees = getEmployees();
        showEmployees(employees);
        Employee last = employees.pop();
        System.out.printf("\n Sorry %s you're gone:%s", last.getName(), last.toString());
        showEmployees(employees);
        Double totSalary = getTotalSalary(employees);
        getTotalSalary(employees);
        System.out.printf("\n Total Sal:%s ", totSalary);
        Employee top = employees.peek();
        System.out.printf("\n Next person to fire:%s", top.toString());
//        String s = reverseThisString("lastClassOfWeek");
    }

    private static Object reverseThisString(String lastClassOfWeek) {
//        Write this using a stack
        String retstring = "";
        Deque<String> theStack = new ArrayDeque<>();
        for (int i=0; i<lastClassOfWeek.length(); i++){
//            Push each character on thestack
//            theStack.push();

        }
//        Reloop and pop each character and append to retString;
                return retstring;
    }

    private static Double getTotalSalary(Deque<Employee> employees) {
        Double Sum = 0.00;
        double Salary = 0;
        for (Employee getSalary : employees){
           Salary += getSalary.getSalary();


        }
        Sum += Salary;
        return Sum;
    }

    private static void showEmployees(Deque<Employee> employees) {
        for (Employee e : employees){
            System.out.printf("\n e:%s", e.toString());
        }
    }

    private static Deque<Employee> getEmployees() {
        Deque<Employee> employees = new ArrayDeque<>();
        employees.push(new Employee(1, "Abby", 100000.00));
        employees.push(new Employee(1, "Baker", 50000.00));
        employees.push(new Employee(1, "Cathy", 60000.00));
        employees.push(new Employee(1, "Dwight", 150000.00));
        return employees;
    }

}
