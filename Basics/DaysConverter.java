public class DaysConverter {
    public static void main(String args[]){
        int totalDays = 1000;

        int years = totalDays/365;
        int remAfterYears = totalDays%365;
        int weeks = remAfterYears/7;
        int days= remAfterYears%7;

        System.out.println(totalDays+" days is approximately "+years+" years, "+weeks+" weeks and "+days+" days.");
    }
}
