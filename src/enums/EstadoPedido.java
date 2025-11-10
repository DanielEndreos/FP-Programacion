package enums;

public enum EstadoPedido {
    PENDIENTE(0),
    PROCESANDO(1),
    ENVIADO(2),
    EN_TRANSITO(3),
    ENTREGADO(4),
    CANCELADO(5);

    private int NUM;

    EstadoPedido(int numP){
        NUM = numP;
    }

    public static EstadoPedido obtenerEstadoActual(){
        int randOpt = (int) (Math.random() * 6);
        for (EstadoPedido eP : values()){
            if(randOpt == eP.NUM){
                return eP;
            }
        }
        return null;
    }
}
