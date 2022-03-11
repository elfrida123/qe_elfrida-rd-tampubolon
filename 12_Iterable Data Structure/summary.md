# 12 Iterable Data Structure
## Iterable
Iterable merupakan sekumpulan data atau struktur data yang dapat dilakukan iterasi atau perulangan kepadanya.Iterable was introduced to be able to use in the "foreach" loop. A class implementing the Iterable interface can be iterated over.
### General-purpose Implementations
General-purpose implementations are the most commonly used implementations, designed for everyday use. They are summarized in the table titled General-purpose-implementations. 
### Iterator
Iterator merupakan kelas yang mengatur (manage) iterasi dari sebuah iterable. Iterator ini mengelola pada bagian mana kita telah melakukan iterasi pada data iterable dan mengetahui data apa yang berikutnya diambil dan bagaimana cara mengambilnya. 
## Collections
Collection merupakan kumpulan dari data atau objek yang diletakkan dalam satu tempat yang sama yang sering dikenal sebagai "collection of the objects".
## List
- List merupakan sebuah interface yang menyediakan cara untuk menyimpan data secara linear
- List merupakan turunan dari interface collection
- List dapat menerima nilai yang sama sehingga kita dapat memasukkan dua atau lebih nilai yang bernilai sama
- Urutan data pada list bergantung pada kapan data itu dimasukkan ke dalam list. 
### ArrayList
ArrayList menyediakan penyimpanan data yang dinamis. Dinamis artinya tidak terikat terhadap kapasitas data yang disimpan oleh ArrayList tersebut. 
### LinkedList
- LinkedList merupakan struktur data yang menyimpan setiap elemennya saling terhubung satu sama lain. 
- Cara linkedlist menghubungkan satu elemen dengan elemen lainnya adalah dengan menyimpan alamat elemen berikutnya.
- Tidak seperti array, data tidak disimpan dalam satu blok memori yang berdekatan dan tidak memiliki ukuran yang tetap.
## Stack
- Kelas Stack mewakili tumpukan objek terakhir masuk pertama keluar (LIFO). Ini memperluas kelas Vektor dengan lima operasi yang memungkinkan vektor diperlakukan sebagai tumpukan.
- Operasi push dan pop yang biasa disediakan, serta metode untuk mengintip item teratas pada tumpukan, metode untuk menguji apakah tumpukan kosong, dan metode untuk mencari tumpukan item dan menemukan seberapa jauh adalah dari atas.
- Serangkaian operasi tumpukan LIFO yang lebih lengkap dan konsisten disediakan oleh antarmuka Deque dan implementasinya, yang harus digunakan dalam preferensi untuk kelas ini.
## Hash Set
- HashSet menyimpan elemen dengan menggunakan mekanisme yang disebut hashing
- HashSet hanya berisi elemen unik. HashSet memungkinkan nilai nol. Kelas HashSet tidak disinkronkan.
- HashSet tidak mempertahankan urutan penyisipan. Di sini, elemen dimasukkan berdasarkan kode hashnya.
- HashSet adalah pendekatan terbaik untuk operasi pencarian. Kapasitas default awal HashSet adalah 16, dan faktor bebannya adalah 0,75.
## LinkedHashSet
- Kelas Java LinkedHashSet berisi elemen unik hanya seperti HashSet.
- Kelas Java LinkedHashSet menyediakan semua opsional
- Mengatur operasi dan mengizinkan elemen nol.
- Kelas Java LinkedHashSet tidak disinkronkan. Kelas Java LinkedHashSet mempertahankan urutan penyisipan.
## EnumSet
- EnumSet dapat berisi nilai enum dan semua nilai harus dimiliki oleh enum yang sama
- Itu tidak memungkinkan untuk menambahkan nilai nol, melemparkan, NullPointerException dalam upaya untuk melakukannya Itu tidak aman untuk thread, jadi kami perlu menyinkronkannya secara eksternal jika diperlukan
- Elemen disimpan mengikuti urutan di mana mereka dideklarasikan di enum
- Ini menggunakan iterator gagal-aman yang berfungsi pada salinan, sehingga tidak akan mengeluarkan Pengecualian ConcurrentModification jika koleksi dimodifikasi saat mengulanginya.
## SortedSet
- Sebuah Set yang selanjutnya memberikan pemesanan total pada elemen-elemennya.
- Elemen-elemen diurutkan baik dengan menggunakan pengurutan alami atau dengan menggunakan Pembanding. Semua elemen yang dimasukkan ke dalam set yang diurutkan harus mengimplementasikan antarmuka Sebanding.
## Queue
- Antrian dapat didefinisikan sebagai daftar terurut yang memungkinkan operasi penyisipan dilakukan di satu ujung yang disebut REAR dan operasi hapus dilakukan di ujung lain yang disebut FRONT.
- Antrian disebut sebagai daftar First In First Out.
- Misalnya, orang yang mengantri untuk mendapatkan tiket kereta api membentuk antrian.
### Deque
Deque adalah koleksi linier yang mendukung penyisipan dan penghapusan elemen dari kedua ujungnya. Nama 'deque' adalah singkatan dari double-ended queue.

# TUGAS
Link : https://docs.google.com/document/d/1JOBzWudOaFz4ovcwE09EAa9cR52xDrUN2RM6U2udK48/edit?usp=sharing