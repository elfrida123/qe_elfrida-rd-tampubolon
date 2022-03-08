# 9 Introduction Basic Programming
## Java Programming
Java adalah bahasa pemrograman tingkat tinggi yang berorientasi objek dan program java tersusun dari bagian yang disebut kelas. Kelas terdiri atas metode-metode yang melakukan pekerjaan dan mengembalikan informasi setelah melakukan tugasnya. Para pemrogram  Java banyak mengambil keuntungan dari kumpulan kelas di pustaka kelas Java, yang disebut dengan Java Application Programming Interface (API). Kumpulan kelas ini diorganisasikan menjadi sekelompok yang disebut paket (package). Java API telah menyediakan fungsionalitas yang memadai untuk menciptakan applet dan aplikasi canggih. Jadi ada dua hal yang harus dipelajari dalam Java, yaitu mempelajari bahasa Java dan bagaimana mempergunakan kelas pada Java API. Kelas merupakan satu-satunya cara menyatakan bagian eksekusi program, tidak ada cara lain. Pada Java program javac untuk mengkompilasi file kode sumber Java menjadi kelas-kelas bytecode. File kode sumber mempunyai ekstensi *.java. Kompilator javac menghasilkan file bytecode kelas dengan ekstensi *.class. Interpreter merupakan modul utama sistem Java yang digunakan aplikasi Java dan menjalankan program bytecode Java.
#### Alasan bahasa pemrograman Java digunakan 
- Bahasa yang digunakan sederhana
Dibandingkan dengan bahasa pemrograman yang lainnya, Java bisa dibilang lebih sederhana. Hal itu bisa terjadi karena Java menggunakan sintaks yang bisa diilang mirip dengan C++
- Hanya fokus pada Objek
Bahasa pemrograman Java hanya fokus pada Objek sehingga ampuh dalam mengorganisasi serta pengembangan perangkat lunak. Dengan fokus pada objek, program komputer dapat saling berkomunikasi dalam satu kelompok objek. Bahasa Java termasuk ke dalam contoh pemrograman  berorientasi objek.
- Pengamanan yang cukup ketat
Pengamanan pada Java ada tiga lapis. Tentu saja pengamanan ini dilakukan untuk elindungi sistem dari penyalahgunaan orang-orang yang tidak bertanggung jawab. 
- Dapat di pakai pada sistem operasi manapun
Seperti yang sudah di singgung pada awal jika Java dapat berjalan pada komputer yang menggunakan sistem operasi apapun. Hal ini bisa dilakukan karena Bahasa Java termasuk Platform Independence. Selain itu, Variabel yang dimiliki Java mempunyai ukuran yang sama dalam semua platform. Oleh sebab itu, variabel yang bertipe integer berukuran sama. Ketika dibuat sebuah file, maka file tersebut bisa dijalankan pada perangkat manapun.
- Menggunakan sistem exception-handling
Java juga mempunyai mekanisme exception -handling yang bisa diandalkan. Exception-handling ini menyediakan cara untuk memisahkan anatar bagian penganan kesalahan dan bagian kode normal. Dengan begitu kode tersebut dituntun ke strukstur kode program yang jauh lebih bersih. Apabila kesalahan ditemukan, maka Java akan membuat exception. Exception ini bisa ditangkap serta dikelola oleh program tanpa memberikan dampak yang lebih buruk.
- Mendukung Native method
Java juga mendukung native mehod atau sebuah fungsi yang ditulis di bahasa lain, khususnya C atau C++. Dengan adanya dukungan secara native method ini dapat memungkinkan programer menulis berbagai fungsi yang bisa dilakukan dengan cepat jika dibandingkan fungsi yang lain.
- Terdapat Garbage Collector
Fungsi dari garbage collector mampu mengumpulka “sampah” secara otomatis. Dengan begitu, programmer tidak perlu dibebani dengan adanya memori yang rusak. Java ini dapat menghilangkan keperluan aritmatika pointer yang bisa jadi membahayakan dan peluang terjadinya kesalahan juga tinggi.
- Daftar perpustakaan yang lengkap
Bahasa Java mempunyai daftar perpustakaan yang cukup lengkap. Dengan begitu, programmer dapat membuat suatu aplikasi sesuai dengan apa yang diinginkan. Perlu diperhatikan jika tidak semua bahasa pemrograman memiliki database yang diinginkan oleh programmer. Java menjadi populer juga karena ini.
- Adanya Fitur GUI
GUI atau singkatan dari Grafical User Interface merupakan salah satu fitur yang ada di dalam Java. Elemen dasar pada Java untuk terciptanya tampilan berbasis grafis ada dua macam yakni AWT dan juga Swing. AWT adalah singkatan dari Abstract Windowing Toolkit merupakan sebuah pustaka windowing yang bertujuan secara umum dan juga multiplatform.
- Penyempurna dari C++
Bagi kamu yang terbiasa dengan bahasa pemrograman C++, kamu tidak perlu khawatir akan kesulitan dengan bahasa pemrograman java. Sebab, pada Java gayanya sudah disesuaikan dengan C++. Bahkan dengan Java, kamu dapat memperluas kode-kode yang kamu inginkan dibandingkan melalui C++.
### Tools
#### JDK
Java Development Kit (JDK) merupakan komponen inti dari Java. Java Development Kit adalah tools yang digunakan seorang developer dalam proses developing, debugging, dan monitoring suatu aplikasi Java. Di dalam JDK juga terdapat Java Runtime Environment yang digunakan untuk menjalankan suatu aplikasi Java.
#### IDE
IDE (Integrated Development Environment) adalah sebuah tools yang membantu developer untuk membuat aplikasi. Di dalam IDE terdapat source code editor, boot automation tools dan debugger. Contoh NeatBeans, OpenJDK, Intellij.
### Tipe Data
Tipe data adalah adalah sebuah pengklasifikasian data berdasarkan jenis data tersebut. Tipe data dibutuhkan agar kompiler dapat mengetahui bagaimana sebuah data akan digunakan. Untuk mengembangkan sebuah program, ada beberapa tipe data yang akan kita pelajari. Di antaranya adalah Character, String, Array, Numbers dan Booleans.
#### - Integer
Tipe bilangan bulat (Integer) adalah tipe data numerik yang biasa digunakan apabila bertemu dengan bilangan bulat, seperti 1, 27, 100, dll. Bilangan ini juga mengenal nilai positif dan negatif (signed number). 
#### - Float
Tipe float biasa digunakan untuk menandai nilai yang presisi seperti ketelitian tunggal (single precision) dengan menggunakan penyimpanan 32-bit. Tipe ini memiliki kemampuan yang lebih cepat jika digunakan pada prosesor-prosesor tertentu dan pastinya memakan ruang penyimpanan yang lebih kecil dari tipe double. Tipe data float akan bermasalah pada saat nilainya terlalu kecil atau terlalu besar, karena pada penerapannya nilai tersebut menjadi tidak akurat.
#### - Double
Tipe double memiliki tingkat ketelitian secara ganda atau double precision dengan menggunakan ruang penyimpanan 64-bit dalam menyimpan nilainya. Tipe tersebut pastinya memberikan kemampuan menghitung matematis secara lebih cepat dari tipe float. Dalam perhitungan yang bersifat bilangan riil dan menginginkan hasil yang lebih akurat, sebaiknya menggunakan tipe ini.
#### - String
Tipe data string terdiri dari kumpulan karakter dengan panjang tertentu, dan seringkali dianggap sebagai tipe data dasar. Hal ini dikarenakan hingga saat ini tipe data string paling sering digunakan oleh para programmer.
#### - Char
Tipe data (char) merupakan tipe data yang digunakan untuk menyimpan satu huruf, angka, tanda baca, simbol, atau spasi kosong. Umumnya, tipe data ini dipakai dalam bahasa pemrograman di berbagai komputer modern untuk menyimpan karakter alfabet dengan menampilkan masing-masing karakter menggunakan kode numerik kecil. Jumlah karakter yang harus disimpan dalam tipe data ini cukup banyak dan oleh karena itu penggunaan bitnya juga harus mewakili setiap karakter secara unik. Penyimpanan karakter ini biasanya disimpan sebagai bilangan bulat tidak bertanda berukuran 8 bit dengan rentang kode dari 0 sampai 255.
#### - Boolean
Tipe data boolean merupakan tipe yang memiliki dua nilai yaitu benar (true) atau salah (false). Nilai yang digunakan pada tipe ini sangat penting dalam mengambil keputusan suatu kejadian tertentu.
### Array
Array adalah sebuah variabel yang bisa menyimpan banyak data dalam satu variabel. Array menggunakan indeks untuk memudahkan akses terhadap data yang disimpannya. Indeks array selalu dimulai dari 0 dan perlu diketahui juga, indeks tidak selalu dalam bentuk angka. Bisa juga karakter atau teks.
### Operator
Operator dalam pemrograman digunakan untuk melakukan operasi tertentu. Misalkan kita ingin menjumlahkan nilai dari variabel x dan y, maka kita bisa menggunakan operator penjumlahan (+).
#### Jenis Operator dalam Java
#### - Operator Assignment
Operator assignment adalah operator yang digunakan untuk memberikan sebuah nilai ke variabel tertentu. Disimbolkan dengan tanda sama dengan (=).
#### - Operator Aritmatika
Operator aritmatika merupakan operator yang digunakan untuk melakukan operasi aritmatika, seperti tambah (+), kurang (-), kali (*), bagi (/).
#### - Operator Equality dan Relational
Operator pembanding adalah operator untuk memabndingkan dua buah nilai. Operator ini menentukan apakah satu operan lebih besar dari, kurang dari, sama dengan, atau tidak sama dengan operan lain. Hasil dari operator ini adalah boolean.
#### - Operator Conditional
Operator conditional dipakai untuk menghasilkan nilai boolean true atau false dari dua kondisi atau lebih. 
&& (AND) = Jika keduanya True maka akan True
|| (OR) = Jika ada salah satu yg True maka akan True
### Input Output
Seperti yang kita ketahui program komputer terdiri dari 3 komponen yaitu input, proses dan output. Input yaitu nilai yang kita masukkan ke dalam program. Sedangkan proses adalah step by step yang dilakukan untuk mengelola input menjadi sesuatu yang berguna atau output. Output adalah hasil dari pengolahannya. Class yang digunakan Java untuk mengolah inputnya itu Class Scanner, BufferedReader dan Konsol. Scanner adalah class yang menyediakan fungsi-fungsi untuk mengambil input dari keyboard. 
### Branching
Percabangan hanyalah sebuah istilah yang digunakan untuk menyebut alur program yang bercabang. Percabangan juga dikenal dengan “Control Flow”, “Struktur Kondisi”, “Struktur IF”, “Decision”, dsb. Semuanya itu sama. Pada diagram alur (Flow Chart) seperti di atas, alurnya memang satu. Tapi setelah kita menggunakan percabangan, alurnya akan bertambah. Pada java kita menggunakan kata kunci if, else, switch, dan case, dan operator ternary.
#### - Percabangan IF
Percabangan ini hanya memiliki satu pilihan. Artinya, pilihan di dalam IF hanya akan dikerjakan kalau kondisinya benar. Tapi kalau salah tidak akan melakukan apa-apa. Alias lanjut eksekusi ke perintah berikutnya.
#### - Percabangan IF/ELSE
Percabangan ini memiliki pilihan alternatif kalau kondisinya salah.
IF: “Jika kondisi benar maka kerjakan ini, kalau tidak silahkan lanjut”
IF/ESLE: “Jika kondisi benar maka kerjakan ini, kalau salah maka kerjakan yang itu, setelah itu lanjut”.
#### - Percabangan IF/ELSE dengan Operator Ternary
Operator ternary memiliki konsep yang sama seperti percabganan IF/ELSE.
#### - Percabangan IF/ELSE/IF
Jika percabangan IF/ESLE hanya memiliki dua pilihan saja. Maka percahangan IF/ELSE/IF memiliki lebih dari dua pilihan.
Format:
if (suatu kondisi) {
    // maka kerjakan ini
    // kerjakan perintah ini juga
    // …
} else if (kondisi lain) {
    // kerjakan ini
    // kerjakan ini juga
    // …
} else if (kondisi yang lain lagi) {
    // kerjakan perintah ini
    // kerjakan ini juga
    // …
} esle {
    // kerjakan ini kalau
    // semua kondisi di atas
    // tidak ada yang benar
    // …
}
#### - Percabangan SWITCH/CASE
Percabangan SWITCH/CASE sebenarnya adalah bentuk lain dari IF/ELSE/IF. Bedanya, percabangan ini menggunakan kata kunci switch dan case.
### Looping
Looping digunakan jika kita ingin melakukan program yang berulang. Contohnya for, whilw, do-while.
Perulangan dalam pemrograman dibagi menjadi dua jenis:
#### 1. Counted Loop
Perulangan yang jumlah pengulangannya terhitung atau tentu. Counted loop terdiri dari perulangan For dan For each.
#### For
#### For Each
Perulangan ini sebenarnya digunakan untuk menampilkan isi dari array. Singkatnya, array itu variabel yang menyimpan lebih dari satu nilai dan memiliki indeks.
#### 2. Uncounted Loop
Perulangan yang jumlah pengulangannya tidak terhitung atau tidak tentu. Uncounted loop terdiri dari perulangan While dan Do/While.
#### Perulangan While
While bisa kita artikan selama. Cara kerja perulangan ini seperti percabangan, ia akan melakukan perulangan selama kondisinya bernilai true.
#### Struktur penulisan:
while ( kondisi ) {
    // blok kode yang akan diulang
}
#### Perulangan Do-While
Cara kerja perulangan Do/While sebenarnya sama seperti perulangan While. Bedanya, Do/While melakukan satu kali perulangan dulu. Kemudian mengecek kondisinya.
#### Struktur penulisan:
do {
    // blok kode yang akan diulang
} while (kondisi);

# TUGAS
Link : https://docs.google.com/document/d/1Vo2rER-IJ7xOwj9zwthoLn9Cz0RoQgH7iU3um8JgIQ0/edit?usp=sharing
