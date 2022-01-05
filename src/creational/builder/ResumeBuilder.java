package creational.builder;

public class ResumeBuilder {
    private String[] skills;
    private int experience;
    private String[] education;
    private double cgpa;
    private String[] projects;
    private String[] achievements;

    public ResumeBuilder setSkills(String[] skills) {
        this.skills = skills;
        return this;
    }

    public ResumeBuilder setExperience(int experience) {
        this.experience = experience;
        return this;
    }

    public ResumeBuilder setEducation(String[] education) {
        this.education = education;
        return this;
    }

    public ResumeBuilder setCgpa(double cgpa) {
        this.cgpa = cgpa;
        return this;
    }

    public ResumeBuilder setProjects(String[] projects) {
        this.projects = projects;
        return this;
    }

    public ResumeBuilder setAchievements(String[] achievements) {
        this.achievements = achievements;
        return this;
    }

    public Resume build(){
        return new Resume(skills,experience,education,cgpa,projects,achievements);
    }

}
