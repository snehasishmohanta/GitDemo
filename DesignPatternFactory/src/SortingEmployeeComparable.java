import java.util.Arrays;

class Employee implements Comparable<Employee>
{
	private int id;
	private String name;
	private double salary;


	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}


	public Employee(int id,String name,double salary) 
	{
		this.id =id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee o) 
	{
		//Employee emp = (Employee) o;
		//return this.id - emp.id; //Ascending //id
		//return emp.id-this.id; // Discending //id
		return this.name.compareTo(o.name); // name

	}
	public String toString()
	{
		return ""+this.id+"  "+this.name+"  "+this.salary;

	}
}

public class SortingEmployeeComparable 
{

	public static void main(String[] args) 
	{
		Employee arr[] = new Employee[4];
		arr[0] = new Employee(11,"Snehasish",20000);
		arr[1]= new Employee(10,"Tubu",2000);
		arr[2] = new Employee(9,"snehasish",27000);
		arr[3] = new Employee(23,"Snehasish",25000);

		Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		for(Employee emp : arr )
		{
			System.out.println(emp);
		}
	}
}
