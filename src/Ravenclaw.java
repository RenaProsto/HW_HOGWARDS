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
    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
}
