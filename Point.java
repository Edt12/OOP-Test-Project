public class Point {

    static final String X_COORD_MSG = " X Coordinate ";
    static final String Y_COORD_MSG = " Y Coordinate ";

    private int xCoordinate;
    private int yCoordinate;

    //Constructor
    public Point(int xCoordinate,int yCoordinate){
        setyCoordinate(yCoordinate);
        setxCoordinate(xCoordinate);
    }
    //sets x Coordinate
    public void setxCoordinate(int xCoordinate) {
            this.xCoordinate = xCoordinate;
    }


    //Sets Y Coordinate
    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
    //gets x Coordinate
    public int getxCoordinate() {
        return xCoordinate;
    }
    //Gets y Coordinate
    public int getyCoordinate() {

        return yCoordinate;
    }
    //Overrides tostring method to print coords instead
    @Override
    public String toString(){
        return (getxCoordinate() +X_COORD_MSG+ getyCoordinate() + Y_COORD_MSG);


    }
    

}
