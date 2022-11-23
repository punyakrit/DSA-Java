package DSA_Question;

/*no water can be trapped if in accending or decending order
min no bars required are 2
water is stored between 3 bars in space of lowest bar\\

//                  logic
take max of both left and right bar height
then take min of both the values and substract the value of bar init the value we will be amount of water stored
Trapped Water = (max left , max right)
value that is least - (boundary size)

 */


public class TrappingRainwater {

    public static int trappingRainWater(int height[]){
        //calculate left max boundary array
        int n = height.length;
        int left[] = new int[n];
        left[0] = height[0];
        for (int i = 1; i < n; i++) {
            left[i]=Math.max(height[i] , left[i-1]);
        }
        //calculate right max boundary array

        int right[] = new int[n];
        right[n-1] = height[n-1];
        for (int i = n-2; i >=0; i--) {
            right[i]=Math.max(height[i] , left[i+1]);
        }

        int trappedwater =0;
//        /loop
        for (int i = 0; i <n ; i++) {
            int waterlevel = Math.min(left[i] , right[i]);
            trappedwater += waterlevel-height[i];
        }
        return trappedwater;
    }


    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int water = trappingRainWater(height);
        System.out.println("water level = "+water);
    }
}
