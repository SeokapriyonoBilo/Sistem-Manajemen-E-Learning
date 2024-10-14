# Sistem Manajemen E-Learning untuk Institusi Pendidikan

Fitur
Menambah Kursus: Tambahkan kursus baru dengan nama, kode kursus, jumlah kredit, serta jenis kursus (Onsite/Online).
Menambah Mahasiswa: Tambahkan mahasiswa baru dengan nama, ID, dan jurusan.
Menampilkan Daftar Kursus: Menampilkan semua kursus yang sudah terdaftar.
Menampilkan Daftar Mahasiswa: Menampilkan semua mahasiswa yang sudah terdaftar.
Implementasi CRUD: Dapat melakukan operasi Create, Read, Update, dan Delete (CRUD) melalui interface CrudOperations.

Struktur Proyek
src/
│
├── com.mycompany.elearning/
│   └── ELearning.java  - Main program untuk mengelola kursus dan mahasiswa
│
└── model/
    ├── Course.java           - Kelas dasar untuk kursus (Base Class)
    ├── OnsiteCourse.java      - Subclass untuk kursus yang dilakukan di tempat fisik (inherit dari Course)
    ├── OnlineCourse.java      - Subclass untuk kursus online (inherit dari Course)
    ├── Student.java           - Kelas untuk representasi mahasiswa
    ├── UndergraduateStudent.java - Subclass dari Student untuk mahasiswa sarjana
    ├── GraduateStudent.java   - Subclass dari Student untuk mahasiswa pascasarjana
    ├── CrudOperations.java    - Interface untuk operasi CRUD (Create, Read, Update, Delete)

1. Menambah Kursus:
Masukkan nama kursus, kode kursus, jumlah kredit, dan detail terkait (misalnya, platform untuk kursus online atau kelas untuk kursus onsite).
2. Menambah Mahasiswa:
Masukkan nama mahasiswa, ID mahasiswa, dan jurusan yang diambil.
3. Menampilkan Semua Data:
Anda dapat melihat daftar kursus atau mahasiswa yang sudah dimasukkan.
