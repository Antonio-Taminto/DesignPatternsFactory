public enum ShapeEnum {
    CERCHIO("Cerchio"),
    RETTANGOLO("Rettangolo"),
    TRIANGOLO("Triangolo");

    private String descrizione;
    ShapeEnum(String descizione) {
        this.descrizione = descizione;
    }

    public String getDescizione() {
        return descrizione;
    }
}
