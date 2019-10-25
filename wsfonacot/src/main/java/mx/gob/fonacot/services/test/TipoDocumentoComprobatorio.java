package mx.gob.fonacot.services.test;

public enum TipoDocumentoComprobatorio {

    ACTA_NACIMIENTO(1, "Acta de Nacimiento"), 
    DOCUMENTO_MIGRATORIO(3, "Documento migratorio"), 
    CARTA_NATURALIZACION(4, "Carta de Naturalizacion"), 
    NUMERO_EXTRANJERO(5, "Numero �nico de extranjero"), 
    CERTIFICADO_NACIONALIDAD(7, "Certificado de nacionalidad mexicana"), 
    OFICIO_REFUGIADO(8, "Oficio Solicitante de Refugiado"), 
    FORMA_TURISTA(9, "Forma Migratoria Turista");

    private int id;
    private String descripcion;

    private TipoDocumentoComprobatorio(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public static TipoDocumentoComprobatorio parse(String clave) {
        int id = Integer.parseInt(clave);
        TipoDocumentoComprobatorio right = null;
        for (TipoDocumentoComprobatorio item : TipoDocumentoComprobatorio
                .values()) {
            if (item.getId() == id) {
                right = item;
                break;
            }
        }
        return right;
    }

}
