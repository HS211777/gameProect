package com.company;

public class Buildings { // all need to use up resources
    public static void placeHouse(int x, int y) {
        Tiles myTile = GameBoard.searchGrid(x, y);
        if (myTile.getType() == 0 && myTile.isLight()) {
            myTile.setType(2);
        } else {
            System.out.println("cannot place");
        }
    }

    public static void placeLight(int x, int y) {
        Tiles myTile = GameBoard.searchGrid(x, y);
        if (myTile.getType() == 0 && myTile.isLight()) {
            myTile.setType(5);
        } else {
            System.out.println("cannot place");
        }
    }

    public static void placeGen(int x, int y) {
        Tiles myTile = GameBoard.searchGrid(x, y);
        Tiles myTile1 = GameBoard.searchGrid(x + 1, y);
        if (myTile.getType() == 0 && myTile.isLight() && myTile1.getType() == 0 && myTile1.isLight()) {
            myTile.setType(3);
            myTile1.setType(3);
        } else {
            System.out.println("cannot place");
        }
    }

    public static void placeMine(int x, int y) {
        Tiles myTile = GameBoard.searchGrid(x, y);
        Tiles myTile1 = GameBoard.searchGrid(x + 1, y);
        Tiles myTile2 = GameBoard.searchGrid(x, y + 1);
        Tiles myTile3 = GameBoard.searchGrid(x + 1, y + 1);
        if (myTile.getType() == 0 && myTile.isLight() && myTile1.getType() == 0 && myTile1.isLight() && myTile2.getType() == 0 && myTile2.isLight() && myTile3.getType() == 0 && myTile3.isLight()) {
            myTile.setType(6);
            myTile1.setType(6);
            myTile2.setType(6);
            myTile3.setType(6);
        } else {
            System.out.println("cannot place");
        }
    }

    public static void placeFarm(int x, int y) {
        Tiles myTile = GameBoard.searchGrid(x, y);
        Tiles myTile1 = GameBoard.searchGrid(x + 1, y);
        Tiles myTile2 = GameBoard.searchGrid(x, y + 1);
        Tiles myTile3 = GameBoard.searchGrid(x + 1, y + 1);
        Tiles myTile4 = GameBoard.searchGrid(x - 1, y);
        Tiles myTile5 = GameBoard.searchGrid(x, y - 1);
        Tiles myTile6 = GameBoard.searchGrid(x - 1, y - 1);
        Tiles myTile7 = GameBoard.searchGrid(x + 1, y - 1);
        Tiles myTile8 = GameBoard.searchGrid(x - 1, y + 1);
        if (myTile.getType() == 0 && myTile.isLight() && myTile1.getType() == 0 && myTile1.isLight() && myTile2.getType() == 0 && myTile2.isLight() && myTile3.getType() == 0 && myTile3.isLight() && myTile4.getType() == 0 && myTile4.isLight() && myTile5.getType() == 0 && myTile5.isLight() && myTile6.getType() == 0 && myTile6.isLight() && myTile7.getType() == 0 && myTile7.isLight() && myTile8.getType() == 0 && myTile8.isLight()) {
            myTile.setType(4);
            myTile1.setType(4);
            myTile2.setType(4);
            myTile3.setType(4);
            myTile4.setType(4);
            myTile5.setType(4);
            myTile6.setType(4);
            myTile7.setType(4);
            myTile8.setType(4);
        } else {
            System.out.println("cannot place");
        }
    }
}