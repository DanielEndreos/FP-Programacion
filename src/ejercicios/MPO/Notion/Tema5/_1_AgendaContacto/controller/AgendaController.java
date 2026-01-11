package ejercicios.MPO.Notion.Tema5._1_AgendaContacto.controller;

import ejercicios.MPO.Notion.Tema5._1_AgendaContacto.model.Agenda;

import java.util.Scanner;

public class AgendaController {
    private Scanner scn;
    private Agenda agenda;

    public AgendaController(Scanner scn) {
        this.scn = scn;
        this.agenda = new Agenda(this.scn);
    }

    public void iniciarAgenda() {
        int opcion = 0;
        do {
            System.out.print("""
                    
                    --- MENÚ AGENDA ---
                    1. Agregar persona
                    2. Buscar persona
                    3. Borrar persona
                    4. Listar personas
                    5. Salir
                    """);
            System.out.print("Seleccione una opción: ");
            opcion = scn.nextInt();

            switch (opcion) {
                case 1 -> { agenda.addContacto(); }
                case 2 -> { agenda.buscarContacto(); }
                case 3 -> { agenda.eliminarContacto(); }
                case 4 -> { agenda.listarContactos(); }
            }

        }while(opcion!=5);
    }

}
