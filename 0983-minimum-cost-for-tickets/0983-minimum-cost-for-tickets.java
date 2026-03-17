class Solution {
     HashSet<Integer> set= new HashSet<>();
    public int mincostTickets(int[] days, int[] costs) {
        for(int day:days){
            set.add(day);
        }
        int lastday=days[days.length-1]+30;
        int dp[]=new int[lastday+1];
        Arrays.fill(dp,-1);
        return recur(days,costs,days[0],dp);
       
        
    }
    public int recur(int[] days,int[] costs,int currday,int dp[]){// currdays=i
        if(currday>days[days.length-1]) return 0;
        if(dp[currday]!=-1) return dp[currday];

        if(!set.contains(currday)){
            return dp[currday]= 0+recur(days,costs,currday+1,dp);
        }
        int day1=costs[0]+recur(days,costs,currday+1,dp);
        int day2=costs[1]+recur(days,costs,currday+7,dp);
        int day3=costs[2]+recur(days,costs,currday+30,dp);
        return dp[currday]=Math.min(day1,Math.min(day2,day3));
    }
}