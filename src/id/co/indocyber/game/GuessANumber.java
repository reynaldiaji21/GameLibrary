/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.game;

/**
 * Librrary untuk game tebak angka antara 1-100 Angka tebakan di hasilkan secara
 * acak oleh Math.random() dan Math ceil(),kemuadian angka di rubah menjadi
 * integer
 *
 * @author user
 */
public class GuessANumber {

    private int angkaTebakan;
    private int jumlahTebakan;
    private boolean LebihBesar;

    public GuessANumber() {
        angkaTebakan = (int) Math.ceil(Math.random() * 100);
        jumlahTebakan = 0;
    }

    public void naikanJumlahTebakan() {
        setJumlahTebakan(getJumlahTebakan() + 1);
    }

    public boolean isGuessTrue(int tebakanPemain) {
        boolean benarOrSalah = false;
        if (tebakanPemain == angkaTebakan) {
            benarOrSalah = true;
        } else if (tebakanPemain > angkaTebakan) {
            LebihBesar = true;
        } else if (tebakanPemain < angkaTebakan) {
            LebihBesar = false;
        }

        naikanJumlahTebakan();
        return benarOrSalah;
    }

    /**
     * @return the jumlahTebakan
     */
    public int getJumlahTebakan() {
        return jumlahTebakan;
    }

    /**
     * @param jumlahTebakan the jumlahTebakan to set
     */
    public void setJumlahTebakan(int jumlahTebakan) {
        this.jumlahTebakan = jumlahTebakan;
    }


    /**
     * @return the LebihBesar
     */
    public boolean isLebihBesar() {
        return LebihBesar;
    }

    /**
     * @param LebihBesar the LebihBesar to set
     */
    public void setLebihBesar(boolean LebihBesar) {
        this.LebihBesar = LebihBesar;
    }
}
