package CreationalModels.abstract_factory.concrete_factory.BlackHoles;

import CreationalModels.abstract_factory.product.Obstacle;
import CreationalModels.abstract_factory.product.BlackHoles.BlackHolesLarge;
import CreationalModels.abstract_factory.product.BlackHoles.BlackHolesReguler;

public class Level1BlackHolesFactory extends BlackHolesFactory{


    @Override
    public Obstacle createObstacle(int score) {
        if(score > 1500) return new BlackHolesLarge();
        else return new BlackHolesReguler();
    }
}