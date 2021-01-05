package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

  public static final int VAL = -1;
  public static final int SIZE = 12;

  private final int[] numbers = new int[SIZE];
  public int total = VAL;

  public void countIn(int in) {
    if (!isFull()) numbers[++total] = in;
  }

  public boolean callCheck() {
    return total == VAL;
  }

  public boolean isFull() {
    return total == 11;
  }

  protected int peekaboo() {
    if (callCheck()) return VAL;
    return numbers[total];
  }

  public int countOut() {
    if (callCheck()) return VAL;
    return numbers[total--];
  }
}
