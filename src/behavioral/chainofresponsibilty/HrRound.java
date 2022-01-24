package behavioral.chainofresponsibilty;

public class HrRound extends Round {

    @Override
    public boolean hire(Candidate candidate) {
        if(candidate.getHrScore()>70 && next==null){
            return true;
        }
        return false;
    }
}
