package behavioral.chainofresponsibilty;

public class Main {
    public static void main(String[] args) {
        Candidate candidate1=new Candidate("Amith Sai",146,90,50,80);
        InterviewPanel interviewPanel=new InterviewPanel();
        if(interviewPanel.hire(candidate1)){
            System.out.println("Congrats " +candidate1.getName()+ " You Are Hired !!!");
        }else{
            System.out.println("Regrets "+ candidate1.getName()+" !!!!");
        }

    }
}
