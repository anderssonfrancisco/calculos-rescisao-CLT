import java.util.Scanner;

public class Calculos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//escolhendo o tipo de demiss�o
		System.out.println("--CALCULOS RESCIS�O CONTRATO CLT--");
		System.out.println("1 - Demiss�o sem justa causa");
		System.out.println("2 - Pedido de demiss�o");
		System.out.println("3 - Acordo previsto em lei");
		System.out.println("4 - Demiss�o com Justa causa");
		System.out.print("Digite o n�mero da Rescis�o: ");
		int tipo = scanner.nextInt();
		
		System.out.print("Qual o salario base? ");
		float salario = scanner.nextFloat();
		System.out.print("Quantos dias do m�s trabalhou? ");
		int diastrab = scanner.nextInt();
		System.out.print("Quantos mes�s do ano trabalhou? ");
		int mesestrab = scanner.nextInt();
		System.out.print("Possui f�rias vencidas? digite 1 pra Sim ou 2 pra N�o: ");
		int caso = scanner.nextInt();
		
		//Calculo ferias
		float ferias = salario + (salario / 3);
		
		//calculo de ferias proporcional
		float Vmensal = salario / mesestrab;
		float mesestrapaquisitivo = Vmensal * mesestrab;
		float feriaspp = mesestrapaquisitivo + (mesestrapaquisitivo / 3);
		
		//calcular o total de dias trabalhados
		float valordia = salario / 30;
		float Vmesresci = valordia * diastrab;
		
		//Decimo terceiro proporcional
		float decimo = Vmensal * mesestrab;
	    //Aviso previo
		float previo = salario; 
		
		//verificando se tem FV + Demiss�o sem justa causa
		if(caso == 1 && tipo == 1 ) {
			
			System.out.println("Qual o valor que possui de FGTS?");
	        float fgts = scanner.nextFloat();
	        
	        //resultadofinal
	        float totalresci = Vmesresci + ferias + feriaspp + decimo + previo + fgts;
	        	System.out.println("O valor final �: " + "R$" + totalresci);	
	     
	        //verificando se tem FV + pedido demiss�o	
		} else if (caso == 1 && tipo == 2 ) {
			
	        //resultadofinal
	        float totalresci = Vmesresci + feriaspp + decimo + previo + ferias;
        	System.out.println("O valor final �: " + "R$" + totalresci);	
        	
        	//verficando se tem FV + acordo da CLT
		} else if (caso == 1 && tipo == 3) {
			
			//meio aviso previo
			float meioAprevio = salario / 2;
			
			System.out.println("Informe o valor do Fgts somado a multa de 20%");
	        float fgts = scanner.nextFloat();
	           
	        //resultadofinal
	        float totalresci = Vmesresci + ferias + feriaspp + decimo + meioAprevio + fgts;
	        	System.out.println("O valor total �: " + "R$" + totalresci);	
	        	
	        //verficando se tem FV + justa causa	
		} else if (caso == 1 && tipo == 4) {
             
			float total = ferias + Vmesresci;
			
			System.out.println("O valor total �: " + "R$" + total);
			
			// Demiss�o sem justa causa - FV
		}else if (caso == 2 && tipo == 1) {
			
			System.out.println("Informe o valor do Fgts somado a multa de 40%");
	        float fgts = scanner.nextFloat();
	           
	        //resultadofinal
	        float totalresci = Vmesresci + feriaspp + decimo + previo + fgts;
	        	System.out.println("O valor final �: " + "R$" + totalresci);
			
	        //pedido de demiss�o - FV	
		}else if (caso == 2 && tipo == 2) {
			
	        //resultadofinal
	        float totalresci = Vmesresci + feriaspp + decimo + previo;
        	System.out.println("O valor final �: " + "R$" + totalresci);
			
        	//acordo da CLT - FV
		} else if (caso == 2 && tipo == 3) {
			
		    //meio aviso previo
			float meioAprevio = salario / 2;
			
			System.out.println("Informe o valor do Fgts somado a multa de 20%");
	        float fgts = scanner.nextFloat();
	           
	        //resultadofinal
	        float totalresci = Vmesresci + feriaspp + decimo + meioAprevio + fgts;
	        	System.out.println("O valor total �: " + "R$" + totalresci);
	        
	        //justa causa - FV	
		}else if(caso == 2 && tipo == 4){
			
			float inftotal = Vmesresci;
			System.out.println("Infelizmente o total � " + "R$" + inftotal);
		}
		
		
	}
	

}
