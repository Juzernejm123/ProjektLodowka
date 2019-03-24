package com.example.projektlodowka;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface ProduktPrzepisDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(ProduktPrzepis... produktPrzepis);

    @Update
    void update(ProduktPrzepis... produktPrzepis);

    @Delete
    void delete(ProduktPrzepis... produktPrzepis);

    @Query("SELECT * FROM ProduktPrzepis")
    List<ProduktPrzepis> loadAll();

    @Query("SELECT * FROM ProduktPrzepis WHERE id = :id")
    ProduktPrzepis loadId(int id);

    @Query("SELECT * FROM ProduktPrzepis WHERE idProduktu = :idProduktu")
    List<ProduktPrzepis> loadProdukt(int idProduktu);

    @Query("SELECT * FROM ProduktPrzepis WHERE idPrzepisu = :idPrzepisu")
    List<ProduktPrzepis> loadPrzepis(int idPrzepisu);
}