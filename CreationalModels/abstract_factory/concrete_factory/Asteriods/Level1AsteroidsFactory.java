package CreationalModels.abstract_factory.concrete_factory.Asteriods;

import CreationalModels.abstract_factory.product.Asteriods.Asteriods;
import CreationalModels.abstract_factory.product.Asteriods.Ice_Asteroids;
import CreationalModels.abstract_factory.product.Asteriods.Iron_Asteroids;
import CreationalModels.abstract_factory.product.Obstacle;


public class Level1AsteroidsFactory extends AsteriodsFactory {

    @Override
    public Obstacle createObstacle(int score) {
        if(score > 500) return new Ice_Asteroids();
        else return (Asteriods) new Iron_Asteroids();
    }
}
