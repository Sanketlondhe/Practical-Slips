import java.io.*;
class InvalidNumber extends Exception
{}
class Fact
{
    public static void main(String []ar)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number--> ");
        int num=Integer.parseInt(br.readLine());
        int fact=1;

        try
        {
            if(num==0)
                throw new InvalidNumber();
            else
                for(int i=1;i<=num;i++)
                {
                    fact=fact*i;
                }
                System.out.println("Factorial of "+num+" is "+fact);
        }
        catch(InvalidNumber n)
        {
            System.out.println("Invalid number!!!!!!");
        }
    }
}