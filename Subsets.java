import java.util.*;

public class Subsets {
    public static void generateAllSubSets(int[] arr,ArrayList<Integer> ans, int begin) {
        if (begin == arr.length) {
            printList(ans);
            return;
        }
        generateAllSubSets(arr, ans, begin + 1);
        ans.add(arr[begin]);
        generateAllSubSets(arr, ans, begin + 1);
        ans.remove(ans.size() - 1);
    }
    private static void printList(ArrayList<Integer> ans) {
        for (int num : ans) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        ArrayList<Integer> newAns = new ArrayList<>();
        generateAllSubSets(arr, newAns, 0);
    }
}