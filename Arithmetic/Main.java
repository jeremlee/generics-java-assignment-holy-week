package Arithmetic;

public class Main {
    public static void main(String[] args) {
        Arithmetic<Long,Double> test = new Arithmetic<>(111111111111111L,0.01);
        System.out.println(test.add());
        System.out.println(test.subtract());
        System.out.println(test.multiply());
        System.out.println(test.divide());
        System.out.println(test.getMin());
        System.out.println(test.getMax());
    }
}