package CreationalModels.abstract_factory;


import CreationalModels.abstract_factory.abstract_factory.ObstacleFactory;
import CreationalModels.abstract_factory.concrete_factory.Asteriods.Level1AsteroidsFactory;
import CreationalModels.abstract_factory.concrete_factory.Asteriods.Level2AsteroidsFactory;
import CreationalModels.abstract_factory.concrete_factory.BlackHoles.Level1BlackHolesFactory;
import CreationalModels.abstract_factory.concrete_factory.BlackHoles.Level2BlackHolesFactory;
import CreationalModels.abstract_factory.concrete_factory.DebrisField.Level1DebrisFieldFactory;
import CreationalModels.abstract_factory.concrete_factory.DebrisField.Level2DebrisFieldFactory;
import CreationalModels.abstract_factory.concrete_factory.EnemyShips.Level1EnemyShipsFactory;
import CreationalModels.abstract_factory.concrete_factory.EnemyShips.Level2EnemyShipsFactory;
import CreationalModels.abstract_factory.concrete_factory.SolarFlares.Level1SolarFlareFactory;
import CreationalModels.abstract_factory.concrete_factory.SolarFlares.Level2SolarFlareFactory;
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

        if(level == 1) factory = new Level1SolarFlareFactory();
        else factory = new Level2SolarFlareFactory();

        obstacle = factory.createObstacle(score);
        obstacle.show();

        if(level == 1) factory = new Level1BlackHolesFactory();
        else factory = new Level2BlackHolesFactory();

        obstacle = factory.createObstacle(score);
        obstacle.show();

        if(level == 1) factory = new Level1EnemyShipsFactory();
        else factory = new Level2EnemyShipsFactory();

        obstacle = factory.createObstacle(score);
        obstacle.show();


    }
}
