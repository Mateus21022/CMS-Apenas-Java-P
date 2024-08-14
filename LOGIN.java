package POO;
import java.util.ArrayList;
import java.util.Scanner;

public class LOGIN {
   

	public static void main (String[]args) {
	 menu();
	 }

	public static void menu(){
		ArrayList<String> conteudo = new ArrayList<>();
		 
		 conteudo.add("Claudio Pimba");
		 conteudo.add("Sérgio Pimba");
		 conteudo.add("Ronaldo Pimba");
		 conteudo.add("Raimundo Pimba");
		 
		 ArrayList<Object>users = new ArrayList<>();
		 users.add(new operacoes("Claudio",3030));
		 users.add(new operacoes("Maria",3030));
		 
		 
		Scanner ler = new Scanner (System.in);
		 System.out.println ("Username: ");
		  String username = ler.next();
		 System.out.println ("Password: ");
		  int password = ler.nextInt();
		  operacoes CompararUsuarios = new operacoes(username, password);
		  
		  
		  if (users.contains(CompararUsuarios)) {
		  System.out.println ("Informe a operação que deseja realizar: \n"
		  		+ "1 - Ver Lista.\n"
		  		+ "2 - Remover Conteudo.\n"
		  		+ "3 - Adicionar Conteudo.\n"
		  		+ "4 - Editar Conteudo.\n"
		  		+ "5 - Sair do Sistema.\n");
		  int opc = ler.nextInt();
		  
		  switch (opc) {
		  case 1: 
			  imprimir(conteudo);
			  break;
		  case 2:
			  remover(conteudo);
			  break;
		  case 3: 
			  adicionar (conteudo);
			  break;
		  case 4:
			  editar (conteudo);
			  
		  case 5:
			   System.out.println ("Adeus!");
			  break;
			  
			  default:
				  System.out.println ("Adeus!");
			  
		  }
		 }else{
			 System.out.println ("Entrada inválida.");
			  menu();
		 }
	}
		  
			  
		  
	
	
	public static void imprimir(ArrayList <String>conteudo) {
		for (String item:conteudo) {
			System.out.println (item);
		}
	}
	
	public static void remover (ArrayList<String>conteudo) {
		Scanner ler = new Scanner (System.in);
		System.out.println ("Qual item você deseja remover? Insira o index da remoção.\n");
		    for (int i = 0; i<conteudo.size();i++) {
		    	System.out.println ("Index: "+i+" Conteudo: "+conteudo.get(i));
		    }
		    int remover = ler.nextInt();
		     conteudo.remove (remover);
		     System.out.println ("Conteúdo removido.\n");
		     
		     for (int i = 0;i<conteudo.size();i++) {
		       System.out.println ("Index: "+i+conteudo.get(i));  
		     }
	}
	
	public static void adicionar (ArrayList<String>conteudo) {
		Scanner ler = new Scanner (System.in);
		System.out.println ("Insira o conteúdo desejado: ");
		String novo = ler.nextLine();
		conteudo.add(novo);
		 for (int i = 0;i<conteudo.size();i++) {
			 System.out.println ("Index: "+i+"- "+conteudo.get(i));
		 }
	}
	
	public static void editar (ArrayList<String>conteudo) {
		Scanner ler = new Scanner (System.in);
		for (int i = 0; i<conteudo.size();i++) {
			System.out.println ("Index: "+i+"- "+conteudo.get(i));
		}
		
		System.out.println ("Insira o indice de onde deseja alterar: ");
		int edit = ler.nextInt();
		ler.nextLine();
		System.out.println ("Agora insira a correção: ");
		String novo = ler.nextLine();
		
		conteudo.set(edit, novo);
		
		for (int i = 0; i<conteudo.size();i++) {
			System.out.println ("Index: "+i+"- "+conteudo.get(i));
		}
	}
	
	
}
