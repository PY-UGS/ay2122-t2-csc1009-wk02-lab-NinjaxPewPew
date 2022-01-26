public class Lab2Time {
    public static void main(String[] args) {
        float totalMilliseconds = System.currentTimeMillis();
        float totalSeconds =  totalMilliseconds/1000 ;
        float currentSeconds = totalSeconds % 60;
        float totalMinutes = totalSeconds/60;
        float currentMinutes = totalMinutes % 60;
        float totalHours = totalMinutes/60 ;
        float currentHours = totalHours % 24 ;

        System.out.print("The current time is " + Math.round(Math.floor(currentHours)) + ":" + Math.round(Math.floor(currentMinutes)) + ":" + Math.round(Math.floor(currentSeconds)) + " GMT");


    }
}
