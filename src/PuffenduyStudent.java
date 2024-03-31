public class PuffenduyStudent extends HogwartsStudent{
    public int hardworking; //трудолюбие
    public int loyal; // верность
    public int honest; // честность

    public PuffenduyStudent(String name, int powerOfMagic, int transgressionDistance,
                     int hardworking, int loyal, int honest) {
        super(name, powerOfMagic , transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;

    }

    @Override
    protected int sumOfParametrs() {
        return hardworking+loyal+honest;
    }

    public void compareStudentsForParameters(PuffenduyStudent puffenduyStudent) {
        int sumOfParametrs1 = sumOfParametrs();
        int sumOfParametrs2 = puffenduyStudent.sumOfParametrs();
        if (sumOfParametrs1>sumOfParametrs2) {
            System.out.printf(
                    "%s лучший Пуффендуец, чем %s (%d vs %d)%n",
                    this.getName(),
                    puffenduyStudent.getName(),
                    sumOfParametrs1,
                    sumOfParametrs2
            );
        } else if (sumOfParametrs2>sumOfParametrs1) {
            System.out.printf(
                    "%s лучший Пуффендуец, чем %s (%d vs %d)%n",
                    puffenduyStudent.getName(),
                    this.getName(),
                    sumOfParametrs2,
                    sumOfParametrs1
            );

        }
        else {
            System.out.printf(
                    "%s одинаково сильный Пуффендуец, как и %s (%d vs %d)%n",
                    this.getName(),
                    puffenduyStudent.getName(),
                    sumOfParametrs1,
                    sumOfParametrs2
            );
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", трудолюбие = " + hardworking +
                " баллов, верность = " + loyal +
                " баллов, честность = " + honest +
                " баллов. Факультет Пуффендуй.";
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }


}
