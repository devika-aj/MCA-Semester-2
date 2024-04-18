class circle
{
    	float radius;
    	circle()
    	{
            	radius=2.0f;
    	}
    	circle(float r)
    	{
            	radius=r;
    	}
    	void circum()
    	{
            	System.out.println("Circumference of circle with raidus "+radius+" is "+(3.14*2*radius));
    	}
}
class _1circle
{
    	public static void main(String args[])
    	{
            	circle c1=new circle();
            	circle c2=new circle(3.0f);
            	c1.circum();
            	c2.circum();
    	}
}
