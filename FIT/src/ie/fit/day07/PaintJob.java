package ie.fit.day07;

public class PaintJob {

    public static void main(String[] args) {

        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        int buckets = (int) areaPerBucket;
        int count = buckets - extraBuckets;

        if (width <= 0) {
            return -1;
        } else if (height <= 0) {
            return -1;
        } else if (areaPerBucket <= 0) {
            return -1;
        } else if (extraBuckets < 0) {
            return -1;
        } else {
            return count;
        }
    }
}
