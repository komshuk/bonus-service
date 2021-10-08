public class Main {
  public static void main(String[] args) {
    BonusServiceOne service = new BonusServiceOne();

    long amount = 1000_60;
    boolean registered = true;

    service.calculate(amount, registered);
  }
}

