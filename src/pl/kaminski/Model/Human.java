package pl.kaminski.Model;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Human {
    public Animal pet;
    public Car car;
    private LocalDateTime lastChecked;
    private Double previousSalaryValue;
    private Double salary;

    public Double getSalary() {
        if(lastChecked != null){
            long diff = ChronoUnit.SECONDS.between(lastChecked, LocalDateTime.now());
            System.out.printf("Your salary was checked %d s ago, last value was %f", diff, previousSalaryValue);
        }
        lastChecked = LocalDateTime.now();
        previousSalaryValue = salary;
        return salary;
    }

    public void setSalary(Double salary) {
        if(salary >= 0){
            System.out.println("New data sent to accounting system.");
            System.out.println("Get new documents from Hania from HR");
            System.out.println("ZUS and US know about your new salary, no need to hide");
            this.salary = salary;
        }
    }
}
