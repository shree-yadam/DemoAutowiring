package sdy.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sdy.autowiring.pojo.Juice;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx = new ClassPathXmlApplicationContext("autowiring_beans.xml");
    	
        Juice juice =  ctx.getBean(Juice.class);
        
        System.out.println(juice);
        
        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
