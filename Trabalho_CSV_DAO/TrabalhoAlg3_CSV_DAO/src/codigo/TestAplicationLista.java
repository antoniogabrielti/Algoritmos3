package codigo;

import datastructures.ListaEncadeada;

public class TestAplicationLista {
    public static void main(String[] args) {
    

		PacienteDAOLista TestePacienteLista = new PacienteDAOLista();
		TestePacienteLista.addPaciente(new Paciente("001","Ana Maria","14-08-2016"));
		imprimeLista(TestePacienteLista.getListaPaciente());
		TestePacienteLista.addPaciente(new Paciente("003","Pedro","14-08-2016"));
                TestePacienteLista.addPaciente(new Paciente("004","Paulo","14-08-2016"));
                TestePacienteLista.addPaciente(new Paciente("002","Roberto","14-08-2016"));
		imprimeLista(TestePacienteLista.getListaPaciente());
		TestePacienteLista.removePaciente("003");
		imprimeLista(TestePacienteLista.getListaPaciente());
	}

	private static void imprimeLista(ListaEncadeada<Paciente> lista) {
		for (Paciente dado : lista)
			System.out.println(dado.toString());
		System.out.println("-----------------");
	}// Emilly Salvador de Mattos
}
