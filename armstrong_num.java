public class armstrong_num {
    public static void main(String [] args){
             int num = 153;
             int temp = num;
             int count = 0;
             int sum=0;
             while(temp!=0){
                count++;
                temp/=10;
             }
             temp=num;
             while(temp!=0){
                int last_digit = temp%10;
                int pow = 1;
                for(int i =1;i<=count;i++){
                    pow = pow*last_digit;
                }
                sum+=pow;
                temp/=10;
             }
             System.out.println(sum==num ? "ArmStrong number" : "not ArmStrong Number");
    }
}
