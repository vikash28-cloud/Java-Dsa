public class RotateArray {
    static void LeftRotateby1(){
        int arr[] = new int[6];
        arr = new int[]{10, 20, 30, 40, 50, 60};
        // shift by 1
        int arr2[]  = new int[6];
        for(int i=0;i<6;i++){
            arr2[i] = arr[(i+1)%6];
        }
        for(int i=0;i<6;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

    }

    static void RightRotateby1(){
        int arr[] = new int[6];
        arr = new int[]{10, 20, 30, 40, 50, 60};
        // shift by 1
        int arr2[]  = new int[6];
        for(int i=0;i<6;i++){
            arr2[(i+1)%6] = arr[i];
        }
        for(int i=0;i<6;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }

    static void RightRotatebyk(){
        int arr[] = new int[6];
        int k=3;
        arr = new int[]{10, 20, 30, 40, 50, 60};
        // shift by 1
        int arr2[]  = new int[6];
        for(int i=0;i<6;i++){
            arr2[(i+k)%6] = arr[i];
        }
        for(int i=0;i<6;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }

    static void LeftRotatebyk(){
        int arr[] = new int[6];
        int k=2;
        arr = new int[]{10, 20, 30, 40, 50, 60};
        // shift by k
        int arr2[]  = new int[6];
        for(int i=0;i<6;i++){
            arr2[i] = arr[(i+k)%6];
        }
        for(int i=0;i<6;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args){
        System.out.println("left rotate by 1");
        LeftRotateby1();
        System.out.println("right rotate by 1");
        RightRotateby1();
        System.out.println("right rotate by k");
        RightRotatebyk();
        System.out.println("left rotate by k");
        LeftRotatebyk();
    }
}
