package behavioral.chainofresponsibilty;

public class TechnicalRound extends Round{
    @Override
    public boolean hire(Candidate candidate) {
        if(candidate.getTechnicalScore()>80 && next!=null){
            return next.hire(candidate);
        }
        return false;
    }
}
