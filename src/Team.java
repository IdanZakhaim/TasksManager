import java.util.Objects;

public class Team extends Member {

private String teamLeader;
    public Team(String fullName, String teamName, String jobDescription, int companyExperienceYears, int seniorityExperienceYears, String teamLeader) {
        super(fullName, teamName, jobDescription, companyExperienceYears, seniorityExperienceYears);
        this.teamLeader = teamLeader;
    }

    public String getTeamLeader() {
        return teamLeader;
    }
    @Override
    public boolean isSenior() {
        boolean veteran = false;
        if (this.companyExperienceYears >= 3 || this.seniorityExperienceYears >= 5) {
            veteran = true;
        }
        return veteran;
    }

    protected static String workerName (Team teamMember){
        return teamMember.getFullName();
    }




}
