
import java.util.Scanner;

public class CursoTeste {

    public static void main(String args[]) {
   int i ;
   double [] notas = new double [10];
   Curso curso = new Curso();
        Scanner ler = new Scanner(System.in);
       
        System.out.println("Digite o nome do curso");
        String nomeCurso = ler.nextLine();
        
        for (i = 0; i < notas.length; i++) {
        
        System.out.println (" Digite a nota "  +  (i + 1)  +  " : ");
        notas [i] = ler.nextDouble();
        }
     
      
   
        
        
        System.out.println ("A média é" + curso.getmedias());
         System.out. println ("A maior nota é" + curso.getmaior());        
                }
    }
