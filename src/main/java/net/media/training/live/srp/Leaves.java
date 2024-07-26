package net.media.training.live.srp;

public class Leaves {
    public int leavesTaken;
    public int totalLeaveAllowed;
    public int[] leavesLeftPreviously;
    public int leaveTaken;

    public Leaves(int leavesTaken, int []leavesLeftPreviously){
        this.leaveTaken=leavesTaken;
        this.leavesLeftPreviously=leavesLeftPreviously;
    }

    public int calculateTotalLeaveLeftPreviously(int years, int yearsInOrg){
        int totalLeaveLeftPreviously = 0;
        for (int i = 0; i < years; i++) {
            totalLeaveLeftPreviously += this.leavesLeftPreviously[yearsInOrg-i-1];
        }
        return totalLeaveLeftPreviously;
    }


}
