public class PrimeSum
{
//    int sumPrime(int num) {
//        int sum = 0;
//        int j;
//        for (int i = 2; i < num; i++)
//        {
//            System.out.println("Variable i: "+i);
//            for (j = 2; j < i; j++)
//            {
//                System.out.println("Variable j: "+j);
//                if (i != j)
//                {
//                    if (i % j == 0)
//                    {
//                        System.out.println("Break");
//                        break;
//                    }
//                }
//            }
//            System.out.println("Old sum: "+sum);
//            sum = sum + i;
//            System.out.println("New Sum: "+sum);
//        }
//            return sum;
//        }

    int sumPrime(int value)
    {
        int sum = 0;
        for(int i = 2; i < value; i++)
        {
            System.out.println(isPrime(i));
            if (isPrime(i) == true)
            {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }

    boolean isPrime(int num)
    {
        if (num == 2 || num == 3)
            return true;
        if (num < 2 || num % 2 == 0)
            return false;
        for (int i = 3; i < Math.sqrt(num); i++)
        {
            if ( num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void  main (String args[]){
        System.out.println( new PrimeSum().sumPrime(11));
//        System.out.println(new PrimeSum().isPrime(4));
    }
}
