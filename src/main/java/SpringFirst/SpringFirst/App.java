package SpringFirst.SpringFirst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringFirst/SpringFirst/ContextApp.xml");
	Employee ee=context.getBean(Employee.class);
		System.out.println(ee);
                                   
                  			
	}

} 
