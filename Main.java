import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        int count = 1;
        BigInteger powerOfTwo = BigInteger.valueOf(1);
        BigInteger result;
        while(count <= 64)
        {
            System.out.println("Square number " + count + " has " + powerOfTwo + " grains of wheat");
            result = powerOfTwo.multiply(BigInteger.valueOf(2));
            powerOfTwo = result;
            count++;
        }
    }
}