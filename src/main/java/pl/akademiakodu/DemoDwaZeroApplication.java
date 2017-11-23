package pl.akademiakodu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.akademiakodu.beans.Employee;

@SpringBootApplication
public class DemoDwaZeroApplication {
	public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(DemoDwaZeroApplication.class, args);

        Employee employee = ctx.getBean(Employee.class);
        System.out.println("Działa znów");
        employee.setName("goma");
        System.out.println("Name wynosi:" + employee.getName());
        employee.getMessage().printEmployee(employee); //Message został zaincjalizowany obktm z kl. SimpleMessage
	}
}
