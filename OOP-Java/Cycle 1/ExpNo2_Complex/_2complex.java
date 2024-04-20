class complex
{
	float real,img;
	complex(float r,float i)
	{
		real=r;img=i;
	}
	complex()
	{
		real=0;img=0;
	}
	complex sum(complex a,complex b)
	{
		complex c =new complex();
		c.real=a.real+b.real;
		c.img=a.img+b.img;
		return c;
	}
	complex differ(complex a,complex b)
	{
                complex c =new complex();
                c.real=a.real-b.real;
                c.img=a.img-b.img;
                return c;
        }

	complex product(complex a,complex b)
	{
		complex c=new  complex();
		c.real=(a.real*b.real)-(a.img*b.img);
		c.img=(a.real*b.img)+(b.img*b.real);
		return c;
	}
	void displayNo(complex c1,complex c2)
	{
		System.out.println("Complex no 1 :"+c1.real+" + i "+c1.img);
		System.out.println("Complex no 2 :"+c2.real+" + i "+c2.img);

	}
	void display(complex c3)
	{
		System.out.println(c3.real+" + i "+c3.img);
	}
}
class _2complex
{
        public static void main(String args[])
        {
		complex c1=new complex(10f,5f);
		complex c2=new complex(2f,3f);
		complex c3=new complex();
		c3.displayNo(c1,c2);

		c3=c1.sum(c1,c2);
		System.out.print("\nSum = ");
		c3.display(c3);

		c3=c1.differ(c1,c2);
                System.out.print("Difference = ");
                c3.display(c3);

		c3=c1.product(c1,c2);
                System.out.print("Product = ");
                c3.display(c3);

        }
}


