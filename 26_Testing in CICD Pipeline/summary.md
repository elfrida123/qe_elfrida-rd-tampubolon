# 26 Testing in CI/CD Pipeline

## Continuous Integration

1. Integrasi Berkelanjutan adalah praktik mengintegrasikan kode ke dalam repositori bersama dan membangun/menguji setiap perubahan secara otomatis sedini mungkin - biasanya beberapa kali sehari
2. Terbaik dicapai melalui integrasi dengan kontrol versi
3. Pengiriman Berkelanjutan menambahkan bahwa perangkat lunak dapat dirilis ke produksi kapan saja, seringkali dengan secara otomatis mendorong perubahan ke sistem yang berubah
4. Deployment Berkelanjutan melangkah lebih jauh dan mendorong perubahan ke produksi secara otomatis

## Delivery vs Deployment
- Pengiriman Berkelanjutan
1. Secara otomatis menyiapkan dan melacak rilis ke produksi
2. Hasil yang diinginkan adalah bahwa siapa pun dengan hak istimewa yang cukup untuk rilis baru dapat melakukannya kapan saja dalam satu atau beberapa klik. Dengan menghilangkan hampir semua tugas manual, pengembang menjadi lebih produktif

- Penerapan Berkelanjutan
1. Setiap perubahan dalam kode sumber disebarkan ke produksi secara otomatis tanpa eksplisit dari pengembang
2. Selama melewati kontrol kualitas

## What makes for Good CI
1. Tahap Terpisah
- Setiap langkah dalam CI harus melakukan tugas tunggal yang terfokus
2. Dapat diulang
- Otomatis dengan cara yang dapat diulang secara konsisten
- Alat harus bekerja untuk pengembang lokal juga
3. Cepat Gagal
- Gagal pada tanda pertama masalah

## CI / CD Process
1. Commit
2. Build
3. Test
4. Deploy 

## Benefits and Costs from implementing CI/CD

1. Mendeteksi Bug di Tahap Awal
2. Mengurangi Jumlah Bug
3. Proses Pengembangan Lebih Transparan
4. Efisien
5. Kurangi Risikonya
6. Penerapan Tanpa Rasa Sakit
7. Mengurangi Biaya
8. Proses Otomatis Dan Transparan
9. Rilis Lebih Sering
10. Tulis Tes Otomatis
11. Server Untuk Tes Otomatis
12. Gabungkan kode sesering mungkin
13. Fondasi yang Kuat di CI
14. Membutuhkan Kualitas Tes Tertinggi
15. Dokumentasi Perlu Sering Diperbarui

### CI/CD Tools
1. JenKins
2. Bamboo
3. CircleCI
4. AWS Codebuild 
5. Azure DevOps
6. CI/CD
7. Travis CI
8. Github 

### Componnets of Github Actions
1. WorkFlows
Alur kerja adalah proses otomatis yang dapat dikonfigurasi yang akan menjalankan satu atau lebih pekerjaan. Alur kerja yang ditentukan oleh file YAML diperiksa ke repositori Anda dan akan berjalan ketika dipicu oleh suatu peristiwa di repositori Anda atau mereka dapat dipicu secara manual atau pada jadwal yang ditentukan

2. Events
Peristiwa adalah aktivitas spesifik dalam repositori yang memicu alur kerja berjalan.

3. Runners 
Runner adalah server yang menjalankan alur kerja Anda saat dipicu. Setiap pelari dapat menjalankan satu pekerjaan pada satu waktu. GitHub menyediakan Ubuntu Linux, Microsoft Windows dan 

4. Actions
Action adalah aplikasi kustom untuk platform GitHub Actions yang melakukan tugas yang kompleks namun sering diulang. Gunakan tindakan untuk membantu mengurangi jumlah kode berulang yang Anda tulis di file alur kerja Anda.

# TUGAS

Link github : https://github.com/elfrida123/api-automation-alta

Report:
![This is an image](https://github.com/elfrida123/qe_elfrida-rd-tampubolon/blob/master/26_Testing%20in%20CICD%20Pipeline/screenshots/1.PNG)

![This is an image](https://github.com/elfrida123/qe_elfrida-rd-tampubolon/blob/master/26_Testing%20in%20CICD%20Pipeline/screenshots/2.PNG)

![This is an image](https://github.com/elfrida123/qe_elfrida-rd-tampubolon/blob/master/26_Testing%20in%20CICD%20Pipeline/screenshots/3.PNG)
