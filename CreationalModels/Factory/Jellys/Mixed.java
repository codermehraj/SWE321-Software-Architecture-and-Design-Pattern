public class Mixed extends Jelly {

    String creator;
    
    Mixed(String creator){
        this.creator = creator;
    }

    @Override
    void make() {
        System.out.println("Cereated " + creator + " Mixed Jelly");
    }
    
}
