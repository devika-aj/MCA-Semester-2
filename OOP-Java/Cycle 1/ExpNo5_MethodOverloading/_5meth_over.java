import java.util.Scanner;
class meth_over
{
	float radi;
	int len,brth;
	float base,h;
	void set_data(float r,int l,int b,float bs,float hgt)
	{
		radi=r;
		len=l;brth=b;
		base=bs;h=hgt;
	}
	void area(float r)
        {
		System.out.println("\nArea of the circle ="+(3.14*radi*radi));
        }
	void area(int len,int brth)
        {
		System.out.println("Area of the ractangle ="+(len*brth));
        }
	void area(float base,float h)
        {
                System.out.println("Area of the triangle ="+(0.5*base*h));
        }
}
class _5meth_over
{
        public static void main(String args[])
        {
		float r,base,h;
		int l,b;
		Scanner s = new Scanner(System.in);
		meth_over m = new meth_over();

		System.out.print("\nEnter the radius of the circle :");
		r=s.nextFloat();

		System.out.print("\nEnter the length of rectangle  :");
                l=s.nextInt();
		System.out.print("Enter the breadth of rectangle  :");
                b=s.nextInt();

		System.out.print("\nEnter the base of triangle :");
		base=s.nextInt();
		System.out.print("Enter the heigth of triangle :");
		h=s.nextInt();

		m.set_data(r,l,b,base,h);
		m.area(r);
		m.area(l,b);
		m.area(base,h);

        }
}





