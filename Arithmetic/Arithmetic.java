package Arithmetic;

public class Arithmetic <T extends Number,Y extends Number>{
    private final T num1;
    private final Y num2;
    public Arithmetic(T num1, Y num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public Double add(){return num1.doubleValue()+num2.doubleValue();}
    public Double subtract(){
        return num1.doubleValue()-num2.doubleValue();
    }
    public Double multiply(){
        return num1.doubleValue()*num2.doubleValue();
    }
    public Double divide(){
        if(num2.equals(0)){throw new ArithmeticException();}
        return num1.doubleValue()/num2.doubleValue();
    }
    public Double getMin(){
        if(num1.doubleValue() < num2.doubleValue()){
            return num1.doubleValue();
        }
        return num2.doubleValue();
    }
    public Double getMax(){
        if(num1.doubleValue() > num2.doubleValue()){
            return num1.doubleValue();
        }
        return num2.doubleValue();
    }
}
