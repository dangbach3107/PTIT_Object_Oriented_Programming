package J05033;

public class Time implements Comparable<Time> {
    private int gio, phut, giay;

    public Time(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    @Override
    public String toString() {
        return gio + " " + phut + " " + giay ;
    }
    
    @Override
    public int compareTo(Time other)
    {
        if (this.gio != other.gio) {  
            return Integer.compare(this.gio, other.gio);  
            } else if (this.phut != other.phut) {  
            return Integer.compare(this.phut, other.phut);  
            } else {  
            return Integer.compare(this.giay, other.giay);  
            }  
    }  
    
}

