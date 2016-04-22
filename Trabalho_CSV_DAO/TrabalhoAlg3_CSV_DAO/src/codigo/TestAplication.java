
package codigo;

public class TestAplication {
public static void main(String[] args) {
  
    Paciente p1 = new Paciente("001","Ana Maria","14-08-2016");
    Paciente p2 = new Paciente("002","Pedro","14-08-2016");
    Paciente p3 = new Paciente("006","Henrique","14-08-2016");
    Paciente p4 = new Paciente("005","Nicole","14-08-2016");
    Paciente p5 = new Paciente("004","Joao","14-08-2016");
    Paciente p6 = new Paciente("003","Mariana","14-08-2016");
    PacienteDaoVector VetorPaciente = new PacienteDaoVector();
    VetorPaciente.addPaciente(p1);
    VetorPaciente.addPaciente(p2);
    VetorPaciente.addPaciente(p3);
    VetorPaciente.addPaciente(p4);
    VetorPaciente.addPaciente(p5);
    VetorPaciente.addPaciente(p6);
        System.out.println("XXXXXXXXXX ACHOU PELO RG XXXXXXXXXXXXX");
    Paciente t = VetorPaciente.getPaciente("001");
        System.out.println("Achado: "+t.toString());
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("************ Vetor de Pacientes Ordenado pelo RG ************");
    VetorPaciente.getVetor();
        System.out.println("************************************");

    }
}
