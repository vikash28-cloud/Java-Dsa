import java.util.Arrays;

public class CheckPrime {
//    check prime no from 1 to n

    static void makeNonPrime(int arr[], int x, int n){
        for(int i=2*x;i<=n;i++){
            if(i%x==0){
                arr[i]=0;
            }
        }
    }

    public static void main(String a[]){
        int n=100;
       int[] arr=  new int[n+1];
        Arrays.fill(arr, 1);

        for(int i=2;i<=n/2;i++){
            if(arr[i]==1) {
                makeNonPrime(arr, i, n);

            }
        }

        for (int i = 0; i <=100 ; i++) {
            if(arr[i]==1){
                System.out.println(i);
            }
        }

    }

}


