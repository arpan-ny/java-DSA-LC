import java.util.Arrays;
class ShuffleArray{
   public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int counter = -1;
        for (int i = 0; i<n;i++){
            arr[++counter] = nums[i];
            arr[++counter] = nums[n+i];
        }
        return arr;
    }
    public static void main(String[] args) {
      ShuffleArray obj = new ShuffleArray();
      int[] arr = {2,3,4,5,6,7};
      System.out.print(Arrays.toString(obj.shuffle(arr,arr.length/2)));

    }
}
