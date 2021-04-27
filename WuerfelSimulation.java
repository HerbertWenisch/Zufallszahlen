import java.util.Random;

public class WuerfelSimulation {
    private int N = 100;
    private Random zG;
    private int[] zzs;
    
    public WuerfelSimulation(){
        zG = new Random();
        zzs = new int[N];
        wuerfeln();
    }
    
    // würfelt einmal:
    private int nextWurf(){
        return zG.nextInt(6) + 1;
    }
    
    // würfelt N-mal:
    public void wuerfeln(){
        for (int i = 0; i < N; i++) 
             zzs[i] = nextWurf();
    }    
    
    // wie oft kommt z vor?
    public int getNumbersOf(int z){
        int count = 0;  // Zähler
        for(int i = 0; i < N; i++)
            if(zzs[i] == z) count++;
        return count;    
    } 
    
}
