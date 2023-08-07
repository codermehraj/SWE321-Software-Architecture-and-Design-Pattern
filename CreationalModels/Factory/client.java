public class client {
    public static void main(String[] args) {
        
        // concrete products : flavours of jelly (e.g. orange, mixed, apple)
        // concrete factorys : maker of diffrent version of the same products
        // (e.g. pran, ruchi)
        
        JellyMaker jm = new Ruchi();
        Jelly j;

        j = jm.makeJelly("orange");
        if(j != null) j.make();
        j = jm.makeJelly("mixed");
        if(j != null) j.make();
        j = jm.makeJelly("apple");
        if(j != null) j.make();
        j = jm.makeJelly("lion");
        if(j != null) j.make();


    }    
}
