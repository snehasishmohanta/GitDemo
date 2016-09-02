import java.util.Arrays;
import java.util.Comparator;

class Employee1 
{
	private String name;
	private int id;
	private double salary;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee1(int id,String name,double salary) 
	{
		this.id =id;
		this.name = name;
		this.salary = salary;
	}

	public String toString()
	{
		return ""+id+"  "+name+"  "+salary;
	}
}

class IdComparator implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		Employee1 employee1 = (Employee1) o1;
		Employee1 employee12 = (Employee1) o2;
		return employee1.getId() - employee12.getId();
	}
}
class NameComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
		Employee1 employee1 = (Employee1) o1;
		Employee1 employee12 = (Employee1) o2;
		return employee1.getName().compareTo(employee12.getName());
	}

}



public class SortingEmployeeComparator {

	public static void main(String[] args) 
	{
		Employee1 arr[] = new Employee1[4];
		arr[0] = new Employee1(11,"nehasish",20000);
		arr[1]= new Employee1(10,"Tubu",2000);
		arr[2] = new Employee1(9,"snehasish",27000);
		arr[3] = new Employee1(23,"Snehasish",25000);

		//Arrays.sort(arr, new IdComparator());

		Arrays.sort(arr, new NameComparator());
		for(Employee1 emp: arr )
		{
			System.out.println(emp);
		}
	}

}
