public abstract class Member {
    private String fullName;
    private String teamName;
    private String jobDescription;
    protected int companyExperienceYears;
    protected int seniorityExperienceYears;

    public Member(String fullName, String teamName, String jobDescription, int companyExperienceYears, int seniorityExperienceYears) {
        this.fullName = fullName;
        this.teamName = teamName;
        this.jobDescription = jobDescription;
        this.companyExperienceYears = companyExperienceYears;
        this.seniorityExperienceYears = seniorityExperienceYears;
    }

    public  String getFullName () {
        return fullName;
    }

    public abstract boolean isSenior ();

}
