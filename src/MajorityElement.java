public class MajorityElement {
//    majority element using moores voting algorithm
    void main(){
        int arr[] = new int[]{7,7,5,7,5,1,5,7,5,5,5,5,5,5};
        int cnt=0;
        int n=14;
        int el=0;
        for (int i = 0; i <n ; i++) {
            if(cnt==0){
                cnt=1;
                el = arr[i];
            } else if (el==arr[i]) {
                cnt++;
            }
            else{
                cnt--;
            }
        }

        int cnt2=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==el){
                cnt2++;
            }
        }
        if(cnt2>n/2){
            System.out.println("Majority element = "+el);
        }
        else{
            System.out.println(" No Majority element ");
        }
    }
}
