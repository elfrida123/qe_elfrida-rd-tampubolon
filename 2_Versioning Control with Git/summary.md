# 2 Versioning Control with Git
## Resume
Pada materi ini mempelajari tentang:
1. Versioning
2. Git
3. Install dan Set Up Git

## 1. Versioning
--> Versioning berfungi untuk mengatur versi dari source code program kita. Kita pasti sering menemukan file yang berubah-ubah nama hanya karna berubah revisi dalam kontennya, sehingga kita sendiri sulit untuk memberi nama file tersebut, maka versioning ini akan mengubah konten file tanpa harus kita menyimpang ulang file tersebut yang akan menyebabkan memory kita penuh.

### Version Control System
* Single User 
  - SCCS - 1972 Unix only
  - RCS - 1982 Cross platform, text only
* Centralized
  - CVS - 1986 File focus
  - Perforce - 1995
  - Subversion - 2000 - track directory structure
  - Microsoft Team Foundation Server -2005
* Distributed 
  - Git - 2005
  - Mercurial - 2005
  - Bazaar - 2005

## 2. Git
--> Salah satu version control system populer yang digunakan para developer untuk mengembangkan software bersama-sama 

## 3. Install dan Set Up Git
### Install Git
1. Download versi terakhir dari github
2. Siapkan command promt
3. Instal aplikasi berdasarkan panduan yang diberikan
4. Untuk memeriksa apakah GIT sudah berhasil diinstalasi buka CMD dan ketikkan perintah **git --version**
   Maka hasil yang diharapkan adalah seperti berikut:
   ![Gambar git --version](https://github.com/elfrida123/qe_elfrida-rd-tampubolon/blob/master/2_Versioning%20Control%20with%20Git/screenshots/git%20--version.PNG)
Setelah kita berhasil melakukan install git maka kita akan melakukan setting up pada komputer kita.
### Set Up Git
1. Pertama sekali kita login menggunakan akun Github kita masing-masing
2. Kemudian kita membua command prompt (cmd)
3. Untuk melakukan config maka ketikkan perintah git config --global user.name "elfrida123"
4. Berikutnya ketikkan perintah git config --global user.email "elfridatampubolon21@gmail.com"
5. Selanjutnya kita akan masuk ke dalam proses INIT
   Sebelum melakukan proses INIT terlebih dahulu harus membuat repositori pada akun github anda dan juga anda membuat repository pada lokal
   - Buka cmd pada repository lokal anda
   - Kemudian ketikkan perintah **git init** ke file yang ingin anda push 
   - Setelah proses init berhasil masukkan perintah git remote add (URL repositori yang telah anda buat)
   - Masukkan perintah **git commit -m "pesan anda"**
   - Selanjutnya ketikkan perintah **git push -u origin (nama branch)**

## Branches in Git
Ada beberapa perintah yang digunakan dalam branch antara lain :
git branch -- list => Menampilkan list branch yang telah kita buat
git branch <branh> => Membuat branch baru
git branch -D <branch> => Menghapus branch 
git branch -a => Menunjukkan lokasi branch

## TUGAS
![Hasil Tugas Section 02](https://github.com/elfrida123/qe_elfrida-rd-tampubolon/blob/master/2_Versioning%20Control%20with%20Git/screenshots/Hasil%20Tugas%20Section%202.PNG)
Langkah-langkah pengerjaaan tugas
1. Membuat repository baru pada github dan juga membuat repository lokal
2. Persiapkan proyek anda dan masukkan ke repository lokal anda
3. Kemudian buka cmd pada repository lokal anda
4. Kemudian lakukan initial dengan mengetikkan perintah **git init** seperti gambar berikut:
   ![git init](https://github.com/elfrida123/qe_elfrida-rd-tampubolon/blob/master/2_Versioning%20Control%20with%20Git/screenshots/1.PNG)
5. Kemudian ketikkan perintah **git add .** untuk menambahkan proyek anda
   ![git add .](https://github.com/elfrida123/qe_elfrida-rd-tampubolon/blob/master/2_Versioning%20Control%20with%20Git/screenshots/2.PNG)
6. Ketikkan perintah **git remote add origin https://github.com/elfrida123/qe_elfrida-rd-tampubolon.git**
   ![git remote add origin https://github.com/elfrida123/qe_elfrida-rd-tampubolon.git](https://github.com/elfrida123/qe_elfrida-rd-tampubolon/blob/master/2_Versioning%20Control%20with%20Git/screenshots/3.PNG)
7. Ketikkan perintah **git commit -m "Tugas 2"**
   ![git commit -m "Tugas 2"](https://github.com/elfrida123/qe_elfrida-rd-tampubolon/blob/master/2_Versioning%20Control%20with%20Git/screenshots/4.PNG)
8. Ketikkan perintah **git push -u origin master**
   ![git push -u origin master](https://github.com/elfrida123/qe_elfrida-rd-tampubolon/blob/master/2_Versioning%20Control%20with%20Git/screenshots/5.PNG)
9. Kemudian kita membuat branch baru dengan perintah **git branch nama-branch**. Pada tugas ini kita akan membuat branch dengan nama develop, ketiga, dan keempat
   ![git branch nama branch](https://github.com/elfrida123/qe_elfrida-rd-tampubolon/blob/master/2_Versioning%20Control%20with%20Git/screenshots/6.PNG)
10. Kemudian ketikkan **git checkout nama-branch** untuk berpindah branch
    ![git checkout nama-branch](https://github.com/elfrida123/qe_elfrida-rd-tampubolon/blob/master/2_Versioning%20Control%20with%20Git/screenshots/7.PNG)
11. Kemudian kita akan add file ke branch develop dengan mengetikkan perintah **git add .**
12. Setelah lakukan commit, kemudian lakukan push
13. Lakukan penambahan file yang akan kita add ke branch ketiga
14. Setelah kita membuat branch ketiga maka kita akan melakukan merge ke branch develop 
15. Lakukan langkah yang sama untuk branch keempat
