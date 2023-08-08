package CreationalModels.abstract_factory.concrete_factory.EnemyShips;

import CreationalModels.abstract_factory.product.Obstacle;
import CreationalModels.abstract_factory.product.EnemyShips.EnemyShipsBlack;
import CreationalModels.abstract_factory.product.EnemyShips.EnemyShipsBlue;

public class Level1EnemyShipsFactory extends EnemyShipsFactory{


    @Override
    public Obstacle createObstacle(int score) {
        if(score > 1500) return new EnemyShipsBlue();
        else return new EnemyShipsBlack();
    }
}