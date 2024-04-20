import java.util.Scanner;
class arr_string
{
	String ar[];
	int n;
	Scanner s= new Scanner(System.in);
	arr_string()
	{
		System.out.print("\nEnter the size of the array :");
		n=s.nextInt();
		s.nextLine();

		ar= new String[n];

		System.out.println("\nEnter the elmts of the array :");
		for (int i=0;i<n;i++)
		{
			ar[i]=s.nextLine();
		}
	}
	void display()
	{
		System.out.println();
		for(int i=0;i<n;i++)
                {
			System.out.println(ar[i]);
                }
	}
	void search()
	{
		int flag=0;
		System.out.print("\nEnter elmt to search:");
		String temp=s.nextLine();
		for(int i=0;i<n;i++)
                {
			if(ar[i].equals(temp))
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("Element found");
		else if(flag==0)
			System.out.println("Element not found ");
	}
	void sort()
	{
		String temp=null;
		for(int i=0;i<n;i++)
                {
			for(int j=i+1;j<n;j++)
                	{
				if (ar[j].compareTo(ar[i]) < 0 )
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
	}
}
class _6arr_string
{
	public static void main(String[] args)
	{
		arr_string a=new arr_string();
		a.search();
		a.sort();
		System.out.println("\nArray after sorting :");
		a.display();
	}
}

