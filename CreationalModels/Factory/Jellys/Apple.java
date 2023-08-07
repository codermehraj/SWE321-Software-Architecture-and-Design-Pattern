public class Apple extends Jelly{
    String creator;
    
    Apple(String creator){
        this.creator = creator;
    }

    @Override
    void make() {
        System.out.println("Cereated " + creator + " Apple Jelly");
    }
}
