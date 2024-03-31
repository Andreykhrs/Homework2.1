public class GriffindorStudent extends HogwartsStudent{
    public int nobility; // благородство
    public int honor; // честь
    public int bravery; // храбрость

    public GriffindorStudent(String name, int powerOfMagic, int transgressionDistance,
                      int nobility, int honor, int bravery) {
        super(name, powerOfMagic, transgressionDistance);
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
    protected int sumOfParametrs() {
        return nobility+honor+bravery;
    }

    public void compareStudentsForParameters(GriffindorStudent griffindorStudent) {
        int sumOfParametrs1 = sumOfParametrs();
        int sumOfParametrs2 = griffindorStudent.sumOfParametrs();
        if (sumOfParametrs1>sumOfParametrs2) {
            System.out.printf(
                    "%s лучший Гриффиндорец, чем %s (%d vs %d)%n",
                    this.getName(),
                    griffindorStudent.getName(),
                    sumOfParametrs1,
                    sumOfParametrs2
            );
        } else if (sumOfParametrs2>sumOfParametrs1) {
            System.out.printf(
                    "%s лучший Гриффиндорец, чем %s (%d vs %d)%n",
                    griffindorStudent.getName(),
                    this.getName(),
                    sumOfParametrs2,
                    sumOfParametrs1
            );

        }
        else {
            System.out.printf(
                    "%s одинаково сильный Гриффиндорец, как и %s (%d vs %d)%n",
                    this.getName(),
                    griffindorStudent.getName(),
                    sumOfParametrs1,
                    sumOfParametrs2
            );
        }
    }

        @Override
    public String toString() {
        return super.toString() +
                ", благородство = " + nobility +
                " баллов, честь = " + honor +
                " баллов, храбрость = " + bravery +
                " баллов. Факультет Гриффиндор.";
    }


}



