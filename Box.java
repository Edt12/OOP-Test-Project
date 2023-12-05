public class Box {
    private Point topRight;
    private Point lowerLeft;

    boolean overlapsX = false;
    boolean overlapsY = false;

    //Constructor
    public Box(Point topRight, Point lowerLeft) {
        setTopRight(topRight);
        setLowerLeft(lowerLeft);
    }

    //Calculates Height of box
    public int calcHeight() {
        return topRight.getyCoordinate() - lowerLeft.getyCoordinate();
    }

    //Calculates width of box
    public int calcWidth() {
        return topRight.getxCoordinate() - lowerLeft.getxCoordinate();

    }

    public boolean isOverlapsX(Box boxTwo, Point topRight, Point lowerLeft) {
        boolean overlapsX = true;
        Point boxTwoTopRight = boxTwo.getTopRight();
        Point boxTwoLowerLeft = boxTwo.getLowerLeft();
        if (boxTwoTopRight.getxCoordinate() <= lowerLeft.getxCoordinate()
                && boxTwoTopRight.getxCoordinate() >= topRight.getxCoordinate()) {
            overlapsX = false;
        } else if (boxTwoLowerLeft.getxCoordinate() <= lowerLeft.getxCoordinate()
                && boxTwoLowerLeft.getxCoordinate() >= topRight.getxCoordinate()) {
            overlapsX = false;
        }
        return overlapsX;
    }

    public boolean isOverlapsY(Box boxTwo, Point topRight, Point lowerLeft) {
        boolean overlapsY = true;
        Point boxTwoTopRight = boxTwo.getTopRight();
        Point boxTwoLowerLeft = boxTwo.getLowerLeft();
        if (boxTwoTopRight.getyCoordinate() <= lowerLeft.getyCoordinate()
                && boxTwoTopRight.getyCoordinate() >= topRight.getyCoordinate()) {
            overlapsY = false;
        } else if (boxTwoLowerLeft.getyCoordinate() <= lowerLeft.getyCoordinate()
                && boxTwoLowerLeft.getyCoordinate() >= topRight.getyCoordinate()) {
            overlapsY = false;
        }
        return overlapsY;
    }



    public Point getTopRight() {
        return topRight;
    }

    public void setTopRight(Point topRight) {
        this.topRight = topRight;
    }

    public Point getLowerLeft() {
        return lowerLeft;
    }

    public void setLowerLeft(Point lowerLeft) {
        this.lowerLeft = lowerLeft;
    }
}
