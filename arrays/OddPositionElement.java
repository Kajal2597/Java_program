package arrays;

public class OddPositionElement {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,67,9};

        for(int i=0; i< a.length; i++)
        {
            if(i%2!=0)
                System.out.print(a[i]+" ");
        }
    }
}
