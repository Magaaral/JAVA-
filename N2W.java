/* N2W
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author personal
 */
public class N2W {
    private static boolean[] single_digit;
 public static void convert_to_words(char[] num)   
 {
     //Get numbers to digits 
     int len=num.length;
     if (len==0){
         System.out.println("The string is empty");
         return;
     }
     if (len>4){
         System.out.println("Length more than 4 is not supported");
         return;
     }
     String[] single_digits= new String[]{
"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", 
"nine" 
};
     String[] two_digits=new String[]{
       "", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
       "sixteen", "seventeen", "eighteen", "nineteen"
     };
     String[] ten_multiple=new String[]{
       "", "twenty","thirty","forty","fifty","sixty", "seventy",
       "eighty", "ninety"
     };
     String[] ten_power=new String[]{
       "","","hundred","thousand"  
     };
     System.out.print(String.valueOf(num) + ": ");
     if (len==1){
         System.out.println(single_digits[num[0] - '0']);
         return;
     }
     int x=0;
     while (x<num.length){
         if(len>=3){
             if(num[x] - '0' !=0){
                 System.out.print(single_digits[num[x] - '0'] + "");
                 System.out.print(ten_power[len - 3] + " ");
                 
             }
             --len;
         }
         else{
             if(num[x] - '0' ==1){
                 int sum=num[x] - '0'+num[x+1] - '0';
                 System.out.println(two_digits[sum]);
                 return;
             }
             else if (num[x]-'0'==2 && num[x+1]-'0'==0){
                 System.out.println("twenty");
                 return;
             }
             else {
                 int i=(num[x]-'0');
                 if (i>0)
                     System.out.print(ten_multiple[i]+"");
                 else
                     System.out.print("");
                 ++x;
                 if(num[x]-'0' !=0)
                     System.out.println(single_digit[num[x]-'0']);
             }
         }
         ++x;
     }
  }
public static void main(String[]args)
{
convert_to_words("20".toCharArray());
convert_to_words("86".toCharArray());
convert_to_words("365".toCharArray());
convert_to_words("1102".toCharArray());
convert_to_words("".toCharArray());
}
}
