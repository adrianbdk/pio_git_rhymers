package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

  int totalRejected = 0;

  public int reportRejected() {
    return totalRejected;
  }

  @Override
  public void countIn(int in) {
    if (!callCheck() && in > peekaboo()) totalRejected++;
    else super.countIn(in);
  }
}
//kombinacja klawiszy służy to nawigacji po otwartych plikach w górnej zakładce
