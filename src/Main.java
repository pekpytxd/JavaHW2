public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        Swallow swallow = new Swallow();
        Penguin penguin = new Penguin();
        Kiwi kiwi = new Kiwi();
        Bird[] array = {eagle, swallow, penguin, kiwi};
        for (int i = 0; i < 4; i ++)
            System.out.println(array[i].getClass() + " can fly " + array[i].fly());

    }

    static class Eagle extends FlyingBird {
        private boolean feathers;
        private boolean layEggs;

        Eagle() {
            this.feathers = true;
            this.layEggs = true;
        }


    }

    static class Swallow extends FlyingBird {
        private boolean feathers;
        private boolean layEggs;

        Swallow() {
            this.feathers = true;
            this.layEggs = true;
        }
    }

    static class Penguin extends NonFlyingBird {
        private boolean feathers;
        private boolean layEggs;

        Penguin() {
            this.feathers = false;
            this.layEggs = true;
        }
    }

    static class Kiwi extends NonFlyingBird {
        private boolean feathers;
        private boolean layEggs;

        Kiwi() {
            this.feathers = true;
            this.layEggs = true;
        }
    }

}
