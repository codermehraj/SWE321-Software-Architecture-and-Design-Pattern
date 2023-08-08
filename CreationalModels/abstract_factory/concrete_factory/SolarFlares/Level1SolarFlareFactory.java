package CreationalModels.abstract_factory.concrete_factory.SolarFlares;

import CreationalModels.abstract_factory.concrete_factory.DebrisField.DebrisFieldFactory;
import CreationalModels.abstract_factory.product.Obstacle;
import CreationalModels.abstract_factory.product.SolarFlares.SolarFlareDark;
import CreationalModels.abstract_factory.product.SolarFlares.SolarFlareDeep;

public class Level1SolarFlareFactory extends DebrisFieldFactory{


    @Override
    public Obstacle createObstacle(int score) {
        if(score > 1500) return new SolarFlareDark();
        else return new SolarFlareDeep();
    }
}