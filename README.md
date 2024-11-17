# 🚀 Aplikasi GUI Konversi Suhu

Selamat datang di proyek ini! 🎉 Proyek ini adalah implementasi GUI berbasis Java untuk melakukan konversi suhu antara berbagai skala seperti Celcius, Fahrenheit, Reamur, dan Kelvin, dengan fitur tambahan untuk memilih arah konversi dan validasi input otomatis.

---

## 👨‍💻 Tentang Saya

Halo! Nama saya **Nur Yoga Andika** 👋  
- 📚 **NPM:** 2210010652  
- 🎓 **Jurusan:** Teknologi Informasi  
- 🌟 Saya selalu berusaha belajar hal-hal baru dan berbagi apa yang saya pelajari.  

💬 Jangan ragu untuk menghubungi saya untuk berdiskusi lebih lanjut tentang proyek ini atau topik lainnya! 🚀  

---

## 📝 Deskripsi Program

Aplikasi ini memungkinkan pengguna:
1. Memasukkan **nilai suhu** di `JTextField`.
2. Memilih jenis konversi melalui:
   - **JComboBox**: Untuk memilih skala tujuan seperti Fahrenheit, Kelvin, atau Reamur.
   - **JRadioButton**: Untuk memilih arah konversi (misalnya dari Celcius ke Fahrenheit atau sebaliknya).
3. Menekan tombol:
   - **Konversi:** Untuk menampilkan hasil konversi.
   - **Hapus:** Untuk menghapus input dan memulai dari awal.
   - **Keluar:** Untuk menutup aplikasi dengan mudah.

Aplikasi ini juga menyediakan fitur tambahan seperti:
- Validasi input otomatis untuk memastikan pengguna hanya memasukkan angka.
- Konversi otomatis saat nilai input berubah.

---

## 💻 Komponen GUI

Berikut adalah komponen utama yang digunakan dalam aplikasi ini:
- **JFrame:** Sebagai jendela utama aplikasi.
- **JPanel:** Mengatur tata letak komponen GUI.
- **JLabel:** Menampilkan label teks.
- **JTextField:** Untuk memasukkan nilai suhu.
- **JComboBox:** Memilih skala suhu tujuan.
- **JRadioButton:** Memilih arah konversi suhu.
- **JButton:** Untuk melakukan tindakan seperti konversi, hapus, dan keluar.

---

## 🔍 Logika Program

1. **Rumus Konversi Suhu:**
   - Celcius ke Fahrenheit: `(C * 9/5) + 32`
   - Celcius ke Kelvin: `C + 273.15`
   - Celcius ke Reamur: `C * 4/5`
   - Rumus sebaliknya untuk konversi dari skala lain ke Celcius.
   
2. **Validasi Input:**
   - Menggunakan `KeyAdapter` untuk membatasi input di `JTextField` hanya berupa angka.

3. **Konversi Otomatis:**
   - Menggunakan `ItemListener` untuk merespons perubahan pilihan skala suhu.

---

## 🎯 Events yang Diimplementasikan

1. **ActionListener:**  
   - Untuk tombol **Konversi**, menghitung dan menampilkan hasil konversi suhu.  
   - Untuk tombol **Hapus**, membersihkan input yang dimasukkan.
   - Untuk tombol **Keluar**, menutup aplikasi.

2. **KeyAdapter:**  
   - Membatasi input hanya berupa angka di `JTextField`.

3. **ItemListener:**  
   - Mengatur arah konversi suhu berdasarkan pilihan `JRadioButton`.

---

## ✨ Variasi

1. Menambahkan skala suhu tambahan seperti:
   - Reamur.
   - Kelvin.
2. Validasi input:
   - Menampilkan pesan kesalahan jika input kosong atau tidak valid.
3. Konversi otomatis:
   - Melakukan perhitungan ulang saat nilai input berubah atau arah konversi diubah.

---

## 🔧 Cara Menggunakan Program

1. Masukkan **nilai suhu** di `JTextField`.
2. Pilih arah konversi menggunakan `JRadioButton`.
3. Pilih skala suhu tujuan menggunakan `JComboBox`.
4. Tekan tombol:
   - **Konversi:** Untuk melihat hasil konversi.
   - **Hapus:** Bersihkan semua input dan mulai dari awal.
   - **Keluar:** Tutup aplikasi dengan mudah.
5. Hasil akan ditampilkan dalam bidang hasil yang telah disediakan.

---


