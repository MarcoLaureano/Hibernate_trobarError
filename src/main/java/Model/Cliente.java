package Model;

import jakarta.persistence.*;

@Entity
@Table(name="Model.Cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idCliente;

    @Column
    private String nombre;

    @Column
    private boolean vip;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="direccion", column=@Column(name="envio_dir")),
            @AttributeOverride(name="ciudad", column=@Column(name="envio_nom")),
            @AttributeOverride(name="provincia", column=@Column(name="envio_ciutat")),
            @AttributeOverride(name="codigoPostal", column=@Column(name="envio_cPostal"))
    })
    private Direccion direccioEnvio;


    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="direccion", column=@Column(name="facturacion_dir")),
            @AttributeOverride(name="ciudad", column=@Column(name="facturacion_nom")),
            @AttributeOverride(name="provincia", column=@Column(name="facturacion_ciutat")),
            @AttributeOverride(name="codigoPostal", column=@Column(name="facturacion_cPostal"))
    })
    private Direccion direccionFacturacion;

    public Cliente() {
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccioEnvio() {
        return direccioEnvio;
    }

    public void setDireccioEnvio(Direccion direccioEnvio) {
        this.direccioEnvio = direccioEnvio;
    }

    public Direccion getDireccionFacturacion() {
        return direccionFacturacion;
    }

    public void setDireccionFacturacion(Direccion direccionFacturacion) {
        this.direccionFacturacion = direccionFacturacion;
    }

    public Cliente(String nombre, boolean vip) {
        this.nombre = nombre;
        this.vip = vip;
    }

}

