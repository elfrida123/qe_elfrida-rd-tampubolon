# 18 RESTful API Testing with Rest Assured
## API Concept and Fundamental
- REST merupakan standrard arsitektur komunikasi berbasis web yang sering diterapkan dalam pengembangan layanan berbasis web umumnya menggunakan HTTP sebagai protokol sebagai komunikasi data. REST merupakan salah satu pemgimplementasian web service yang digunakan sebagai pertukaran data.
- REST API berisi aturan yang membatasi programmer dalam melakukan tindakan tertentu, terdapat request dan response pada data yang dikirimkan atau diterima , data biasanya yang diterima adalah JSON.

### API Concept
Ketika kita berasa di restoran atau rumah makan dimana client diibaratkan sebagai kita , dimana client akan melakukan request atau pemesanan makanan kepada waiter , dimana waiter disini akan berperan sebagai API . waiter tugasnya menerima request dari client dan menyampaikan request kepada koki atau yang berada di dapur. Kemudian setelah request diberikan kepada chef maka chef akan memproses pesanan dan memberikan hasil request kepada waiter, kemudian waiter akan memberikan makanan atau request pesanan ke pemesan makanan.

### Fundamental API
1. Record, Define API Information 
2. Parsing , Filter of Recording API DATA And then extract
3. Reconstruction API calls and sent them from a simulate a client
4. Test Validation

### The Practice Test Pyramid
Test Pyramid dikelompokkkan ke dalam berbagai kategori, mirip dengan konsep piramida nutrisi jumlah test akan secara teoritis akan berkurang saat kita naik dalam kategori dan memiliki test setiap kategori memungkinkan mempunyai rangkaian menyeluruh.
Bagian-bagian Test Pyramid:
### - UNIT TESTING
Unit test merupakan pengujian perangkat lunak yang menguji setiap unit atau komponen sebuah perangkat lunak. Unit testing dilakukan pada masa pengembangan atau pada saat menuliskan code program perangkat lunak dari si developer. Seperti namanya, komponen yang diuji pada unit testing adalah unit-unit dari perangkat lunak. Unit disini dapat berupa function, method, procedure, module, maupun object. Tujuan dari unit testing adalah untuk memvalidasi setiap unit dari kode perangkat lunak dapat berjalan seperti yang diharapkan.

- COMPONENT TESTING
Komponen Testing merupakan pengujian perangkat lunak dimana pengujian dilakukan pada setiap komponen terpisah tanpa mengintegrasikan dengan komponen lain. Salah satu black box testing yang dilakukan QA.

### - INTEGRATION TESTING
Integration testing adalah pengujian dari hasil penggabungan unit yang ada di dalam software. Biasanya QA menguji bagaimana unit-unit tersebut bekerja sebagai suatu kombinasi, bukan lagi sebagai suatu unit yang individual. Integration testing sebaiknya dilakukan secara bertahap untuk menghindari kesulitan penelusuran jika terjadi kesalahan error / bug.

### - UI TEST (End-to-end)
UI test adalah yang paling dekat dengan interaksi pengguna pada aplikasi web atau android atau ios. User input harus memicu tindakan yang tepat, data harus disajikan kepada pengguna, status UI harus berubah seperti yang diharapkan. Ini adalah testing dengan tingkatan tertinggi. Dengan menggunakan alat atau kerangka kerja, uji E2E memberi tahu browser apa yang harus dilakukan, klik, ketik, dan kemudian harapkan perilaku aplikasi berdasarkan tindakan. Adalah baik untuk memiliki cakupan penuh dengan tes unit dan integrasi.

### Kesimpulan Testing Pyramid:
### 1. Semakin tinggi level yang Anda dapatkan, semakin sedikit tes yang harus Anda lakukan.
- Karena semakin tinggi level yang Anda dapatkan, biaya untuk menulis, menjalankan di dalam pipeline, dan memelihara lebih mahal.
- Pengujian tingkat rendah cenderung berjalan lebih cepat karena tidak memerlukan pohon DOM lengkap untuk dijalankan dan mudah dirawat karena pengujian ini kecil.
### 2. Tulis tes dengan tingkat detail yang berbeda.
- Anda harus fokus pada pengujian unit, menulis banyak pengujian unit kecil dan cepat untuk mencakup semua cabang pernyataan kondisi, input dan output fungsi, dll.
- Tulis beberapa tes integrasi lagi untuk memastikan aplikasi Anda berperilaku dengan benar.
- Tulis beberapa pengujian tingkat tinggi yang menguji aplikasi Anda dari ujung ke ujung.
- Berhati-hatilah agar Anda tidak berakhir dengan rangkaian pengujian besar-besaran pada integrasi dan E2E yang akan menjadi mimpi buruk untuk dipelihara dan membutuhkan waktu terlalu lama untuk dijalankan.
### 3. Bahkan kami dapat menampilkan semua aplikasi dan koneksi dari ujung ke ujung untuk diuji. Tetapi kami tidak dapat menguji semua gaya atau apakah UI cocok dengan desain. Itulah mengapa tes tingkat tinggi harus fokus pada skenario penting.

## TUGAS
![This is an image](https://github.com/elfrida123/qe_elfrida-rd-tampubolon/blob/master/18_RESTful%20API%20Testing%20with%20Rest%20Assured/screenshots/TUGAS.PNG)

Link : https://github.com/elfrida123/qe_elfrida-rd-tampubolon/tree/master/18_RESTful%20API%20Testing%20with%20Rest%20Assured/praktikum


