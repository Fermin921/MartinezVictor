

public class App {
    public static void main(String[] args) throws Exception {
        int PrimerNum=1;
        int SegundoNum=2; 
        int CantCiclo=15;  
        int Contador=1;
        int Suma=0;
       System.out.println(PrimerNum);
       System.out.println(SegundoNum);
    do {
          Contador=Contador+1;
           Suma=PrimerNum+SegundoNum;
           System.out.println(Suma);
           PrimerNum=SegundoNum;
            SegundoNum=Suma;

 
          } while(Contador<= CantCiclo );
          
    }
}
