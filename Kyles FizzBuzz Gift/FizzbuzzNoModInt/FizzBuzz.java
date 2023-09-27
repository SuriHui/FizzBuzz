public class FizzBuzz
{
    public static void main(String[] args)
    {
        for (int x = 0; x <= 100; x++) {
            if (mod5(x) && mod3(x)){
                System.out.println("FizzBuzz");
            }else if(mod3(x) ){
                System.out.println("Fizz");
            }else if(mod5(x) ){
                System.out.println("Buzz");
            }else{
                System.out.println(x);
            }
        }
    }

    public static boolean mod5 (int n)
    {
        while ( n > 0 ){
            n = n - 5;
        }
        if ( n == 0 ){
            return true;
        }
        return false;
    }
    public static boolean mod3 (int n)
    {
        while ( n > 0 ){
            n = n - 3;
        }
        if ( n == 0 ){
            return true;
        }
        return false;
    }
}