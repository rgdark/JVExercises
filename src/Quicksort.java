public class Quicksort {

    public static void main(String args[]) {

        int a[] = new int[5];
        a[0] = 4;
        a[1] = 6;
        a[2] = 1;
        a[3] = 9;
        a[4] = 7;

        int n = a.length;
        int i = 0;
        int j = n - 2;
        int k = 0;
        int divider = 0;
        //int left = a[i];
        //int right = a[j];
        //pivot=a[n];
        findDivider(a, i, j, n);
      /*  k = a[i];
        a[i] = a[n - 1];
        a[n - 1] = k;
        divider = i;
        for (i = 0; i < a.length; i++)
            System.out.println("Element at index " + i + ": "+ a[i]);
    */
    }

    public static void findDivider(int a[], int i, int j, int n) {

        System.out.println("i=" + i + "j=" + j + "n=" + n);
        System.out.println("Array values are: ");
        for (i = 0; i < n; i++)
            System.out.println(a[i]);

        boolean done = false;
        while (!done) {

            while (a[i] < a[n - 1] && i != j) {
               // System.out.println("Incrementing i");
                //System.out.println(a[i]);
                //System.out.println(a[n - 1]);
                i++;
            }
            while (a[j] > a[n - 1] && i != j) {
                //System.out.println("Decrementing j");
                //System.out.println(a[j]);
                //System.out.println(a[n - 1]);
                j--;
            }

            if (i != j) {
                int k = a[i];
                a[i] = a[j];
                a[j] = k;
            } else {
                done = true;
                int temp=a[i];
                a[i]=a[n-1];
                a[n-1]=temp;
                break;
            }
        }
        System.out.println("New array: ");
        for(i=0;i<n;i++)
            System.out.println(a[i]);
    }


}






