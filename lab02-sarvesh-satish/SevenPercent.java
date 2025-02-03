public class SevenPercent implements SalesTaxBehavior { //implements the interface
    @Override
    public double compute(Double value) { //compute the value * tax (0.07)
        return value * 0.07;
    }
}