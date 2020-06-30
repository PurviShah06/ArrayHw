public class Ascending_Array
{
    public static void main(String[] args)
    {
        int a[]={10,20,90,85,2,67,312,0};//declaration, instantiation and initialization
        int sort=0;
        System.out.println("Ascending Array :");// printing out
        for(int i=0;i<a.length;i++)// for loop for check
        {
            for(int j=i+1;j<a.length;j++)//for loop to compare
            {
                if (a[i]>a[j])//check condition for find grater value
                {
                    sort=a[i];//store value of i in sort
                    a[i]=a[j];
                    a[j]=sort;

                }
            }
            System.out.println(a[i]);// printing out
        }
    }
}
