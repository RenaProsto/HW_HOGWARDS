import java.util.Objects;

public class Hufflepuff extends Hogwards {

    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String studentsName, int powerOfMagic, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(studentsName, powerOfMagic, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    @Override
    public int checkingSpecificSkills(Hogwards hogwards) {
        return diligence+loyalty+honesty;
    }

    @Override
    public String toString() {
        return " Пуффендуй: " + super.toString() +
                " Трудолюбие - " + diligence +
                " Верность - " + loyalty +
                " Честность - " + honesty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hufflepuff that = (Hufflepuff) o;
        return diligence == that.diligence && loyalty == that.loyalty && honesty == that.honesty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diligence, loyalty, honesty);
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }


    public int getHonesty() {
        return honesty;
    }

    public void checkingStudentsOfTheSameFaculty(Hufflepuff hufflepuff) {
        check(hufflepuff);
    }
}
