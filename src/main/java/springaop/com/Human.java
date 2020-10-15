package springaop.com;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


// A method which is u want to use many times before or after every method then u have to use @Aspect over class.
@Aspect  
@EnableAspectJAutoProxy
@Component
public class Human {

	 // run this method just before public void study() as written in execution attribute.
 //  @Before("execution(public void study())") 
	//or
	@Before("poin()")
	public void wakeUp()  // this method is called advisory in AOP.
	{
		System.out.println("human can sleep");
	}
  
//run this method just after public void study() as written in execution attribute.
  //@After("execution(public void study())") 
  //or
  @After("poin()")
 	public void sleep()  // this method is called advisory AOP.
 	{
 		System.out.println("human can sleep");
 	}
  
  @Pointcut("execution(public void study())") // this is called point cut expression in AOP.
  public void poin() {} // this method is called advisory in AOP.
  
  
  @AfterReturning(pointcut ="execution(public int add(. .))",returning="value"  )
  public void plus( int value)
  {
	  System.out.println("add two number="+value );
  }
  
}
