package com.avp.homework11.task3_maze;

import com.avp.homework11.task3_maze.bean.Maze;
import com.avp.homework11.task3_maze.service.MazeService;

public class MazeApp {
    public static void main(String[] args) {
        Maze app = new Maze();
        MazeService appService = new MazeService(app);
        appService.startGameMaze();
    }
}
