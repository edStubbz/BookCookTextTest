package com.docduck.textlibrary;

public class Position {

    private int x;
    private int y;

    /**
     * Constructor to set up a 2 coordinate position
     * 
     * @param xPos - X coordinate of the position
     * @param yPos - Y coordinate of the position
     */
    public Position(int xPos, int yPos) {
        this.x = xPos;
        this.y = yPos;
    }

    /**
     * Sets the X coordinate of the position
     * 
     * @param xPos - X coordinate of the position
     */
    public void setX(int xPos) {
        this.x = xPos;
    }

    /**
     * Sets the Y coordinate of the position
     * 
     * @param yPos - Y coordinate of the position
     */
    public void setY(int yPos) {
        this.y = yPos;
    }

    /**
     * Gets the X coordinate of the position
     * 
     * @return - The X coordinate of the position
     */
    public int getX() {
        return this.x;
    }

    /**
     * Gets the Y coordinate of the position
     * 
     * @return - The Y coordinate of the position
     */
    public int getY() {
        return this.y;
    }

}