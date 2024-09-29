# Sistem Manajemen E-Learning untuk Institusi Pendidikan

## Deskripsi
Sistem Manajemen E-Learning ini dirancang untuk membantu institusi pendidikan dalam mengelola informasi tentang kursus dan mahasiswa. Program ini memungkinkan pengguna untuk menambah, menampilkan daftar kursus, serta menampilkan daftar mahasiswa.

## Fitur
- Tambah kursus dengan nama, kode, dan jumlah kredit.
- Tambah mahasiswa dengan nama, ID, dan jurusan.
- Tampilkan semua kursus yang telah ditambahkan.
- Tampilkan semua mahasiswa yang telah ditambahkan.
- Antarmuka pengguna berbasis teks sederhana.

## Struktur Proyek
Proyek ini terdiri dari beberapa kelas yang dikelompokkan dalam dua package:
1. **model**
   - `Course`: Kelas ini merepresentasikan kursus dengan atribut nama, kode, dan kredit. Memiliki metode untuk menampilkan informasi kursus.
   - `Student`: Kelas ini merepresentasikan mahasiswa dengan atribut nama, ID, dan jurusan. Memiliki metode untuk menampilkan informasi mahasiswa.

2. **com.mycompany.elearning**
   - `ELearning`: Kelas utama yang menjalankan aplikasi dan menangani interaksi pengguna.
