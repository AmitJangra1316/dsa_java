 class binary_search {
    static int binary(int[] arr,int key){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int mid=(i+j)/2;
            if(key<arr[mid]){
             j=mid-1;
            }
            else if(key>arr[mid]){
                i=mid+1;
            }
            else if(arr[mid]==key){
                return i;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[]={-9,-4,1,6,9,11,23};
        int  key=1;
        int answer=binary(arr,key);
        System.out.println(answer);
    }
}
