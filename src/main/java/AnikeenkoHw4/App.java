package AnikeenkoHw4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	 ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
    	 System.out.println("Using Annotations");
         Student student = (Student) context.getBean("student");
         student.getName();
         student.getMark();
         
         ApplicationContext context2 = new ClassPathXmlApplicationContext("SpringBeans2.xml");
         System.out.println("Using XML");
         Student student2 = (Student) context2.getBean("student2");
         student2.getName();
         student2.getMark();
         
    }
}
