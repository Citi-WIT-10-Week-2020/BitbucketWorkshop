	
import java.util.*;
 
public class SkeletonATM{
 
    double reserve = 20000.0;
    double bank_account = 0;
    int pin = 0000;
 
    public SkeletonATM(){
        super();
    }
    public SkeletonATM(double startAmount){
 
    }
 
    public boolean login(int pin){
        return false;
    }
    public double withdraw(double request){
        if(request <= bank_account && request <= reserve){
            bank_account -= request;
            reserve -= request;
            return request;
        }
        else{
            return 0;
        }
        
    }
 
    public void deposit(double input){
 
    }
 
 
    public static void main(String args[]){
        
    }
}