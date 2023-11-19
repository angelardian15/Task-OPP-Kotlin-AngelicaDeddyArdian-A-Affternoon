package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName: String = "Angelica Deddy"
    val lastName: String = "Ardian"
    val age: Int = 20
    val status: Boolean = false
    println("firstName: $firstName")
    println("lastName: $lastName")
    println("age: $age")
    println("status: ${if(status)"single" else "tidak single"}")

}
/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    println("group id: $groupId")
    println("group members: $groupMember")
    println("session: $session")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<String> {
    val groupMembers = listOf("Angelica","Dhea","Resta","Luvy","Awal")
    return listOf(groupMembers[0])
}
/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Kak Reinaldi","Kak Malik")
    val jumlahAnggotaGrup = arrayOf("Angelica","Dhea","Resta","Luvy","Awal")
    val total: Int = mentor.size + jumlahAnggotaGrup.size
    return total
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Kelompok 8", listOf("Angelica","Dhea","Resta","Luvy","Awal"), "Afternoon A")

}