import java.util.*;
public class DequeClass {
    int dequeProcess(ArrayDeque<Integer> deque, int subsetSize){

        HashSet<Integer> identical = new HashSet<>();
        ArrayList<Integer> uniqueSizesList = new ArrayList<>();

        int subsetsNumber = deque.size() - subsetSize + 1;
        for (int i = 0; i < subsetsNumber; i++) {
            Object[] deqAsArray = deque.toArray();
            int loopCount = deque.size()-1;
            for (int j = 0; j < subsetSize; j++) {
                identical.add((Integer) deqAsArray[loopCount-j]);
            }
            deque.removeLast();
            uniqueSizesList.add(identical.size());
            identical.clear();
        }
        return determineMax(uniqueSizesList);
    }
    // Look for the highest number
    int determineMax(ArrayList<Integer> uniqueSizes){
        int maximum = 0;
        for(Integer num : uniqueSizes){
            if(num > maximum){
                maximum = num;
            }
        }
        return maximum;
    }
}
