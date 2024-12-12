public class findmin {
    public static void main(String[] args){
        int [] arr = {12,45,25,25,26,2,2,6};
        System.out.println(searchmin(arr));

    }
//    assume arry not empty
    static int searchmin(int [] arr ){
        int ans = arr[0];
        for (int i =1 ; i < arr.length; i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;

    }
    }


