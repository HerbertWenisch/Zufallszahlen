import java.util.Random;

public class LottoB {
    private final int N = 49;
    private final int n = 6;
    private boolean[] gezogen;
    private Random zG;
    
    public LottoB(){
        gezogen = new boolean[N + 1];  // Pos 0 wird nicht benutzt
        zG = new Random();
    }
    
    // Ziehen mit Zurücklegen:
    private int nextZZ(){
        return zG.nextInt(N) + 1;
    }
    
    public void reset(){
        for (int i = 1; i < N; i++)
           gezogen[i] = false;
    }
    
    public void ziehungDurchführen(){
        // Your Code!
    }
    
    
    public void printLottoZahlen(){
        String lottoZahlen = "";
        // Your Code!
        System.out.println(lottoZahlen);   
    }
        
}
