public class Clock {
    private int hours;
    private int minutes;
    private int second;

    public Clock(){
        this.hours = 12;
        this.minutes = 0;
        this.second = 0;
        
    }

    public Clock(int hour,int minutes,int second){
        this.hours = hour;
        this.minutes = minutes ;
        this.second = second;
        
    }
    public Clock(int sec){
        setClock(sec);
        
    }
    public void setClock(int second){

        this.hours = second / 3600;  
        int remainingSeconds = second % 3600;
        this.minutes =  remainingSeconds/ 60;     
        this.second = remainingSeconds % 60;
       
    }

    public void setHours(int hours) {
        if(hours > 0 & hours < 23){
            this.hours = hours;
        }
        else{
            this.hours = 0;
        }
    }

    public void setMinutes(int minutes) {
        if(minutes > 0 & minutes < 59){
        this.minutes = minutes;
    }
    else{
        this.minutes = 0;
    }
}

    public void setSecond(int second) {
        if(second > 0 & second < 59){
        this.second = second;
        }
        else{
        this.second = 0;
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSecond() {
        return second;
    }
    
    public void tick(){
        this.second += 1;
    }
    public void tickDown(){
        this.second -= 1;
    }


    private int getSecondsSinceMidnight() {
        return hours * 3600 + minutes * 60 + second;
    }
    public void addClock(Clock otherClock) {
        int totalSeconds = this.getSecondsSinceMidnight() + otherClock.getSecondsSinceMidnight();
        setClock(totalSeconds);
    }

    public Clock subtractClock(Clock otherClock) {
        int diffSeconds = Math.abs(this.getSecondsSinceMidnight() - otherClock.getSecondsSinceMidnight());
        return new Clock(diffSeconds);
    }

    @Override
    public String toString() {
        return "(" + hours + ":" + minutes + ":" + second + ")";
    }

  
    
}
