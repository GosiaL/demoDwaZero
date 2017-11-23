package pl.akademiakodu.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class AdvancedMessage implements Message{
    @Override
    public void printEmployee(Employee employee) {
        System.out.println("Advanced message: " + employee.getName());
    }
}
