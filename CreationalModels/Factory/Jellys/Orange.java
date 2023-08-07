public class Orange extends Jelly {
    String creator;
    
    Orange(String creator){
        this.creator = creator;
    }

    @Override
    void make() {
        System.out.println("Cereated " + creator + " Orange Jelly");
    }
}
