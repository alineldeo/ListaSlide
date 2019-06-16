
public class Curso {

    public double medias;
    public double maior;
    public String nomeCurso;
    public float soma;
    public double [] notas = new double [10];
    public Curso() {
    }

    public Curso(String nomeCurso, int notas) {
    }

    public void setNomeCurso(String Nome) {
        this.nomeCurso = Nome;
    }

    public String getNomeCurso() {
        return this.nomeCurso;
    }
     public void setNotas (double [] Nota) {
    this.notas = Nota;
    }
 
    public double [] getNotas (){
    return notas;
    }
    public double getmedias (){
        double soma = 0;
        for(int i =0;i<10;i++) {
    soma = soma + getNotas()[i];
    }
        return soma/10;
   
    }
    public double getmaior () {
         double maior = getNotas()[0];
         for (int i = 0; i <=10; i++) {
         if (maior > getNotas ()[i]){
         maior = getNotas ()[i];
         } 
        }
             return maior;
    
    
}
} 
  