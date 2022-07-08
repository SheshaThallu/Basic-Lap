package test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
// import model.Laptop;
import model.Processor;
public class Test
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		Laptop laptop = (Laptop) context.getBean("laptop");
//		laptop.use();
		Processor processor = context.getBean(Processor.class);
		processor.start();
	}
}
