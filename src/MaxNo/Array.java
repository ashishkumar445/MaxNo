package MaxNo;

public class Array {
    public static void main(String[]args)
    {
        int[]a={4,77,8,9,5};
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.println("Maximum element is "+max);
    }
}
