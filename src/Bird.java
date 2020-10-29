public abstract class Bird {
    private boolean feathers;
    private boolean layEggs;

    Bird() {

    }

    Bird(boolean feathers, boolean layEggs) {

    }

    public void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

    public boolean getLayEggs() {
        return this.layEggs;
    }

    public boolean getFeathers() {
        return this.feathers;
    }

    public abstract boolean fly();
}
