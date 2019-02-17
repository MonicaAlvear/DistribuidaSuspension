package entidades;

public class Direccion {

    private Long id;
    private String calle1;
    private String calle2;
    private String numero;

    public Direccion() {
            }

    public Direccion(Long id, String calle1, String calle2, String numero) {
        this.id = id;
        this.calle1 = calle1;
        this.calle2 = calle2;
        this.numero = numero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCalle1() {
        return calle1;
    }

    public void setCalle1(String calle1) {
        this.calle1 = calle1;
    }

    public String getCalle2() {
        return calle2;
    }

    public void setCalle2(String calle2) {
        this.calle2 = calle2;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
