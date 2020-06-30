public class Equal_Array
{
    public static void main(String[] args)
    {
        //declaration, instantiation and initialization
        int arrA[] = {1,2,3,4,10};
        int arrB[] = {10,20,30,40,50};
        if(arrA.length==arrB.length)//check equal length of two Arrays
        {
            System.out.println("Equal Arrays size" );// printing out
            for(int i=0;i<arrA.length;i++)
            {
                for(int j=0;j<arrA.length;j++)
                {
                    if (arrA[i]==arrB[j])
                    {
                        System.out.println(arrB[j] +"   is a equal in Both Array");
                    }
                }
            }
        } else
            {
            System.out.println("Not Equal Array size");
            }
    }
}
