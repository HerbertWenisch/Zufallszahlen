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
        int z;
        for (int i = 0; i < n; i++){
           z = nextZZ();
           while(gezogen[z]) z = nextZZ();
           gezogen[z] = true;
        }
    }
    
    
    public void printLottoZahlen(){
        String lottoZahlen = "";
        for(int i = 1; i < N; i++)
           if(gezogen[i]) lottoZahlen += i + " ";
        System.out.println(lottoZahlen);   
    }
        
}
