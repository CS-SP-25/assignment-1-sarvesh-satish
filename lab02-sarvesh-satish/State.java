public class State {
    private String name;
    private SalesTaxBehavior taxBehavior; // i use this to determine how much tax to use
    public State(String name) { //constructor
        this.name = name;
    }
    public String getName(){ //simple get
        return name;
    }
    public void setName(String name){// simple name set
        this.name = name;
    }
    public void setTaxBehavior(SalesTaxBehavior taxBehavior){// simple set tax behavior
        this.taxBehavior = taxBehavior;
    }
    public SalesTaxBehavior getTaxBehavior(){ // simple get tax behavior
        return taxBehavior;
    }
    public void showTax(double value){} // abstract method
}