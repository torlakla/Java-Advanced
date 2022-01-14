package Exercise.DefiningClasses.CompanyRoster_02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String,Department> list = new HashMap<>();
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];
            Employee employee= null;
            if (input.length == 6) {
                String email = input[4];
                int age = Integer.parseInt(input[5]);
                employee = new Employee(name, salary, position, department, email, age);


            } else if (input.length == 5) {
                if (input[4].contains("@")) {
                    String email = input[4];
                    employee = new Employee(name, salary, position, department, email);

                } else {
                    int age = Integer.parseInt(input[4]);
                    employee = new Employee(name, salary, position, department, age);

                }

            } else if(input.length==4){
                employee = new Employee(name, salary, position, department);

            }
            if(!list.containsKey(department)){
                list.put(department,new Department(department));
            }
            list.get(department).getEmployees().add(employee);
        }
        Department maxAverageSalaryDep = list.entrySet()
                .stream()
                .max(Comparator.comparing(entry ->entry.getValue().getAverageSalary())).get().getValue();
        System.out.println("Highest Average Salary: "+ maxAverageSalaryDep.getName());
        maxAverageSalaryDep.getEmployees().stream()
                .sorted((e1,e2)->Double.compare(e2.getSalary(),e1.getSalary()))
                .forEach(employee -> System.out.println(employee));

    }
}
