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
    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
