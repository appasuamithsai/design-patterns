package creational.builder;

/* Builder Design pattern */
// help us to build a complex object in a simplified way


import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String[] skills={"C","CPP","JAVA","PYTHON"};
        int experience=2;
        String[] education={"X-CBSE","Intermediate-TSBIE","B.E-OU"};
        double cgpa=8.5;
        String[] projects={"Chat Bot","Android App","Web Design"};
        String[] achievements={"Coodinator-StreetCause-MVSR","President-CSI-MVSR"};

//        Resume resume=new Resume(skills,2,education,8.5, projects,achievements);
//        System.out.println(resume);

        Resume resume=new ResumeBuilder().setAchievements(achievements).setCgpa(8.5).setSkills(skills).setExperience(2).build();
        System.out.println(resume);

    }
}
