import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Demo;
import com.pojo.Message;
import com.pojo.MyEmp;
import com.pojo.Student;



public class StudentMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student=(Student)context.getBean("s");
		System.out.println(student);
		
		Message message = (Message)context.getBean("msg");
		System.out.println(message);
		
		Demo demo=(Demo)context.getBean("demo");
		System.out.println(demo);
		
		Student student_new=(Student)context.getBean("s");
		System.out.println(student_new);
		System.out.println(student==student_new);
		
		MyEmp myemp = (MyEmp)context.getBean("myemp");
		System.out.println(myemp);
	
	}

}
