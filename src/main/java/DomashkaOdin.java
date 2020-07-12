import java.math.BigDecimal;

public class DomashkaOdin {

    public static void main(String[] args) {
        calculatePixels( 800, 600);
        calculateNumberOfStones(1550000, 800);

    }

        public static void calculatePixels( int width, int height) {
        System.out.println(width * height);

    }

        public static void calculateNumberOfStones( int squareOfRoadSurface, int squareOfOneStone) {
            calculateSquareOfRoadSurfaceCm(500, 3100);
            calculateSquareOfOneStoneCm(20, 40);
            System.out.println(squareOfRoadSurface / squareOfOneStone);
    }

        public static void calculateSquareOfRoadSurfaceCm(int roadWidth, int roadLength) {
            int squareOfRoadSurface = roadWidth * roadLength;
    }

        public static void calculateSquareOfOneStoneCm(int stoneWidth, int stoneLength) {
            int squareOfOneStone = stoneWidth * stoneLength;
    }


}








