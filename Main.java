public class Main {
    public static void main(String[] args) {
        Point pointOne = new Point(4,5);
        System.out.println(pointOne.toString());
        Point pointTwo = new Point(1,2);

        Box boxOne = new Box(pointOne,pointTwo);
        System.out.println(boxOne.getlowerLeft());

        System.out.println(boxOne.calcHeight());
        System.out.println(boxOne.calcWidth());

        Point pointOneBoxTwo = new Point(5,3);
        Point pointTwoBoxTwo = new Point(1,5);

        Box boxTwo = new Box(pointOneBoxTwo, pointTwoBoxTwo);

        System.out.println(boxTwo.calcWidth());
    }
}
