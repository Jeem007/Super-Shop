
package classes;
public class ShopInfo {
   
    protected double dailyavgincome;
    protected  double monthlyavgincome;
    protected double yearlyavgincome;
    protected double weeklyavgincome;
    protected double cashbox;
    protected double profit;
    protected double loss;

   

    public double getDailyavgincome() {
        return dailyavgincome;
    }

    public void setDailyavgincome(double dailyavgincome) {
        this.dailyavgincome = dailyavgincome;
    }

    public double getMonthlyavgincome() {
        return monthlyavgincome;
    }

    public void setMonthlyavgincome(double monthlyavgincome) {
        this.monthlyavgincome = monthlyavgincome;
    }

    public double getYearlyavgincome() {
        return yearlyavgincome;
    }

    public void setYearlyavgincome(double yearlyavgincome) {
        this.yearlyavgincome = yearlyavgincome;
    }

    public double getWeeklyavgincome() {
        return weeklyavgincome;
    }

    public void setWeeklyavgincome(double weeklyavgincome) {
        this.weeklyavgincome = weeklyavgincome;
    }

    public double getCashbox() {
        return cashbox;
    }

    public void setCashbox(double cashbox) {
        this.cashbox = cashbox;
    }


    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public double getLoss() {
        return loss;
    }

    public void setLoss(double loss) {
        this.loss = loss;
    }
    
    public ShopInfo(double dailyavgincome, double monthlyavgincome, double yearlyavgincome,double weeklyavgincome, double cashbox,double profit, double loss) {
        
        this.dailyavgincome = dailyavgincome;
        this.monthlyavgincome = monthlyavgincome;
        this.yearlyavgincome = yearlyavgincome;
        this.weeklyavgincome = weeklyavgincome;
        this.cashbox = cashbox;
        this.profit = profit;
        this.loss = loss;
    }
    void ShopStatemnet(){
        System.out.println("Available cash in the shop          : "+cashbox);
        System.out.println("Daily Average income                : "+dailyavgincome);
        System.out.println("Montly Average income               : "+monthlyavgincome);
        System.out.println("Yearly Average income               : "+yearlyavgincome);
        System.out.println("Weekly Average income               : "+weeklyavgincome);
        System.out.println("Profit                              : "+profit);
        System.out.println("Loss                                : "+loss);
    }


    
}
