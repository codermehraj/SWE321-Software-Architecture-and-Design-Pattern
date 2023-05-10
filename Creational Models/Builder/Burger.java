public class Burger {
    private final double cost;
    private final int cheese;
    private final int meat;
    private final int letus;

    private Burger(BurgerBuilder builder) {
        this.cost = builder.getCost();
        this.cheese = builder.cheese;
        this.meat = builder.meat;
        this.letus = builder.letus;
    }

    // getters for all fields


    public double getCost() {
        return cost;
    }

    public int numOfChese() {
        return cheese;
    }

    public int numOfMeat() {
        return meat;
    }

    public int numOfLetus() {
        return letus;
    }

    public static class BurgerBuilder {
        private double cost;
        private int cheese = 0;
        private int meat = 0;
        private int letus = 0;
        
        public BurgerBuilder(){}

        public double getCost(){
            return cheese * 10 + meat * 30 + letus * 5;
        }

        public BurgerBuilder cheese(int cheese) {
            this.cheese += cheese;
            return this;
        }

        public BurgerBuilder letus(int letus) {
            this.letus += letus;
            return this;
        }

        public BurgerBuilder meat(int meat) {
            this.meat += meat;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}
