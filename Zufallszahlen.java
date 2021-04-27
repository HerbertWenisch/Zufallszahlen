import java.util.Random;

public class Zufallszahlen {
    private final int N = 36;
    private final Random zG;   
    private int[] zzs;  
    
    public Zufallszahlen(){
        zG = new Random();
        zzs = new int[N];
        for (int i = 0; i < N; i++) 
             zzs[i] = nextZZ();
    }
            
            
    private int nextZZ(){
        return zG.nextInt(N) + 1;
    }
    
    public void reset(){
       for (int i = 0; i < N; i++) 
             zzs[i] = nextZZ(); 
    }
    
    public boolean contains(int zahl){
        
        for (int i = 0; i < N; i++)
            if(zzs[i] == zahl) return true;  // gefunden: Abbruch mit true
            
        return false; // Array durchgegangen und nicht dabei
    }
    
    public int getMax(){
        int max = 1;
        for(int i = 0; i < N; i++)
           if(zzs[i] > max) max = zzs[i];  // neues Maximum
        return max;
    }  
}
