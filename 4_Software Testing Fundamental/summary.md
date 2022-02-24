# Software Testing Fundamental
## Resume
Pada materi ini akan mempelajari tentang:
1. Apakah itu Software Testing
2. Seberapa Penting Software Testing
3. Testing Platform
4. Jenis-jenis Software Testing
5. Level of Testing

## 1. Software Testing
Menurut ANSI / IEEE 1059, sebuah software testing adalah sebuah proses menganalisis item perangkat lunak untuk mendeteksi perbedaan antara kondisi yang sekarang dan kondisi yang diperlukan untuk mengevaluasi fitur item perangkat lunak.

## 2. Seberapa Penting Software Testing
Dengan adanya software testing dapat:
- Menghemat uang (saves money)
- Menjamin kualitas produk (product quality)
- Keamanan terjaga (security)
- Kepuasan konsumen atau pelanggan (customer satisfaction)
Software bugs bisa sangat berbahaya dan mahal. Software bugs dapat menyebabkan krisis moneter dan manusia

## 3. Testing Platform
## Jenis-jenis Testing Platform
### 1. API (Application Programming Interface)
API adalah definisi dan protokol untuk membangun dan mengintegrasikan sebuah software. API adalah pengembangan dari inovasi software yang memungkinkan berbagai aplikasi bertukan data dan fungsionalitas dengan mudah dan aman.
### 2. Web
Web atau website adalah sebuah kumpulan hal yang berisi informasi tertentu dan dapat diakses melalui internet. Website dapat dibukan dengan menuliskan URL atau halaman tempat website di browser.
### 3. Mobile
Dalam software testing platform mobile dibedakan menjadi 2 jenis yaitu android dan iOS.
### 4. Dekstop
## 4. Jenis-jenis Software Testing
### 1. Fungsional Testing
Fungsional testing adalah jenis pengujian yang memverifikasi bahwa setiap fungsi atau aplikasi telah beroperasi sesuai dengan requirement
#### Manual Testing
- Manual testing adalah langkah untuk mencari cacat atau bugs dari perangkat lunak
- Pada metode ini tester memiliki peran penting sebagai pengguna akhir untuk pengecekan semua fitur aplikasi bekerja dengan benar. Penguji melakukan pengujian tanpa bantuan tools atau script.
- Tujuannya adalah untuk menguji aplikasi bebas cacat dan aplikasi sesuai dengan yang diharapkan.
- Software tester akan menjalankan test cases tersebut
- Test cycle lebih lambat
- Membantu mmeberikan opini atau input mengenai tampilan UI
#### Automation Testing
- Sebuah metode pengujian software yang menggunakan suatu software testing dengan tujuan untuk membandingkan output yang diprediksikan dengan output yang dihasilkan
- Tester membuat script/code untuk test case tersebut lalu dijalankan dengan automation tools
- Automation terbatas
### 2. Non-Fungsional Testing
Non-fungsional testing adalah pengujian dari aspek non-fungsional suatu aplikasi seperti kinerja, kegunaan, keamanan, dll. Non-fungsional testing dilakukan setelah fungsional testing selesai. Dengan menerapkan non-fungsional testing kita dapat meningkatkan kualitas software. Contohnya performance testing.
#### Performance Testing
Performance testing merupakan jenis pengujian perangkat lunak yang memastikan aplikasi bekerja dengan baik dibawah beban kerja yang diharapkan.
Concern:
  - Speed
    Speed menentukan kecepatan respon aplikasi
  - Scalability
    Scalability menentukan maksimum user load yang dapat di handle aplikasi
  - Stability
    Stability menentukan kestabilan aplikasi dalam berbagai jenis jumlah load
### 3. Maintenance Testing
Maintenance testing dilakukan setelah aplikasi atau perangkat lunak dirilis ke konsumen atau user. Maintenance testing diperlukan untuk mempertahankan atau meningkatkan karakteristik, kualitas non-fungsional testing dari komponen atau sistem selama masa pakainya terutama efisiensi kerja, kompetibelitas, keandalan, keamanan, dan portabilitas. Contoh : regression testing.
#### Regression Testing
Setiap kali ada fungsionalitas baru ditambahkan atau fungsionalitas lama dihapus dalam aplikasi, maka harus dilakukan regression testing untuk memastikan ada atau tidaknya bugs baru.
## 5. Level of Testing
#### Unit Testing
Unit testing adalah sebuah pengujian perangkat lunak yang menguji komponen atau unit dari sebuah perangkat lunak. Unit testing dilakukan pada saat masa development dari sebauh perangkat lunak oleh developer. Unit dapat berupa method, function, procedure, module, object. Tujuan unit testing adalah untuk memvalidasi setiap unit dari code perangkat lunak seperti yang diharapkan. Contoh automation testing yang digunakan untuk unit testing adalah sebagai berikut:
- JUnit
- NUnit
- JMockit
- Emma
- PHP Unit
#### Integration Testing
Integration testing adalah pengujian dari penggabungan unit-unit yang ada di dalam perangkat lunak. Tester menguji bagaimana unit-unit tersebut bekerja dalam suatu kombinasi. Integration testing sebaiknya dilakukan secara bertahap untuk menghindari kesulitan penelurusan jika terjadi error/bugs.
Tujuan :
- Memeriksa suatu aplikasi atau sogftware berjalan dengan baik
- Memeriksa kinerja suatu aplikasi atau software
- Menguji struktur orogram yang sudah dirancang
#### System Testing
System testing merupakan testing yang dilakukan pada satu keseluruhan sistem yang dilakukan end-to-ed testing untuk memverifikasi semua scenario telah berjalan dengan baik. Cakupan sistem testing akan menguji aspek-aspek fungsional dan non-fungsional dari sebuah pernagkat lunak tersebut telah memenuhi persyaratan untuk digunakn oleh pengguna.
#### Acceptance Testing
Acceptance testing digunakan untuk menentukan apakah sistem yang dikembangkan telah memenuhi kebutuhan pengguna. Dalam beberapa proyek acceptance testing biasanya dilakukan pada tahap terakhir proses pengujian yaitu sebelum diserahkan kepada pengguna. Acceptance testing biasanya dilakukan setelah beberapa rangkaian testing seperti unit testing, integration testing, system testing selesai. Acceptance testing bertujuan untuk apakah aplikasi yang dibuat sudah sesuai dengan proses bisnis dan kebutuhan atau tidak.

# TUGAS
