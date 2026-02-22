package ejercicios.Programacion.Notion.Ficheros.Ejercicio9.controller;
import ejercicios.Programacion.Notion.Ficheros.Ejercicio9.model.Usuario;

import java.util.List;

public class Gestor {
    private List<Usuario> lista;
    private Operaciones operaciones;

    public Gestor(){
        operaciones = new Operaciones();
        lista = operaciones.importarUsuarios();
    }

    public void addUsuario(Usuario usuario){
        this.lista.add(usuario);
        System.out.println("Usuario creado con éxito.");
    }

    public void listarUsuarios(){
        System.out.println("Listado suarios:");
        this.lista.forEach(Usuario::mostrarDatos);
        System.out.println("");
    }

    public void exportar(){
        operaciones.exportarUsuarios(this.lista);
    }

    public void importar(){
        this.lista = operaciones.importarUsuarios();
    }

    public List<Usuario> getLista() {
        return lista;
    }

    public void setLista(List<Usuario> lista) {
        this.lista = lista;
    }

    public Operaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(Operaciones operaciones) {
        this.operaciones = operaciones;
    }
}
