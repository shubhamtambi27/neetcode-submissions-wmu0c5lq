class Solution {
    public void reverseString(char[] arr) {
        int i = 0, j = arr.length - 1;

        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(char l:arr){
            System.out.print(l);
        }
        
    }
}