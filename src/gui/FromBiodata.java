package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FromBiodata {
    private JPanel RoolPanel;
    private JTextField textNama;
    private JTextField textNim;
    private JButton cekButton;
    private JTextField labelNama;
    private JTextField labelNim;
    private JTextField labelJenjangPendidikan;
    private JTextField labelTahunMasuk;
    private JTextField labelFakultas;
    private JTextField labelJurusan;
    private JTextField labelJenisKelamin;
    private JTextField labelNomorUrutMahasiswa;
    private JButton selesaiButton;
    private JButton batalButton;

    public FromBiodata() {
        cekButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Nama = textNama.getText();
                String Nim = textNim.getText();

                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(Nama);
                mhs.setNim(Nim);

                labelNama.setText("Nama : " + mhs.getNama());
                labelNim.setText("Nim : " + mhs.getNim());
                labelJenjangPendidikan.setText("Jenjang Pendidikan : " + mhs.getJenjangPendidikan());
                labelTahunMasuk.setText("Tahun Masuk : " + mhs.getTahunMasuk());
                labelFakultas.setText("Fakultas : " + mhs.getFakultas());
                labelJurusan.setText("Jurusan : " + mhs.getJurusan());
                labelJenisKelamin.setText("Jenis Kelamin : " + mhs.getJenisKelamin());
                labelNomorUrutMahasiswa.setText(" " + mhs.getNomorUrutMahasiswa());

            }
        });

        selesaiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public JPanel getRoolPanel() {
        return RoolPanel;


    }
}
