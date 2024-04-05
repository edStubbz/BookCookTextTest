package com.docduck.textlibrary;

import javafx.scene.paint.Color;

public class Border {

    private boolean hasBorder = true;
    private int borderWidth = 1;
    private Color borderColour = Color.BLACK;

    /**
     * Sets up a border with default values
     */
    public Border() {

    }

    /**
     * Sets up a border with defined values
     * 
     * @param width        - width of the border
     * @param borderColour - the colour of the border
     * @param hasBorder    - whether or not the border is to be displayed
     */
    public Border(int width, String borderColour, boolean hasBorder) {
        this.borderWidth = width;
        this.borderColour = Color.web(borderColour);
        this.hasBorder = hasBorder;
    }

    /**
     * Sets whether the border is displayed
     * 
     * @param hasBorder - whether or not the border is to be displayed
     */
    public void setHasBorder(boolean hasBorder) {
        this.hasBorder = hasBorder;
    }

    /**
     * Sets the width of the border
     * 
     * @param width - width of the border
     */
    public void setBorderWidth(int width) {
        this.borderWidth = width;
    }

    /**
     * Sets the colour of the border
     * 
     * @param color - Color object for the colour of the border
     */
    public void setBorderColour(Color color) {
        this.borderColour = color;
    }

    /**
     * Returns the current colour of the border
     * 
     * @return - current colour of the border
     */
    public Color getBorderColour() {
        return this.borderColour;
    }

    /**
     * Returns the current width of the border
     * 
     * @return - the current width of the border
     */
    public int getBorderWidth() {
        return this.borderWidth;
    }

    /**
     * Returns whether the border is displayed or not
     * 
     * @return - whether the border is displayed or not
     */
    public boolean getHasBorder() {
        return this.hasBorder;
    }

}