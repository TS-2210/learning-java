public class LargestElement{
    public static void main(String[]args){
        largestElement(new int[]{1, 4, 66, 19, 100, 31});
    }
    public static void largestElement(int[] arr){
        int largest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}