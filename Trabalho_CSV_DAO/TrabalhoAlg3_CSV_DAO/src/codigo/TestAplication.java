
package codigo;

public class TestAplication {
    public static void main(String[]args){
    Paciente p1 = new Paciente("001","Ana Maria","14-08-2016");
    Paciente p2 = new Paciente("002","Pedro","14-08-2016");
    Paciente p3 = new Paciente("006","Henrique","14-08-2016");
    Paciente p4 = new Paciente("005","Nicole","14-08-2016");
    Paciente p5 = new Paciente("004","Joao","14-08-2016");
    Paciente p6 = new Paciente("003","Mariana","14-08-2016");
    PacienteDAOLista ListaPaciente = new PacienteDAOLista();
    ListaPaciente.addPaciente(p1);
    ListaPaciente.addPaciente(p2);
    ListaPaciente.addPaciente(p3);
    ListaPaciente.addPaciente(p4);
    ListaPaciente.addPaciente(p5);
    ListaPaciente.addPaciente(p6);
    MostrarLista(ListaPaciente);
    }
    
    public static void MostrarLista(PacienteDAOLista lista){
        for(Paciente p : lista.getLista()){
            p.toString();
        }
    }
}
