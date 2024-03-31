public abstract class HogwartsStudent {
    private String name;
    private int powerOfMagic;
    private int transgressionDistance;
    public HogwartsStudent(String name, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    @Override
    public String toString() {
        return "Студент Hogwarts " +
                name +
                ", сила магии = " + powerOfMagic +
                ", расстояние трансгрессии = " + transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    private int sumOfBaseParametrs() {
        return powerOfMagic+transgressionDistance;
    }

    protected abstract int sumOfParametrs();

    public void compareStudentsForGeneralParameters(HogwartsStudent hogwartsStudent) {
        int sumOfParametrs1 = sumOfBaseParametrs();
        int sumOfParametrs2 = hogwartsStudent.sumOfBaseParametrs();
        if (sumOfParametrs1>sumOfParametrs2) {
            System.out.printf(
                    "%s сильнее по базовым параметрам, чем %s (%d vs %d)%n",
                    this.getName(),
                    hogwartsStudent.getName(),
                    sumOfParametrs1,
                    sumOfParametrs2
            );
        } else if (sumOfParametrs2>sumOfParametrs1) {
            System.out.printf(
                    "%s сильнее по базовым параметрам, чем %s (%d vs %d)%n",
                    hogwartsStudent.name,
                    this.name,
                    sumOfParametrs2,
                    sumOfParametrs1
            );

        }
        else {
            System.out.printf(
                    "%s одинаковый по базовым параметрам, как и %s (%d vs %d)%n",
                    this.getName(),
                    hogwartsStudent.getName(),
                    sumOfParametrs1,
                    sumOfParametrs2
            );
        }
    }

    public void print() {
        System.out.println(this);
    }

}
