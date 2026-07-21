public class Sort01 {
    void main(String[] args){
        int arr[] = new int[]{0,1,0,1,0,0,1,0,0,1};
        int n=10;
        int start=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==1){
                start=i;
                break;
            }
        }
        int j=start+1;
        int i=  start;
        while(j<n){
            if(arr[j]==0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] =temp;
                i++;

            }
            j++;
        }
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k]+" ");
        }
    }
}
