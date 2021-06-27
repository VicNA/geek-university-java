package ru.geekbrains.javalevel2.lesson7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

public class ServerApp {

    public static void main(String[] args) {
        new Server();
    }
}
