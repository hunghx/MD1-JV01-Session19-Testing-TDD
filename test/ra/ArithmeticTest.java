package ra;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ArithmeticTest {
    @Test
    void testIsEven2(){
        // mã kiểm thử
        // input : 2 - output: true
        int number=2;
        boolean excepted = true;
        assertEquals(excepted,Arithmetic.isEven(number));
    } @Test
    void testIsEven0(){
        // mã kiểm thử
        // input : 0 - output: false
        int number=0;
        boolean excepted = false;
        assertEquals(excepted,Arithmetic.isEven(number));
    } @Test
    void testIsEven1(){
        // mã kiểm thử
        // input : 1 - output: false
        int number=1;
        boolean excepted = false;
        assertEquals(excepted,Arithmetic.isEven(number));
    }
    @Test
    void testIsPrime_1(){
        // mã kiểm thử
        // input : 1 - output: false
        int number=-1;
        boolean excepted = false;
        assertEquals(excepted,Arithmetic.isPrime(number));
    } @Test
    void testIsPrime1(){
        // mã kiểm thử
        // input : 1 - output: false
        int number=1;
        boolean excepted = false;
        assertEquals(excepted,Arithmetic.isPrime(number));
    } @Test
    void testIsPrime2(){
        // mã kiểm thử
        // input : 1 - output: false
        int number=2;
        boolean excepted = true;
        assertEquals(excepted,Arithmetic.isPrime(number));
    } @Test
    void testIsPrime9(){
        // mã kiểm thử
        // input : 1 - output: false
        int number=9;
        boolean excepted = false;
        assertEquals(excepted,Arithmetic.isPrime(number));
    }
}