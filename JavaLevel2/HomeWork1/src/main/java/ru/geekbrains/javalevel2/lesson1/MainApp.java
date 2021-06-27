package ru.geekbrains.javalevel2.lesson1;

import ru.geekbrains.javalevel2.lesson1.obstacles.Obstacles;
import ru.geekbrains.javalevel2.lesson1.obstacles.Track;
import ru.geekbrains.javalevel2.lesson1.obstacles.Wall;
import ru.geekbrains.javalevel2.lesson1.participants.*;

public class MainApp {

    public static void main(String[] args) {
        Participants[] participants = {
                new Human("Александр", 500, 0.8),
                new Robot("Валли", 1000, 0.4),
                new Cat("Барсик", 800, 1.1)
        };

        Obstacles[] obstacles = {
                new Track(400),
                new Wall(0.3),
                new Track(400),
                new Wall(0.5),
                new Track(600)
        };

        for (Participants p : participants) {
            for (Obstacles o : obstacles) {
                o.doIt(p);
                if (!p.getResult()) break;
            }
            System.out.println();
        }
    }
}
