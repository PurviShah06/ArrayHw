import java.util.Scanner;

public class Duplicate_Value_of_Array
{
    public static void main(String[] args)
    {
        int arr[] = new int[6];
        //declaration, instantiation and initialization
        arr[0]=1;
        arr[1]=20;
        arr[2]=2;
        arr[3]=20;
        arr[4]=10;
        arr[5]=2;
        System.out.println("Duplicate Values Are:-  ");
        for (int a=0;a<arr.length;a++) //For Loop for Searches duplicate Value
        {
            System.out.println(arr[a]);
            for(int b=a+1;b<arr.length;b++)//For loop for comparision
            {
                if(arr[a]==arr[b])//compare two values
                {
                    System.out.println(arr[b]);//printing out
                }
            }
        }
    }
}