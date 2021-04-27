import java.util.Random;

public class LottoA {
    private final int N = 6;
    private final int n = 49;
    private int[] lottozahlen;
    private Random zG;
    
    public LottoA(){
        lottozahlen = new int[N];
        zG = new Random();
    }    
    
    
    private int nextZZ(){
        return zG.nextInt(n) + 1;
    }
    
    public void reset(){
        for(int i = 0; i < N; i++)
            lottozahlen[i] = 0;
    }
    
    private boolean contains(int z){
        for(int i = 0; i < N; i++)
           if (lottozahlen[i] == z) return true;
        return false;   
    }
    
    public void ziehungDurchführen(){
        // Your Code
    }
    
    // Bildschirmausgabe:
    public void printZiehung(){
        for (int i = 0; i < N; i++)
             System.out.print(lottozahlen[i] + "  ");
    }
}
