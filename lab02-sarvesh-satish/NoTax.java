public class NoTax implements SalesTaxBehavior { // implement the interface
    @Override
    public double compute(Double value) { // return 0 for no tax
        return 0;
    }
}