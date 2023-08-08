package CreationalModels.abstract_factory.concrete_factory.BlackHoles;

import CreationalModels.abstract_factory.product.Obstacle;
import CreationalModels.abstract_factory.product.BlackHoles.BlackHolesReguler;
import CreationalModels.abstract_factory.product.BlackHoles.BlackHolesSmall;

public class Level2BlackHolesFactory extends BlackHolesFactory{


    @Override
    public Obstacle createObstacle(int score) {
        if(score > 1500) return new BlackHolesSmall();
        else return new BlackHolesReguler();
    }
}