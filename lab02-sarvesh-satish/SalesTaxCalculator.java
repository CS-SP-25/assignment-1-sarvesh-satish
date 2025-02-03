public class SalesTaxCalculator {
    public static void main(String[] args) {
      String stateName = args[0];
      Double sale = Double.parseDouble(args[1]);
      State state;
      if (stateName.equalsIgnoreCase("Alaska")) {
          state = new Alaska();
      } else if (stateName.equalsIgnoreCase("Indiana")) {
          state = new Indiana();
      } else if (stateName.equalsIgnoreCase("Hawaii")) {
          state = new Hawaii();
      }
      else {
          System.out.println("Error: Only 'Alaska', 'Indiana', and 'Hawaii' are supported.");
          return;
      }
      state.showTax(sale);
    }
}
