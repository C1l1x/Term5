public class ASCII 
{
    public static void main(String[] args)
    {
        for(int i = 32; i <= 127; i++)
        {
            System.out.println("kod " + i + " ----> '" + (char)i + "'");
        }
    }
}