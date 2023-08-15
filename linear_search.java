import java.util.Scanner;

class linear_search {
    public static void main(String[] args) {
        int i;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the length of array ");
            int n=sc.nextInt();
            int[] arr = new int[n];

            System.out.print("Enter the element of array ");
            for (i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.print("Enter the value you want to find ");
            int key=sc.nextInt();
 
            for( i =0;i<n;i++){
                if(key==arr[i]){
                    System.out.println("Element found at index "  +(i+1));
                    break;
                }
                
            }
        }
        if(i==5){
          System.out.println("Element not found");
        }  
}
}
