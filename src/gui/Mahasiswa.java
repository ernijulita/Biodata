package gui;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Mahasiswa {
    private String Nama;
    private String Nim;
    private String JenjangPendidikan;
    private String TahunMasuk;
    private String Fakultas;
    private String Jurusan;
    private String JenisKelamin;
    private String NomorUrutMahasiswa;

    public Mahasiswa() {
    }

    public Mahasiswa(String Nama,
                     String Nim,
                     String JenjangPendidikan,
                     String TahunMasuk,
                     String Fakultas,
                     String Jurusan,
                     String JenisKelamin,
                     String NomorUrutMahasiswa) {
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNim() {
        return Nim;
    }

    public void setNim(String Nim) {
        this.Nim = Nim;
    }

    public String getJenjangPendidikan() {
        char kodeJp = Nim.charAt(0);
        if (kodeJp == '1') {
            return "S1(Sarjana)";
        } else if (kodeJp == '2') {
            return "S2(Margister)";
        } else if (kodeJp == '3') {
            return "S3(Doktor)";
        }
        return "Unknown";
    }

    public void setJenjangPendidikan(String JenjangPendidikan) {
        this.JenjangPendidikan = JenjangPendidikan;
    }

    public String getTahunMasuk() {
        char kodeTM = Nim.charAt(1);
        char kodeTM1 = Nim.charAt(2);
        return "20" + kodeTM + kodeTM1;
    }

    public void setTahunMasuk(String TahunMasuk) {
        this.TahunMasuk = TahunMasuk;
    }

    public String getFakultas() {
        char kodeFK = Nim.charAt(3);
        if (kodeFK == '1') {
            return "Tarbiyah dan Keguruan";
        } else if (kodeFK == '2') {
            return "Syari’ah dan Hukum";
        } else if (kodeFK == '3') {
            return "Ushuluddin";
        } else if (kodeFK == '4') {
            return "Dakwah dan Komunikasi";
        } else if (kodeFK == '5') {
            return "Sains dan Teknologi";
        } else if (kodeFK == '6') {
            return "Psikologi";
        } else if (kodeFK == '7') {
            return "Ekonomi dan Ilmu Sosial";
        } else if (kodeFK == '8') {
            return "Pertanian dan Peternakan";
        }
        return "Unknown";
    }

    public void setFakultas(String fakultas) {
        this.Fakultas = fakultas;
    }

    public String getJurusan() {
        char kodeJN = Nim.charAt(5);
        if (kodeJN == '1') {
            return "Teknik Informatika";
        } else if (kodeJN == '2') {
            return "Teknik Industri";
        } else if (kodeJN == '3') {
            return "Sistem Informasi";
        } else if (kodeJN == '4') {
            return "Matematika";
        } else if (kodeJN == '5') {
            return "Teknik Elektro";
        }
        return "Unknown";
    }

    public void setJurusan(String jurusan) {
        this.Jurusan = jurusan;
    }

    public String getJenisKelamin() {
        char kodeJK = Nim.charAt(6);
        if (kodeJK == '1') {
            return "Laki-Laki";
        } else if (kodeJK == '2') {
            return "Perempuan";
        }
        return "UNKNOWN";
    }

    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    public String getNomorUrutMahasiswa() {
        char kodeU = Nim.charAt(7);
        char kodeUr = Nim.charAt(8);
        char kodeUru = Nim.charAt(9);
        char kodeurut = Nim.charAt(10);
        return "Nomor Urut Mahasiswa:" + kodeU + kodeUr + kodeUru + kodeurut;
    }

    public void setNomorurut(String NomorUrutMahaiswa) {
        this.NomorUrutMahasiswa= NomorUrutMahaiswa;
    }

}