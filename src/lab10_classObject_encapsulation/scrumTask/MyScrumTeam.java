package lab10_classObject_encapsulation.scrumTask;

public class MyScrumTeam {

    public static void main(String[] args) {

        Tester[] testers = {
                new Tester("josh",53,'M',"A1","QA",45),
                new Tester("Emily", 25,'F',"A2","SDET",42)
        };
        Developer[] developers = {
                new Developer("Ilhan",26,'M',"A2","Front=End Developer",50,"Java"),
                new Developer("Mahmut",23,'M',"A5","Back=End Developer",49,"Ruby"),
                new Developer("Kamil",30,'M',"A1","Front=End Developer",55,"C#")
        };

        ScrumTeam scrumTeam = new ScrumTeam("Bilal","Hasan","Lucy",14);

        scrumTeam.addTester(testers);
        scrumTeam.addDeveloper(developers);

        System.out.println(scrumTeam);

        System.out.println("----------------------------------------------");
        System.out.println("Testers: " );
        for(Tester eachTester: scrumTeam.getTesters()){
            System.out.println("\t" + eachTester.getName() + " : $ "+eachTester.getSalary());
        }

        System.out.println("Developers: ");
        for (Developer eachdeveloper : scrumTeam.getDevelopers()) {
            System.out.println("\t"+eachdeveloper.getName()+" : $"+eachdeveloper.getSalary());
        }
    }
}
