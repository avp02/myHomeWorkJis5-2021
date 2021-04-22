package com.avp.homework11.task3_maze.service;

import com.avp.homework11.task3_maze.bean.Maze;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class MazeService {

    private static final Logger log = LoggerFactory.getLogger(MazeService.class);

    private int i = 0;
    private int j = 0;
    private final Maze maze;

    public MazeService(Maze maze) {
        this.maze = maze;
    }

    public void startGameMaze() {
        Scanner scanner = new Scanner(System.in);
        firstLogging();

        while (!maze.getFieldFromGame()[maze.getFieldFromGame().length - 1][maze.getFieldFromGame().length - 1].equals("X")) {
            wasd(scanner.nextLine());
        }
        log.info("Вы выиграли!");
    }

    private void firstLogging() {
        log.info("Вот так выглядит лабиринт.");
        printGameField(maze.getFieldFromGame());
        log.info("Твоя задача дойти от верхнего левого угла до правого нижнего по \"+\".\n " +
                "Для передвижения по лабиринту используй кдавиши  \"w\" -- вверх,\n " +
                "\"s\" -- вниз, \"a\" -- влево, \"d\" -- вправо.\n " +
                "Буквой X будет обозначено твое местоположение.");
    }

    private void wasd(String go) {
        switch (go.toLowerCase()) {
            case "w":
                checkUp();
                break;
            case "s":
                checkDown();
                break;
            case "a":
                checkLeft();
                break;
            case "d":
                checkRight();
                break;
            default:
                log.info("Для передвижения по лабиринту используйте кдавиши \"w\" -- вверх, " +
                        "\"s\" -- вниз, \"a\" -- влево, \"d\" -- вправо");
                break;
        }
    }

    private void checkRight() {
        if (j < maze.getFieldFromGame().length - 1 && maze.getFieldFromGame()[i][j + 1].equals("+")) {
            maze.getFieldFromGame()[i][j + 1] = "X";
            maze.getFieldFromGame()[i][j] = "+";
            printGameField(maze.getFieldFromGame());
            j++;
        } else {
            log.info("Выберите другой путь");
        }
    }

    private void checkLeft() {
        if (j > 0 && maze.getFieldFromGame()[i][j - 1].equals("+")) {
            maze.getFieldFromGame()[i][j - 1] = "X";
            maze.getFieldFromGame()[i][j] = "+";
            printGameField(maze.getFieldFromGame());
            j--;
        } else {
            log.info("Выберите другой путь");
        }
    }

    private void checkDown() {
        if (i < maze.getFieldFromGame().length - 1 && maze.getFieldFromGame()[i + 1][j].equals("+")) {
            maze.getFieldFromGame()[i + 1][j] = "X";
            maze.getFieldFromGame()[i][j] = "+";
            printGameField(maze.getFieldFromGame());
            i++;
        } else {
            log.info("Выберите другой путь");
        }
    }

    private void checkUp() {
        if (i > 0 && maze.getFieldFromGame()[i - 1][j].equals("+")) {
            maze.getFieldFromGame()[i - 1][j] = "X";
            maze.getFieldFromGame()[i][j] = "+";
            printGameField(maze.getFieldFromGame());
            i--;
        } else {
            log.info("Выберите другой путь");
        }
    }

    private void printGameField(String[][] array) {
        for (String[] strings : array) {
            StringBuilder sb = new StringBuilder();
            for (int l = 0; l < array[0].length; l++) {
                sb.append(strings[l]).append(" ");
            }
            log.info("{}", sb);
        }
    }
}


