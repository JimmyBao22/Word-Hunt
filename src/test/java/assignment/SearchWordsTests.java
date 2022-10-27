package assignment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SearchWordsTests {

    public static void main(String[] args) {

    }

    void testAddToQueue() {
        Queue<GameManager.WordPoints> queue = new LinkedList<>();
        List<Point> list = new ArrayList<>();
        int size = 4;
        boolean[][] visited = new boolean[size][size];
        int[][] points = new int[(int)(Math.random() * 100)][2];
        for (int i = 0; i < points.length; i++) {
            points[i][0] = (int)(Math.random() * 100);
            points[i][1] = (int)(Math.random() * 100);
        }

        
    }

    @RepeatedTest(100)
    void testWordPointsClass() {
        /*

        int length = (int)(Math.random() * 1000);
        String word = "";
        for (int i = 0; i < length; i++) {
            word += (char)((int)(Math.random() * 26) + 'a');
        }
        System.out.println(word);

        List<Point> list = new ArrayList<Point>();
        int listSize = (int)(Math.random() * 100);
        for (int i = 0; i < listSize; i++) {
            list.add(new Point((int)(Math.random() * 100), (int)(Math.random() * 100)));
        }

        boolean[][] visited = new boolean[100][100];
        boolean[][] copy = new boolean[100][100];
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[i].length; j++) {
                if (Math.random() < 0.5) {
                    visited[i][j] = true;
                }
                copy[i][j] = visited[i][j];
            }
        }

        GameManager.WordPoints wordPoints= new GameManager.WordPoints(word, list, visited);

        Assertions.assertEquals(word, wordPoints.getWord());

        for (int i = 0; i < listSize; i++) {
            Assertions.assertEquals(list.get(i).getX(), wordPoints.getPoints().get(i).getX());
            Assertions.assertEquals(list.get(i).getY(), wordPoints.getPoints().get(i).getY());
        }

        // change visited array
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[i].length; j++) {
                if (Math.random() < 0.5) {
                    visited[i][j] = !visited[i][j];
                }
            }
        }

        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; j < visited[i].length; j++) {
                if (Math.random() < 0.5) {
                    Assertions.assertEquals(copy[i][j], wordPoints.getVisited()[i][j]);
                }
            }
        }

         */
    }
}