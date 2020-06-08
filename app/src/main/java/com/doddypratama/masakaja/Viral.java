package com.doddypratama.masakaja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Viral extends AppCompatActivity {

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viral);

        getDataFromInternet();

    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan, infoMakanan, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void getDataFromInternet() {

        namaMakanan.add("Dalgona Coffee");
        fotoMakanan.add("https://cdn-brilio-net.akamaized.net/news/2020/04/14/182401/1208363-1000xauto-resep-dalgona-tanpa-mixer.jpg");
        infoMakanan.add("Bahan:\n" +
                "- 2 sendok makan kopi instan tanpa ampas\n" +
                "- 2 sendok makan air panas\n" +
                "- satu cangkir susu\n" +
                "- 2 sendok makan gula pasir\n" +
                "\n" +
                "Cara membuat:\n" +
                "1. Campur kopi instan, gula pasir dan air panas. Aduk terus hingga mengembang jadi krim lembut.\n" +
                "2. Aduk selama dua menit lagi dengan cepat.\n" +
                "3. Tuang kopi di atas susu.");


        namaMakanan.add("Oreo Dessert Cup");
        fotoMakanan.add("https://img-global.cpcdn.com/recipes/26e540e41b13fda4/751x532cq70/oreo-dessert-cup-foto-resep-utama.jpg");
        infoMakanan.add("Bahan :\n" +

                "- Oreo crust (Bahan A)\n" +
                "- 1 bungkus remahan oreo\n" +
                "- 3 sdm mentega, lelehkan\n" +

                "- Cream cheese homemade\n" +
                "- 30 gr keju\n" +
                "- 30 ml susu cair\n" +
                "- Whipped cream\n" +
                "- 150 gr whipped cream bubuk\n" +
                "- 300 ml susu cair dingin\n" +
                "- Coklat ganache \n" +
                "- 150 ml whippecream cair\n" +
                "- 30 ml susu cair\n" +
                "- 1 sdt madu\n" +


                "- 100 gr dcc\n" +
                "- 1 sdt mentega\n" +
                "\n" +
                "Cara Membuat :\n" +
                "1. Oreo diblender kasar lalu dicampurkan dengan mentega cair kemudian blender lagi hingga halus lalu tata di cup kemudian dinginkan hingga set\n" +
                "2. Kemudian mixer whipped cream bubuk dengan susu cair lalu tata di atas remahan oreo, dinginkan hingga set\n" +
                "3. Masukkan remahan biskuit regal (ini boleh iya boleh engga yaa sesuai selera saja) lalu dinginkan\n" +
                "4. Siapkan wadah, masukkan bahan D yaitu potongan dcc dan mentega lalu sisihkan kemudian masak bahan C hingga muncul gelembung selanjutnya selagi panas tuangkan ke wadah bahan D aduk hingga dcc cair\n" +
                "5. Kemudian tuangkan coklat ganache dan dessert cup siap disajikan");


        namaMakanan.add("Chocolate Pudding Cake");
        fotoMakanan.add("https://2.bp.blogspot.com/-79G5UaInu94/Wgwr4dXouGI/AAAAAAAAlXs/4xoVM5KfC68Smva5unu7Q_TQaWnHg1-qQCLcBGAs/s1600/caramel%2Bcustard%2Bchocolate%2Bcake1.JPG");
        infoMakanan.add("Bahan :\n" +

                "Bahan A: \n " +
                "- Caramel\n" +
                "- 100 g gula pasir. 50g untuk masing2 loyang\n" +
                "\n" +
                "Bahan B :\n" +
                "- Meringue\n" +
                "- 4 butir putih telur\n" +
                "- 50 g gula pasir\n" +
                "\n" +
                "Bahan C:\n" +
                "- Adonan cake\n" +
                "- 4 kuning telur\n" +
                "- 1 sdm margarin atau butter cair\n" +
                "- 1 sdt vanili extract\n" +
                "- 125 ml susu uht full cream (saya pakai ultra mimi)\n" +
                "- 70 g tepung terigu (saya pakai segitiga biru)\n" +
                "- 50 g gula pasir\n" +
                "- 1 sdm susu kental manis (optional)\n" +
                "\n" +
                "Cara Membuat :\n" +
                "1. Caramel: masukkan gula ke panci kecil atau teflon, panaskan dengan api kecil hingga lumer, sambil diaduk agak tidak gosong. Tuang ke loyang, sisihkan.\n" +
                "2. Aduk putih telur dengan mixer hingga berbuih, masukkan gula 2 kali, mixer hingga foam peak, sisihkan\n" +
                "3. Adonan A: campurkan margarin atau butter cair dan vanili extract ke kuning telur, kocok hingga rata, sisihkan\n" +
                "4. Adonan B: taruh susu ke panci atau teflon, masukkan gula pasir, nyalakan api kecil, diaduk hingga gula mencair, kira2 2menit, kemudian matikan apinya. Setelah itu, masukkan tepung terigu yg diayak ke dalam panci atau teflon, aduk hingga rata\n" +
                "5. Aduk tepung hingga tercampur rata, kemudian masukkan adonan kuning telur yang sudah dikocok. Campurkan hingga adonan tercampur rata\n" +
                "6. Masukkan adonan tersebut ke adonan meringue atau putih telur. Adok dengan spatula, hingga tercampur rata\n" +
                "7. Siapkan loyang kotak yang telah diisi air. Masukkan adonan ke loyang yang telah dimasukkan caramel tadi. Pakai tusuk gigi putar adonan dari arah dalam keluar, untuk mengurangi bubbles adonan. Taruh loyang adonan ke dalam loyang kotak berisi air\n" +
                "8. Panggang adonan dengan oven suhu 170-180° selama 35-40 menit. Siapkan piring atau tempat untuk menyajikan cake tersebut. Setelah cake matang, keluar Kan loyang cake dari loyang kotak air, kemudian taruh piring atau tempat menyajikan cake ke atas loyang cake, kemudian dibalik.");


        namaMakanan.add("Pudding Roti Tawar");
        fotoMakanan.add("https://img-global.cpcdn.com/recipes/164ab92c1213981f/751x532cq70/puding-roti-tawar-foto-resep-utama.jpg");
        infoMakanan.add("Bahan : \n" +
                "- 8 buah tawar kupas (tanpa pinggiran)\n" +
                "- 180 gr Gula\n" +
                "- 2 Bks agar-agar plain\n" +
                "- 1 bungkus susu bubuk dancow\n" +
                "- 1 bungkus coklat bubuk (saya pakai chocolatos)\n" +
                "- 1 liter susu cair ful cream\n" +
                "\n" +
                "Cara Membuat :\n" +
                "1. Blender semua roti tawar kupas beserta semua susu cair sampai halus (sisihkan)\n" +
                "2. Di panci masukkan 2 Bks agar-agar dan gula, lalu masukkan campuran susu dan roti tawar yang sudah di blender. Masak sampai mendidih sambil diaduk terus\n" +
                "3. Setelah mendidih bagi adonan menjadi 2 bagian masing 500 ml, satu bagian di masukkan dancow bubuk dan satu bagian lagi di masukkan bubuk chocolatos dan aduk rata jangan bergerindil, kalau bergerindil sharing adonan biar halus\n" +
                "4. Setelah itu siapkan loyang tuang bergantian dari arah tengah loyang antara adonan putih dan coklat sampai habis, diamkan jika sudah dingin masukkan kulkas");

        namaMakanan.add("Nugget Pisang");
        fotoMakanan.add("https://i.ytimg.com/vi/1brCHA5VbaQ/maxresdefault.jpg");
        infoMakanan.add("Bahan : \n" +

                "- 5 buah pisang uli\n" +
                "- 1 bungkus tepung pisang\n" +
                "- Tepung roti secukupnya\n" +
                "- Remahan oreo halus\n" +
                "- 100 ml susu UHT full cream\n" +
                "- 100 gram coklat blok\n" +
                "\n" +
                "Cara Membuat :\n" +
                "1. Larutkan tepung pisang sedikit mengental, lalu masukkan potongan pisang dan biarkan tercampur semua.\n" +
                "2. Ambil pisang satu persatu dan masukkan ke dalam tepung roti lalu padatkan.\n" +
                "3. Nyalakan kompor dan goreng pisang dengan api sedang agar pisang matang sampai kedalam dan tidak gosong. Setelah matang, angkat dan tiriskan.\n" +
                "4. Masak susu UHT full cream hingga mendidih lalu masukkan coklat blok, lalu aduk sampai meleleh dan tercampur rata.\n" +
                "5. Kemudian tata pisang di atas piring lalu lumuri pisang dengan coklat dan taburkan remahan oreo.\n" +
                "6. Pisang nugget coklat tabur oreo siap dinikmati.");


        prosesRecyclerViewAdapter();

    }

}
