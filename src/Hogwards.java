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

    public void setStudentsName(String studentsName) {
        this.studentsName = studentsName;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return  "Имя - " + studentsName + ',' +
                " Сила магии - " + powerOfMagic + ',' +
                " Расстояние трансгрессии - " + transgressionDistance + ',';
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


    public void checkingStudentsOfTheSameFaculty(Hogwards hogwards){
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
