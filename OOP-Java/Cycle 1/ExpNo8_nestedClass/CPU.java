import java.util.Scanner;
public class CPU
{
    	private double price;
    	public class Processor
	{
        	private int numberOfCores;
        	private String manufacturer;

        	public Processor(int numberOfCores, String manufacturer)
		{
            		this.numberOfCores = numberOfCores;
            		this.manufacturer = manufacturer;
        	}

        	public void printProcessorInfo() {
            		System.out.println("Processor Cores: " + numberOfCores);
            		System.out.println("Processor Manufacturer: " + manufacturer);
        	}
    	}
	//static class
    	public static class RAM
	{
        	private int memory;
        	private String manufacturer;

        	public RAM(int memory, String manufacturer) {
            		this.memory = memory;
            		this.manufacturer = manufacturer;
        	}

        	public void printRAMInfo()
		{
            		System.out.println("RAM Memory: " + memory + "GB");
            		System.out.println("RAM Manufacturer: " + manufacturer);
        	}
	}

    	public CPU(double price)
	{
        	this.price = price;
    	}

    	public void printPrice()
	{
        	System.out.println("\nCPU Price: $" + price);
    	}

    	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the price : ");
		int prc=s.nextInt();
		s.nextLine();
        	CPU myCpu = new CPU(prc);

		System.out.print("Enter manufacture of processor  : ");
		String p_man=s.nextLine();
		System.out.print("Enter number of core  : ");
                int c=s.nextInt();
		s.nextLine();
        	CPU.Processor myProcessor = myCpu.new Processor(c,p_man);

		System.out.print("Enter manufacture of RAM  : ");
                String r_man=s.nextLine();
		System.out.print("Enter size of RAM  : ");
                int rsize=s.nextInt();
	        CPU.RAM myRAM = new CPU.RAM(rsize,r_man);

        	myCpu.printPrice();
        	myProcessor.printProcessorInfo();
        	myRAM.printRAMInfo();
    	}
}
