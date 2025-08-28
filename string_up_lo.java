public class string_up_lo {
    public static void main (String[] args){
        String s = "Shiva";
        int Upcase = 0;
        int lowcase = 0;
        for(int i = 0;i<s.length();i++){
            char st = s.charAt(i);
            if(Character.isUpperCase(st)){
                Upcase++;
            }
            else if (Character.isLowerCase(st)){
                lowcase++;
            }
        }
        System.out.println(Upcase);
        System.out.println(lowcase);

       }
}
