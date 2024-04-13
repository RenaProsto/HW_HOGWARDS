import java.util.Objects;

public abstract class Hogwards {
    private String studentsName;
    private int powerOfMagic;
    private int transgressionDistance;

    public Hogwards(String studentsName, int powerOfMagic, int transgressionDistance) {
        this.studentsName = studentsName;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }
    public String getStudentsName() {
        return studentsName;
    }
    public int getPowerOfMagic() {
        return powerOfMagic;
    }
    public int getTransgressionDistance() {
        return transgressionDistance;
    }
    @Override
    public String toString() {
        return  "Имя - " + studentsName + ',' +
                " Сила магии - " + powerOfMagic + ',' +
                " Расстояние трансгрессии - " + transgressionDistance + ',';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwards hogwards = (Hogwards) o;
        return powerOfMagic == hogwards.powerOfMagic && transgressionDistance == hogwards.transgressionDistance && Objects.equals(studentsName, hogwards.studentsName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentsName, powerOfMagic, transgressionDistance);
    }

    public abstract int checkingSpecificSkills(Hogwards hogwards);

    public int checkingGeneralSkills() {
        return powerOfMagic + transgressionDistance;
    }
    public void print() {
        System.out.println(this);
    }
    public void checkingStudentsOfAllFaculties(Hogwards hogwards) {
        int powerFirstStudent = checkingGeneralSkills();
        int powerSecondStudent = hogwards.checkingGeneralSkills();
        if (powerFirstStudent > powerSecondStudent) {
            System.out.println("Сила студента " + this.studentsName + " больше чем сила студента " + hogwards.studentsName);
        } else if (powerFirstStudent < powerSecondStudent) {
            System.out.println("Сила студента " + hogwards.studentsName + " больше чем сила студента " + this.studentsName);
        } else {
            System.out.println("Студенты равны по силе");
        }
    }
    protected void check(Hogwards hogwards){
        int powerFirstStudent = checkingSpecificSkills(hogwards);
        int powerSecondStudent = hogwards.checkingSpecificSkills(hogwards);
        if (powerFirstStudent > powerSecondStudent){
            System.out.println(this.studentsName + " лучше студент своего факультета чем " + hogwards.studentsName);
        }else if (powerFirstStudent < powerSecondStudent){
            System.out.println(hogwards.studentsName + " лучше студент своего факультета чем " + this.studentsName );
        }
        else {
            System.out.println("Студенты равны в знанях");
        }
    }
}