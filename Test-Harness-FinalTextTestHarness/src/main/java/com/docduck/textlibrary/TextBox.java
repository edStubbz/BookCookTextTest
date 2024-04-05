package com.docduck.textlibrary;

import java.util.List;

import javafx.animation.PauseTransition;
import javafx.geometry.VPos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.util.Duration;

public class TextBox {

    private double width = 100;
    private double height = 100;
    private String content;
    private Font font;
    private Color fontColour = Color.BLACK;
    private int fontSize = 10;
    private Color backgroundColour = Color.GREY;
    private boolean hasBackground = true;

    private double characterSpacing = 0;
    private double lineSpacing = 1.5;

    private Position boxPosition;
    private Border boxBorder;

    private Text boxText;

    private Rectangle boxRectangle;
    private double margin = 0;
    private Position offset;
    private boolean textOriginCentre = false;
    private Pane pane;

    public enum Origin {
        CENTRE, CORNER,
    }

    /////////////////////////////////////////////////////////////////////////////

    /**
     * Constructs a default text box with default parameters
     * 
     * @author jrb617
     */
    public TextBox() {
        this.boxPosition = new Position(0, 0);

        this.boxRectangle = new Rectangle(this.boxPosition.getX(), this.boxPosition.getY(), this.width, this.height);
        setBackgroundColour(backgroundColour);

        this.boxText = new Text(this.boxPosition.getX(), this.boxPosition.getY(), null);
        this.boxText.setTextOrigin(VPos.TOP);
        this.boxText.setWrappingWidth(this.width - 2 * margin);
        setFontColour(this.fontColour);
        setFontSize(this.fontSize);
        setLineSpacing(this.lineSpacing);
        setCharacterSpacing(this.characterSpacing);

        this.boxBorder = new Border();
        setBorderWidth(this.boxBorder.getBorderWidth());
        setBorderColour(this.boxBorder.getBorderColour());
        setMargin(margin);

        this.offset = new Position(0, 0);

    }

    /**
     * Constructs a default text box at the specified position
     * 
     * @param positionX - The X coordinate of the text box
     * @param positionY - The Y coordinate of the text box
     * @author jrb617
     */
    public TextBox(int positionX, int positionY) {
        this.boxPosition = new Position(positionX, positionY);

        this.boxRectangle = new Rectangle(this.boxPosition.getX(), this.boxPosition.getY(), this.width, this.height);
        setBackgroundColour(backgroundColour);

        this.boxText = new Text(this.boxPosition.getX(), this.boxPosition.getY(), null);
        this.boxText.setTextOrigin(VPos.TOP);
        this.boxText.setWrappingWidth(this.width - 2 * margin);
        setFontColour(this.fontColour);
        setFontSize(this.fontSize);
        setLineSpacing(this.lineSpacing);
        setCharacterSpacing(this.characterSpacing);

        this.boxBorder = new Border();
        setBorderWidth(this.boxBorder.getBorderWidth());
        setBorderColour(this.boxBorder.getBorderColour());
        setMargin(margin);

        this.offset = new Position(0, 0);
    }

    /**
     * Constructs a default text box at the specified position with content
     * 
     * @param positionX - The X coordinate of the text box
     * @param positionY - The Y coordinate of the text box
     * @param content   - The text content to be displayed
     * @author jrb617
     */
    public TextBox(int positionX, int positionY, String content) {
        this.boxPosition = new Position(positionX, positionY);

        this.boxRectangle = new Rectangle(this.boxPosition.getX(), this.boxPosition.getY(), this.width, this.height);
        setBackgroundColour(this.backgroundColour);

        this.content = content;
        this.boxText = new Text(this.boxPosition.getX(), this.boxPosition.getY(), content);
        this.boxText.setTextOrigin(VPos.TOP);
        this.boxText.setWrappingWidth(this.width - 2 * margin);
        setFontColour(this.fontColour);
        setFontSize(this.fontSize);
        setLineSpacing(this.lineSpacing);
        setCharacterSpacing(this.characterSpacing);

        this.boxBorder = new Border();
        setBorderWidth(this.boxBorder.getBorderWidth());
        setBorderColour(this.boxBorder.getBorderColour());
        setMargin(margin);

        this.offset = new Position(0, 0);

    }

    /**
     * Constructs a default text box with the specified width and height
     * 
     * @param width  - width of the text box
     * @param height - height of the text box
     * @author jrb617
     */
    public TextBox(double width, double height) {

        this.boxPosition = new Position(0, 0);

        this.boxRectangle = new Rectangle(this.boxPosition.getX(), this.boxPosition.getY(), width, height);
        setBackgroundColour(backgroundColour);
        this.width = width;
        this.height = height;

        this.boxText = new Text(this.boxPosition.getX(), this.boxPosition.getY(), null);
        this.boxText.setTextOrigin(VPos.TOP);
        this.boxText.setWrappingWidth(this.width - 2 * margin);
        setFontColour(this.fontColour);
        setFontSize(this.fontSize);
        setLineSpacing(this.lineSpacing);
        setCharacterSpacing(this.characterSpacing);

        this.boxBorder = new Border();
        setBorderWidth(this.boxBorder.getBorderWidth());
        setBorderColour(this.boxBorder.getBorderColour());
        setMargin(margin);

        this.offset = new Position(0, 0);

    }

    /**
     * Constructs a default text box with the specified width and height at the
     * specified coordinates
     * 
     * @param positionX - The X coordinate of the text box
     * @param positionY - The Y coordinate of the text box
     * @param width     - width of the text box
     * @param height    - height of the text box
     * @author jrb617
     */
    public TextBox(int positionX, int positionY, double width, double height) {

        this.boxPosition = new Position(positionX, positionY);

        this.boxRectangle = new Rectangle(this.boxPosition.getX(), this.boxPosition.getY(), width, height);
        setBackgroundColour(backgroundColour);
        this.width = width;
        this.height = height;

        this.boxText = new Text(this.boxPosition.getX(), this.boxPosition.getY(), null);
        this.boxText.setTextOrigin(VPos.TOP);
        this.boxText.setWrappingWidth(this.width - 2 * margin);
        setFontColour(this.fontColour);
        setFontSize(this.fontSize);
        setLineSpacing(this.lineSpacing);
        setCharacterSpacing(this.characterSpacing);

        this.boxBorder = new Border();
        setBorderWidth(this.boxBorder.getBorderWidth());
        setBorderColour(this.boxBorder.getBorderColour());
        setMargin(margin);

        this.offset = new Position(0, 0);
    }

    /**
     * Constructs a default text box with the specified width and height at the
     * specified coordinates with content
     * 
     * @param positionX - The X coordinate of the text box
     * @param positionY - The Y coordinate of the text box
     * @param width     - width of the text box
     * @param height    - height of the text box
     * @param content   - The text content to be displayed
     * @author jrb617
     */
    public TextBox(int positionX, int positionY, double width, double height, String content) {

        this.boxPosition = new Position(positionX, positionY);

        this.boxRectangle = new Rectangle(this.boxPosition.getX(), this.boxPosition.getY(), width, height);
        setBackgroundColour(backgroundColour);
        this.width = width;
        this.height = height;

        this.content = content;
        this.boxText = new Text(this.boxPosition.getX(), this.boxPosition.getY(), content);
        this.boxText.setTextOrigin(VPos.TOP);
        this.boxText.setWrappingWidth(this.width - 2 * margin);
        setFontColour(this.fontColour);
        setFontSize(this.fontSize);
        setLineSpacing(this.lineSpacing);
        setCharacterSpacing(this.characterSpacing);

        this.boxBorder = new Border();
        setBorderWidth(this.boxBorder.getBorderWidth());
        setBorderColour(this.boxBorder.getBorderColour());
        setMargin(margin);

        this.offset = new Position(0, 0);

    }

    /**
     * Constructs a fully customised text box
     * 
     * @param positionX        - The X coordinate of the text box
     * @param positionY        - The Y coordinate of the text box
     * @param width            - width of the text box
     * @param height           - height of the text box
     * @param content          - The text content to be displayed
     * @param font             - the font to be used
     * @param fontColour       - the colour of the text
     * @param fontSize         - the size of the text
     * @param lineSpacing      - the line spacing of the text
     * @param characterSpacing - the character spacing of the text
     * @param backGroundColour - the background colour of the text box
     * @param borderColour     - the border colour of the text box
     * @param borderWidth      - the width of the text box
     * @param margin           - the margin of the text box
     * @param corderRadius     - the corner radius of the text box
     * @author jrb617
     */
    public TextBox(int positionX, int positionY, double width, double height, String content, String font,
            String fontColour, int fontSize, double lineSpacing, double characterSpacing, String backGroundColour,
            String borderColour, int borderWidth, int margin, double cornerRadius) {

        this.boxPosition = new Position(positionX, positionY);

        this.boxRectangle = new Rectangle(this.boxPosition.getX(), this.boxPosition.getY(), width, height);
        setBackgroundColour(backgroundColour);
        this.width = width;
        this.height = height;

        this.content = content;
        this.boxText = new Text(this.boxPosition.getX(), this.boxPosition.getY(), content);
        this.boxText.setTextOrigin(VPos.TOP);
        this.boxText.setWrappingWidth(this.width - 2 * margin);

        setFont(font);
        setFontColour(fontColour);
        setFontSize(fontSize);
        setLineSpacing(lineSpacing);
        setCharacterSpacing(characterSpacing);

        this.boxBorder = new Border();
        setBorderWidth(borderWidth);
        setBorderColour(borderColour);
        setMargin(margin);

        this.offset = new Position(0, 0);
        setCornerRadius(cornerRadius);

    }

    /////////////////////////////////////////////////////////////////////////////

    // Methods relevant for both the text box and the text

    /**
     * Sets the width of the text box Accounts for the offset if the origin point is
     * at the centre
     * 
     * @param width - Width of the text box
     * @author jrb617
     */
    public void setWidth(double width) {
        this.width = width;
        this.boxText.setWrappingWidth(this.width - 2 * margin);
        this.boxRectangle.setWidth(this.width);

        checkOffset();
        checkText();
        checkCornerRadius();
        checkMargin();

    }

    /**
     * Sets the width of the text box Accounts for the offset if the origin point is
     * at the centre
     * 
     * @param height - the height of the text box
     * @author jrb617
     */
    public void setHeight(double height) {
        this.height = height;
        this.boxRectangle.setHeight(this.height);

        checkOffset();
        checkText();
        checkCornerRadius();
        checkMargin();
    }

    /**
     * Sets the X position of the text box's origin Default - upper left corner
     * 
     * @param position - the x position of the text box's origin
     * @author jrb617
     * 
     */
    public void setPositionX(int position) {
        this.boxPosition.setX(position - this.offset.getX());
        this.boxText.setX(this.boxPosition.getX() + margin);
        this.boxRectangle.setX(this.boxPosition.getX());

    }

    /**
     * Sets the Y position of the text box's origin Default - upper left corner
     * 
     * @param position - the y position of the text box's origin
     * @author jrb617
     * 
     */
    public void setPositionY(int position) {
        this.boxPosition.setY(position - this.offset.getY());
        this.boxText.setY(this.boxPosition.getY() + margin);
        this.boxRectangle.setY(this.boxPosition.getY());
    }

    /**
     * Sets the origin point of the text box, either upper left corner or centre
     * point
     * 
     * @param origin - the origin point as an enum
     * @author jrb617
     */
    public void setOrigin(Origin origin) {
        switch (origin) {
        case CENTRE:
            this.offset.setX((int) (this.width / 2));
            this.offset.setY((int) (this.height / 2));
            this.boxPosition.setX(this.boxPosition.getX() - this.offset.getX());
            this.boxPosition.setY(this.boxPosition.getY() - this.offset.getY());
            this.boxText.setX(this.boxPosition.getX() + margin);
            this.boxText.setY(this.boxPosition.getY() + margin);
            this.boxRectangle.setX(this.boxPosition.getX());
            this.boxRectangle.setY(this.boxPosition.getY());
            break;

        case CORNER:
            if (this.offset.getX() != 0) {
                this.boxPosition.setX(this.boxPosition.getX() + this.offset.getX());
                this.boxPosition.setY(this.boxPosition.getY() + this.offset.getY());
                this.boxText.setX(this.boxPosition.getX() + margin);
                this.boxText.setY(this.boxPosition.getY() + margin);
                this.boxRectangle.setX(this.boxPosition.getX());
                this.boxRectangle.setY(this.boxPosition.getY());
            }
            this.offset.setX(0);
            this.offset.setY(0);
            break;
        }

    }

    /////////////////////////////////////////////////////////////////////////////

    // Methods for modifying the text box text

    /**
     * Sets the content of the text box
     * 
     * @param content - the text box content
     * @author jrb617
     */
    public void setContent(String content) {
        this.content = content;
        this.boxText.setText(this.content);
//        checkText();
    }

    /**
     * Gets the list of fonts on the user's computer Checks the entered font against
     * this list. If the font is installed, it sets it to that, if not it displays
     * an error message and sets it to system default
     * 
     * @param font - the font to be used
     * @author jrb617
     */
    public void setFont(String font) {

        boolean fontOnSys = false;

        List<String> systemFonts = Font.getFontNames();

        for (String systemFont : systemFonts) {

            if (systemFont.equalsIgnoreCase(font)) {
                this.font = new Font(systemFont, this.fontSize);

                if (this.font.getName().equals(font)) {
                    fontOnSys = true;
                }

            }
            if (fontOnSys == true) {
                break;
            }
        }

        if (!fontOnSys) {
            this.font = new Font(fontSize);
            System.out.println("Font not installed on system, default system font selected.");
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Font Error");
            alert.setContentText("Font not installed on system, default system font selected.");
            alert.showAndWait();
        }

        this.boxText.setFont(this.font);

    }

    /**
     * Sets the font colour to the entered hexadecimal value
     * 
     * @param fontColour - hexadecimal font colour
     * @author jrb617
     */
    public void setFontColour(String fontColour) {
        this.fontColour = Color.web(fontColour);
        this.boxText.setFill(this.fontColour);
    }

    /**
     * Sets the font colour to the entered enum value
     * 
     * @param fontColour - Javafx.Color enum colour
     * @author jrb617
     */
    public void setFontColour(Color fontColour) {
        this.fontColour = fontColour;
        this.boxText.setFill(fontColour);
    }

    /**
     * Checks whether a font has been set If set, just sets the size as entered If
     * not set, sets the font to default and the size as entered
     * 
     * @param fontSize
     * @author jrb617
     */
    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;

        if (this.font != null) {
            if (this.font.getSize() != fontSize) {
                this.font = new Font(this.font.getName(), fontSize);
            }
        }
        else {
            this.font = new Font(fontSize);
        }

        this.boxText.setFont(this.font);
        checkText();
    }

    public void setCharacterSpacing(double characterSpacing) {
        this.characterSpacing = characterSpacing;
    }

    /**
     * Sets the desired line spacing
     * 
     * @param lineSpacing - line spacing to be used
     * @author jrb617
     */
    public void setLineSpacing(double lineSpacing) {
        this.lineSpacing = lineSpacing;
        this.boxText.setLineSpacing(this.lineSpacing);
        checkText();
    }

    /**
     * Adds the entered string to the already stored content
     * 
     * @param addend - String to be added to the content
     * @author jrb617
     */
    public void addContent(String addend) {
        this.content = this.content + addend;
        this.boxText.setText(this.content);
        checkText();
    }

    /**
     * Sets the origin point of the text within the box Either the upper left corner
     * or the centre
     * 
     * @param origin - the origin point as an enum
     * @author jrb617
     */
    public void setTextOrigin(Origin origin) {
        switch (origin) {
        case CENTRE:
            this.textOriginCentre = true;
            break;
        case CORNER:
            this.textOriginCentre = false;
            break;
        }
    }

    /**
     * Sets the text alignment within the text box
     * 
     * @param alignment - TextAlignment enum
     */
    public void setTextAlignment(TextAlignment alignment) {
        this.boxText.setTextAlignment(alignment);
    }

    /////////////////////////////////////////////////////////////////////////////

    // Methods for modifying the Text box

    /**
     * Adds the background to the text box
     * 
     * @author jrb617
     */
    public void addBackground() {
        this.boxRectangle.setFill(Color.web(this.backgroundColour.toString(), 1));
    }

    /**
     * Removes the background from the text box
     * 
     * @author jrb617
     */
    public void removeBackground() {
        this.boxRectangle.setFill(Color.web(this.backgroundColour.toString(), 0));
    }

    /**
     * Sets the background colour to the entered hexadecimal value
     * 
     * @param fontColour - hexadecimal background colour
     * @author jrb617
     */
    public void setBackgroundColour(String backgroundColour) {
        if (this.hasBackground) {
            this.backgroundColour = Color.web(backgroundColour);
        }
        else {
            this.backgroundColour = Color.web(backgroundColour, 0);
        }
        this.boxRectangle.setFill(this.backgroundColour);

    }

    /**
     * Sets the background colour to the entered enum value
     * 
     * @param fontColour - Javafx.Color enum colour
     * @author jrb617
     */
    public void setBackgroundColour(Color backgroundColour) {
        if (this.hasBackground) {
            this.backgroundColour = Color.web(backgroundColour.toString());
        }
        else {
            this.backgroundColour = Color.web(backgroundColour.toString(), 0);
        }
        this.boxRectangle.setFill(this.backgroundColour);
    }

    /**
     * Adds the border to the text box
     * 
     * @author jrb617
     */
    public void addBorder() {
        this.boxBorder.setHasBorder(true);
        this.boxRectangle.setStroke(Color.web(this.boxBorder.getBorderColour().toString(), 1));

    }

    /**
     * Removes the border from the text box
     * 
     * @author jrb617
     */
    public void removeBorder() {
        this.boxBorder.setHasBorder(false);
        this.boxRectangle.setStroke(Color.web(this.boxBorder.getBorderColour().toString(), 0));
    }

    /**
     * Sets the width of the border outside the text box
     * 
     * @param width - the width of the exterior border ?@author jrb617
     */
    public void setBorderWidth(int width) {
        this.boxBorder.setBorderWidth(width);
        this.boxRectangle.setStrokeWidth(width);

    }

    /**
     * Sets the colour of the border If the border is not displayed, the colour is
     * stored for when it is
     * 
     * @param Colour - hexadecimal border colour
     * @author jrb617
     */
    public void setBorderColour(String Colour) {
        if (this.boxBorder.getHasBorder()) {
            this.boxBorder.setBorderColour(Color.web(Colour));
        }
        else {
            this.boxBorder.setBorderColour(Color.web(Colour, 0));
        }
        this.boxRectangle.setStroke(this.boxBorder.getBorderColour());
    }

    /**
     * Sets the colour of the border If the border is not displayed, the colour is
     * stored for when it is
     * 
     * @param Colour - Javafx.Color enum colour
     * @author jrb617
     */
    public void setBorderColour(Color colour) {
        if (this.boxBorder.getHasBorder()) {
            this.boxBorder.setBorderColour(Color.web(colour.toString()));
        }
        else {
            this.boxBorder.setBorderColour(Color.web(colour.toString(), 0));
        }
        this.boxRectangle.setStroke(this.boxBorder.getBorderColour());
    }

    /**
     * Sets the margin between the text box perimeter and the text If the margin is
     * larger than half the width/height, no margin is set
     * 
     * @param margin - pixel distance between the wall and the text
     * @author jrb617
     */
    public void setMargin(double margin) {
        if (margin < width / 2 && margin < height / 2) {
            this.margin = margin;
            this.boxText.setX(this.boxPosition.getX() + margin);
            this.boxText.setY(this.boxPosition.getY() + margin);
            this.boxText.setWrappingWidth(this.width - 2 * margin);
        }
        checkText();
    }

    /**
     * Sets the radius of the rounded corner If the radius is larger than the width
     * or height of the box, no radius is set
     * 
     * @param radius - radius of the corner in pixels
     * @author jrb617
     */
    public void setCornerRadius(double radius) {
        this.boxRectangle.setArcHeight(radius);
        this.boxRectangle.setArcWidth(radius);
        checkCornerRadius();
    }

    /**
     * Returns the rectangle object for the background of the text box
     * 
     * @return - rectangle object for the displayed box
     * @author jrb617
     */
    public Rectangle returnBox() {
        return boxRectangle;
    }

    /**
     * Returns the text object for the displayed text
     * 
     * @return - text object for the displayed text
     * @author jrb617
     */
    public Text returnText() {
        checkText();
        return this.boxText;
    }

    /**
     * Returns a pane containing both the text object and the rectangle object
     * 
     * @return - pane containing the text object for the displayed text and the
     *         rectangle object for the background.
     * @author jrb617
     */
    public Pane returnTextBox() {
        this.pane = new Pane(this.boxRectangle, this.boxText);
        return this.pane;

    }

    /**
     * Draws the complete text box on the passed in pane
     * 
     * @param pane - the Pane for the text box to be drawn on
     * @author jrb617
     */
    public void drawTextBox(Pane pane) {
        checkText();
        this.pane = new Pane(this.boxRectangle, this.boxText);
        pane.getChildren().add(this.pane);
    }

    /**
     * Undraws the complete text box
     * 
     * @param pane - the Pane for the text box to be drawn on
     * @author jrb617
     */
    public void undrawTextBox(Pane pane) {
        pane.getChildren().remove(this.pane);
    }

    /**
     * Sets the delays for displaying the text box for a limited time
     * 
     * @param pane     - The pane for the text box to be drawn on
     * @param onDelay  - the delay before the text box is drawn
     * @param offDelay - the delay before the text box is removed
     * @author jrb617
     */
    public void setDelay(Pane pane, double onDelay, double offDelay) {
        checkText();
        this.pane = new Pane(this.boxRectangle, this.boxText);
        PauseTransition delay = new PauseTransition(Duration.seconds(onDelay));
        delay.setOnFinished(e -> pane.getChildren().add(this.pane));
        delay.play();
        PauseTransition delay2 = new PauseTransition(Duration.seconds(offDelay));
        delay2.setOnFinished(e -> pane.getChildren().remove(this.pane));
        delay2.play();
    }

    /////////////////////////////////////////////////////////////////////////////

    // Private Methods

    /**
     * Offsets the coordinate system is using central origin
     * 
     * @author jrb617
     */
    private void checkOffset() {
        if (this.offset.getX() != 0 || this.offset.getY() != 0) {
            this.boxPosition.setX(this.boxPosition.getX() + this.offset.getX());
            this.offset.setX((int) (this.width / 2));
            this.boxPosition.setX(this.boxPosition.getX() - this.offset.getX());
            this.boxText.setX(this.boxPosition.getX() + margin);
            this.boxRectangle.setX(this.boxPosition.getX());
            this.boxPosition.setY(this.boxPosition.getY() + this.offset.getY());
            this.offset.setY((int) (this.height / 2));
            this.boxPosition.setY(this.boxPosition.getY() - this.offset.getY());
            this.boxText.setY(this.boxPosition.getY() + margin);
            this.boxRectangle.setY(this.boxPosition.getY());
        }
    }

    /**
     * Checks that the text is not too large for the box and sizes it down to fit
     * 
     * @author jrb617
     */
    private void checkText() {

        this.boxText.setFont(new Font(this.font.getName(), this.fontSize));
        if (this.boxText.getLayoutBounds().getHeight() > (this.height - 2 * margin)) {
            int i = this.fontSize;
            this.boxText.setFont(new Font(this.font.getName(), i));

            while (this.boxText.getLayoutBounds().getHeight() > (this.height - 2 * margin)) {

                i--;

                this.boxText.setFont(new Font(this.font.getName(), i));
            }
        }

        if (textOriginCentre) {
            this.boxText.setY(
                    (boxText.getY() - margin + this.height / 2 - (this.boxText.getLayoutBounds().getHeight() / 2)));
        }

    }

    /**
     * Checks that the corner radius is still valid after a change Removes the
     * radius if invalid
     * 
     * @author jrb617
     */
    private void checkCornerRadius() {

        if (this.boxRectangle.getArcHeight() > height || this.boxRectangle.getArcWidth() > width) {
            this.boxRectangle.setArcHeight(0);
            this.boxRectangle.setArcWidth(0);
        }
    }

    /**
     * Checks that the margin is still valid after a change Removes the margin if
     * invalid
     * 
     * @author jrb617
     */
    private void checkMargin() {

        if (margin >= width / 2 || margin >= height / 2) {
            this.margin = 0;
            this.boxText.setX(this.boxPosition.getX() + margin);
            this.boxText.setY(this.boxPosition.getY() + margin);
            this.boxText.setWrappingWidth(this.width - 2 * margin);
        }
    }

}