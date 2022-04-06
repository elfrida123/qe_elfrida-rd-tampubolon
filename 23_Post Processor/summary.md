# 23 Post Processor
## What is Post Processor?
Post processor adalah bagian dari test plan yang merupakan sebuah aksi yang berjalan saat proses setelah dilakukan. Proses disini adalah proses request sebuah halaman web. Proses yang dilakukan pada post processor ini pada umumnya adalah proses untuk mengekstrak value yang didapatkan dari hasil mengakses sebuah web seperti data pada JSON, session, dll.

## JSON Extractor
jsonpath digunakan untuk mengambil nilai-nilai yang terdapat pada data JSON yang dihasilkan dari response saat kita melakukan request.

## JSON Path
- Digunakan untuk ekstrak isi dari json response
- Beberapan ekspresi yang umum digunakan:
  - $ = root elemrnt
  - . = child operator (object)
  - [] = child operator (array)
  - .. = recursive descent (langsung ke objek)
  - * = wildcard (all things)
  - [start:end] = array slice operator borrowed

## TUGAS
