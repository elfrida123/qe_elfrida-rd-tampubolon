# 21 Fundamental Performance Test

## Performance Test

### Apa itu Performance Test?
Performance test merupakan teknik non-functional testing untuk menentukan parameter sistem dalam hal responsive dan stabilitas di bawah berbagai beban (load kerja). Performance testing mengukur kualitas atribut dari sistem seperti stabilitas, ketahanan, dan penggunaan resources. Hasil pengujian biasanya berupa number of virtual users.

### Apa yang Diukur dari Performance Test?
- Performance suatu aplikasi sampai suatu batas teretentu
- Bukan merupakan functional-test
- Bisa dalam berbagai macam bentuk untuk memahami reliability, stability dan availability pada environment-nya.

### Mengapa Performance Test Jarang Dilakukan?
Pada umumnya performance testing cukup mahal untuk diaplikasikan dan dijalankan, namun dapat dijadikan tolak ukur apakah sistem tersebut dapat mengakomodasi traffic yang ada. Hal ini disebabkan karena pengujian memerlukan persiapan yang dimana beberapa kasus harus membuat environment terpisah dari production agar tidak tercampurnya data test dengan data production, Environment ini ada juga yang membuatnya di server cloud yang biayanya bisa lebih besar dari environment production.

### Apa yang Perlu Diperhatikan dari Performance Test?
Throughput dan response data-nya.

## Metode Performance Test

### Membuat Test Plan
### Kenali yang dibutuhkan:
- Endpoint yang akan diuji:
  - /login
  - /beli_pulsa
  - /cek_out
- Kebutuhkan masing-masing endpoint:
  - Username dan password untuk endpoint /login
  - Produk, denom dan nomor untuk pengujian untuk endpoint /beli_pulsa
  - Metode pembayaran yang dipilih untuk endpoint /cek_out

### Menentukan Metode Test
- Pilih berdasarkan kondisi sistem, apakah belum pernah diuji atau sudah
  - Selalu awali dengan load test untuk tahu kondisi awal sistem
- Pilih berdasarkan situasi yang akan dihadapi

### Tipe-tipe Performance Testing
#### Smoke Testing
Smoke Testing adalah sejenis software yang dilakukan setelah perangkat lunak di build untuk memastikan bahwa fungsi penting dari program ini bekerja dengan baik. Ini dijalankan “sebelum” setiap tes fungsional atau regresi rinci dijalankan pada perangkat lunak membangun. Tujuannya adalah untuk menolak aplikasi yang rusak parah, sehingga tim QA tidak membuang waktu menginstal dan menguji aplikasi perangkat lunak.

#### Load Testing  
Load Testing adalah pengujian yang paling sederhana yang dilakukan untuk memahami perilaku sistem dalam keadaan beban tertentu. Hasil dari load test digunakan untuk mengukur kepentingan bisnis saat transaksi yang kritis dengan memonitor dampak terhadap database, application server atau pendukung lainnya.
Sederhananya load testing menentukan kelakuan sistem pada saat kondisi normal dan puncak. Idealnya, kita mengetahui jumlah traffic yang ada di prod sebagai nilai di load test.

#### Table Tier
Table Tier ini bisa dijadikan patokan ideal suatu sistem baru yang belum pernah masuk ke production.

#### Stress Testing
Stress testing digunakan untuk menguji stabilitas dan keandalan sistem. Tes ini dapat menentukan sistem pada ketahanan dan penanganan kesalahan dalam kondisi beban yang sangat berat sehingga memastikan bahwa sistem tidak akan crash di bawah situasi krisis.

#### Spike Testing
Seperti stress test, namun kenaikan langsung menuju melebihi puncak dilakukan dalam waktu singkat. Jika stress test memberikan waktu untuk scale-out, disini tidak.

#### Soak Testing
Soak Testing adalah menjalankan sistem pada beban tinggi untuk jangka waktu yang lama. Tujuannya adalah untuk mengetahui reliability ketika dalam tekanan di bawah puncak dalam jangka panjang (>=1 jam) serta mengetahui apakah terdapat bug pada race condition, memory leaks, db connections, dll.

### Istilah-istilah Penting pada Performance Testing
- System Under Test (SUT) : Sebutan untuk sistem yang sedang dilakukan test
- Load Generator : Sebutan untuk server yang digunakan untuk mmebuat request
- Throughput : Satuan kerja dalam satuan waktu. Misalnya Request per second (RPS) dan Request per minute (RPM)
- Performance Threshold : Target maksimal nilai yang diperbolehkan, misalnya response time 2 detik, Max CPU usage 70%, dsb
- Saturation : Kondisi dimana SUT atau Load Generator sudah dalam kondisi maksimum dalam merespon atau mengenerate.
- Virtual Users : Simulasi dari users yang melakukan pengujian, dapat melakukan satu atau lebih requests dalam satu iterasi.
- Response time : Lama waktu pengiriman request hingga menerima response.

## Tools Performance Testing
- LoadNinja
- HPLoad Runner
- JMeter

# TUGAS
1. Apa itu volume test? Apakah sama dengan load test?
Jawab: Volume test adalah salah satu jenis pengujian software non-functional yang menguji ketahanan suatu sistem ketika diberikan volume database atau data dalam jumlah yang banyak. Sering disebut dengan istilah flood test. Volume test dilakukan untuk menganalisis kinerja sistem dengan meningkatkan volume data dalam database. Sedangkan load test adalah pengujian software yang dilakukan untuk memahami perilaku sistem dalam keadaan beban (load) tertentu. Load test biasanya digunakan untuk persiapan menghadapi sebuah event musiman yang trafiknya bertambah seiring waktu. 
Volume test dan load test berbeda dimana load test menguji ketahanan sistem ketika diberi load (beban) kerja tertentu, sedangkan volume test menguji ketahanan sistem ketika diberikan volume database dalam jumlah banyak.

2. Bagaimana contoh sistem yang kurang stabil?

![This is an image](https://github.com/elfrida123/qe_elfrida-rd-tampubolon/blob/master/21_Fundamental%20Performance%20Test/screenshots/Tugas2.PNG)

Gambar diatas merupakan sistem yang kurang stabil karena melewati waktu rata rata yang ditunjukkan dengan telah mencapai grafik maximum. Hal tersebut mungkin terjadi karena adanya suatu events yang menyebabkan banyak user sedang menggunakan aplikasi dan membuat respon menjadi lebih lama. Dari gambar dapat dilihat bahwa pemakaian aplikasi yang paling banyak pada pukul 12.54. semakin banyak user yang menggunakan semakin lama prosesnya.

