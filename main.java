package consoleApp03                                                               ;
import java.text.DecimalFormat                                                     ;
import java.util.Scanner                                                           ;
import java.util.concurrent.TimeUnit                                               ;
public class main                                                                  {
	public static  void main(String[] args) throws InterruptedException            {
		Epoch EP = new Epoch()                                                     ;
		Scanner SC = new Scanner(System.in)                                        ;
		Calculator_Interest CF = new Calculator_Interest()                         ;
		CF.toprintln1()                                                            ;		
		while (true)                                                               {
			CF.toprintln2()                                                        ;
			char SelectFuntion = (SC.next().charAt(0))                             ;
			if (Character.toUpperCase(SelectFuntion) == 'E')                       {
				EP.inputEpoch()                                                    ;			                                                                                                                                                                                                                                 }			
			if (Character.toUpperCase(SelectFuntion) == 'I')                       {
				CF.inputInterest()                                                 ;			                                                                                                                                                                                                                                 }
			if (Character.toUpperCase(SelectFuntion) == 'N')                       {
				CF.toExit()                                                        ;
				break                                                              ;
                                                                                   }
		                                                                           }
	                                                                               }                                                                                                                                                                                                                                             }