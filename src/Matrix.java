public class Matrix {
    public static void main(String[] args)
    {
        int [][]arr=new int[3][3];////3 row and 3 column
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};//declaration, instantiation and initialization
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a.length;j++){
                System.out.print(a[j][i]+" ");// printing out
            }
            System.out.println( );
        }
    }
}
