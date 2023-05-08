package SpringFirst.SpringFirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Employee {
	@Autowired
	private Address add;

	

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	

	
	@Override
	public String toString() {
		return "Employee [add=" + add + "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Address add) {
		super();
		this.add = add;
		System.out.println("Inside Construtor");
		
	}
	
	

	

}
