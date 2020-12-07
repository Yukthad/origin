package day4assignment;
import java.util.LinkedList;
import java.util.List;

public class EmpImp  implements EmpInterface{
	List<Employee> p1 = new LinkedList<Employee>();
	@Override
	public void  addEmployee(Employee e) {
		 return;
       }
	@Override
	public void deleteEmployee(Employee e) {
		p1.remove(e);
		}

	@Override
	public void display(Employee emp) {
		System.out.println("Employee Id : "+emp.getEid() + "\nName : " + emp.getEname() + "\nSalary : "+emp.getSalary());
		return;
	}
	@Override
	public double yearlysalary(double salary) {
		return salary*12;
	}
	@Override
	public double appSalary(Employee e) {
		return 0;
	}
}
