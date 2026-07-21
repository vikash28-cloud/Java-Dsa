public class PerfectNumber {
    //perfect number = divisors sum of number  == that number
    // 6 = 1+2+3 = 6  is a perfect number
    // steps:
    // find all divisors of the number
    // add all divisors
    // check the sum is eqaul to that number or not
    // if yes then perfect if no then not perfect

    boolean checkPerfect(int x){
        int sum=0;
        for(int i=1;i<=x/2;i++){
            if(x%i==0){
                sum+=i;
            }
        }
        if(sum==x){
            return true;
        }
        else{
            return false;
        }
    }

    public void main(){
        System.out.println(checkPerfect(96));
    }

}
