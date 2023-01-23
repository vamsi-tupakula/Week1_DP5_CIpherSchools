public class MinimumNumberOfPlatForms {
    public static int minPlatforms(int[] arr, int[] dep) {
        int result = 1;
        int arrivalIndex = 1;
        int departureIndex = 0;
        int platforRequired = 1;

        while (arrivalIndex < arr.length && departureIndex < dep.length) {
            int currArrivalTime = arr[arrivalIndex];
            int currDepartureTime = dep[departureIndex];

            if (currArrivalTime <= currDepartureTime) {
                platforRequired++;
                arrivalIndex++;
            } else {
                platforRequired--;
                departureIndex++;
            }

            if (platforRequired > result) {
                result = platforRequired;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] arr = {900,915,1100};
        int[] dep = {1000,1105,1200};
        System.out.println(minPlatforms(arr,dep));
    }
}