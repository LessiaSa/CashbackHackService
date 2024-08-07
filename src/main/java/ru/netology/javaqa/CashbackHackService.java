package ru.netology.javaqa;

public class CashbackHackService {
    public int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}
