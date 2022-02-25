# 5 Testing Documentation (Test Scenario - Test Case)

## 1. Test Scenario
- Test scenario merupakan sebuah dokumen yang berisi sekumpulan langkah-langkah sistematis yang disusun software tester agar sistem yang ingin diuji dapat memenuhi ketentuan user, memenuhi standard tertentu serta berfungi dengan baik.
- Test scenario merupakan tingkatan tertinggi dari sebuah test case
- Tujuan:
  - Memudahkan developer dan tester untuk melakukan testing
  - Menjadi dasar pengembangan bagi pengerjaan project 
  - Menjadi dasar client atau product owner menyesuaikan dengan system requirement
- Tools yang digunakan dapat berupa Google Spreadsheet, TestRail, Testlink, Qase.io, dll.

### Bagaimana membuat test case yang baik dan benar?
### Kriteria
#### 1. In Language System Requirement
System requirement adalah kunci sehingga kita dapat menyusun scenario test sesuai flow yang telah ditentukan.
#### 2. Give Context
User seolah-olah perlu melakukan hal tersebut.
#### 3. Give Detail
Memberikan rincian secara spesifik hal-hal yang perlu diketahui oleh user.
#### 4. Crystals Clear, easy to understand
Berikan penjelasan secara detail terkait test step dan spesifikasi expected results, sehingga akan memudahkan kita dalam melakukan proses testing.
#### 5. Complete
User dapat melakukan apapun sesuai dengan system requirement yang telah diberikan.
#### 6. Coherent
Antara scenario satu dengan yang lain, antara step satu dengan yang lain saling berkesinambungan.
#### 7. Proofs
Lengkapi dengan hasil yang didapatkan dari scenario yang telah dilakukan (Result : pass/fail).
#### 8. Consistent
Penggunaan kata haruslah secara konsisten, jika ingin menggunakan kata field email maka kata pada test step selanjutnya harus sesuai dengan kata yang ditulis di awal.
#### 9. End-user mind, don't asume
Contohnya, dalam pembuatan notifikasi, kita harus memastikan kalau client menginginkan notifikasi berupa pop up message atau alert message.
#### 10. Don’t forget cover negative test
Tidak semua step yang dilakukan dalam kondisi positif, think outside of the box dan tulis semua kemungkinan yang ada.
#### 11. Update
Perubahan itu pasti, catat perubahannya dan perbarui versi pembuatannya.

### Test Scenario Example

## 2. Test Case
- Test Case atau juga bisa disebut dengan uji kasus adalah suatu rancangan atau rangkaian mengenai tindakan yang dilakukan oleh software tester untuk melakukan verifikasi terhadap fitur atau fungsi tertentu dari sebuah perangkat lunak.

#### - Tujuan 
  - Untuk memastikan bahwa suatu sistem dapat dijalankan dengan baik sesuai dengan kebutuhan awal
  - Mampu memberikan respon ketika terdapat suatu masukan yang tidak valid.

#### - Komponen
	   - Test Case ID
	   - Test Case Description
	   - Pre-conditions
	   - Test Step
	   - Expected Result
	   - Actual Result
	   - Status
- Test Case bertindak sebagai titik awal dalam pelaksanaan pengujian sebuah sistem. Dari test case ini biasanya diketahui apakah fitur sistem berjalan normal atau tidak.

### Beberapa hal yang perlu diperhatikan dalam membuat test case
#### 1. Test Case dibuat Sederhana dan Transparan
Dalam pembuatan test case, penguji harus membuat test case yang sederhana dengan penjelasan jelas dan ringkas supaya orang lain dapat mengeksekusi. Gunakan bahasa yang mudah dipahami, sehingga membantu pemahaman pengujian menjadi mudah dan pelaksanaan tes atau pengujian menjadi lebih cepat.
#### 2. Test Case dibuat dengan End User in Mind
Tujuan utama dari pembangunan sebuah perangkat lunak adalah untuk membuat kasus uji yang memenuhi persyaratan client yang mudah digunakan dan dioperasiakan. Dengan demikian, penguji harus mampu membuat kasus uji dengan mengingat perspektif dari pengguna akhir
#### 3. Hindari Pengulangan Kasus Uji
Dalam membuat test case, usahakan untuk tidak membuat pengujian yang berulang. Jika sebuah test case diperlukan untuk mengeksekusi beberapa test case lain, penguji dapat memanggil test case tersebut ke dalam kolom pre-condition.
#### 4. Jangan Berasumsi
Dalam membuat test case, jangan mengasumsikan mengenai fitur dan fungsi dari perangkat yang sedang diuji. Pengujian harus sesuai dengan ketentuan dan dokumen spesifikasi.
#### 5. Pastikan bahwa Pengujian Sudah Mencakup Semuanya
Dalam membuat pengujian, pastikan bahwa penguji sudah memeriksa semua fitur sistem secara keseluruhan serta memenuhi persyaratan perangkat lunak seperti yang disebutkan dalam dokumen spesifikasi. Penguji dapat menggunakan Traceability Matrix untuk memastikan bahwa tidak ada fungsi yang belum teruji
#### 6. Test Case Harus Dapat Diidentifikasi
Nama dari test case id harus dapat diidentifikasi sehingga memudahkan penguji ketika akan melacak error atau mengidentifikasikan persyaratan perangkat lunak pada tahap berikutnya
#### 7. Repeatable and Self-standing
Dalam membuat test case, test case harus menghasilkan hasil yang sama setiap kali, tidak peduli siapa pengujinya.
#### 8. Peer Review
Test case yang dibuat harus bisa ditinjau oleh orang lain. Hal ini memungkinkan orang lain menemukan sebuah cacat yang terlewatkan.

### Test Case Scenario

# TUGAS
