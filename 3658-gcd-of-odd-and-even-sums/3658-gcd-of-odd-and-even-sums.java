class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddsum = 0;
        int evensum = 0;
        int oddcount = 0;
        int evencount = 0;
        int i =1;
        while((evencount<n)||(oddcount<n)){
            if(i%2==0){
                if(evencount<n){
                    evencount++;
                    evensum+=i;
                }
            }
            else{
                if(oddcount<n){
                    oddcount++;
                    oddsum+=i;
                }
            }
            i++;
        }
        while(evensum!=0){
            int temp = evensum;
            evensum = oddsum%evensum;
            oddsum = temp; 
        }
        return oddsum;
    }
}