# 9 Linux Basic Command
## 1. Linux Command
Linux Command adalah utilitas dari sistem operasi Linux. Semua tugas dasar dan lanjutan dapat dilakukan dengan menjalankan perintah. Perintah dijalankan di terminal Linux . Terminal adalah antarmuka baris perintah untuk berinteraksi dengan sistem, yang mirip dengan prompt perintah di OS Windows. Perintah di Linux peka huruf besar/kecil. Command line di Linux sepenuhnya text-based dan lebih cepat dibandingkan menggunakan GUI.
### Kelebihan Command Line
- Less Resources
Command line ringan digunakan sehingga tidak mengharuskan komputer untuk memiliki spesifikasi tinggi bila ingin menggunakan command line.
- Repetitive Task Friendly
Kita dapat menyimpan script untuk mengotomatiskan tugas yang sama berulang kali.
- Powerful
Karena hanya menggunakan teks, antaramuka sistem operasi ini terlihat lebih stabil dibandingkan GUI. Hal ini tentu tidak akan mempengaruhi aktivitas karena tidak memakan resources yang banyak. 

### Macam-macam Command Linux
#### Linux Commands Structure
- ls
ls memiliki fungsi menampilkan semua file di direktori kerja. Namun, dalam mempraktikkannya command tanpa option dan parameter hampir tidak berguna. Mungkin kita akan memerlukan directory file khusus atau daftar file dari direktori tertentu pada kondisi yang lebih kompleks jika tidak menggunakan option dan parameter. Mungkin ada lebih dari satu opsi dan parameter untuk satu perintah. Misalnya, kami menggunakan perintah cd .. untuk pergi ke direktori sebelumnya. Titik.. tidak lebih dari parameter.
Command pada ls:
* ls -a => command ini akan menampilkan file yang namanya dimulai dari . (titik) atau tersembunyi
* ls -l => menampilkan daftar file dalam format panjang.
* ls -l /usr => menampilkan file dalam format panjang dari direktori kerja yang berbeda.

### Basic Commands
- cal
Cal memiliki fungsi untuk menampilkan kalender.
- date
Date berfungsi untuk menampilkan tanggal pada zona waktu yang tertera pada OS kita.

### File System Commands
- touch
Touch adalah command linux yang memperbolehkan kita untuk membuat file baru yang kosong melalui perintah linux. Contoh : touch /home/username/Documents/Web.html untuk membuat file HTML berjudul Web di bawah direktori Documents.
- cat
cat (concatenate) adalah salah satu perintah dasar sistem operasi Linux yang sering digunakan. Perintah ini berfungsi untuk membuat daftar konten atau isi file pada standard output (sdout). Untuk menjalankan command ini, ketik cat yang kemudian diikuti dengan nama dan ekstensi file. Sebagai contoh: cat file.txt.
- cp
cp berfungi untuk menyalin file dari direktori saat ini ke direktori yang berbeda. Misalnya, command cp scenery.jpg /home/username/Pictures untuk membuat salinan scenery.jpg (dari direktori saat ini) ke direktori Pictures.
- mv
Fungsi utama command mv adalah untuk memindahkan file meskipun sebenarnya bisa digunakan untuk mengganti atau mengubah nama file. Argumen yang ada di mv serupa dengan argumen yang ada di perintah cp. Ketik mv, nama file, dan direktori tujuan. Contoh: mv file.txt /home/username/Documents. Untuk mengganti nama file, perintah Linux-nya adalah mv oldname.ext newname.ext.
- rm 
rm adalah perintah dasar pada Linux yang berfungsi untuk menghapus direktori beserta isinya. Jika hanya ingin menghapus direktorinya saja – alternatif command selain rmdir – gunakan rm -r. Namun saat menggunakan command ini, kita harus berhati-hati dan cek kembali direktori di mana kita berada saat ini. Sekali command rm dijalankan, maka semuanya akan terhapus dan tidak bisa dikembalikan.
- mkdir
Untuk membuat direktori baru, Anda bisa menggunakan perintah dasar Linux mkdir. Sebagai contoh, jika Anda mengetik mkdir Music, direktori baru yang muncul disebut Music.
- rmdir
Jika ingin menghapus direktori, gunakan perintah rmdir. Namun, rmdir hanya boleh digunakan untuk menghapus direktori kosong
- cd
Untuk menjelajahi file dan direktori Linux, gunakan perintah cd. Perintah Linux ini memerlukan path penuh atau nama direktori, tergantung pada direktori yang Anda gunakan saat ini. Misalkan saat ini Anda sedang berada di /home/username/Documents dan ingin membuka Photos, subdirektori dari Documents. Untuk melakukannya, Anda hanya perlu mengetikkan command ini: cd Photos.
- pwd
Perintah dasar Linux pwd berfungsi untuk mencari path dari direktori (folder) yang Anda gunakan saat ini. Perintah ini akan mengembalikan path yang absolut (penuh), yang pada dasarnya merupakan path semua direktori yang diawali dengan garis miring depan (/). Contoh dari path absolut adalah /home/username.

### Processes Control Commands
- top
Command top akan menampilkan daftar proses yang sedang berlangsung dan seberapa banyak ruang CPU yang digunakan oleh tiap proses tersebut. Melakukan pengawasan terhadap penggunaan resource sistem sangatlah disarankan, terutama ketika Anda harus mencari tahu mana proses yang perlu dimatikan karena terlalu banyak menggunakan resource.
- clear
Gunakan command clear untuk membersihkan terminal jika di dalamnya sudah terdapat banyak sekali command.
- history
Kalau sudah lihai menggunakan Linux, Anda bisa menjalankan ratusan command atau perintah setiap hari. Misalnya, penggunaan command history untuk mengecek kembali (review) command yang sudah ditambahkan sebelumnya.

### Utilities Program Commands
- ls
ls berfungsi untuk menampilkan semua file di direktori kerja kita.
- which
which merupakan command untuk mencari file yang dieksekusi terkait dengan command yang diberikan
- sudo
sudo (superuser) merupakan sebuah perintah yang digunakan untuk menjalankan task yang memerlukan hak akses atau permission adminstratif (root) penggunaan sudo tidak terlalu disarankan karena kapan saja bisa terjadi error apabila kita melakukan kesalahan.
- find
find digunakan untuk mencari file dan direktori, lebih ditujukan untuk mencari file yang berlokasi di direktori yang dituju.

### File Access Permissions
- chmod
chmod adalah perintah Linux lain, yang digunakan untuk mengubah izin baca, tulis, dan eksekusi file dan direktori.
- chown
Perintah chown memungkinkan Anda untuk mengubah atau mentransfer kepemilikan file ke nama pengguna yang ditentukan. Misalnya, chown linuxuser2 file.ext akan menjadikan linuxuser2 sebagai pemilik file.ext.

## Shell Script
Shell script adalah sebuah bahasa pemrograman yang dieksekusi berdasakan shell commands dan juga shell merupakan program yang berfungsi sebagai jembatan antara user dan kernel. 
Keuntungan menggunakan shell pada dunia testing yaitu ketika harus mengeksekusi beberapa commands beruturut-turut, hal itu membuat kita harus menunggu command pertama baru bisa melakukan command berikutnya. 

# TUGAS
![This is an image](https://github.com/elfrida123/qe_elfrida-rd-tampubolon/blob/master/9_Linux%20Basic%20Command/screenshots/Tugas.PNG)
Link : https://github.com/elfrida123/qe_elfrida-rd-tampubolon/blob/master/9_Linux%20Basic%20Command/praktikum/Tugas%20Praktikum-Elfrida%20Tampubolon.docx
