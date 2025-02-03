public class Indiana extends State{
    public Indiana(){
        super("Indiana"); //contruct a Indiana class with default NoTax taxBehavior
    }
    public void showTax(double value){
        setTaxBehavior(new SevenPercent());//set tax behavior dynamically
        double tax = getTaxBehavior().compute(value); // get tax
        System.out.printf("The sales tax on $%.2f in Indiana is $%.2f.%n", value, tax); // print
    }
}