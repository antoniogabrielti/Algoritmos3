
package codigo;
import datastructures.Iterador;
import datastructures.Vetor;
public class TestAplicationVector {
public static void main(String[] args) {
    

		PacienteDaoVector TestePacienteVetor = new PacienteDaoVector();
		TestePacienteVetor.addPaciente(new Paciente("001","Ana Maria","14-08-2016"));
		imprimeLista(TestePacienteVetor.getVetorPacientes());
		TestePacienteVetor.addPaciente(new Paciente("003","Pedro","14-08-2016"));
                TestePacienteVetor.addPaciente(new Paciente("004","Paulo","14-08-2016"));
                TestePacienteVetor.addPaciente(new Paciente("002","Roberto","14-08-2016"));
		imprimeLista(TestePacienteVetor.getVetorPacientes());
		TestePacienteVetor.removePaciente("003");
                System.out.println("Encontrado:");
                System.out.println(TestePacienteVetor.getPaciente("004").toString());
                System.out.println("**************************");
		imprimeLista(TestePacienteVetor.getVetorPacientes());
	}

	private static void imprimeLista(Vetor<Paciente> lista) {
		for (Paciente dado : lista)
			System.out.println(dado.toString());
		System.out.println("-----------------");
	}
}
