package com.doddypratama.masakaja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Dessert extends AppCompatActivity {

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan, infoMakanan, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void getDataFromInternet(){

        namaMakanan.add("Pancake");
        fotoMakanan.add("https://cdn-brilio-net.akamaized.net/news/2019/09/20/170967/1099730-1000xauto-20-resep-pancake-lezat-sederhana-dan-mudah-dibuat.jpg");
        infoMakanan.add("Bahan:\n" +
                "- 125 gr terigu\n" +
                "- 1 btr telur\n" +
                "- 250 ml susu cair\n" +
                "- 2 sdm SKM\n" +
                "- 30 gr butter cair\n" +
                "- 1/4 sdt garam\n" +
                "\n" +
                "Bahan isi:\n" +
                "- 150 gr whipping cair\n" +
                "- 1 sachet skm\n" +
                "- Buah mangga potong-potong secukupnya\n" +
                "\n" +
                "Cara membuat:\n" +
                "1. Kocok whipping cream dan susu kental manis sampai kental dan kaku, lalu simpan dikulkas.\n" +
                "2. Masukkan telur, susu cair dan skm dalam wadah dan aduk rata menggunakan bowl whisk.\n" +
                "3. Masukkan terigu, garam aduk sampai tidak mengumpal lagi, bila perlu disaring.\n" +
                "4. Lalu masukkan butter cair aduk rata, masukkan pewarna aduk sampai bener-benar rata\n" +
                "5. Panaskan teflon dengan api sedang cenderung kecil, olesi sedikit minyak lalu lap sambil diratakan dengan tissue dapur\n" +
                "6. Tuang 1 sendok sayur adonan putar dan ratakan, biarkan sebentar, angkat.\n" +
                "7. Lakukan sampai adonan habis\n" +
                "8. Ambil 1 lembar adonan, beri whipping cream lalu masukkan mangga, gulung seperti melipat amplop\n" +
                "9. Simpan di kulkas sampai 1 jam, sajikan dingin lebih enak.");

        namaMakanan.add("Es Cincau Pandan");
        fotoMakanan.add("https://agrowoles.files.wordpress.com/2015/05/es_cincau_hijau_0000x0000_0.jpg");
        infoMakanan.add("Bahan : \n" +
                "- 1 bungkus Agar agar putih\n" +
                "- 2 helai Pandan\n" +
                "- 4 sdm Gula\n" +
                "- Air 600 ml untuk blender pandan\n" +
                "- Cincau hitam\n\n" +
                "Cara Memasak : \n" +
                "1. Blender daun pandan dengan air 600 ml hingga halus. Lalu saring dan ambil air nya saja.\n" +

                "2. Rebus air pandan, agar agar dan gula sampai mendidih.\n" +

                "3. Tuang ke wadah tahan panas dan biarkan mengeras.\n" +

                "4. Agar agar pandan nya boleh dipotong seperti cincau atau diserut atau diapain aja. Kalau saya, dikerok pakai kerokan kelapa muda jadi memanjang gitu.\n" +

                "5. Sajikan dengan santan siap saji dan gula merah rebus");


        namaMakanan.add("Salad Buah");
        fotoMakanan.add("https://4.bp.blogspot.com/-LmL8LdTQ8c4/XAFj9_KUaZI/AAAAAAABO6M/Mm6sAeJVcaUZ2i6kRArmXGda_d1ewjxlwCLcBGAs/s1600/cara%2Bmembuat%2Bsalad%2Bbuah.jpg");
        infoMakanan.add("Bahan : \n" +
                "- Pear\n" +
                "- Apel\n" +
                "- Anggur\n" +
                "- Semangka\n" +
                "- Mayones\n" +
                "- Susu kental manis\n" +
                "- Keju\n" +
                "- Jeruk nipis\n\n" +
                "Cara Memasak :\n" +
                "1. Potong buah seperti bentuk dadu\n" +

                "2. Beri perasan air jeruk biar seger\n" +

                "3. Masukkan susu dan mayo. Aduk rata\n" +

                "4. Beri parutan keju");


        namaMakanan.add("Es Pisang Ijo");
        fotoMakanan.add("https://img-global.cpcdn.com/recipes/3ecbd56825c59e49/751x532cq70/es-pisang-ijo-khas-makassar-foto-resep-utama.jpg");
        infoMakanan.add("Bahan : \n" +
                "- 3 buah pisang cavendish (harusnya pakai pisang raja)\n\n" +
                "Bahan Adonan Kulit :\n" +
                "- 60 gram tepung terigu\n" +
                "- 50 gram tepung beras\n" +
                "- 200 ml santan encer\n" +
                "- 40 gram gula\n" +
                "- Sejumput garam\n\n" +
                "Bahan Bubur :\n" +
                "- 500 ml santan (saya pakai santan bubuk)\n" +
                "- 90 gram tepung beras\n" +
                "- 70 gram gula\n" +
                "- Sejumput garam\n" +
                "- Sejumput vanilli bubuk (resep asli pakai daun pandan)\n\n" +
                "Pelengkap : (Secukupnya atau sesuai selera)\n" +
                "- Sirup cocopandan\n" +
                "- Susu Kental manis\n" +
                "- Es batu\n\n" +
                "Cara Memasak :\n" +
                "1. Kukus pisang sampai kulitnya berubah warna saja, kupas kulitnya, dinginkan sebentar, lalu masukkan ke freezer sebentar supaya agak padat ; karena pisangnya lembek banget, harusnya pakai pisang raja.\n" +

                "2. Siapkan mangkok, masukkan tepung terigu, tepung beras, gula dan garam. Tuangi cairan santan dan pasta pandan sedikit demi sedikit sambil diaduk. Aduk sampai tidak bergerindil, lalu kukus sampai matang (saat di tes tusuk dengan lidi tidak ada adonan yg menempel). Biarkan agak dingin.\n" +

                "3. Ambil 1/3 bagian kulit, letakkan diatas plastik wrap yang sudah dioles sedikit minyak goreng, tekan-tekan sebentar dengan tangan lalu gilas dengan rolling pin. Ketebalan disesuaikan kebutuhan.\n" +

                "4. Ambil satu buah pisang, letakkan diatasnya, gulung dan padatkan sampai menyerupai pisang utuh. Bungkus padat dengan plastik wrap. Saya pakai plastik wrap karena tidak ada daun pisang. Lakukan sampai habis. Kukus sampai matang kira-kira sekitar 20-30 menit. Angkat, buka plastiknya, lalu dinginkan.\n" +

                "5. Buat buburnya ; didihkan 400 ml santan. Sisanya yang 100 ml dicampur dengan tepung beras, gula dan garam (aduk rata), sisihkan. Jika santan sudah mendidih, tuang campuran tepung beras, aduk perlahan sampai menjadi kental dan meletup-letup (jangan sampai gosong)\n" +

                "6. Cara penyajian : Ambil secukupnya bubur, potong-potong pisang ijo, letakkan diatas bubur, lalu siram dengan sirup cocopandan, beri es batu yang sudah dihancurkan, dan juga susu kental manis.");


        namaMakanan.add("Brown Sugar Milk Tea");
        fotoMakanan.add("https://img-global.cpcdn.com/recipes/b35a63281f859a8e/751x532cq70/324-brown-sugar-boba-milk-foto-resep-utama.jpg");
        infoMakanan.add("Bahan : \n" +

                "-6 SDM tapioka\n" +
                "- 2 SDM cokelat bubuk\n" +
                "- 3 SDM gula merah" +
                "- 1 Teh celup\n" +
                "- Susu cair putih tanpa rasa\n" +
                "- Gula merah\n" +
                "- Es batu\n" +
                "\n" +
                "Cara Membuat :\n" +
                "1. Ayak tapioka, cokelat bubuk kemudian satukan, lelehkan gula merah yang sudah di iris halus dengan air secukup nya didihkan dan masukan kedalam tapioka dan cokelat bubuk lalu aduk sampai bisa dibentuk\n" +
                "2. Didihkan air kemudian bentuk bulat bulat sesuai selera dan masukan ke dalam air yang sudah mendidih\n" +
                "3. Aduk aduk agar tidak menempel dan rebus kurang lebih 25 menit, angkat dan cuci atau bilas dengan air matang\n" +
                "4. Buat teh dengan gula merah, masukan susu cair, masukan boba dan beri es batu. Siap di sajikan");
        prosesRecyclerViewAdapter();

    }
}
