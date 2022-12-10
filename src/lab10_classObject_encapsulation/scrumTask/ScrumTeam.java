package lab10_classObject_encapsulation.scrumTask;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    private String PO,BA,SM;
    private ArrayList<Tester> testers = new ArrayList<>();
    private ArrayList<Developer> developers = new ArrayList<>();

    private int daysOfSprint;

    public String getPO() {
        return PO;
    }

    public void setPO(String PO) {
        terminate(PO,"Invalid PO name: "+PO) ;
        this.PO = PO;
    }

    public String getBA() {
        return BA;
    }

    public void setBA(String BA) {
        terminate(BA,"Invalid BA name:" + BA);
        this.BA = BA;
    }

    public String getSM() {
        return SM;
    }

    public void setSM(String SM) {
        terminate(SM,"Invalid SM name:" + SM);
        this.SM = SM;
    }

    public int getDaysOfSprint() {
        if(daysOfSprint<=0){
            System.err.println("Invalid days for Sprint "+daysOfSprint );
            System.exit(1);
        }
        return daysOfSprint;
    }

    public void setDaysOfSprint(int daysOfSprint) {
        this.daysOfSprint = daysOfSprint;
    }

    public ArrayList<Tester> getTesters() {
        return testers;
    }

    public ArrayList<Developer> getDevelopers() {
        return developers;
    }

    private static void terminate(String arg, String err){
        if(arg==null||arg.trim().isEmpty()){
            System.err.println(err);
            System.exit(1);
        }
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }
    public void addTester(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }
    public void addDeveloper(Developer developer){
        developers.add(developer);
    }
    public void addDeveloper(Developer[] developer){
        this.developers.addAll(Arrays.asList(developer));
    }
    public void removeTester(String id){
        testers.removeIf(p -> p.getEmployeeId().equals(id));
    }
    public void removeDeveloper(String id){
        developers.removeIf(p -> p.getEmployeeId().equals(id));
    }
    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        setBA(BA);
        setPO(PO);
        setSM(SM);
        setDaysOfSprint(daysOfSprint);
        }


    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", testers=" + testers.size() +
                ", developers=" + developers.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
