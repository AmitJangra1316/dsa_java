class bubble_sort {
    static void bubble(int[] a, int n) {
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String args[]) {
        int a[] = { 9, 5, 1, 7, 4 };
        int n = 5;

        bubble(a, n);

        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }
}