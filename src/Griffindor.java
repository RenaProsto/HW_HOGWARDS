import java.util.Objects;

public class Griffindor extends Hogwards {

    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String studentsName, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(studentsName, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return  "Гриффиндор: " + super.toString() +
                " Благородство - " + nobility + ',' +
                " Честь - " + honor + ',' +
                " Храбрость - " + bravery + '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Griffindor that = (Griffindor) o;
        return nobility == that.nobility && honor == that.honor && bravery == that.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nobility, honor, bravery);
    }

    @Override
    public int checkingSpecificSkills(Hogwards hogwards) {
        return this.nobility + this.honor + this.bravery;
    }

    @Override
    public int checkingGeneralSkills() {
        return super.checkingGeneralSkills();
    }
}
