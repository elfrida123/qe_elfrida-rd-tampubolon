# 13 Map Data Structure
## Map
Map merupakan struktur data yang ada di Java yang dapat digunakan untuk menyimpan data di dalamnya. Data yang ada di dalam map diidentifikasi menggunakan key. Setiap key memiliki datanya sendiri yang disebut value. Map juga merupakan generalisasi dari array. Seperti array, map juga memiliki operasi untuk mengambil dan meletakkan elemen. Akan tetapi pada map, operasi ini tidak dilakukan pada bilangan 0, 1, … N-1, akan tetapi pada sembarang Object. Beberapa bahasa pemrograman menggunakan istilah array asosiatif (associative array) karena kesamaan perintah dengan array biasa.
### HashMap
HashMap merupakan implementasi dari map yang menggunakan struktur data hash table. HashMap itu sendiri adalah interface yang mempunyai fungsi untuk memetakan nilai dengan kunci(key) unik ke dalam nilai (value). Kunci dan nilai(value) dalam HashMap boleh diset dengan null. HashMap sangat bermanfaat sebagai memory record management, dimana tiap record dapat disimpan disebuah Map. HashMap ini bisa diterapkan pada suatu aplikasi seperti kamus, yang mempunyai key dan value–dalam aplikasi kamus ketika akan mencari arti dari suatu kata, kita akan memakai kata yang akan dicari artinya tersebut sebagai “key”, dan kita akan mendapatkan arti dari kata tersebut yang berupa “value” dari “key” yang telah kita masukkan. HashMap sangat cocok digunakan pada data cukup kompleks. Dengan demikian, programmer tidak harus menghafal letak index seperti pada array dan collection class sequence lainnya.
### WeakHashMap
WeakHashMap masih menggunakan hash table tetapi bedanya pada WaekHashMap key dapat dihilangkan jika sudah tidak digunakan.
### IdentityHashMap
IdentityHashMap masih menerapkan hash table tetapi key memiliki referensi pada memori yang berbeda maka akan dianggap sebagai data yang berbeda. 
### LinkedHashMap
LinkedHashMap menerapkan doubly linked list dan juga hash table sebagai struktur data di map nya.
### ImmutableMap
ImmutableMap tidak dapat diubah isinya baik ditambah atau mengubah data yang sudah ada.
## SortedMap
SortedMap artinya map yang dapat diurutkan baik secara ascending maupun descending. 
### Navigable Map
Navigable map masih termasuk sorted map tetapi dengan method-method untuk menavigasi yang lebih lengkap.
