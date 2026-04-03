class Solution {
    public void sortColors(int[] arr) {
    int n = arr.length;      

        // Outer loop to traverse the array
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
              
                // If the current element is greater
                // than the next element
                if (arr[j] > arr[j + 1]) {
                  
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // Set swapped to true
                }
            }

            // If no two elements were swapped by inner loop,
            // then break the loop
            if (!swapped)
                break;
    }  
    }
}