# 22 Introduction JMeter and Tutorial Record with JMeter
- Apache JMeter adalah perangkat lunak sumber terbuka, aplikasi desktop Java 100% murni, yang dirancang untuk memuat uji perilaku fungsional dan mengukur kinerja situs web. Awalnya dirancang untuk aplikasi web pengujian beban tetapi sejak itu diperluas ke fungsi pengujian lainnya.
  
## Tools
- Apache Jmeter
- K6
- Locust
- Blazemeter
- Smartbear LoadNinja

## Beberapa komponen skrip JMeter
### Rencana Tes / Test Plan
- Rencana besar tes yang akan dilakukan (parent)

### Grup Utas / Thread Groups
- Sekelompok utas menjalankan skenario yang sama

### Sampler / Samplers
- Sebutan untuk request yang dikirim ke server

### Elemen konfigurasi / Config elements
- Elemen yang digunakan untuk konfigurasi atau modifikasi sampier requests yang dikum ke server


### Pendengar / Listeners*
Perekam data yang dihasilkan dan tes

### Pengatur waktu / Timers
- Fitur ini akan jalan duluan sebelum semua fitur yong loin berjalan

### Pernyataan / Assertions
- Seperti pernyataan di API/Web/Testing, ini adalah kriteria tambahan apakah lulus/tidak

### Prosesor pra-posting / Pre-post processors
- Fitur yang memproses response data sebelum/sesudah tes

## Summary Report
Summary rate = (jumlah_response_2xx / jumlah_thread)*100%