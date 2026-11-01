class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Deque<Float> deque = new ArrayDeque<>();
        int size = position.length;
        int ans=0;
        int [][]arr = new int[size][2];
        for(int i=0; i<size ;i++){
            arr[i][0] = position[i];
            arr[i][1] = speed[i];
        }
        // 10 8 5 3 0
        // 2 4 1 3 1
        // 1 1 7 3 12
        Arrays.sort(arr,Comparator.comparingInt(a -> a[0]));
        for(int i=size-1; i>=0; i--){
          float timeTaken =(float) (target - arr[i][0])/arr[i][1];
          ans++;
          if( !deque.isEmpty() && deque.peek() >= timeTaken){
                continue;
            }
         deque.push(timeTaken);
        }
        return deque.size();
    }
}
