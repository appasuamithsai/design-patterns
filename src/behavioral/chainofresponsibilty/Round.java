package behavioral.chainofresponsibilty;

public abstract class Round {
    abstract public boolean hire(Candidate candidate);
    public Round next;
    public void setNextRound(Round next) {
        this.next = next;
    }
}
