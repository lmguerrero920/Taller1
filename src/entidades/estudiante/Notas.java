package entidades.estudiante;

public class Notas {



    private double Nota1;

    private double Nota2;

    private double Nota3;


    public double getNota1() {
        return Nota1;
    }

    public void setNota1(double nota1) {
        Nota1 = nota1;
    }

    public double getNota2() {
        return Nota2;
    }

    public void setNota2(double nota2) {
        Nota2 = nota2;
    }

    public double getNota3() {
        return Nota3;
    }

    public void setNota3(double nota3) {
        Nota3 = nota3;
    }

  public double calcularNota()
  {
      return((this.getNota1()*0.40)+(this.getNota2()*0.30)+(this.getNota3()*0.30));
  }




}
