import java.util.Scanner;

public class Specific_Value
{
    public static void main(String[] args)
    {
        //declaration, instantiation and initialization
        int arr[]={20,30,35,40,60,90,12,15,94,32,84,61,51,5156,865,51321,6658,000,50,54,04,-6,-8,9,51};
        Scanner scanner=new Scanner(System.in);//inbuilt scanner class
        System.out.println("Enter Value");//printing out
        int val1 =scanner.nextInt();//define variable
        int sp=0;
        int sp1=0;
        for(int i=0;i<arr.length;i++)//for loop
        {
            if (arr[i] == val1)// compare two values
            {
                sp=sp+i;
            }else{
                sp1=sp1+i;
            }
        }
        if (sp!=0)// if
        {
            System.out.println("Your Enter Value is Specific ");
        }else if (sp1!=0)
        {
            System.out.println("Your Enter Value is Not Specific!!!!!!!");
        }
    }
}
