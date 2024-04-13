public class Main {

    public static void main(String[] args) {

        Griffindor harryPotter = new Griffindor("Гарри Поттер", 10, 20, 18, 23, 25);
        Griffindor hermionaGreinger = new Griffindor("Гермиона Грейнджер", 12, 25, 15, 25, 19);
        Griffindor ronWisli = new Griffindor("Рон Уизли", 5, 10, 16, 22, 16);

        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 8, 5, 8, 6, 10, 8, 20);
        Slytherin grahamMontegry = new Slytherin("Грэхэм Монтегю", 5, 3, 1, 2, 3, 3, 8);
        Slytherin gregoryGoyl = new Slytherin("Грегори Гойл", 4, 2, 3, 5, 7, 5, 6);

        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 5, 8, 6, 10, 8, 20);
        Ravenclaw choChang = new Ravenclaw("Чо Чанг", 4, 5, 8, 2, 8, 15);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 6, 6, 6, 10, 8, 16);

        Hufflepuff zachariasSmith = new Hufflepuff("Захария Смитт", 3, 4, 5, 6, 7);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 6, 7, 8, 9, 10);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 8, 4, 5, 5, 7);

        gregoryGoyl.print();

        cedricDiggory.checkingStudentsOfAllFaculties(ronWisli);

        padmaPatil.checkingStudentsOfTheSameFaculty(choChang);
    }
}
