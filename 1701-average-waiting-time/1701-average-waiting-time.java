class Solution {
    public double averageWaitingTime(int[][] customers) {
        int idletime=1;
        long totalwaitingtime=0;
        for(int cust[]: customers){
            if(idletime<= cust[0]){
                idletime=cust[0]+cust[1];
            }else{
                idletime+= cust[1];
            }
            totalwaitingtime+=(idletime-cust[0]);
            

        }
        double avg= (double)totalwaitingtime/ customers.length;
        return avg;
        
    }
}