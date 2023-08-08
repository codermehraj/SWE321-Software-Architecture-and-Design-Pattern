package CreationalModels.abstract_factory.concrete_factory.SolarFlares;

import CreationalModels.abstract_factory.concrete_factory.DebrisField.DebrisFieldFactory;
import CreationalModels.abstract_factory.product.Obstacle;
import CreationalModels.abstract_factory.product.SolarFlares.SolarFlareDeep;
import CreationalModels.abstract_factory.product.SolarFlares.SolarFlareLight;

public class Level2SolarFlareFactory extends DebrisFieldFactory{


    @Override
    public Obstacle createObstacle(int score) {
        if(score > 1500) return new SolarFlareLight();
        else return new SolarFlareDeep();
    }
}
