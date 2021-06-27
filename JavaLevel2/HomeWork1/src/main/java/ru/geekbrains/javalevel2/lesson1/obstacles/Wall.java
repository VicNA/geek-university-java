package ru.geekbrains.javalevel2.lesson1.obstacles;

import ru.geekbrains.javalevel2.lesson1.participants.Participants;

public class Wall implements Obstacles {

    private double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public void doIt(Participants p) {
        p.jump(height);
    }
}
