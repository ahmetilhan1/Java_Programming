package day30_inheritance.TypesofInheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class President extends Person {

    public President(String name, char gender, LocalDate DOB, LocalDate electedDate) {
        super(name, gender, DOB);
        setElectedDate(electedDate);
    }

    private LocalDate electedDate;

    public LocalDate getElectedDate() {
        return electedDate;
    }

    public void setElectedDate(LocalDate electedDate) {
        this.electedDate = electedDate;
    }

    public void lie(){
        System.out.println(getName()+ " does lie");
    }


}
