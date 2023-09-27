public class FizzBuzz
{
    public static void main(String[] args)
    {
        for (float x = 1; x <= 100; x++) {
            if (x/3 == (int)x/3 && x/5 == (int)x/5 ){
                System.out.println("FizzBuzz");
            }else if(x/3 == (int)x/3  ){
                System.out.println("Fizz");
            }else if(x/5 == (int)x/5  ){
                System.out.println("Buzz");
            }else{
                System.out.println(x);
            }
        }
    }

}