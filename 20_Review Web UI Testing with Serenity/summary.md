# 20 Review Web UI Testing with Serenity
## Web UI Testing with Cucumber
Web automation testing ini adalah suatu cara yang digunakan untuk melakukan testing terhadap web yang dibuat. Cara kerjanya seperti layaknya manusia yang melakukan kegiatan di suatu website.
### Tools Web Automation Testing
### 1. Katalon
Katalon merupakan Testing tools yang lagi “naik daun” dan selalu digunakan untuk pengetesan baik dari Mobile apps dan Browser desktop. Testing tools ini dapat merekam langkah, menangkap elemen web pada web aplikasi, memainkan secara otomatis untuk test case yang sudah ada dan untuk pelaporan (record and play). Katalon bisa digunakan untuk pemula ataupun yang sudah ahli dalam bidang QA. Pada katalon kita bisa menangkap object/element (button, field text, datepicker, link, checkbox, radio button, select, ect. ) pada setiap page di web browser ataupun aplikasi mobile yang sedang kita record untuk dapat dijalankan pada testing. Namun jika ada terdapat error di saat melakukan play sesuai record yang telah kita buat, maka kita bisa melakukan penambahan script untuk melakukan pengecekan lebih lanjut.

### 2. Cypress.io
Cypress adalah free test tools dimana bisa di run pada Cl dan dapat digunakan pada operating systems seperti Mac, Linux, dan Windows. Saat ini Cypress hanya bisa melakukan pengerjaan testing pada web saja, jadi belum dapat melakukan pengerjaan pada native mobile app. Tapi kita bisa menunggu siapa tahu kedepannya akan ada update terbaru sehingga kita bisa menggunakan cypress.io pada pengetesan mobile app. Pada testing tools cypress.io support menggunakan bahasa semua bahasa, baik itu javascript, Ruby, Node, C#, PHP. Cypress melakukan testing semua yang berjalan pada konteks browser.

### 3. Robot Framework
Robot Framework (RF) meggunakan Python sebagai base programming languagenya. Robot Framework merupakan salah satu framework dari selenium dan dapat kita combine dengan custom function yang dibuat dengan bahasa python.

### 4. Test Project
TestProject termasuk tool end-to-end testing yang kepopulerannya bisa disejajarkan dengan Katalon. Jadi, selain bisa untuk automation testing pada website, TestProject juga bisa digunakan untuk melakukan automation mobile testing layaknya katalon. Selain itu, kemudahan penggunaannya memang layak disandingkan dengan katalon. Basis Driver katalon dan TestProject juga menggunakan selenium untuk website dan appium untuk mobile.

### 5. Serenity BDD
Serenity BDD merupakan library open source yang membantu tester dalam menulis automation acceptance test yang terstruktur dan lebih terawat dengan baik dan juga menghasilkan laporan pengujian yang kaya makna (yang biasa dikenal dengan istilah “living documentation”) yang tidak hanya melaporkan pada hasil pengujian, tetapi juga fitur apa yang telah diuji.

## Intro Serenity BDD
Serenity BDD merupakan library open source yang membantu tester dalam menulis automation acceptance test yang terstruktur dan lebih terawat dengan baik dan juga menghasilkan laporan pengujian yang kaya makna (yang biasa dikenal dengan istilah “living documentation”) yang tidak hanya melaporkan pada hasil pengujian, tetapi juga fitur apa yang telah diuji.

### Architecture Serenity BDD
Dengan arsitektur dasar yang dimiliki Serenity BDD, maka dilakukan perancangan tambahan arsitektur agar framework yang dikembangkan dapat lebih mudah digunakan kembali dan dipahami oleh tim penguji aplikasi.

### Define Requirements
- Saat menggunakan Serenity, Anda mulai dengan persyaratan yang perlu Anda terapkan.
- Ini sering dinyatakan sebagai "cerita" pengguna dengan kriteria penerimaan yang membantu memperjelas persyaratan.
- "Story" inilah yang diotomatiskan Serenity.

### Automate Acceptance Criteria
- Selanjutnya, jelaskan penerimaannya kriteria dalam istilah bisnis tingkat tinggi.
- Catat kriteria penerimaan ini menggunakan alat BDD seperti Mentimun dengan formulir "fitur", sehingga Serenity dapat menjalankannya.

## BDD Framework
### BDD With Jbehave
Steps:
- Write Story
- Configure Stories
- Browser Interaction
- Run Stories
- View Reports
