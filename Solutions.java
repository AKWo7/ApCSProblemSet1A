
public class Solutions
{
    
    public void celsuisToFahrenheit(){
        double celsuis = 30.0, fahrenheit = 0.0;
        
        fahrenheit = (celsuis * 1.8) + 32;
        System.out.println( celsuis+"°C = "+fahrenheit+"°F");
        
    }
    
    public void elapsedTime(){
        int hours = 12;
        int minutes = 0;
        int seconds = 0;
        
        int timepast = (hours * 3600) + (minutes * 60) + seconds;
        int timeleft = 86400 - timepast;
        double percent = (timepast/86400.0) * 100;
        
        System.out.print("The current time is " +hours+":"+minutes+":"+seconds+". ");
        System.out.println("It has been "+timepast+" seconds since the day began.");
        System.out.println("There are " + timeleft + " seconds left in the day.");
        System.out.println("The day is "+percent+"% done.");
        
    }
    
    public void secondsToHMS(){
        int seconds = 5000;
        int hours = seconds/3600;
        int minutes = (seconds%3600)/60;
        int second = (seconds%3600)%60;
        
        
        System.out.println(seconds+" seconds = "+hours+" hours, "+minutes+" minutes, and "+second+" seconds.");
    }
}
