package grading_system;

import java.util.Scanner;	
public class NewSwitch {
			
	    public static void main(String[] args) {				
	        int assesmentScore,exanmScore,fees;				
					
	        Scanner scanner = new Scanner(System.in);				
	        System.out.print("Enter Assesment score: ");				
	        assesmentScore = scanner.nextInt();				
	        System.out.print("Enter Exams score: ");				
	        exanmScore = scanner.nextInt();				
	        System.out.print("Enter Fees paid: ");				
	        fees = scanner.nextInt();				
					
					
	        int x = fees - 100;				
	        int a,e, f ,t;				
					
	        if(x<0) f=0;else f=1 ;				
			if (exanmScore < 24) exanmScore=0;		
			if (assesmentScore<14)assesmentScore=0;		
	        				
			switch ( assesmentScore ){		
	            case 0 :				
					a=0;
	                break;				
					
	            case 14 :			 	
	                a=1;				
	                break;				
					
	            default:				
	                a=2;				
	                break;				
	        }				
					
	        switch (exanmScore){				
	            case 0 : 				
	                e=0;				
	                break;				
					
	            case 24 :				
	                e= 1;				
	                break;				
					
	            default:				
	                e=2;				
	                break;				
					
	        }				
					
	        t= a+e;				
	        switch (t){				
	            case 3: case 4:				
	                System.out.println("You passed both assessment and exams ");				
					
	                switch (f){				
	                    case 1:				
	                        System.out.println("Certificate Granted");				
	                        break;				
					
	                    case 0:				
	                        System.out.println("Certificate Withheld due to debt of " + x );				
	                        break;				
	                }				
	                break;				
					
	            case 2 :				
	                switch (e){				
	                    case 0:				
	                        System.out.println("You failed in the exams");				
	                        break;				
	                    case 1:				
	                        System.out.println("You failed both exams and assessment");				
	                        break;				
	                    default:				
	                        System.out.println("You failed in the assessment");				
	                        break;				
	                }				
					
	            default:				
	                System.out.println("You failed both exams and assessment, hence you've been repeated");				
	                break;				
	        }				
	    }				
	}				
