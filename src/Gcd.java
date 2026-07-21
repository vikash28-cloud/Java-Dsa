
//here GCD sum
//using gcd(a,b) = gcd(b,a%b) => end = gcd(a,0) => RETURN a
public static void main(String arg[]){
    int a=18; int b=12;
    while(b!=0){
        int temp = b;
        b= a%b;
        a = temp;

        System.out.println("a="+a + " b=" + b);
    }
    System.out.println("final ans = " +a);
}
