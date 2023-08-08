package CreationalModels.abstract_factory.abstract_factory;

import CreationalModels.abstract_factory.product.Obstacle;

public abstract class ObstacleFactory {
    public abstract Obstacle createObstacle(int score);
}
