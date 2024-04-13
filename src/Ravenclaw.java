import java.util.Objects;

public class Ravenclaw extends Hogwards {

    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String studentsName, int powerOfMagic, int transgressionDistance, int intelligence, int wisdom, int wit, int creativity) {
        super(studentsName, powerOfMagic, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }
    @Override
    public int checkingSpecificSkills(Hogwards hogwards) {
        return intelligence+wisdom+wit+creativity;
    }


    @Override
    public String toString() {
        return " Когтевран: " + super.toString() +
                " Ум -" + intelligence +
                " Мудрость - " + wisdom +
                " Остроумие - " + wit +
                " Творчество - " + creativity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return intelligence == ravenclaw.intelligence && wisdom == ravenclaw.wisdom && wit == ravenclaw.wit && creativity == ravenclaw.creativity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(intelligence, wisdom, wit, creativity);
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void checkingStudentsOfTheSameFaculty(Ravenclaw ravenclaw) {
        check(ravenclaw);
    }
}
