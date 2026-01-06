import java.util.Arrays;

class RemoveDuplicates {
    public static void main(String[] args) {
        int[] a = {5, 2, 8, 2, 3, 5, 1};

        Arrays.sort(a);
        int[] temp = new int[a.length];
        int j = 0;

        for (int i = 0; i < a.length - 1; i++) 
            {
            if (a[i] != a[i + 1]) 
                {
                temp[j++] = a[i];
            }
        }
        temp[j++] = a[a.length - 1]; 

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < j; i++) 
        {
            System.out.print(temp[i] + " ");
        }
    }
}