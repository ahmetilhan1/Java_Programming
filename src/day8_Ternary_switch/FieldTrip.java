package day8_Ternary_switch;

public class FieldTrip {

    public static void main(String[] args) {

        int grade = 6;

        String location = "Unknown";
        int numberofGroups = 0;
        String teacher = "Unknown";

        String result = "Location= " + location + "\n" + "NumberofGroups= " + numberofGroups + "\n" + "Teacher= " + teacher;


        if (grade >= 1 && grade <= 6) {

            if (grade == 1) {
                location = "Apple Orchard";
                numberofGroups = 3;
                teacher = "Ms. Smith";
            } else if (grade == 2) {
                location = "Zoo";
                numberofGroups = 7;
                teacher = "Mr. Lee";
            } else if (grade == 3) {
                location = "Aquarium";
                numberofGroups = 5;
                teacher = "Ms, Wilson";
            } else if (grade == 4) {
                location = "Movie Theater";
                numberofGroups = 2;
                teacher = "Ms. Grace";
            } else if (grade == 5) {
                location = "Museum";
                numberofGroups = 5;
                teacher = "Ms. Lela";
            } else {
                location = "Six Flags";
                numberofGroups = 8;
                teacher = "Mr. Watt";
            }
            result = "Location= " + location + "\n" + "NumberofGroups= " + numberofGroups + "\n" + "Teacher= " + teacher;


        }
        System.out.println(result);
    }
}