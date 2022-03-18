# 17 From Manual to Automation Testing
Pada saat mengembangkan software, tentunya kita sering menemukan bug atau error. Untuk meminimalisir adanya bug pada software sebelum diberikan pada pegguna , kita perlu untuk melakukan testing pada software. Testing dapat dilakukan dengan cara manual testing dan automated testing.
## Manual Testing
Manual testing adalah langkah untuk mencari cacat atau bug pada program perangkat lunak. Pada metode ini tester atau penguji memiliki peran penting sebagai pengguna akhir pengecekan semua fitur aplikasi bekerja dengan benar. Penguji melakukan pengecekan manual tanpa menggunakan bantuan atau tools/scripts. Tujuannya adalah untuk memastikan jika aplikasi yang diuji bebas cacat dan aplikasi perangkat lunak dapat bekerja sesuai dengan apa yang diharapkan. Manual testing berperan penting saat pengujian visual dimana automation tools tidak dapat melakukan. Manual tester dapat mengetahui kontras antara button dan background yang lebih terang sehingga membuat user kesulitan mencari button dan memahami tindakan yang perlu diambil. User Interface (UI)feedback adalah hal yang tidak dapat ditemukan menggunakan automated testing.
### Kelebihan Manual Testing
### - Mendapatkan Visual Feedback
Tools dan Scripts tidak dapat membantu dalam memberikan opini maupun input mengenai tampilan UI.
### - Less expensive in the short-term projects. 
Jika hanya melakukan tes aplikasi sederhana yang tidak terlalu banyak updates maka manual testing tidak perlu menggunakan tools ataupun software yang mahal.
### - The human element. 
Bisa mendapatkan feedback dari orang secara langsung sehingga mengetahui apa yang user suka dan tidak suka (Dimana automated tools tidak dapat memberikan feedback).

### Kekurangan Manual Testing
### - Kurang teliti daripada automantion testing
Kadang adanya human error atau ketidaktelitian, sehingga jika menggunakan automation testing akan mengurangi bug yang akan terlewat.
### - Not reusable
Jika menemukan banyaknya perubahan maka harus melakukan pengecekan secara manual kembali dari awal agar memastikan perubahan baru tidak akan merusak aplikasi yang sudah jadi.
### - Kelelahan terhadap tester 
Jika QA tester sudah sangat familiar dengan aplikasi yang selalu dia tes secara terus menerus sehingga membuat QA tester sangat memahami alur dari aplikasi tersebut. Sehingga hal ini akan menyebabkan kelelahan dan kesalahan maka melewatkan beberapa hal dan membuat kesalahan.

## Automation Testing
Automation testing merupakan testing yang membutuhkan automation tools untuk menjalankan test case kita. Untuk melakukan proses automation testing quality assurance / tester perlu untuk membuat code / script testing. Script tersebut akan dijalankan dengan bantuan automation testing tools. Automation testing bergantung pada script test yang berjalan secara otomatis. Fungsi automation testing adalah untuk membandingkan hasil yang diharapkan dengan hasil yang sebenarnya, seroang QA juga akan melihat apakah aplikasi sudah sesuai atau tidak. 
### Kelebihan Automation Testing
### - Dapat menemukan bug lebih banyak dari manual tester
Script dapat mencari lebih dalam, sehinga dapat menemukan bug yang tester tidak dapat temukan.
### - Kecepatan dan efisiensi 
Script lebih cepat dari tester, sehingga dapat cepat selesai dalam menemukan bug.
### - Test Reusable
Jika selalu mendapatkan update dan perubahan masing-masing unit/feature, maka tidak perlu menulis ulang scripsts setiap saat dan dapat digunakan kembali pada regression testing.

### Kekurangan Automation Testing
### - Lebih Mahal
Karena menggunakan tools maka pengerjaan menggunakan automation testing akan mahal, namun tetap menghemat waktu serta usabilitas.
### - Kurangnya human element 
Manual testing memberikan human element untuk dapat melakukan interaksi user dengan aplikasi termasuk secara visual.
### - Tidak adanya feedback mengenai UI
Tanpa adanya human element, maka kita tidak bisa melakukan pengecekan terhadap UI seperti warna, kontras, pemilihan font, dan button sizes.

### Why Automation Testing?
- Flexibility
- Velocity
- Coverage
- Error-Avoidance

### Which Test Case to Automate?
- Test case executed repeatedly
- Test case difficult to perform manually
- Test case time-consuming to perform manually

### Which Test Case NOT to Automate?
- Test case yang baru dirancang dan belum pernah di-execute sama sekali
- Test case yang memiliki requirement sering berubah-ubah

### Automate Testing Process
#### 1. Test Tool Selection
Pemilihan tool selection sangat bergantung pada teknologi yang digunakan untuk membangun aplikasi yang sedang diuji. 
#### 2. Define Scope Automation
Scope automation adalah area dimana aplikasi atau software yang diuji akan diotomatisasi. Poin-poin yang membantu untuk menentukan scope yaitu fitur yang penting untuk bisnis, scenario yang memiliki banyak data, fungsionalitas umum di seluruh aplikasi, kelayakan teknis, sejauh mana komponen bisnis digunakan kembali, kompleksitas test case, kemampuan untuk menggunakan test case yang sama.
#### 3. Planning, Design and Development
Selama fase ini kita akan membuat strategi dan rencana untuk automation dan srateginya akan berisi berupa tools automation yang dipilih, desain kerangka dan fitur-fitur, item automation di dalam dan diluar cakupan, kesiapan test plan automation, jadwal dan timeline, serta hasil dari automation testing berupa report.
#### 4. Test Execution
Script yang telah dibuat akan dijalankan pada fase ini. Script membutuhkan input test data sebelum di set untuk dijalankan. Setelah dieksekusi kita akan mendapatkan sebuah report hasil automation testing. 
#### 5. Maintenance
Fase maintenance adalah fase dimana automation testing yang dilakukan untuk menguji apakah fungsionalitas baru yang ditambahkan ke perangkat lunak atau software berfungsi dengan baik atau tidak. Maintenance dalam automation test dilakukan ketika script automation baru ditambahkan dan perlu direview untuk meningkatkan efektivitas setiap scripts di setiap siklus release yang berurutan. 

### Automation Best Practices
- Scope of automation
- Select the right automation tool
- Scripting standards
- Measure metrics
- Standard error message

## TUGAS
1. Deskripsikan hasil pengujian secara otomatis berikut ini!

Gambar diatas merupakan test report dari Serenity BDD (Behavior Driven Development) testing. BDD testing adalah teknik pengembangan perangkat lunak yang agile dan merupakan perpanjangan dari TDD (Test Driven Development). Dalam BDD, test case ditulis dalam bahasa alami yang bahkan dapat dibaca oleh non-programmer. Dari gambar tersebut dapat kita simpulkan bahwa kita sedang melakukan REST API testing yang melibatkan tindakan CRUD (Create-Read-Update-Delete) dengan metode POST, GET, PUT, dan DELETE untuk menguji REST API pada fitur Sample_REST_API_Testing pada layanan posting. Pada method "POST post example" kita akan menambahkan atau membuat item baru pada service post. Setelah kita berhasil menambahkan item baru maka kita dapat memeriksa data yang kita tambahkan sudah berhasil atau tidak dengan menggunakan method "GET posts example". Apabila kita ingin mengubah data atau melakukan update content data kita, kita dapat menggunakan method "UPDATE posts example". Apabila kita ingin menghapus data yang tidak kita inginkan lagi kita dapat menggunakan method "DELETE posts example". Hasil dari pengujian kita berhasil dilakukan dengan run time POST selama 786ms, sedangkan GET selama 212ms, method UPDATE 764ms dan method DELETE memiliki run time terlama dengan waktu 880ms.

2. Deskripsikan hasil pengujian secara otomatis berikut ini!

Gambar diatas merupakan test report dari Serenity BDD (Behavior Driven Development) testing. Dari gambar diatas dapat kita simpulkan bahwa capabilities petstore memiliki jumlah scenario yang diuji 1 dan berstatus "passed" atau berhasil yang ditandai dengan warna hijau. Untuk capabilities  search memiliki jumlah scenario 4 dengan 3 diantaranya berstatus "passed" dan 1 scenarion berstatus "pending" yang ditandai dengan warna biru muda. Untuk capabilities shopping cart memiliki 2 scenario dimana 1 diantaranya berstatus "passed" dan 1 scenario berstatus "failed" atau gagal.