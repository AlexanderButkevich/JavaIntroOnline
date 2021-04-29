package by.epam.training_center.decomposition;

public final class Task4 {
    public static Result getMaxDistPoints(double[][] points) {
        double[] point1 = null;
        double[] point2 = null;
        double distance = 0;
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double newDistance = getDistance(points[i], points[j]);
                if (newDistance > distance) {
                    distance = newDistance;
                    point1 = points[i];
                    point2 = points[j];
                }
            }
        }
        return new Result(point1, point2, distance);
    }

    private static double getDistance(double[] a, double[] b) {
        return Math.sqrt(Math.pow(a[0]-b[0], 2) + Math.pow(a[1]-b[1], 2));
    }

    public static class Result {
        private final double[] point1;
        private final double[] point2;
        private final double distance;

        public Result(double[] point1, double[] point2, double distance) {
            this.point1 = point1;
            this.point2 = point2;
            this.distance = distance;
        }

        public double[] getPoint1() {
            return point1;
        }

        public double[] getPoint2() {
            return point2;
        }

        public double getDistance() {
            return distance;
        }
    }
}
