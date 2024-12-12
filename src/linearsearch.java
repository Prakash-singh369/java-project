public class linearsearch {
    public static void main(String[] args) {
        int[] arr = {12, 25, 2, 62, 42, 53, 52};
        int target = 53;
        System.out.println(searchRange(arr,target,1,6));
    }
    static int searchRange(int [] arr ,int target , int start ,int end){
        if(arr.length == 0){
            return -1;
        }
        for (int index = start ; index<=end;index++){
            int element = arr[index];
            if (element==target){
                return index;
            }
        }
        return 0;

    }


}
