import java.util.Scanner;

public class Palindrome {


        public static void main (String[] args){

            int sum=0;
            int num;
            int temp;
            int rem;
            int a;
            int sum1=0;


            System.out.println("enter a number");
            Scanner input = new Scanner(System.in);
            num = input.nextInt();

            temp=num;
            while(temp>0) {
                rem = temp % 10;
                sum = (sum * 10) + rem;
                temp = temp / 10;
            }
            if(sum==num)
            {
                while(temp>0)
                {
                    a=num%10;
                    if(a%2==0)
                    {
                        sum1=sum1+a;
                    }
                    temp=temp/10;

                }

                if(sum1<25){
                    System.out.println("is palindrome and sum of even no. is less than 25");
                }
                else{
                    System.out.println("is palindrome and sum of even no. is greater than 25");
                }



            }
            else
            {
                System.out.println("the number is not a palindrome");
            }
        }

    }