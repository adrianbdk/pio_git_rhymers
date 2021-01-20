package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

  private static final int VAL = -1;
  private static final int SIZE = 12;

  private final int[] numbers = new int[getSIZE()];
  private int total = getVAL();

  public static int getVAL() {
    return VAL;
  }

  public static int getSIZE() {
    return SIZE;
  }

  public void countIn(int in) {
    if (!isFull()) numbers[total = getTotal() + 1] = in;
  }

  public boolean callCheck() {
    return getTotal() == getVAL();
  }

  public boolean isFull() {
    return getTotal() == 11;
  }

  protected int peekaboo() {
    if (callCheck()) return getVAL();
    return numbers[getTotal()];
  }

  public int countOut() {
    if (callCheck()) return getVAL();
    return numbers[total = getTotal() - 1];
  }

  public int getTotal() {
    return total;
  }
}
