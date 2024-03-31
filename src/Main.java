import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        GriffindorStudent harry = generateGriffindorStudent("Гарри Поттер");
        GriffindorStudent germiona = generateGriffindorStudent("Гермиона Грейнджер");
        GriffindorStudent ron = generateGriffindorStudent("Рон Уизли");

        PuffenduyStudent zahariya = generatePuffenduyStudent("Захария Смит");
        PuffenduyStudent sedric = generatePuffenduyStudent("Седрик Диггори");
        PuffenduyStudent djastin = generatePuffenduyStudent("Джастин Финч-Флетчли");

        KogtevranStudent chjou = generateKogtevranStudent("Чжоу Чанг");
        KogtevranStudent padma = generateKogtevranStudent("Падма Патил");
        KogtevranStudent markus = generateKogtevranStudent("Маркус Белби");

        SlytherinStudent drako = generateSlytherinStudent("Драко Малфой");
        SlytherinStudent grakhem = generateSlytherinStudent("Грэхэм Монтегю");
        SlytherinStudent gregori = generateSlytherinStudent("Грегори Гойл");

        drako.print();
        drako.compareStudentsForGeneralParameters(ron);
        padma.compareStudentsForParameters(chjou);

    }



    private static GriffindorStudent generateGriffindorStudent(String name) {
        return new GriffindorStudent(
                name,
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100)
        );
    }

    private static PuffenduyStudent generatePuffenduyStudent(String name) {
        return new PuffenduyStudent(
                name,
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100)
        );
    }

    private static KogtevranStudent generateKogtevranStudent(String name) {
        return new KogtevranStudent(
                name,
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100)
        );
    }

    private static SlytherinStudent generateSlytherinStudent(String name) {
        return new SlytherinStudent(
                name,
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100)
        );
    }

}





