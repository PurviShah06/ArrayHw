public class Sum_Of_Array {
    public static void main(String[] args)
    {
        int arr[]={5,-4,-3,0,1};//declaration, instantiation and initialization
        int sum=0;
        int ex=0;
        for (int a=0;a<arr.length;a++)// For loop for length is the property of array
        {
            ex=arr[a]+ex;
        }
        // printing outs
        System.out.println("Total Of the Array "+arr[0]+" , "+arr[1]+" ,"+arr[2]+" ,"+arr[3]+" ,"+arr[4] +" = "+ ex);
    }
}
