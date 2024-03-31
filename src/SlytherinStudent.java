public class SlytherinStudent extends HogwartsStudent{
    private int cunning; // хитрость
    private int determination; // решительность
    private int ambition; // амбициозность
    private int resourcefulness; // находчивость
    private int thirstForPower; // жажда власти

    public SlytherinStudent(String name, int powerOfMagic, int transgressionDistance, int cunning,
                     int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    @Override
    protected int sumOfParametrs() {
        return cunning+determination+ambition+resourcefulness+thirstForPower;
    }

    public void compareStudentsForParameters(SlytherinStudent slytherinStudent) {
        int sumOfParametrs1 = sumOfParametrs();
        int sumOfParametrs2 = slytherinStudent.sumOfParametrs();
        if (sumOfParametrs1>sumOfParametrs2) {
            System.out.printf(
                    "%s лучший Когтегранец, чем %s (%d vs %d)%n",
                    this.getName(),
                    slytherinStudent.getName(),
                    sumOfParametrs1,
                    sumOfParametrs2
            );
        } else if (sumOfParametrs2>sumOfParametrs1) {
            System.out.printf(
                    "%s лучший Когтегранец, чем %s (%d vs %d)%n",
                    slytherinStudent.getName(),
                    this.getName(),
                    sumOfParametrs2,
                    sumOfParametrs1
            );

        }
        else {
            System.out.printf(
                    "%s одинаково сильный Когтегранец, как и %s (%d vs %d)%n",
                    this.getName(),
                    slytherinStudent.getName(),
                    sumOfParametrs1,
                    sumOfParametrs2
            );
        }
    }
    @Override
    public String toString() {
        return super.toString() +
                ", хитрость = " + cunning +
                " баллов, решительность = " + determination +
                " баллов, амбициозность = " + ambition +
                " баллов, находчивость = " + resourcefulness +
                " баллов, жажда власти = " + thirstForPower +
                " баллов. Факультет Слизерин.";
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }


}
