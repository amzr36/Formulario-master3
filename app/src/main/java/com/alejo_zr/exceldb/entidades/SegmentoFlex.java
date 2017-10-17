package com.alejo_zr.exceldb.entidades;

import java.io.Serializable;

/**
 * Created by Alejo on 28/09/2017.
 */

public class SegmentoFlex implements Serializable {

    private Integer id_segmento;
    private String id_carretera;
    private String nombre_carretera;
    private String fecha;
    private String nCalzadas;
    private String nCarriles;
    private String anchoCarril;
    private String anchoBerma;
    private String pri;
    private String prf;
    private String comentarios;

    public SegmentoFlex(Integer id_segmento, String id_carretera, String nombre_carretera, String fecha, String nCalzadas,
                        String nCarriles, String anchoCarril, String anchoBerma, String pri, String prf, String comentarios) {
        this.id_segmento = id_segmento;
        this.id_carretera = id_carretera;
        this.nombre_carretera = nombre_carretera;
        this.fecha = fecha;
        this.nCalzadas = nCalzadas;
        this.nCarriles = nCarriles;
        this.anchoCarril = anchoCarril;
        this.anchoBerma = anchoBerma;
        this.pri = pri;
        this.prf = prf;
        this.comentarios = comentarios;
    }

    public SegmentoFlex() {

    }

    public Integer getId_segmento() {
        return id_segmento;
    }

    public void setId_segmento(Integer id_segmento) {
        this.id_segmento = id_segmento;
    }

    public String getId_carretera() {
        return id_carretera;
    }

    public void setId_carretera(String id_carretera) {
        this.id_carretera = id_carretera;
    }

    public String getNombre_carretera() {
        return nombre_carretera;
    }

    public void setNombre_carretera(String nombre_carretera) {
        this.nombre_carretera = nombre_carretera;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getnCalzadas() {
        return nCalzadas;
    }

    public void setnCalzadas(String nCalzadas) {
        this.nCalzadas = nCalzadas;
    }

    public String getnCarriles() {
        return nCarriles;
    }

    public void setnCarriles(String nCarriles) {
        this.nCarriles = nCarriles;
    }

    public String getAnchoCarril() {
        return anchoCarril;
    }

    public void setAnchoCarril(String anchoCarril) {
        this.anchoCarril = anchoCarril;
    }

    public String getAnchoBerma() {
        return anchoBerma;
    }

    public void setAnchoBerma(String anchoBerma) {
        this.anchoBerma = anchoBerma;
    }

    public String getPri() {
        return pri;
    }

    public void setPri(String pri) {
        this.pri = pri;
    }

    public String getPrf() {
        return prf;
    }

    public void setPrf(String prf) {
        this.prf = prf;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
}
