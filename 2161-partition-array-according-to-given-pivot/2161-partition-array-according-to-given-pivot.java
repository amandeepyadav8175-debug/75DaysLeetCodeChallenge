class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int lesscount=0;
        int pivotcount=0;
        int greatercount=0;
        for(int num:nums){
            if(num<pivot){
                lesscount++;
            }else if(num> pivot){
                greatercount++;
            }else{
                pivotcount++;
            }
        }
        int i=0;
        int j=lesscount;
        int k= lesscount+ pivotcount;
        int res[]= new int[nums.length];
        for(int num:nums){
            if(num<pivot){
                res[i]= num;
                i++;
            }else if(num>pivot){
                res[k]= num;
                k++;
            }else{
                res[j]= num;
                j++;
            }
        }
        return res;
        
    }
}