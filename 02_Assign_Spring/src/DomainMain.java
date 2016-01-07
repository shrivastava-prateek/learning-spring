

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.domain.Address;
import com.domain.AddressConsInj;
import com.domain.Employee;
import com.domain.EmployeeConsInj;

public class DomainMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Employee emp=(Employee)context.getBean("emp");
		Address add=(Address)context.getBean("add");

		System.out.println(emp);
		System.out.println(add);
		
		EmployeeConsInj empinj= (EmployeeConsInj)context.getBean("empinj");
		AddressConsInj addinj = (AddressConsInj)context.getBean("addinj");
		
		System.out.println(empinj);
		System.out.println(addinj);

	}

}
