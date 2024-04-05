# Text-Library
A library to display Text on a JavaFX window



## Library Outline

### Features

**TextBox**

- Change font
- Adjust font size
- Change font colour
- Adjust line spacing
- Adjust character spacing
- Display text within a text box
- Adjust the position of text boxes
- Adjust the width & height of a text box
- Change the text within a text box
- Change the font within a text box
- Add or remove a border of the text box
- Adjust textbox border width and colour
- Adjust how long text is displayed on the screen for 0 - infinite


### Class Structure

- `TextBox{}`
- `Position()`
- `Border()`

### Method & Field Definitions

#### TextBox Class:

**Fields:**

- `private double width;` - Width of the TextBox
- `private double height;` - Height of the TextBox
- `private String content;` - Content(text) to be displayed in the TextBox
- `private Font font;` - Font used in the TextBox
- `private Colour fontColour;` - Colour of displayed text
- `private int fontSize;` - Font size of the text in the TextBox
- `private String backgroundColour;` - Background Colour of the text box
- `private double characterSpacing;` - Character spacing of the text
- `private double lineSpacing;` - Line spacing of the text  
- `private Position boxPosition;` - Text box top left corner position
- `private Border boxBorder;` - Border Field to store border data
- `private Text boxText;` - Text field for the text content
- `private Rectangle boxRectangle;` - Rectangle field for the text box background
- `private double margin;` - The padding between the text box border and the text
- `private Position offset;` - The offset to move the origin to the centre
- `private boolean textOriginCentre;` - Whether the text origin is at the centre
- `private Pane pane;` - The pa

**Constructors:**

- `publicTextBox();`
  - Constructor with default values

- `public TextBox(int positionX, int positionY);`
  - Constructor with defined X and Y positions
  -`@param positionX` X position of the text box origin
  -`@param positionY` Y position of the text box origin

- `public TextBox(int positionX, int positionY, String content);`
  - Constructor with defined X and Y positions, and content
  -`@param positionX` X position of the text box origin
  -`@param positionY` Y position of the text box origin
  -`@param content` The text content to be displayed
  
- `public TextBox(double width, double height);`
  - Constructor with defined width and height
  -`@param width` The width of the text box
  -`@param height` The height of the text box

- `public TextBox(int positionX, int positionY, double width, double height);`
  - Constructor with defined width, height, and X and Y positions
  -`@param positionX` X position of the text box origin
  -`@param positionY` Y position of the text box origin
  -`@param width` The width of the text box
  -`@param height` The height of the text box
  
- `public TextBox(int positionX, int positionY, double width, double height, String content);`
  - Constructor with defined width, height, content, and X and Y positions
  -`@param positionX` X position of the text box origin
  -`@param positionY` Y position of the text box origin
  -`@param width` The width of the text box
  -`@param height` The height of the text box
  -`@param content` The text content to be displayed
  
- `public TextBox(int positionX, int positionY, double width, double height, String content, String font, String fontColour, int fontSize, double lineSpacing, double characterSpacing, String backGroundColour, String borderColour, int borderWidth, int margin, double cornerRadius);`
  - Completely customised constructor
  -`@param positionX` X position of the text box origin
  -`@param positionY` Y position of the text box origin
  -`@param width` The width of the text box
  -`@param height` The height of the text box
  -`@param content` The text content to be displayed
  -`@param font` The font of the text 
  -`@param fontColour` The colour of the text
  -`@param fontSize` The size of the text
  -`@param lineSpacing` The line spacing of the text
  -`@param characterSpacing` The character spacing of the text
  -`@param borderColour` The colour of the text box border
  -`@param borderWidth` The width of the text box border
  -`@param margin` The padding between the border and the text
  -`@param cornerRadius` The radius of the rounded corners 

**Methods:**

- `public void setWidth(double width);`
  - Set the width of the TextBox.
  - `@param width` The width of the TextBox.

- `public void setHeight(double height);`
  - Set the height of the TextBox.
  - `@param height` The height of the TextBox.
   
- `public void setPositionX(int positionX);`
  - Sets the X position of the text box.
  - `@param positionX` The new X position of the top left corner of the text box

- `public void setPositionY(int positionY);`
  - Sets the Y position of the text box.
  - `@param positionY` The new Y position of the top left corner of the text box
   
- `public void setOrigin(Origin origin);`
  - Sets the text origin of the text box
  - `@param origin` The origin of the text box as an enum

- `public void setContent(String text);`
  - Set the content (text) of the TextBox.
  - `@param text` The content (text) to be displayed in the TextBox.

- `public void setFont(String font);`
  - Set the font of the TextBox.
  - `@param font` The font to be used in the TextBox.

- `public void setFontColour(String fontColour);`
  - Set the colour of the text content.
  - `@param fontColour` The colour to be used for the text in the textbox.

- `public void setFontColour(Color fontColour);`
  - Set the colour of the text content.
  - `@param fontColour` The colour of the text given in Color format.
  
- `public void setFontSize(int fontSize);`
  - Set the font size of the TextBox.
  - `@param size` The font size of the TextBox.
  
- `public void setCharacterSpacing(double characterSpacing);`
  - Set the spacing of the text in the box.
  - `@param spacing` The spacing between the characters.

- `public void setLineSpacing(double lineSpacing);`
  - Set the spacing of the lines of text in the box.
  - `@param spacing` The spacing between the lines.

- `public void addContent(String addend);`
  - Adds extra text to the end of the currently displayed text.
  - `@param addend` The extra text to be added to the current text.

- `public void setBackgroundColour(String colour);`
  - Sets the background colour of the text box.
  - `@param colour` The new background colour of the text box.  

- `public void setTextOrigin(Origin origin);`
  - Sets the text origin of the text within the box.
  - `@param textOrigin` The text origin of the text

- `public void setTextAlignment(TextAlignment alignment);`
  - Sets the alignment of the text within the box.
  - `@param alignment` The alignment of the text.

- `public void setBackgroundColour(String backgroundColour);`
  - Sets the background colour of the TextBox.
  - `@param backgroundColour` The background colour of the TextBox.
  
- `public void setBackgroundColour(Color backgroundColour);`
  - Sets the background colour of the TextBox.
  - `@param backgroundColour` The background colour of the TextBox as a javafx Color.

- `public void addBorder();`
  - Adds a border to the text box.
  
- `public void removeBorder();`
  - Removes the border of the text box.  

- `public void addBackground();`
  - Adds a background to the TextBox.

- `public void removeBackground();`
  - Removes a background to the TextBox.

- `public void setBorderWidth(double width);`
  - Sets the width of the text box's border.
  - `@param width` The width of the text box's border.

- `public void setBorderColour(String colour);`
  - Sets the colour of the text box's border.
  - `@param colour` The colour of the text box's border.
  
- `public void setBorderColour(Color colour);`
  - Sets the colour of the text box's border.
  - `@param colour` The colour of the text box's border as a javafx Color.  

- `public void setMargin(double margin);`
  - Sets the margin size of the TextBox.
  - `@param margin` The size of the margin.
  
- `public void setCornerRadius(double radius);`
  - Sets the corner radius of the TextBox so that they can have rounded corners.
  - `@param radius` The radius of the rounded corners.  

- `public Rectangle returnBox();`
  - Returns the value of the boxRectangle field.

- `public Text returnText();`
  - Returns the value of the field boxText
  
- `public Pane return returnTextBox();`
  - returns the text boxText and boxRectangle Fields on a pane
  
- `public void drawTextBox(Pane pane);`
   - draws the text box on the entered pane
   - `@param pane` The Pane to be drawn on
  
- `public void setDelay(Pane pane, double onDelay, double offDelay);`
  - Displays the text box for the designated period of time
  - `@param pane` The Pane to be drawn on
  - `@param onDelay` The delay before the text box is displayed
  - `@param offDelay` The delay before the text box is removed
  




#### Position Class:

**Fields:**

- `private int x;` - x-coordinate of the position
- `private int y;` - y-coordinate of the position

**Methods:**

- `public Position(int xPos, int yPos);`
	- Constructor initialses x and y position of top left corner of TextBox.

- `public void setX(int xPos);`
	- Set position of TextBox.
	-`@param xPos` The x-position of the top left corner of the TextBox.
	
- `public void setY(int yPos);`
	- set y-position of TextBox.
	-`@param yPos` The y-position of the top left corner of the TextBox.
	
- `public int getX();`
	- Get x-position of TextBox.
	
- `public int getY();`
	- Get y-position of TextBox.


#### Border Class:

**Fields:**

- `private boolean hasBorder;` - Indicates whether the TextBox has a border
- `private int borderWidth;` - Width of the border
- `private String borderColour;` - Colour of the border

**Methods:**
- `public Border();`
  - Constructor that initialises a border with default values

- `public Border(int width, String borderColour, boolean hasBorder);`
  - Constructor that initialises the border of the textbox.
  - `@param width` The width of the border.
  - `@param borderColour` The colour of the border.
  - `@param hasBorder` Whether the text box has a border.
  
- `public void setHasBorder(boolean hasBorder);`
  - Set whether the TextBox has a border.
  - `@param hasBorder` Indicates whether the TextBox should have a border.

- `public void setBorderWidth(int width);`
  - Set the width of the border.
  - `@param width` The width of the border.

- `public void setBorderColour(Color colour);`
  - Set the colour of the border.
  - `@param colour` The colour of the border.

- `public Color getBorderColour();`
  - Gets the colour of the border.
  
- `public int getBorderWidth();`
  - Gets the width of the border.
   
- `public boolean getHasBorder();` 
  - Gets whether there is or is not a border.
