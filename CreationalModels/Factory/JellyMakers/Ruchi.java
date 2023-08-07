public class Ruchi extends JellyMaker {
    Ruchi(){}

    @Override
    Jelly makeJelly(String product) {
        if(product == "orange") return new Orange("Ruchi");
        else if(product == "mixed") return new Mixed("Ruchi");
        else if(product == "apple") return new Apple("Ruchi");
        else {
            System.out.println("product dont exist in the factory");
            return null;
        }
    }
}
