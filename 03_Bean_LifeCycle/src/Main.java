import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mypack.MyData;
import com.mypack.MyData1;



public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MyData mydata= (MyData)context.getBean("mydata");
		System.out.println(mydata.getData());
		//((AbstractApplicationContext)context).registerShutdownHook();	
		System.out.println("-------------------------------------------------------------------------");
		MyData1 mydata1= (MyData1)context.getBean("mydata1");
		System.out.println(mydata1.getData());
		
	}

}
