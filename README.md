# 🎮 Game Tebak Angka (Java)

## 📘 Deskripsi

Program ini adalah permainan sederhana berbasis *console (terminal)* yang dibuat menggunakan bahasa pemrograman *Java*.
Pemain diminta untuk *menebak angka antara 1 hingga 10*. Program akan menghasilkan angka acak menggunakan class Random.
Jika tebakan pemain benar, maka pemain *menang* dan permainan berakhir. Jika salah, pemain *kalah* dan dapat mencoba lagi.

---

## ⚙️ Fitur

* Menggunakan *java.util.Random* untuk menghasilkan angka acak 1–10.
* Menggunakan *java.util.Scanner* untuk menerima input dari pengguna.
* Looping *while(true)* agar pemain dapat bermain berulang hingga menang.
* Menampilkan hasil setiap tebakan (menang atau kalah).

---

## 🧩 Alur Program

1. Program menampilkan judul dan instruksi permainan.
2. Pemain memasukkan angka tebakan (1–10).
3. Program menghasilkan angka acak antara 1 dan 10.
4. Program membandingkan angka tebakan dengan angka acak:

    * Jika sama → tampilkan *“You win!”* dan keluar dari loop.
    * Jika berbeda → tampilkan *“You lose!”* dan angka yang benar.
5. Program berulang hingga pemain berhasil menebak angka yang benar.

---

## 🖥️ Contoh Output


Welcome To My Game
===== Game Tebak Angka =====
Pilih angka 1-10 : 5
You lose!
Angkanya adalah 8

Welcome To My Game
===== Game Tebak Angka =====
Pilih angka 1-10 : 8
You win!
Angkanya adalah 8


---

## 🚀 Cara Menjalankan Program

### 1️⃣ Kompilasi

bash
javac Main.java


### 2️⃣ Jalankan Program

bash
java Main


---

## 🧠 Teknologi yang Digunakan

* *Java 8+*
* *Class Scanner* → membaca input dari pengguna.
* *Class Random* → menghasilkan angka acak.

---

## 👨‍💻 Penulis

Dibuat oleh *Ayi Syaiful* sebagai latihan dasar Java untuk memahami penggunaan input, random number, dan struktur kontrol.
