package Week1.Classes;

public class Rectangle {
    // fields
    private Integer width;
    private Integer height;
    private String color = "Blue";

    // constructor
    public Rectangle(Integer width, Integer height, String color) {
        if (width >= 1) {
            this.width = width;
        } else {
            this.width = 1;
        }

        if (height >= 1) {
            this.height= height;
        } else {
            this.height = 1;
        }
        
        if (color.isEmpty()) {
            this.color = "Blue";
        } else {
            this.color = color;
        }
    }

    // public Rectangle(Integer width, Integer height) {
    //     Rectangle(width, height, "Blue");
    // }

    /**
     * @return the width
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * @return the height
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    public void draw() {
        // String s = "";
        for (int i = 0; i < height; i++) {
            String s = "";
            for (int j = 0; j < width; j++) {
                s = s.concat("B");
            }
            System.out.println(s);
        }
        System.out.println(color);
    }
}
