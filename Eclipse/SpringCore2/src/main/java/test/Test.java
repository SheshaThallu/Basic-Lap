package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.torryharris.config.SpringConfig;
import com.torryharris.model.Car;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		Car car =(Car) context.getBean("car");
		car.drive();
	}
}