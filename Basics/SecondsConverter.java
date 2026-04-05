public class SecondsConverter {
    public static void main (String args[]){
        int totalSeconds = 87939;

        int hours = totalSeconds/3600;
        int remAfterHours= totalSeconds%3600;
        int minutes = remAfterHours/60;
        int seconds = remAfterHours%60;

        System.out.println(totalSeconds + " seconds = " + hours + " hours, " + minutes + " minutes and " + seconds + " seconds");
    }
}
