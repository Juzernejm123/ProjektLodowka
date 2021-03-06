package com.example.projektlodowka.database;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;


@Entity(foreignKeys = {
        @ForeignKey(entity = Przepis.class, parentColumns = "id", childColumns = "idPrzepisu", onDelete = ForeignKey.CASCADE),
        @ForeignKey(entity = Produkt.class, parentColumns = "id", childColumns = "idProduktu", onDelete = ForeignKey.CASCADE)},
        indices = {@Index("idProduktu"), @Index("idPrzepisu")})

public class ProduktPrzepis {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private int idPrzepisu;

    private int idProduktu;

    private int iloscProduktu;

    private boolean opcjonalny;


    @Ignore
    public ProduktPrzepis() {}

    public ProduktPrzepis(int idPrzepisu, int idProduktu, int iloscProduktu, boolean opcjonalny) {
        this.idPrzepisu = idPrzepisu;
        this.idProduktu = idProduktu;
        this.iloscProduktu = iloscProduktu;
        this.opcjonalny = opcjonalny;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPrzepisu() {
        return idPrzepisu;
    }

    public void setIdPrzepisu(int idPrzepisu) {
        this.idPrzepisu = idPrzepisu;
    }

    public int getIdProduktu() {
        return idProduktu;
    }

    public void setIdProduktu(int idProduktu) {
        this.idProduktu = idProduktu;
    }

    public int getIloscProduktu() { return iloscProduktu; }

    public void setIloscProduktu(int iloscProduktu) { this.iloscProduktu = iloscProduktu; }

    public boolean isOpcjonalny() {
        return opcjonalny;
    }

    public void setOpcjonalny(boolean opcjonalny) {
        this.opcjonalny = opcjonalny;
    }
}
