class lcm{
    static int findHcf(int a, int b){
        while(b!=0){
            int temp = b;
            b= a%b;
            a = temp;
        }
        return a;
    }

    static int findLcm(int a , int b){
        // first we find hcf
        // lcm = a*b/hcf
        int hcf = findHcf(a,b);
        int lcm = (a*b)/hcf;
        return lcm;
    }

    public static void main(String arg[]){
        System.out.println(findLcm(12,18));
    }

}

