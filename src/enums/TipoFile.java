package enums;

public enum TipoFile {
IMAGENES(new String[]{"jpg", "png", "gif"}),
DOCUMENTOS(new String[]{"pdf", "doc", "txt"}),
AUDIO(new String[]{"mp3", "wav"}),
VIDEO(new String[]{"mp4", "avi"});

private String[] TIPOS;

TipoFile(String[] listaP){
    this.TIPOS = listaP;
}

    public String[] getTIPOS() {
        return TIPOS;
    }

    public static TipoFile findByType(String item){
    for(TipoFile tF : values()){
        for (int i = 0; i < tF.TIPOS.length; i++) {
            if (tF.TIPOS[i].equals(item)){
                return tF;
            }
        }
    }
    return null;
}

}
