public abstract  class Vehicle implements Transport {
    private int numberOfTyres;
    public Vehicle(int numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }

    abstract public void makeStartSound();

    public int getNumberOfTyres(){
        return numberOfTyres;
    }
    public void setNumberOfTyres(int noOfTypres){
        numberOfTyres = noOfTypres;
    }

    public void commute() {
        System.out.println("going");
    }
}
