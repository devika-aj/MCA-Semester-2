import java.util.Scanner;

class matrix
{
	Scanner s=new Scanner(System.in);
	int row,col,ar[][];
	matrix()
	{
		int i,j;
		System.out.print("\nEnter no.of rows :");
		row=s.nextInt();
		System.out.print("Enter no.of columns :");
                col=s.nextInt();

		ar=new int [row][col];

                System.out.println("Enter the elements :");
                for(i=0;i<row;i++)
                {
                        for(j=0;j<col;j++)
                        {
                                ar[i][j]=s.nextInt();
                        }
                }
	}
        matrix(int r,int c)
        {
		row=r;
		col=c;
		ar=new int [row][col];
        }
	void display()
	{
		int i,j;
                for(i=0;i<row;i++)
                {
                        for(j=0;j<col;j++)
                        {
				System.out.print(ar[i][j]+"\t");
                        }
			System.out.println();
                }
	}
	void sum(matrix m)
	{
		int i,j;
		if(row==m.row && col==m.col)
		{
			matrix sum=new matrix(row,col);
			for(i=0;i<row;i++)
	                {
        	                for(j=0;j<col;j++)
                	        {
					sum.ar[i][j]=ar[i][j]+m.ar[i][j];
                        	}
                	}
			System.out.println("\nSum of the two matrix =");
			sum.display();
		}
		else
		{
			System.out.println("Can't add two matrix..(Different size)");
		}
	}
	void product(matrix m1,matrix m2)
	{
		int i,j,k;
                if(m1.col==m2.row)
                {
                        matrix m3=new matrix(m1.row,m2.col);
			for (i=0;i<m1.row;i++)
			{
				for (j=0;j<m2.col;j++){
					for (k=0;k<m2.row;k++){
						m3.ar[i][j] += m1.ar[i][k] * m2.ar[k][j];
					}
				}
			}
		System.out.println("\nProduct of the two matrix =");
		m3.display();
		}
		else
                {
                        System.out.println("Can't multiply...)");
                }

	}
}
class _4matrix
{
        public static void main(String args[])
        {
		matrix m1=new matrix();
		matrix m2=new matrix();
		m1.sum(m2);
		m1.product(m1,m2);
	}
}


// System.out.println();
