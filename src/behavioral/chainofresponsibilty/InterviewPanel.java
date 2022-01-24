package behavioral.chainofresponsibilty;

public class InterviewPanel {
    private Round firstRound;
    public InterviewPanel(){
        TechnicalRound  technicalRound=new TechnicalRound();
        ManagerRound managerRound=new ManagerRound();
        HrRound hrRound=new HrRound();
        firstRound=technicalRound;
        technicalRound.setNextRound(managerRound);
        managerRound.setNextRound(hrRound);
    }
    public boolean hire(Candidate candidate){
        return firstRound.hire(candidate);
    }

}
