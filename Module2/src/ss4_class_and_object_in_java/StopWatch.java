package ss4_class_and_object_in_java;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;
import java.util.Locale;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public StopWatch(){}
    public long start(){
        startTime= System.currentTimeMillis();
        return startTime;
    }
    public long end(){
        endTime=System.currentTimeMillis();
        return endTime;
    }
    public long getElapsedTime(){
        long time;
        time=((end()-start())*1000);
        return time;
    }
    public static void main(String[] args) {
        StopWatch sw=new StopWatch();
        long a=sw.start();
        for(int i=0;i<100000;i++){
            System.out.printf(+i+" ");
        }
        long b=sw.end();
        System.out.printf("start : "+a+" ");
        System.out.printf("end : "+b+" ");
        System.out.printf("thời gian chạy chương tình là : "+(b-a));

    }
}
