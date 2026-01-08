package ejercicios.MPO.Notion.Tema5.AgendaContacto;

import ejercicios.MPO.Notion.Tema5.AgendaContacto.controller.AgendaController;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scn = new Scanner (System.in);
        AgendaController agendaCtrl = new AgendaController(scn);

        agendaCtrl.iniciarAgenda();

    }
}
