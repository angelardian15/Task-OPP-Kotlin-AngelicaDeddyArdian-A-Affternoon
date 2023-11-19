package id.infinitelearning.KotlinSubmission.exercise4

import java.lang.IllegalArgumentException

fun main() {
    try {
//        menghitung total pembayaran untuk 50 buku dengan harga 50/buku
        val totalBayar = hitungTotal(50,50)
        println("Total pembayaran: $totalBayar")
        prosesBayar(totalBayar)
    } catch (e: Exception) {
        println("Transaksi gagal: ${e.message}")
    }
}
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
fun hitungTotal(jumlahBuku: Int, harga: Int): Int{
    if (jumlahBuku < 0 || harga <0) {
        throw IllegalArgumentException("jumlah buku dan harga per buku harus bernilai positif")
    }
        return jumlahBuku * harga
}

fun prosesBayar (jumlah: Int) {
//    proses pembayaran
    println("Pembayaran sebesar $jumlah berhasil di proses")
}