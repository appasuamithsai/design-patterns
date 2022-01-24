package behavioral.chainofresponsibilty;

public class Candidate {
    private String name;
    private int id,technicalScore,managerScore,hrScore;

    public Candidate(String name, int id, int technicalScore, int managerScore, int hrScore) {
        this.name = name;
        this.id = id;
        this.technicalScore = technicalScore;
        this.managerScore = managerScore;
        this.hrScore = hrScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTechnicalScore() {
        return technicalScore;
    }

    public void setTechnicalScore(int technicalScore) {
        this.technicalScore = technicalScore;
    }

    public int getManagerScore() {
        return managerScore;
    }

    public void setManagerScore(int managerScore) {
        this.managerScore = managerScore;
    }

    public int getHrScore() {
        return hrScore;
    }

    public void setHrScore(int hrScore) {
        this.hrScore = hrScore;
    }
}
