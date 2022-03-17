# 14 Pengenalan RESTful API
## API
API (Application Programming Interface) merupakan suatu penghubung yang memungkinkan suatu aplikasi untuk berinteraksi dengan aplikasi lainnya dan berbagi data. Tujuan dari penggunaan API adalah untuk mempercepat proses development dengan menyediakan function secara terpisah sehingga developer tidak perlu membuat fitur yang serupa. API berperan sebagai pembawa pesan yang menerima permintaan dari pengguna dan memberitahu sistem apa yang harus dilakukan lalu memberikan respon yang sesuai untuk permintaan tersebut.
## REST API
- REST (REpresentational State Transfer) merupakan standar arsitektur komunikasi berbasis web yang sering diterapkan dalam pengembangan layanan berbasisi web. Umumnya menggunakan HTTP (Hypertext Transfer Protocol) sebagai protocol untuk komunikasi data. REST pertama kali diperkenalkan oleh Roy Fielding pada tahun 2000.
- REST merupakan salah satu implementasi dari web service sebagai standar yang digunakan untuk pertukaran data antar aplikasi maupun sistem.
- Data yang umumnya digunakan adalah JSON.
### HTTP Method
HTTP dirancang untuk memungkinkan komunikasi antar client dan server.  HTTP berfungsi sebagai protokol respon dari permintaan client dan server.
### Method:
- GET -> digunakan mengambil informasi tentang resource yang telah ditentukan oleh URL. Singkat GET digunakan untuk membaca data. 
- PUT -> digunakan untuk mengirim data ke server untuk membuat maupun memperbaharui resource. 
- POST -> digunakan untuk mengirimkan data baru ke server. Simpelnya method POST ini digunakan untuk membuat data baru. Request POST mungkin berisi beberapa data untuk dikirimkan ke server. 
- DELETE -> digunakan untuk menghapus resource yang sudah ditentukan 
- PATCH 
- HEAD
- OPTION
### REST API Component
- Method
- URL (Base URL + Path)
- Header
- Body
### JSON
JSON (JavaScript Object Notation) adalah sebuah format data file yang digunakan untuk pertukaran dan penyimpanan data. JSON merupakan bagian dari JavaScript.
### HTTP Response Code
- 200 -> OK
- 201 -> Create (Method POST and PUT)
- 404 -> Method POST and PUT tetapi datanya tidak sesuai maupun kesalahan dalam format
- 404 -> Respurce tidak ditemukan
- 401 -> Terjadi karena kita tidak melakukan autentifikasi terlebih dahulu sebelum melakukan request
- 405 -> Request tidak support
- 500 -> Error server

## API Testing
- API testing adalah test yang dilakukan pada layer dimana API yang didesain untuk berinteraksi atau berkomunikasi pada aplikasi dipastikan functional test-nya,  melalui rangkaian atau set dari sebuah test. 
- Sederhanannya API testing diharapkan bisa memberikan gambaran tentang bagaimana response dari aplikasi web tanpa atau sebelum GUI nya siap atau dalam proses. 
- API testing sangat berbeda dengan GUI.
### Kind od API Testing
### 1. Functionality
Test ini ditujukan untuk memvalidasi suatu fitur apakah sudah berfungsi atau belum.
### 2. Load Test
Load test memiliki tujuan untuk menguji kekuatan ke sistem apakah mampu mengolah data dari beban yang diberikan.
### 3. Security
Test ini memiliki tujuan untuk menguji keamanan suatu sistem. 
### API Testing Tools
- PostMan
- Frisby
- JMeter
- Rest-assured
## Difference between API Test & Unit Test
### Unit Test
- Dilakukan oleh developer
- Fungsi-fungsi terpisah
- Developer bisa mengakses source code
- Hanya dasar functionality yang di test
- Scopenya terbatas
- Biasanya dilakukan sebelum build
### API Test
- Tester perform it
- End to End
- Tidak bisa mengakses source code
- Hanya fungsi API saja
- Semua functional issue
- Scopenya lebih luas
- Dilakukan setelah build
### API Testing Process
### 1. Specification Review
Tahap ini memiliki tujuan untuk mereview dari spesifikasi API dan dokumen.
### 2. Specification Development
Tahap ini memiliki tujuan untuk memastikan detail dokumen mengenai condition dan ekspektasi hasilnya di setiap test case.
### 3. Framework Development
Pada tahap ini kita harus memilih untuk memakai tools apa pada API testing nanti. 
### 4. Test Case Development
Padatahap ini kita akan membuat test scenario mupun test case nya. 
### 5. Execution & Report
Mengeksekusi test case yang telah kita buat dan membuat report hasil dari testing yang telah kita lakukan. 
### Test Case API Testing
- Mendapatkan response yang sesuai dengan inputan
- Apakah memberikan balikan atau tidak
- Apakah mengganggu fitur yang lain atau tidak
- Update struktur data
- Memodifikasi data yang ada.
### Best Practice of API Testing
- Kelompokkan test case kedalam beberapa kategori
- Beri judul yang sesuai pada setiap test
- Harus berhati-hati ketika melakukan test yang berhubungan dengan menghapsu sesuatu
- Ketika membuat test case harus dipikirkan juga segala kombinasi input pada API
### Types of Output of an API
- Bisa berbentuk apa saja, tapi pada umumnya JSON atau XML
- Response apakah Pass atau Fail
- Memanggil fungsi API lain
### Common Types of Test in API Testing
- Memverifikasi apakah kita mendapat respon dari API
- Memverifikasi apakah hasil input/request sudah sesuai atau belum
- Memverifikasi apakah data yang kita input/update sudah benar-benar berubah atau bertambah
- Memverifikasi waktu response yang dibeirkan
### Types of Bugs that API testing detects
- Gagal melakukan error handling pada keadaan tertentu
- Kesulitan untuk tersambung dan mendapat respon API
- Isu keamanan
- Performance issues
- Error atau warning yang tidak tepat
- Struktur dari data respon tidak benar (JSON & XML)
### Advantages of Testing API
- Efisiensi waktu
- Bahasa yang independen
- Mengurangi biaya testing
- Mengurangi resiko
### Challenges of API Testing
- Kombinasi parameter, pemilihan parameter
- Tidak ada GUI
- Kita harus mengetahui terlebih dahulu parameter
- Perlu juga mengetest error handling dari setiap API.

# TUGAS
Link TestRail : https://elfridatampubolon12.testrail.io/index.php?/projects/overview/2

Link Spreedsheet : https://docs.google.com/spreadsheets/d/1FcH0-y_8LE3-esTA99vicqtBaiUdTe_I4wk-Mi7ZNqI/edit?usp=sharing
