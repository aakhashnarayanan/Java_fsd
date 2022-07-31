package constructor;

public class shape_constructor {
		int a,b,c,r,h;
		double d;
		shape_constructor()
		{
			r=5;
			h=2;
		}
		shape_constructor(int a)
		{
			this.a=a;
		}
		shape_constructor(int b, int c)
		{
			this.b=b;
			this.c=c;
		}
		shape_constructor(double d)
		{
			this.d=d;
		}
		void display_Square()
		{
			System.out.println("Area of Square= " + a*a);
		}
		void display_Rectangle()
		{
			System.out.println("Area of Rectangle= " + b*c);
		}
		void display_Circle()
		{
			System.out.println("Area of Circle= " + 3.14*d*d);
		}
		public void area()
		{
			System.out.println("Area of Rhombus= " + r*r);
		}
		public void area(int b)
		{
			System.out.println("Area of Triangle= " + 0.5*b*h);
		}

	public static void main(String[] args) {
		shape_constructor sq=new shape_constructor(4);
		sq.display_Square();
		shape_constructor rect=new shape_constructor(4,4);
		rect.display_Rectangle();
		shape_constructor circle=new shape_constructor(4.4);
		circle.display_Circle();
		shape_constructor rh=new shape_constructor();
		rh.area();
		shape_constructor tri=new shape_constructor();
		tri.area(4);
}
}
