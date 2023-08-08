package CreationalModels.abstract_factory.concrete_factory.DebrisField;

import CreationalModels.abstract_factory.product.Asteriods.Asteriods;
import CreationalModels.abstract_factory.product.DebrisField.DynamicDebrisField;
import CreationalModels.abstract_factory.product.DebrisField.StaticDebrisField;
import CreationalModels.abstract_factory.product.Obstacle;

public class Level1DebrisFieldFactory extends DebrisFieldFactory{


    @Override
    public Obstacle createObstacle(int score) {
        if(score > 1500) return new DynamicDebrisField();
        else return new StaticDebrisField();
    }
}
