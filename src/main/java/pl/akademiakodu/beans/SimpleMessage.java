package pl.akademiakodu.beans;

import org.springframework.stereotype.Component;

@Component
public class SimpleMessage implements Message {
    @Override
    public void printEmployee(Employee employee) {
        System.out.println("Pracownik " + employee.getName());
    }
}
