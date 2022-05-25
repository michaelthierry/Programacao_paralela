import java.util.jar.Attributes.Name;

public class SemaforoSleep implements Runnable{

    private String farolVerde = "Verde";
    private String farolVermelho = "Vermelho";


    public void run(){

        String nome = Thread.currentThread().getName();

        if(nome.equals("1")){
            for(int i = 0; i < 10; i++){
                if(i <= 5){
                    System.out.println("Farol: "+ nome+ "Esta:"+farolVerde);
                    try{
                        Thread.currentThread();
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
    
                    }
                    
                }else{
                    System.out.println("Farol: "+ nome+ "Esta:"+farolVermelho);
                    try{
                        Thread.currentThread();
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
    
                    }
                }   
            }
        }else{
            for(int i = 0; i < 10; i++){
                if(i <= 5){
                    System.out.println("Farol: "+ nome+ "Esta:"+farolVermelho);
                    try{
                        Thread.currentThread();
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
    
                    }
                    
                }else{
                    System.out.println("Farol: "+ nome+ "Esta:"+farolVerde);
                    try{
                        Thread.currentThread();
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
    
                    }
                }   
            }
        }
        
        
        
        
    }
}
