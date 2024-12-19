package chapter14;

// == 직원 관리 시스템 == //

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// 2. 직원 목록 필터링 & 정렬
@AllArgsConstructor
@Getter
@ToString
class Employee {
    private String department;
    private String name;
    private double salary;
}

public class I_Practice {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("IT", "이승아", 5000),
                new Employee("HR", "조승범", 7000),
                new Employee("IT", "김준일", 6500),
                new Employee("Finance", "전예찬", 4000),
                new Employee("HR", "윤대휘", 6300)
        );

        // 1. 급여가 6000 이상인 직원 필터링
        List<Employee> filteredEmployees = employees.stream()
                .filter(employee -> employee.getSalary() >= 6000)
                .collect(Collectors.toList());

        System.out.println("급여가 6000 이상인 직원");
        filteredEmployees.forEach(System.out::println);
        // 2. IT 부서 직원의 이름만 추출
        List<String> itEmployeesName = employees.stream()
                .filter(employee -> employee.getDepartment().equals("IT"))
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println("IT 부서 직원의 이름");
        itEmployeesName.forEach(System.out::println);

        // 3. 특정 부서(HR) 직원 중에 이름에 '조'가 포함된 직원 필터링
        List<Employee> filteredEmployeesWithJo = employees.stream()
                .filter(employee -> employee.getDepartment().equals("HR"))
                .filter(employee -> employee.getName().contains("조"))
                .collect(Collectors.toList());

        System.out.println("특정 부서(HR) 직원 중에 이름에 '조'가 포함된 직원");
        filteredEmployeesWithJo.forEach(System.out::println);

        // 4. 부서별 직원 그룹화
        Map<String, List<Employee>> employeeByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(employeeByDept);
        // {Finance=[Employee(department=Finance, name=전예찬, salary=4000.0)], HR=[Employee(department=HR, name=조승범, salary=7000.0), Employee(department=HR, name=윤대휘, salary=6300.0)], IT=[Employee(department=IT, name=이승아, salary=5000.0), Employee(department=IT, name=김준일, salary=6500.0)]}

        // 5. 부서별 평균 급여 계산
        Map<String, Double> avegSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

//        Map<String, Double> avegSalaryByDept2 = employees.stream()
//                .collect(Collectors.groupingBy(employee -> employee.getDepartment(), Collectors.averagingDouble(employee -> employee.getSalary())));

        System.out.println(avegSalaryByDept);   // {Finance=4000.0, HR=6650.0, IT=5750.0}
    }
}
