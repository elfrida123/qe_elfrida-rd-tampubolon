# 25 Mobile Testing
Mobile testing adalah proses dimana aplikasi yang dikembangkan untuk perangkat mobile diuji untuk kegunaan dan konsistensinya. Ada dua macam pengujian yang harus dilakukan untuk aplikasi pada perangkat mobile yaitu pengujian hardware dan software.
## Testing Hardware 
Hardware termasuk prosesor, memori internal, ukuran layar, resolusinya, besarnya RAM, kemampuan kamera, bluethooth, WIFI dan lain-lain akan menjadi komponen yang yang harus diuji dalam proses pengujian ini.

## Testing Software
Dalam tahap ini kemudian aplikasi mobile yang telah dikembangkan akan diuji secara mendetail dan teliti. Fungsi dan konsistenti sebuah aplikasi mbile akan diuji. Seperti kita ketahui bahwa aplikasi mobile terbagi menjadi tiga macam yakni: aplikasi mobile native, aplikasi mobile hybrid dan aplikasi mobile web. Ketiga nya memiliki perbedaan dasar yang tentunya akan mempengaruhi proses pengujian.
Pengujian aplikasi mobile jauh lebih kompleks dibanding pengujian aplikasi atau web untuk dekstop karena:
- Perangkat mobile memiliki banyak macam ukuran layar konfigurasi hardware seperti keypad, virtual keypad (touch screen), trackball dan lain-lain.
- Bermacam-macam sistem operasi yang di pakai, seperti android, windows, blackberry, dan iOS
- Bermacam-macam versi dari sistem operasi
- Bermacam-macam jenis jaringan mobile, seperti CDMA atau GSM, berkemampuan EDGE, 3G, atau 4G.

Untuk mengatasi semua masalah teknis di atas, ada beberapa macam testing yang selayaknya dilakukan pada aplikasi mobile.
- Usability testing, untuk memastikan bahwa aplikasi mobile mudah digunakan dan memberikan user experience yang baik untuk penggunanya.
- Compatibility testing, pengujian aplikasi dengan perangkat mobile yang berbeda, melalui browser, dengan ukuran layar yang berbeda serta versi OS sesuai dengan kebutuhan.
- Interface testing, pengujian pilihan menu, tombol, bookmark, history, pengaturan, dan anvigasi dari aplikasi
- Service testing, pengujian aplikasi dalam keadaan online maupun offline
- Low leve resource testing, pengujian memori, auto-delete file-file sementara, masalah pertumbuhan database.
- Performance testing, pengujian kinerja aplikasi dengan mengubah koneksi dari 2G atau 3G ke wifi. Bagaimana kemampuan berbagi dokumennya dan bagaimana kapasitas baaterai yang dibutuhkan.
- Operational testing, backup dan rencana recovery jika baterai melemah atau saat kehilangan data karena proses upgrade dari toko aplikasi.
- Installation testing, validasi aplikasi dengan menginstall atau menguninstall pada perangkat mobile
- Securuty testing, pengujian aplikasi untuk memvalidasi apakah data terlindungi system informasi.

## Appium
- Appium adalah mobile web native dan hybrid software application test automation tools
- Appium open source
- Appium bisa “cross-platform” automation tool , Jadi kalian bisa membuat software automatios test script di IOS dan Android menggunakan API yang sama.
- “cross-platform” Mengizinkan kalian untuk menggunakan code yang bisa di gunakan di IOS dan Android test suites.
- Appium dapat di jalankan di Android devices simulator atau di real devices.
- Appium dibangung diatas beberapa filosopi penting :
  - Tidak perlu me-rekompile aplikasi kalian untuk menjalankan automasi.
  - Tidak terpaku pada spesifik bahasa pemrograman atau framework tertentu
- Appium support Android, iOS, dan Windows apps.

### Appium Components
Pada appium terdapat 2 komponen besar yang kita gunakan yakni:
- Appium Server : merupakan komponen inti dari arsitektur Appium yang ditulis dalam node.js yang berjalan di mesin atau di code.
- Appium Client : library yang ditulis dalam beberapa bahasa untuk membuat skrip pengujian sehingga kita dapat mengirim perintah ke server appium.

## Using Maven Archetype
- Pola dasar Maven digunakan untuk menghasilkan proyek dasar dengan semua dependensi dan struktur dasar
- Serenity memiliki perpustakaan pola dasar sehingga Anda dapat menghasilkan proyek sampel baik menggunakan baris perintah atau menggunakan IDE
- Anda dapat mengakses sampel pola dasar yang dihasilkan di github
- Sudah menggunakan versi serenity-core terbaru.

## Appium basic action and cucumber
### 1. Kerangka Cucumber
- Cucumber BDD adalah kerangka kerja yang mendukung untuk membuat tes Otomasi pengembangan yang digerakkan oleh perilaku (BDD)
- Menggunakan Sintaks gherkin
- Mendukung berbagai bahasa pemrograman Java, Ruby, JavaScript, Python
- Memiliki fitur dan dukungan hebat dengan Intellij IDEA IDE.

### Cucumber Tags
- Tag adalah cara yang bagus untuk mengatur fitur dan skenario Anda
- Mereka dapat digunakan untuk dua tujuan
  - Menjalankan subset skenario
  - Membatasi kait ke subste skenario
- Anda dapat meletakkan tag pada kata kunci Fitur atau Skenario di atas pada file fitur
- Tag pada kata kunci Fitur akan mewarisi semua skenario di dalam file fitur/
- Tag pada kata kunci skenario hanya diterapkan pada skenario tunggal

###The WebdriverWait Object
- Objek WebdriverWait digunakan untuk mengatur waktu tunggu hingga elemen memenuhi kondisi
  Contoh : Tunggu sampai elemen terlihat tunggu sampai elemen hilang.
- Ini adalah bagian dari penantian eksplisit
- Konstruktor itu sendiri memiliki 3 parameter
  1. Parameter pertama untuk Objek AndroidDriver
  2. Parameter ke-2 untuk timeoit (waktu maksimum kita menunggu elemen memenuhi kondisi)
  3. Parameter ke-3 untuk waktu pemungutan suara (periksa setiap dan penggilingan)
- Objek ExoectedConditions menyimpan daftar kondisi yang didukung oleh appium

# TUGAS
HASIL

![This is an image](https://github.com/elfrida123/qe_elfrida-rd-tampubolon/blob/master/25_Mobile%20Testing/screenshots/Result.PNG)

## Scenario 1
![This is an image](https://github.com/elfrida123/qe_elfrida-rd-tampubolon/blob/master/25_Mobile%20Testing/screenshots/Scenario1.PNG)

## Scenario 2
![This is an image](https://github.com/elfrida123/qe_elfrida-rd-tampubolon/blob/master/25_Mobile%20Testing/screenshots/Scenario2.PNG)

## Scenario 3
![This is an image](https://github.com/elfrida123/qe_elfrida-rd-tampubolon/blob/master/25_Mobile%20Testing/screenshots/Scenario3.PNG)

## Scenario 4
![This is an image](https://github.com/elfrida123/qe_elfrida-rd-tampubolon/blob/master/25_Mobile%20Testing/screenshots/Scenario4.PNG)

## Scenario 5
![This is an image](https://github.com/elfrida123/qe_elfrida-rd-tampubolon/blob/master/25_Mobile%20Testing/screenshots/Scenario5.PNG)

## Scenario 6
![This is an image](https://github.com/elfrida123/qe_elfrida-rd-tampubolon/blob/master/25_Mobile%20Testing/screenshots/Scenario6.PNG)
