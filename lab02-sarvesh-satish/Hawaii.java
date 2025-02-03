public class Hawaii extends State{
    public Hawaii(){
        super("Hawaii"); //construct an Hawaii class
    }
    public void showTax(double value){
        setTaxBehavior(new FourOneHalfPercent()); //set tax behavior dynamically
        double tax = getTaxBehavior().compute(value); //get tax
        System.out.printf("The sales tax on $%.2f in Hawaii is $%.2f.%n", value, tax);// print
    }
}