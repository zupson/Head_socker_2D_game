package hr.algebra.head_soccer_2d_game.controller;

import hr.algebra.head_soccer_2d_game.manager.GameObjectManager;
import hr.algebra.head_soccer_2d_game.manager.GameStateManager;
import hr.algebra.head_soccer_2d_game.model.entities.enums.Side;

public class GameFieldController implements GoalListener{
    private final GameStateManager gameStateManager;
    private final GameObjectManager gameObjectManager;

    public GameFieldController(GameStateManager gameStateManager, GameObjectManager gameObjectManager) {
        this.gameStateManager = gameStateManager;
        this.gameObjectManager = gameObjectManager;
    }

    //TODO: ovdje dodati metod za detekciju gola
    @Override
    public void onGoalScored(Side side){
        switch (side){
            case Side.LEFT ->{
                gameObjectManager.getLeftGoal().addScore();
                System.out.println("GOLLLLLLLLLLLL! lijevi gol je psotignut");
            }
            case Side.RIGHT -> {
                gameObjectManager.getRightGoal().addScore();
                System.out.println("GOLLLLLLLLLLLL! desni gol je psotignut");
            }
        }
        gameStateManager.setScoredGoalFlag(true);
    }
    //TODO: ovdje dodati metodu za refresh rezultata
}
