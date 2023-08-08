package CreationalModels.abstract_factory;


import CreationalModels.abstract_factory.abstract_factory.ObstacleFactory;
import CreationalModels.abstract_factory.concrete_factory.Asteriods.Level1AsteroidsFactory;
import CreationalModels.abstract_factory.concrete_factory.Asteriods.Level2AsteroidsFactory;
import CreationalModels.abstract_factory.concrete_factory.DebrisField.Level1DebrisFieldFactory;
import CreationalModels.abstract_factory.concrete_factory.DebrisField.Level2DebrisFieldFactory;
import CreationalModels.abstract_factory.product.Obstacle;

public class Client {
    public static void main(String[] args) {
        int level = (int)(Math.random() * 2) + 1;

        ObstacleFactory factory;

        if(level == 1) factory = new Level1AsteroidsFactory();
        else factory = new Level2AsteroidsFactory();

        int score = (int)(Math.random() * 2000);

        Obstacle obstacle = factory.createObstacle(score);
        obstacle.show();

        if(level == 1) factory = new Level1DebrisFieldFactory();
        else factory = new Level2DebrisFieldFactory();

        obstacle = factory.createObstacle(score);
        obstacle.show();


    }
}
