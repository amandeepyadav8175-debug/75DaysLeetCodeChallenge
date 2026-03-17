class Solution {
     HashSet<Integer> set= new HashSet<>();
    public int mincostTickets(int[] days, int[] costs) {
        for(int day:days){
            set.add(day);
        }
        int lastday=days[days.length-1]+30;
        int dp[]=new int[lastday+1];
       for(int day=days[days.length-1];day>=0;day--){
        if(!set.contains(day)){
             dp[day]= 0+dp[day+1];//recur(days,costs,day+1,dp);
            continue;
        }
        int day1=costs[0]+dp[day+1];//recur(days,costs,day+1,dp);
        int day2=costs[1]+dp[day+7];//recur(days,costs,day+7,dp);
        int day3=costs[2]+dp[day+30];//recur(days,costs,day+30,dp);
        dp[day]=Math.min(day1,Math.min(day2,day3));

       }
        return  dp[days[0]];//recur(days,costs,days[0],dp);
       
    }
    }
   