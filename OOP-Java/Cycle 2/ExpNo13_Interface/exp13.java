import java.util.Scanner;

interface Resizable
{
	void resize(int percentage);
}

class Image implements Resizable
{
    private int width;
    private int height;

    Image(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resize(int percentage)
    {
        double scaleFactor = 1 + (percentage / 100.0);
        int newWidth = (int) (width * scaleFactor);
        int newHeight = (int) (height * scaleFactor);
        System.out.println("Resized image: Width = " + newWidth + ", Height = " + newHeight);
    }
}

public class exp13
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter initial width and height of the image in pixels :");
        int initialWidth = scanner.nextInt();
        int initialHeight = scanner.nextInt();

        Image image = new Image(initialWidth, initialHeight);
        int choice;
        do
	{
            System.out.println("\nMenu :\n1.Resize image\n2.Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice)
	    {
                case 1: System.out.print("Enter percentage to resize: ");
                    	int percentage = scanner.nextInt();
                    	image.resize(percentage);
                    	break;
                case 2: System.out.println("Exiting...");
                    	break;
                default: System.out.println("Invalid choice...");
            }
        }while(choice != 2);
        scanner.close();
    }
}
