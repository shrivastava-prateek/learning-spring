import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mypack.MyDemo;
import com.mypack.MyDemoUse;


public class DemoUseMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MyDemoUse demouse = (MyDemoUse)context.getBean("mydemouse");
		int criteria=1;
		MyDemo demo = demouse.getDemo(criteria);
		demouse.setDemo(demo);
		demouse.showDemoUse();
	
	}

}
