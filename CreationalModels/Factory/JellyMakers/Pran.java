public class Pran extends JellyMaker{

    Pran(){}

    @Override
    Jelly makeJelly(String product) {
        if(product == "orange") return new Orange("Pran");
        else if(product == "mixed") return new Mixed("Pran");
        else if(product == "apple") return new Apple("Pran");
        else {
            System.out.println("product dont exist in the factory");
            return null;
        }
    }
    
}
