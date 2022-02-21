package com.company;

import java.util.ArrayList;
import java.util.Random;

public class GameBoard {
    private static ArrayList<Tiles> grid = new ArrayList<>();
    private static int gridSize = 128;

    public static void createGrid(){
        for (int i = 0; i < gridSize; i++){
            for (int j = 0; j < gridSize; j++){
                Tiles myTile = new Tiles(false, 0, i, j);
                grid.add(myTile);
            }
        }
    }
    public static void createBorder(){
        int size = grid.size();
        for (int i = 0; i < size; i++){
            Tiles myTile = grid.get(i);
            if (myTile.getX() == 0 || myTile.getX() == 127){
                myTile.setType(1);
            }
            else if (myTile.getY() == 0 || myTile.getY() == 127){
                myTile.setType(1);
            }
        }
    }
    public static void createRocks(){
        int size = IORsystems.RandomInt(3,1);
        int xCoord = IORsystems.RandomInt(gridSize-2,1);
        int yCoord = IORsystems.RandomInt(gridSize-2,1);
        Tiles myTile = searchGrid(xCoord,yCoord);
        if (size == 1){
            myTile.setType(1);
        }
        else if (size == 2){
            myTile.setType(1);
            Tiles myTile1 = searchGrid(xCoord+1,yCoord);
            Tiles myTile2 = searchGrid(xCoord,yCoord+1);
            Tiles myTile3 = searchGrid(xCoord+1,yCoord+1);
            myTile1.setType(1);
            myTile2.setType(1);
            myTile3.setType(1);
        }
        else{
            myTile.setType(1);
            Tiles myTile1 = searchGrid(xCoord+1,yCoord);
            Tiles myTile2 = searchGrid(xCoord,yCoord+1);
            Tiles myTile3 = searchGrid(xCoord+1,yCoord+1);
            Tiles myTile4 = searchGrid(xCoord-1,yCoord);
            Tiles myTile5 = searchGrid(xCoord,yCoord-1);
            Tiles myTile6 = searchGrid(xCoord-1,yCoord-1);
            Tiles myTile7 = searchGrid(xCoord-1,yCoord+1);
            Tiles myTile8 = searchGrid(xCoord+1,yCoord-1);
            myTile1.setType(1);
            myTile2.setType(1);
            myTile3.setType(1);
            myTile4.setType(1);
            myTile5.setType(1);
            myTile6.setType(1);
            myTile7.setType(1);
            myTile8.setType(1);
        }
    }

    public static Tiles searchGrid(int x, int y){
        int size = grid.size();
        boolean found = false;
        int count = 0;
        Tiles outTile = new Tiles(false,-1,-1,-1);
        while (!found && count < size){
            Tiles myTile = grid.get(count);
            if (myTile.getX() == x && myTile.getY() == y){
                found = true;
                outTile = myTile;
            }
            count++;
        }
        return outTile;
    }
}
