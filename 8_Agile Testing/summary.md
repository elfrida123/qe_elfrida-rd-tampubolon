# 8 Agile Testing
## SDLC (Software Development Life Cycle)
SDLC merupakan proses yang digunakan untuk merancang, mengembangkan dan menguji software yang berkualitas tinggi. Tujuan dari SDLC adalah untuk menyediakan alur terstruktur dalam membantu organisasi menghasilkan software berkualitas tinggi yang disediakan dengan perkiraan waktu yang singkat dan biaya yang lebih rendah, namun tetap memenuhi atau melebihi harapan pelanggan. Dalam praktiknya, SDLC akan dimulai dengan mengevaluasi sistem yang ada untuk mendefinisikan persyaratan pada sistem yang baru. Baru setelah itu, software akan dibuat berdasarkan tahapan-tahapan SDLC yang ada. SDLC dapat mengatisipasi kemungkinan adanya pengerjaan ulang atau perbaikan setelah software telah jadi. SDLC juga merupakan metodologi yang berulang, sehingga kamu harus memastikan kualitas code yang ada di setiap siklus. Sangat sulit untuk membuat sebuah software tanpa perancangan yang maksimal. Beberapa teknik dalam pengembangan software yang dikembangkan hingga kini. Dilihat dari berbagai sisi, SDLC memiliki berbagai fungsi diantaranya sebagai berikut :
1. Sebagai sarana komunikasi antara tim developer dengan pemegang kepentingan,
2. SDLC membagi peranan dan tanggung jawab yang jelas antara developer, designer, business analyst dan juga manajer proyek,
3. Memberikan gambaran input, output yang jelas dari satu tahp menuju tahap selanjutnya.
Pada dasarnya, SDLC menggambarkan alur terstruktur dalam fase siklus software dan urutan bagaimana fase itu dilaksanakan untuk membuat software yang berkualitas dalam waktu yang cepat. Setiap fase atau tahapan akan menghasilkan apa yang dibutuhkan oleh fase berikutnya dalam life cycle tersebut. Persyaratan tersebut llau diterjemahkan ke dalam desain. Code pun kemudian akan diproduksi sesuai dengan desain tersebut dalam tahap development.
Setelah coding dan development itu, baru kemudian dilakukan tahapan testing untuk memverifikasi apakah hasil yang dihasilkan sudah sesuai dengan persyaratan yang ditentukan di awal.

### Tahap-tahap SDLC
#### 1. Requirement Gathering
Pada tahap ini sistem akan dianalisis bagaimana akan dijalankan nantinya. Hasil analisis berupa kelebihan dan kekurangan sistem, fungsi sistem hingga pembaharuan yang dapat diterapkan. Bagian ini termasuk bagian perencanaan. Bagian lain yang termasuk bagian perencanaan adalah alokasi sumber daya, perancanaan kapasitas, penjadwalan proyek, estimasi biaya, dan penetapan. Dengan demikian, hasil dan tahap ini ialah rencana proyek, estimasi biaya, dan ketentuan. Idealnya manajer proyek dan developer dapat bekerja maksimal pada tahap ini.

#### 2. Design
Tahap desain dalam SDLC adalah tahapan dimana kamu membuat model cara kerja aplikasi software. Ada beberapa aspek yang diperhatikan dalam tahapan desain antara lain:
- Communications
Mendefinisikan metode atau cara aplikasi berkomunikasi dengan aset lainnya seperti server pusat atau aplikasi lainnya.
- Programming
Tidak hanya menentukan bahasa pemrograman tapi juga termasuk metode pemecahan masalah dan tugas-tugas yang ada dalam aplikasi.
- Architecture
Menentukan bahasa pmrograman, praktik dalam industri, desain keseluruhan dan penggunaan template tertentu. 
- User Interface
Mendefinisikan bagaimana cara pelanggan berinteraksi dengan software dan bagaimana software tersebut dapat merespon input yang ada.
- Platforms
Mendefinisikan platform dimana software akan dijalankan. Misalnya android, ios, linux atau game konsol.
- Security
Mendefiniskan langkah-langkah untuk mengamankan aplikasi, misalnya membuat perlindungan kata sandi, enkripsi SSL traffic atau membuat penyimpanan kredensial pengguna lain.
Membuat prototipe juga dapat menjadi bagian dari tahapan desain dalam SDLC. Prototipe sendiri menjadi versi awal dari software dalam model pengembangan software yang berulang. Prototipe akan mendemostrasikan ide dasar bagaimana aplikasi dapat terlihat dan bekerja, desain ini dapat ditunjukkan kepada pemangku kepentingan untuk mendapatkan umpan balik yang berguna untuk meningkatkan aplikasi software tersebut.

#### 3. Development (Code)
Pada tahap ini dimana program/code ditulis. Biasanya jika proyek tersebut kecil maka program dapat ditulis oleh satu developer. Namun, jika proyek besar bisa dipecah dan dikerjakan oleh beberapa tim. Pada tahap ini bisa juga digunakan aplikasi Access Control atau Source Code Management untuk membantu developer melacak perubahan pada code dan memastikan kompatibilitas antar proyek tim yang berbeda sehingga sasaran terpenuhi. 
Proses coding tidak hanya dilakukan sebatas menyusun code agar aplikasi dapat berjalan, tapi juga mencakup banyak tugas lain misalnya menemukan dan memperbaiki error atau glithes yang ditemukan, serta penulisan dokumentasi seperti panduan pengguna atau bantuan FAQ untuk masalah teknis. Tahapan ini termasuk salah satu tahapan SDLC yang memakan waktu yang panjang karena akan muncul kensala-kendala baru yang mungkin menghambat jalannya sistem. Pada tahapan ini perancangan bisa saja berubah karena satu atau banyak hal.

#### 4. Testing
Sesudah sistem selesai dikembangkan, sistem harus melalui testing sebelum digunakan atau dipublish. Tahap pengujian sistem harus dijalankan untuk mencoba apakah sistem yang dikembangkan dapat bekerja optimal atau tidak. Pada tahap ini, ada beberapa hal yang harus diperhatikan, seperti kemudahan penggunaan sampai pencapaian tujuan dari sistem yang sudah disusun sejak perancangan sistem dilakukan. Tahap tes SDLC ialah bagian paling penting dalam rangkaian pembuatan sebuah perangkat lunak. Karena sangat tidak mungkin mempublikasikan sebuah software tanpa melalui pengujian terlebih dahulu. Beberapa pengujian yang harus dilewati, antara lain kualitas kode, tes fungsional, integration testing, performance testing, dan security testing. Untuk memastikan pengujian berjalan teratur dan tidak ada bagian yang terlewati, tes dapat dilakukan menggunakan perangkat Continuous Integration. Dari tahap ini, akan dihasilkan perangkat lunak yang telah dites dan siap untuk direlease. 

#### 5. Deployment
Pada tahap ini aplikasi sudah tersedia pada pelanggan untuk digunakan. Meski begitu tahapan ini bisa jadi lebih rumit. Contohnya beberapa perusahaan mungkin perlu melakukan pembaruan database ke aplikasi yang baru dikembangkan sehingga memakan lebih banyak waktu dan tenaga. Tahapan ini bukan menunjukkan bahwa setiap tahap SDLC sudah selesai. Berbagai feedback yang disampaikan oleh user juga harus didengarkan lagi. Bila perlu, akan ada penyesuaian lagi terhadap produk.

#### 6. Maintanance
Pada titik ini sebetulnya aplikasi benar-benar sudah selesai dan bisa digunakan di lapangan. Namun, tahapan operasi dan pemeliharaan masih dianggap penting. Sebab, dalam tahapan ini pengguna bisa jadi menemukan bug yang tidak ditemukan selama pengujian sehingga kesalahan perlu diatasi. Dari sini bisa jadi akan memunculkan siklus software development life cycle yang baru untuk memperbaiki bug, menentukan rencana pengembangan berulang, atau tambahan fitur dalam rilis mendatang.

### Model-model SDLC
#### 1. Waterfall Model
Model SDLC ini adalah salah satu model tertua dan tersingkat dalam penerapannya. Dalam sistem ini, setelah satu fase selesai, fase berikutnya harus segera dimulai.Setiap fase memiliki rencana kecil dan menurun ke fase berikutnya. Maka dari itu, fase ini dikatakan waterfall atau air terjun karena tiap fase memiliki ‘turunan’ kecil lainnya. Namun, salah satu kekurangan dari model ini adalah jika ada satu detail kecil yang tertinggal, dapat mempengaruhi keseluruhan rencana dan berakhir berantakan.

#### 2. Agile Model
Agile model adalah model SDLC yang dapat memisahkan produk dengan proses dan waktu pengerjaannya secara cepat. Metodologi ini diyakini sangat efektif untuk keberhasilan penciptaan sebuah produk. Dalam metode ini, tim akan mencoba tiap produk yang sudah selesai untuk meminimalisir kesalahan. Namun, salah satu kelemahan dari metode ini dapat memicu proyek ke arah yang salah dan tidak sesuai dengan kemauan dan ekspektasi dari customer.

#### 3. Iterative Model
Metode SDLC ini adalah metode yang memiliki repetisi tinggi. Developer akan menciptakan produk dengan versi cepat dan pastinya murah. Setelah itu, mereka akan mencoba produk dan merevisi jika ada kesalahan. Salah satu kekurangan dari metode ini adalah dapat mengkonsumsi bahan baku jika ada satu detail yang tertinggal untuk dikerjakan.

#### 4. V-Shaped Model
V-shaped SDLC model adalah lanjutan dari Waterfall Model. Metode SDLC ini akan mencoba tiap fase dalam proses pengembangan suatu produk.

#### 5. Big bang Model
Model software development life cycle ini adalah model yang diklaim memiliki risiko tinggi saat dijalankan. Mengapa demikian? Hal ini dikarenakan dalam pengerjaannya, tim akan menginvestasikan semua bahan baku ke dalam projek tersebut. Sehingga metode ini akan berhasil jika mengerjakan proyek yang kecil dan cenderung berbahaya untuk proyek besar.

#### 6. Spiral Model
Metode ini merupakan metode yang paling fleksibel dan mirip dengan iterative model. Metode ini fokus pada repetisi dalam pengerjaannya.

## Agile Testing Manifesto
Meskipun kita sebagai QA sudah nyaman dengan cara lama dalam testing aplikasi di step akhir development, namun testing manifesto perlu diterapkan di mindset tim.Perbedaan antara testing manifesto dengan testing akhirnya lumayan banyak perbedaannya. Perbedaan prinsip testing manifesto dengan testing metode kuno akan sangat berpengaruh terhadap proses development. Salah satu dari pengaruh dari testing manifesto adalah dengan kondisi adanya kebutuhan untuk mengukur dan meningkatkan upaya pengujian, kita sebagai seorang QA dapat mengevaluasi dan meningkatkan seberapa baik kita melakukan software testing. Sedangkan hal itu tidak bisa didapatkan jika kita menggunakan testing metode yang hanya ada di step akhir proses development.
Masih banyak lagi hal-hal yang kita lakukan yang sebenarnya jauh sekali dari istilah agile manifesto. Diantaranya QA tidak bisa bekerja sampai development selesai, ada tekanan di akhir sprint, saling blaming kalau ada bug, dan masih banyak lagi.

#### 5 Kunci dalam Testing Manifesto
1. Testing is an activity not a phase
Kalau kita melihat proses development yang lama, dapat kita lihat proses testing aplikasi dilakukan di akhir proses development. Dengan cara lama tersebut seorang tester akan kewalahan di akhir proses development karena dia harus melakukan full test aplikasi yang belum pernah dia test sebelumnya. Dalam testing manifesto tester dianjurkan untuk melakukan testing beriringan dengan proses development, jadi tidak terpisah atau membentuk fase sendiri melainkan jadi satu dengan proses development.
2. Prevent bugs rather than finding bugs
Seorang ahli strategi militer Cina, Sun Tzu pernah berkata “Kemenangan terbesar adalah yang tidak memerlukan pertempuran”. Hal tersebut bisa kita terapkan dalam proses development aplikasi, dimana kita lebih fokus untuk mencegah munculnya bug daripada menemukan bug. Bagaimana hal ini dapat dilakukan ? Baik, mari kita mulai dengan mengetahui bagaimana bug itu muncul. Ada beberapa faktor yang dapat memunculkan bug, diantaranya adalah requirement yang kurang lengkap atau kurang detail. Untuk mengurangi kemunculan bug alangkah baiknya kita tulis dulu seperti apa requirement dari fitur yang akan kita kerjakan sebelum memulai menulis code. Semua itu dapat dilakukan dengan berkomunikasi dengan sesama anggota team untuk benar-benar membangun aplikasi yang berkualitas.
3. Don't be a checker, be a tester
Sebagai seorang tester, tidaklah cukup jika hanya melakukan testing tanpa adanya improvement / masukan terhadap apa yang test. Jika seorang tester hanya melakukan pengecekan fungsional dan tidak memahami seperti apa kebutuhan user yang akan menggunakan aplikasi maka peran seorang tester akan dipertanyakan ketika semua test sudah otomatis. Disinilah peran tester sebenarnya dibutuhkan, bagaimana dia bisa memberikan feedback terhadap apa yang sedang di test.
4. Don't try to break the system, instead help build the best possible system
Di dalam proses testing, seorang QA akan melakukan positif test dan negative test. Mungkin ada beberapa dari kita yang merasa senang jika menemukan bug. Tidak bisa dipungkiri kalau seorang QA mampu memiliki pikiran jahat terkait fitur apa aja yang bisa ia temukan bugnya. Meskipun hal tersebut memiliki sisi menariknya, namun kita harus mengingat tujuan utama dari proses development itu sendiri, yaitu untuk menciptakan product yang berkualitas. Untuk itu seorang QA seharusnya memposisikan dirinya sebagai user, dan menilai product dari prespektif user sehingga dapat memberikan masukan terhadap developer.
5. The whole team is responsible for quality, not just the tester
Mengingat tanggung jawab seluruh tim untuk kualitas adalah prinsip dasar Agile. Beban dari kualitas product yang dibangun tidak semestinya dibebankan pada salah satu anggota saja. Misalnya ada bug yang baru ditemukan saat product sudah launcing, tidak semerta-merta tanggung jawab itu dibebankan pada seorang QA yang mungkin tidak teliti atas bug tersebut, bukan juga dengan membebankan developer. Namun setiap anggota tim bertanggung jawab berlandaskan kepemilikan bersama atas product yang dibangun.

## Testing Pyramid
Testing Pyramid adalah strategi yang dapat membantu tim Pengembangan dan Otomasi membuat perangkat lunak pengujian berkualitas tinggi dan andal. Ini mengurangi waktu yang dibutuhkan tim untuk mengidentifikasi apakah perubahan yang mereka lakukan merusak sistem dengan menawarkan umpan balik langsung. Testing pyramid yang beroperasi pada tiga tingkat membantu mengurangi jumlah waktu yang dihabiskan tim otomatisasi dalam pelaksanaan test case dengan mengkategorikan setiap fitur baru ke dalam satu atau semua test. 
### Level Testing Pyramid
#### Unit Test
Unit test merupakan pengujian perangkat lunak yang menguji setiap unit atau komponen sebuah perangkat lunak. Unit testing dilakukan pada masa pengembangan atau pada saat menuliskan code program perangkat lunak dari si developer. Seperti namanya, komponen yang diuji pada unit testing adalah unit-unit dari perangkat lunak. Unit disini dapat berupa function, method, procedure, module, maupun object. Tujuan dari unit testing adalah untuk memvalidasi setiap unit dari kode perangkat lunak dapat berjalan seperti yang diharapkan.

#### Integration Testing 
Integration testing adalah pengujian dari hasil penggabungan unit yang ada di dalam software. Biasanya QA menguji bagaimana unit-unit tersebut bekerja sebagai suatu kombinasi, bukan lagi sebagai suatu unit yang individual. Integration testing sebaiknya dilakukan secara bertahap untuk menghindari kesulitan penelusuran jika terjadi kesalahan error / bug.

#### UI Test (end-to-end test)
UI test adalah yang paling dekat dengan interaksi pengguna pada aplikasi web atau android atau ios. User input harus memicu tindakan yang tepat, data harus disajikan kepada pengguna, status UI harus berubah seperti yang diharapkan. Ini adalah testing dengan tingkatan tertinggi. Dengan menggunakan alat atau kerangka kerja, uji E2E memberi tahu browser apa yang harus dilakukan, klik, ketik, dan kemudian harapkan perilaku aplikasi berdasarkan tindakan. Adalah baik untuk memiliki cakupan penuh dengan tes unit dan integrasi.
Kesimpulan Testing Pyramid:
1. Semakin tinggi level yang Anda dapatkan, semakin sedikit tes yang harus Anda lakukan.
- Karena semakin tinggi level yang Anda dapatkan, biaya untuk menulis, menjalankan di dalam pipeline, dan memelihara lebih mahal.
- Pengujian tingkat rendah cenderung berjalan lebih cepat karena tidak memerlukan pohon DOM lengkap untuk dijalankan dan mudah dirawat karena pengujian ini kecil.
2. Tulis tes dengan tingkat detail yang berbeda.
- Anda harus fokus pada pengujian unit, menulis banyak pengujian unit kecil dan cepat untuk mencakup semua cabang pernyataan kondisi, input dan output fungsi, dll.
- Tulis beberapa tes integrasi lagi untuk memastikan aplikasi Anda berperilaku dengan benar.
- Tulis beberapa pengujian tingkat tinggi yang menguji aplikasi Anda dari ujung ke ujung.
- Berhati-hatilah agar Anda tidak berakhir dengan rangkaian pengujian besar-besaran pada integrasi dan E2E yang akan menjadi mimpi buruk untuk dipelihara dan membutuhkan waktu terlalu lama untuk dijalankan.
3. Bahkan kami dapat menampilkan semua aplikasi dan koneksi dari ujung ke ujung untuk diuji. Tetapi kami tidak dapat menguji semua gaya atau apakah UI cocok dengan desain. Itulah mengapa tes tingkat tinggi harus fokus pada skenario penting.

# TUGAS
1. Pada fase apa saja QE berperan pada proses SDLC?
Sebutkan dan jelaskan peran seperti apa yang QE dapat lakukan pada setiap fase tersebut!
Jawab: Menurut saya, QE berperan di setiap fase pada SDLC
1. Requirement Gathering
Pada tahapan ini QE berperan untuk mempersiapkan planning untuk meminimalisir resiko atau keadaan yang tidak dapat diprediksikan yang mungkin timbul nantinya pada software. Tidak hanya itu, pada tahapan ini QE juga berperan untuk menganalisis kebutuhan user supaya sistem atau software yang akan dibangun dapat sesuai dengan kebutuhan client.
2. Design
Pada tahapan ini seorang QE berperan untuk menganalisa komunikasi antara user dengan sistem yang dibangun apakah sudah bekerja optimal atau tidak. Pada tahapan ini, seorang QE juga memeriksa kembali apakah prototipe yang dibangun oleh seorang UI/UX sudah hall of fame, sudah memenuhi kebutuhan atau tidak, apakah sistem yang dibangun user friendly atau tidak, dll.
3. Development
Tahap development adalah tahap pengembangan software dimana software yang telah dirancang dan didesain akan dibangun dengan menggunakan teknologi serta bahasa pemograman yang dipilih. Tahap development merupakan tahap terlama dalam proses SDLC, dalam proses pengembangan QA sudah dapat merancang test case yang kemungkinan akan digunakan serta dapat mencek beberapa fungsi yang sudah dibangun, jika ada sesuatu seperti code yang dicurigai kurang vulnerable dan masih ada fungsi yang error maka QA dan Developer harus bekerjasama untuk memperbaiki fungsi yang sedang dibangun agar proses kedepannya menjadi lebih baik dan menghindari bug yang akan terjadi pada saat software selesai dibangun.
4. Testing
Pada tahapan ini seorang QE akan mengeksekusi test case yang telah dibuat sebelumnya, baik test case bersifat positif dan negatif. Seorang QE juga harus menguji keseluruhan dari software yang dibangun seperti kemudahan penggunaan sampai pencapaian tujuan dari sistem yang sudah disusun sejak perancangan sistem dilakukan.
5. Deployment
Pada tahapan Deployment seorang QA harus memastikan apakah semua test case dan pengujian yang sudah dilakukan pada proses testing sudah berjalan dengan baik dan semua kegiatan sudah dilakukan.
6. Maintanance
Pada tahapan ini seorang QE harus mampu menerima feedback dari user guna untuk mengembangkan atau memperbaiki software agar memiliki kualitas yang tinggi. Ketika ditemukan bugs yang tidak diprediksikan pada tahap testing, maka seorang developer akan memperbaiki bugs yang ditemukan tersebut, kemudian seorang QE juga harus membuat test case yang mungkin ada baik bersifat positif maupun negatif kemudian mengeksekusi test case tersebut.

2. Menurut teman-teman apa tantangan ketika menerapkan agile testing? Berikan penjelasan pada masing-masing 5 poin agile testing manifesto?
Jawab: 
1. Testing is an activity not a phase
Tantangan pada poin ini adalah masih banyak pola pikir QE yang menilai bahwa testing dilakukan pada saat aplikasi sudah siap dibangun, dan jika ada error yang terjadi saat aplikasi dipakai maka itu adalah tugas developer, pada poin ini seorang QE harus memiliki pola pikir bahwa proses testing harus dilakukan secara beriringan dengan tahap development agar menghasilkan software yang berkualitas tinggi dan handal. 

2. Prevent bugs rather than finding bugs
Tantangan pada poin ini adalah seorang QE memiliki mindset bahwa dia akan sangat bahagia apabila menemukan bugs bukan mencengah adanya bugs. Tidak hanya itu, seorang QE harus memiliki pola pikir kritis supaya dapat menentukan kemungkinan bugs yang terjadi sebelum tahapan testing dimulai.

3. Don't be a checker, be a tester
Tantangan pada poin adalah seorang QE memiliki mindset yang tugas dan tanggung jawabnya hanyalah menguji aplikasi software sesuai dengan test case yang telah dibuatnya sebelumnya. Padahal seorang QE juga harus melakukan pengecekan fungsional dari software apakah sesuai dengan kebutuhan user. Juga seorang QE harus mampu menerima feedback untuk melakukan improvement pada software.

4. Don't try to break the system, instead help build the best possible system
Tantangan pada poin ini adalah membuat atau menciptakan test case sebanyak mungkin baik bertipe negatif maupun positif yang sesuai dengan kebutuhan user. Seorang QA seharusnya memposisikan dirinya sebagai user, dan menilai product dari prespektif user sehingga dapat memberikan masukan terhadap developer.

5. The whole team is responsible for quality, not just the tester
Tantangan pada poin adalah kurangnya kekompakan dalam tim untuk mengerjakan suatu proyek. Testing tidak hanya dikerjakan oleh tester atau QE tetapi semua anggota atau role dalam tim haruslah ikut serta. Tantangan bagi seorang QE sendiri adalah seorang QE harus mampu memberikan feedback maupun masukan dari software yang diujinya dan mampu memberikan laporan yang baik dan jelas.