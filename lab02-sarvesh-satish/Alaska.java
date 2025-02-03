public class Alaska extends State{
    public Alaska(){
        super("Alaska"); //construct an Alaska class
    }
    public void showTax(double value){
        setTaxBehavior(new NoTax());//set tax behavior dynamically
        double tax = getTaxBehavior().compute(value); //get tax
        System.out.printf("The sales tax on $%.2f in Alaska is $%.2f.%n", value, tax);// print
    }
}