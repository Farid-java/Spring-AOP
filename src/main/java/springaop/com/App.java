package springaop.com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         AbstractApplicationContext  context = new  AnnotationConfigApplicationContext(AppConfig.class);
         
         Student bean = context.getBean("student",Student.class );
         
         bean.study();
         
         Emp e = context.getBean("emp",Emp.class );
         e.study();
         
         bean.add(10, 20);
    }
}
