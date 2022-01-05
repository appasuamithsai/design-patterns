package creational.builder;

import java.util.Arrays;

public class Resume {
    private String[] skills;
    private int experience;
    private String[] education;
    private double cgpa;
    private String[] projects;
    private String[] achievements;

    public Resume(String[] skills, int experience, String[] education, double cgpa, String[] projects, String[] achievements) {
        this.skills = skills;
        this.experience = experience;
        this.education = education;
        this.cgpa = cgpa;
        this.projects = projects;
        this.achievements = achievements;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "skills=" + Arrays.toString(skills) +
                ", experience= " + experience +" Years"+
                ", education=" + Arrays.toString(education) +
                ", cgpa=" + cgpa +
                ", projects=" + Arrays.toString(projects) +
                ", achievements=" + Arrays.toString(achievements) +
                '}';
    }
}
