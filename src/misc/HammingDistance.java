package misc;

public class HammingDistance {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int smallestDistance =-1;
        int smallestIndex =-1;
        for(int i =0; i<points.length;i++) {
            int [] point = points[i];
            if(point[0]== x || point [1]==y) {
                int manhattanDistance  = Math.abs(point[0]-x) + Math.abs(point[1]-y);
                if(smallestDistance ==-1) {
                    smallestDistance = manhattanDistance;
                    smallestIndex = i;
                } else if(manhattanDistance < smallestDistance) {
                    smallestDistance = manhattanDistance;
                    smallestIndex = i;
                }

            } else {
                continue;
            }

        }
        return  smallestIndex;
    }

    public static void main(String[] args) {
        HammingDistance hammingDistance = new HammingDistance();
        int [][]  a = {
                {1, 2},
                {3, 1},
                {2, 4},
                {2, 3},
                {4,4}
        };
       int distamce =  hammingDistance.nearestValidPoint(3,4, a );
        System.out.println(distamce);
    }

}
