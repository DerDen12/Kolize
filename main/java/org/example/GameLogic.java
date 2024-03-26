package org.example;

import org.example.logic.Ball;
import org.example.logic.Direction;
import org.example.logic.Wall;

import java.awt.*;
import java.util.ArrayList;

public class GameLogic {
    private Ball ball;
    private Ball ballEnemy;
    private ArrayList<Wall> walls;


    public GameLogic() {
        this.ball = null;
        this.walls = new ArrayList<>();
    }

    public void initialize() {

        ball = new Ball(50, 50, 50, 50, Color.BLUE);

        Wall wall1 = new Wall(250, 30, 250, 130, Color.BLACK);
        walls.add(wall1);
    }

    public void update() {
        for (Wall wall : walls)
            if (ball.isCollidedBall(wall.getWallRectangle()))
                System.out.println("funguje");

            }





    public Ball getBall() {
        return ball;
    }

    public ArrayList<Wall> getWalls() {
        return walls;
    }
}
