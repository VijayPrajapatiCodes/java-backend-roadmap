package Java_8.Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class OtpGenerator {
    public static void main(String[] args) {
        Supplier<Integer> generateOtp=()->new Random().nextInt(900000)+100000;

        System.out.println("OTP"+ " " +generateOtp.get());
        System.out.println("OTP"+ " " +generateOtp.get());
        System.out.println("OTP"+ " " +generateOtp.get());

    }
}
