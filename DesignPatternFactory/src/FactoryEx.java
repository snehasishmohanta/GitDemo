interface Shape
{
	void draw();
}

class Circle implements Shape
{
	public void draw() 
	{
		System.out.println("Circle Drawn");
	}
}
class Triangle implements Shape
{
	public void draw() 
	{
		System.out.println("Triangle Drawn");		
	}
}
class Square implements Shape
{
	public void draw()
	{
		System.out.println("Square Drawn");
	}
}

class ShapeFactory
{
	public Shape getShape(String type)
	{
		if(type==null)
		{
			return null;
		}
		else if(type.equalsIgnoreCase("Circle"))
		{
			return new Circle();
		}
		else if(type.equalsIgnoreCase("Triangle"))
		{
			return new Triangle();
		}
		else if(type.equalsIgnoreCase("Square"))
		{
			return new Square(); 
		}
		return null;
	}
}


public class FactoryEx
{
	public static void main(String[] args) 
	{
		ShapeFactory factory = new ShapeFactory();
		factory.getShape("circle").draw();
		factory.getShape("triangle").draw();
		factory.getShape("SQUARE").draw();
	}
}
