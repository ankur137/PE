import java.util.Scanner;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.StreamHandler;

public class PE7 {
	Logger logger;
    Handler handler;
    public PE7(){
    logger = Logger.getLogger(PE7.class.getName());
    logger.setLevel(Level.INFO);
//    handler = new StreamHandler(System.out, new SimpleFormatter());
//    handler.setLevel(Level.ALL);
//    logger.addHandler(handler);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PE7 logObj=new PE7();
		Factor f1=(a,b)->{
			if(a%b==0) {
				return (b + " is a factor of " + a);
			}else {
				return (b + " is not a factor of " + a);
			}
              
            };  
            Scanner scan = new Scanner(System.in);
            	logObj.logger.info("Result: "+ f1.isFactor(scan.nextInt(),  scan.nextInt()));

	}

	}


