public class KogtevranStudent extends HogwartsStudent{
    private int mind; // ум
    private int wisdom; // мудрость
    private int wit; // остроумие
    private int fullOfCreativity; // полны творчества

    public KogtevranStudent(String name, int powerOfMagic, int transgressionDistance,
                     int mind, int wisdom, int wit, int fullOfCreativity) {
        super(name, powerOfMagic, transgressionDistance);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.fullOfCreativity = fullOfCreativity;
    }

    @Override
    protected int sumOfParametrs() {
        return mind+wisdom+wit+fullOfCreativity;
    }

    public void compareStudentsForParameters(KogtevranStudent kogtevranStudent) {
        int sumOfParametrs1 = sumOfParametrs();
        int sumOfParametrs2 = kogtevranStudent.sumOfParametrs();
        if (sumOfParametrs1>sumOfParametrs2) {
            System.out.printf(
                    "%s лучший Когтегранец, чем %s (%d vs %d)%n",
                    this.getName(),
                    kogtevranStudent.getName(),
                    sumOfParametrs1,
                    sumOfParametrs2
            );
        } else if (sumOfParametrs2>sumOfParametrs1) {
            System.out.printf(
                    "%s лучший Когтегранец, чем %s (%d vs %d)%n",
                    kogtevranStudent.getName(),
                    this.getName(),
                    sumOfParametrs2,
                    sumOfParametrs1
            );

        }
        else {
            System.out.printf(
                    "%s одинаково сильный Когтегранец, как и %s (%d vs %d)%n",
                    this.getName(),
                    kogtevranStudent.getName(),
                    sumOfParametrs1,
                    sumOfParametrs2
            );
        }
    }
    @Override
    public String toString() {
        return super.toString() +
                ", ум = " + mind +
                " баллов, мудрость = " + wisdom +
                " баллов, остроумие = " + wit +
                " баллов, полны творчества = " + fullOfCreativity +
                " баллов. Факультет Когтевран.";
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
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

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }


}
