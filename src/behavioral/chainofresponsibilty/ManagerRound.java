package behavioral.chainofresponsibilty;

public class ManagerRound extends Round{

    @Override
    public boolean hire(Candidate candidate) {
        if(candidate.getManagerScore()>60 && next!=null){
            return next.hire(candidate);
        }
        return false;
    }
}
