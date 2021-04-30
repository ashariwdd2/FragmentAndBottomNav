package com.example.fragmentandbottomnav;

import java.util.ArrayList;

public class DataDinas {
    private static String [] namaDinas = {
            "DISDIKPORA",
            "DINKES",
            "DISPUPERKIM",
            "DINPERTARU",
            "SATPOL PP",
            "DINSOSNAKERTRANS",
            "DP3AP2KB",
            "DISDUKCAPIL",
            "DISPERINDAG",
            "DINAS PERTANIAN",
            "DLH",
            "DISKOMINFOSANDI",
            "DISHUB",
            "DINAS KEBUDAYAAN",
            "DINAS PARIWISATA",
            "DPMPTSP",
            "DISPERINKOPUKM",
            "DPKP",
            "DISPERPUSARSIP"
    };

    private static String [] desDinas = {
            "Dinas yang mengurusi bagian Pendidikan, Kepemudaan dan Olahraga Kota Yogyakarta",
            "Dinas yang mengurusi bagian Kesehatan Kota Yogyakarta",
            "Dinas yang mengurusi bagian Pekerjaan Umum, Perumahan dan Kawasan Permukiman Kota Yogyakarta",
            "Dinas yang mengurusi bagian Pertanahan dan Tatat Ruang (Kundha Niti Mandala Sarta Tata Sasana) Kota Yogyakarta",
            "Dinas Satuan Polisi Pamong Praja Kota Yogyakarta",
            "Dinas yang mengurusi bagian Sosial, Tenaga Kerja dan Transmigrasi Kota Yogyakarta",
            "Dinas yang mengurusi bagian Pemberdayaan Perempuan, Perlindungan Anak, dan Pengendalian Penduduk dan Keluarga Berencana Kota Yogyakarta",
            "Dinas yang mengurusi bagian Kependudukan dan Pencatatan Sipil Kota Yogyakarta",
            "Dinas yang mengurusi bagian Perdagangan Kota Yogyakarta",
            "Dinas yang mengurusi bagian Pertanian dan Pangan Kota Yogyakarta",
            "Dinas yang mengurusi bagian Lingkungan Hidup Kota Yogyakarta",
            "Dinas yang mengurusi bagian Komunikasi Informatika dan Persandian Kota Yogyakarta",
            "Dinas yang mengurusi bagian Perhubungan Kota Yogyakarta",
            "Dinas yang mengurusi bagian Kebudayaan (Kundha Kabudayan) Kota Yogyakarta",
            "Dinas yang mengurusi bagian Pariwisata Kota Yogyakarta",
            "Dinas yang mengurusi bagian Penanaman Modal dan Pelayanan Satu Pintu Kota Yogyakarta",
            "Dinas yang mengurusi bagian Perindustrian, Koperasi, Usaha Kecil dan Menengah Kota Yogyakarta",
            "Dinas yang mengurusi bagian Pemadam Kebakaran dan Penyelamatan Kota Yogyakarta",
            "Dinas yang mengurusi bagian Perpustakaan dan Kearsipan Kota Yogyakarta"


    };

    private static int [] logoDinas = {
            R.drawable.pendidikan,
            R.drawable.kesehatan,
            R.drawable.dpu,
            R.drawable.pertanahan,
            R.drawable.polpp,
            R.drawable.dinsosnakertrans,
            R.drawable.kb,
            R.drawable.dukcapil,
            R.drawable.disdikpora,
            R.drawable.pertanian,
            R.drawable.disdikpora,
            R.drawable.kominfologo,
            R.drawable.dishub,
            R.drawable.disdikpora,
            R.drawable.pariwisata,
            R.drawable.dpmptsp,
            R.drawable.perinkop,
            R.drawable.dpkp,
            R.drawable.perpustakaan
    };

    static ArrayList<com.example.fragmentandbottomnav.Dinas> getListData(){
        ArrayList<com.example.fragmentandbottomnav.Dinas> list = new ArrayList<>();
        for (int position = 0; position <namaDinas.length; position++){
            com.example.fragmentandbottomnav.Dinas dinas = new com.example.fragmentandbottomnav.Dinas();
            dinas.setNamadinas(namaDinas[position]);
            dinas.setDesdinas(desDinas[position]);
            dinas.setLogo(logoDinas[position]);
            list.add(dinas);
        }
        return list;
    }
}
