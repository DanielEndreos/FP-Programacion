package ejemplo;

import ejemplo.controller.APIController;

public class main {
    public static void main(String[] args) {
        APIController controller = new APIController();
        //controller.obtenerLigas();
        //controller.obtenerClasificacion("4331");
        controller.obtenerClasificacionCompleta("4331");
    }
}
