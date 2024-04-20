class bank
{
        String name;
	int ac_no;
	String type;
	float bal;
	bank()
        {
		 System.out.println("**** New Customer ****");
        }
	bank(String n,int no,String t,float b)
        {
		name=n;ac_no=no;
		type=t;bal=b;
        }
	void deposit(float amt)
        {
		bal=bal+amt;
        }
	void withdraw(float amt)
        {
		bal=bal-amt;
        }
	void display()
        {
                System.out.println("Name : "+name);
		System.out.println("Account number : "+ac_no);
		System.out.println("type : "+type);
		System.out.println("balance  : "+bal);
        }
}
class _3bank
{
        public static void main(String args[])
        {
		bank obj1=new bank();
		bank obj2=new bank("Anu",122,"savings",2000.0f);
		obj2.deposit(500f);
		obj2.withdraw(1000f);
		obj2.display();
        }
}


