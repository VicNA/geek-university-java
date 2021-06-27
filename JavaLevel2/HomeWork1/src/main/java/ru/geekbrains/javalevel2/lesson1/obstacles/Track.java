package ru.geekbrains.javalevel2.lesson1.obstacles;

import ru.geekbrains.javalevel2.lesson1.participants.Participants;

public class Track implements Obstacles {

    private int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participants p) {
        p.run(length);
    }
}
