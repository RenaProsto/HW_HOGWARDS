import java.util.Objects;

public class Slytherin extends Hogwards {

    private int cunning;

    private int determination;
    private int ambition;
    private int resourcefulness;

    private int thirstForPower;

    @Override
    public int checkingSpecificSkills(Hogwards hogwards) {
        return
                cunning + determination + ambition + resourcefulness + thirstForPower;
    }
    @Override
    public String toString() {
        return "Слизерин: " + super.toString() +
                " Хитрость - " + cunning +
                " Решительность - " + determination +
                " Амбициозность - " + ambition +
                " Находчивость - " + resourcefulness +
                " Жажда власти - " + thirstForPower;
    }

    public Slytherin(String studentsName, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(studentsName, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Slytherin slytherin = (Slytherin) o;
        return cunning == slytherin.cunning && determination == slytherin.determination && ambition == slytherin.ambition && resourcefulness == slytherin.resourcefulness && thirstForPower == slytherin.thirstForPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cunning, determination, ambition, resourcefulness, thirstForPower);
    }

    public void checkingStudentsOfTheSameFaculty(Slytherin slytherin) {
        check(slytherin);
    }

}
