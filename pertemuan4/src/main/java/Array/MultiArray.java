/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author ANTON TSURAYA
 */
public class MultiArray {
    public static void main(String[] args) {
        double[][] nilaiMahasiswa = new double [5][30];
        
        nilaiMahasiswa[0][0] = 80;
        nilaiMahasiswa[1][0] = 90;
        nilaiMahasiswa[2][0] = 75;
        nilaiMahasiswa[3][0] = 70;
        
        
        nilaiMahasiswa[4][0] = nilaiMahasiswa[0][0] * bobot [0] +
                nilaiMahasiswa[1][0] * bobot [1] +
                nilaiMahasiswa[2][0] * bobot [2] +
                nilaiMahasiswa[1][0] * bobot [1] ;
        
        System.out.println("Nilai Si Mahasiswa 1 : "+nilaiMahasiswa[4][0]);
        
        nilaiMahasiswa[0][1] = 80;
        nilaiMahasiswa[1][1] = 90;
        nilaiMahasiswa[2][1] = 75;
        nilaiMahasiswa[3][1] = 70;
        
        nilaiMahasiswa[4]][1] = 0;
        for (int i=0 ; i<=3 ; i++) {
            nilaiMahasiwa[4][1] += nilaiMahasiswa[i][1] * bobot[i];
        }
        
        System.out.println("Nilai Si Mahasiswa 2 :"+nilaiMahasiswa[4]][1]);
        
        double jumlahNilaiAkhir = 0;
        for (int i=0 ; i<=3 ; i++){
            jumlahNilaiAkhir += nilaiMahasiswa[4][i];
        }
        System.out.println(jumlahNilaiAkhir);

    }
    
}
