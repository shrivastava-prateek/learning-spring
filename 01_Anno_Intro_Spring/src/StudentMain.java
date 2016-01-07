
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.pojo.Student;



public class StudentMain {

	public static void main(String[] args) {

	//ApplicationContext ac = new FileSystemXmlApplicationContext("");
	ApplicationContext ac=new FileSystemXmlApplicationContext("C:\\Users\\Administrator\\Desktop\\Spring\\01_Anno_Intro_Spring\\src\\beans.xml");
	Student student = (Student)ac.getBean("s");
	System.out.println(student);
		
		
	}

}
