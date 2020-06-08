package com.doddypratama.masakaja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Indonesia extends AppCompatActivity {

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indonesia);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan, infoMakanan, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void getDataFromInternet(){

        namaMakanan.add("Nasi Goreng");
        fotoMakanan.add("https://cdn-brilio-net.akamaized.net/news/2019/09/30/171446/1104158-nasi-goreng-sederhana-sedap-makan.jpg");
        infoMakanan.add("Bahan:\n" +
                "- 2 butir telur\n" +
                "- 2 sdm minyak goreng\n" +
                "- 3 buah tomat ceri (potong sesuai selera)\n" +
                "- 1 piring nasi\n" +
                "- 1 batang daun bawang (cincang kasar)\n" +
                "- Kerupuk (secukupnya)\n" +
                "- 1 sdm margarin\n" +
                "\n" +
                "Bumbu halus:\n" +
                "- 2 siung bawang putih\n" +
                "- 5 buah cabai rawit\n" +
                "- Kecap manis (secukupnya)\n" +
                "- 3 siung bawang merah\n" +
                "- Garam (secukupnya)\n" +
                "- Gula (secukupnya)\n" +
                "\n" +
                "Cara memasak:\n" +
                "1. Panaskan margarin sampai leleh, masak telur orak-arik lalu sisihkan.\n" +
                "2. Tambahkan minyak goreng dan bumbu halus, aduk rata, masak hingga harum.\n" +
                "3. Masukkan nasi ke dalam adonan telur dan bumbu, aduk rata. Tambahkan daun bawang, aduk kembali.\n" +
                "4. Sajikan bersama topping tomat ceri dan kerupuk juga sedikit hiasan daun seledri juga irisan cabai merah.");


        namaMakanan.add("Soto Ayam");
        fotoMakanan.add("https://asset-a.grid.id/crop/0x0:0x0/x/photo/2019/11/01/1062562557.jpg");
        infoMakanan.add("Bahan : \n" +
                "- 300 gr ayam rebus suwir\n" +
                "- 5 siung bawang merah\n" +
                "- 3 siung bawang putih\n" +
                "- 1 cm jahe\n" +
                "- 2 lembar daun salam\n" +
                "- 2 ruas sereh\n" +
                "- 1 ruas jahe\n" +
                "- 700 ml FF Full Cream\n" +
                "- 250 ml kaldu ayam / sapi\n" +
                "- ½ sdt merica\n" +
                "- 3 butir cengkeh\n" +
                "- 1 sdt ketumbar bubuk\n" +
                "- 2 sdm gula pasir\n" +
                "- 1 sdm minyak goreng\n" +
                "- Garam dan merica secukupnya\n" +
                "- Daun bawang dan bawang goreng (topping)\n" +
                "\n" +
                "Cara Memasak : \n" +
                "1. Siapkan bawang merah 5 siung, bawang putih 3 siung, jahe 1 cm lalu haluskan\n" +

                "2. Panaskan wajan, masukkan minyak 1 sdm, masukkan bumbu yang sudah dihaluskan, serai 2 batang, daun salam 2 lembar, ketumbar 1 sdt, cengkeh 3 butir, tambahkan kaldu ayam 250ml, Frisian Flag Susu Cair Full Cream 700ml, garam sesuai selera, merica 1/2 sdt, gula 2 sdt.\n" +

                "3. Masukkan ayam suir 300gr lalu aduk sampai bumbu-bumbunya meresap. Dan Soto ayam siap dihidangkan dengan menambahkan daun bawang & bawang goreng di atasnya.");


        namaMakanan.add("Sate Lilit Khas Bali");
        fotoMakanan.add("https://cdn.idntimes.com/content-images/community/2020/02/img-20200206-050527-ea17fb8f4c62ab4920bc24961964e684_600x400.jpg");
        infoMakanan.add("Bahan :\n" +
                "- 400 gram fillet ikan tenggiri giling\n" +
                "- 100 gram ayam giling\n" +
                "- 25 gram tepung kanji/tapioka\n" +
                "- 50 gram tepung terigu serbaguna\n" +
                "- 1 kuning telur ayam\n" +
                "- 1 ruas jari kunyit\n" +
                "- 1 ruas jari jahe\n" +
                "- 1 ruas jari kencur\n" +
                "- 1 ruas jari lengkuas\n" +
                "- 4 siung bawang putih\n" +
                "- 6 butir bawang merah\n" +
                "- 4 buah cabai merah\n" +
                "- Garam secukupnya\n" +
                "- Gula merah secukupnya\n" +
                "- Minyak goreng secukupnya, untuk menumis\n" +
                "- Batang serai sebagai pengganti lidi secukupnya\n" +
                "\n" +
                "Cara Memasak :\n" +
                "1. Haluskan kunyit, jahe, bawang putih, bawang merah, kencur, cabai, lengkuas, garam, dan gula merah. Setelah itu panaskan sedikit minyak di penggorengan dan tumis bumbu hingga harum dan berubah warna.\n" +
                "2. Campur ikan tenggiri dan ayam giling, tambahkan tepung kanji, tepung terigu, kuning telur, dan terakhir masukkan tumisan bumbu.\n" +
                "3. Bentuk sate dan lilitkan ke batang serai. Panggang dengan api kecil sampai seluruh bagian sate matang sempurna.");


        namaMakanan.add("Batagor Bandung");
        fotoMakanan.add("https://resepcaramemasak.info/wp-content/uploads/2014/08/Resep-Batagor-Bandung.jpg");
        infoMakanan.add("Bahan :\n" +
                "- 2 buah tahu putih, potong menjadi 8 bagian\n" +
                "- 1 sdt garam\n" +
                "- 2 butir putih telur\n" +
                "- 8 lembar kulit pangsit\n" +
                "- 200 gram ikan tengiri fillet, haluskan\n" +
                "- 3 batang daun bawang, cincang halus\n" +
                "- 100 gram tepung sagu\n" +
                "- 1 sdt merica\n" +
                "- 1 sdt gula pasir\n" +
                "- 2 butir telur\n" +
                "- 150 ml air dingin\n" +
                "- 20 gram tepung terigu\n" +
                "\n" +
                "Cara Memasak :\n" +

                "1. Campurkan ikan tengiri halus, daun bawang, garam, dan gula pasir. Uleni hingga rata. Masukkan putih telur, aduk rata.\n" +
                "2. Tuang air dingin sedikit demi sedikit sembari menguleni adonan.\n" +
                "3. Masukkan tepung sagu sedikit demi sedikit sambil terus diaduk, lalu masukkan tepung sagu. Aduk rata.\n" +
                "4. Kukus tahu. Kemudian iris dan kosongkan bagian tengah tahu.\n" +
                "5. Masukkan adonan ke dalam tahu, isikan adonan di tengah kulit pangsit. Tutup kulit pangsit. Sisihkan.\n" +
                "6. Kocok 2 butir telur dan beri sedikit garam. Masukkan tahu dan kulit pangsit.\n" +
                "7. Goreng batagor hingga berwarna cokelat");


        namaMakanan.add("Rendang Daging");
        fotoMakanan.add("https://cdn0-production-images-kly.akamaized.net/wIwQrQDvUCGS92etq3exM2SfNrQ=/640x360/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/1253731/original/213c98558a7233f0f923c91df2b986f9beef-curry-recipe-stew-beef-in-coconut-curry.jpg");
        infoMakanan.add("Bahan :\n" +
                "- 500 gr daging\n" +
                "- 1 batang serai geprek\n" +
                "- 3 lembar daun jeruk\n" +
                "- 2 lembar daun salam\n" +
                "- 1 ruas lengkuas geprek\n" +
                "- 2 cm kayu manis\n" +
                "- 1 sdt gula merah\n" +
                "- 1 sdt kaldu sapi dan garam\n" +
                "- 1/2 sdt jintan bubuk\n" +
                "- 1/2 sdt merica bubuk\n" +
                "- Jeruk nipis\n" +
                "- 500 ml santan dari 1/2 kelapa\n" +
                "\n" +
                "Bumbu Halus :\n" +
                "- 4 siung bawang putih\n" +
                "- 6 butir bawang merah\n" +
                "- 2 butir kemiri\n" +
                "- 1/2 sdt ketumbar\n" +
                "- 3 cabai merah besar (buang bijinya)\n" +
                "- 2 cm kunyit\n" +
                "- 3 cm jahe\n" +
                "\n" +
                "Cara Memasak :\n" +
                "1. Cuci bersih daging, potong sesuai selera, beri perasan jeruk nipis, lalu cuci lagi\n" +
                "2. Haluskan bumbu, lalu tumis bumbu halus dengan serai, daun jeruk, daun salam, kayu manis dan lengkuas sampai matang\n" +
                "3. Masukkan daging, aduk rata, lalu masukkan santan. Masak dengan api kecil sambil sesekali diaduk.\n" +
                "4. Kemudian masukkan garam, kaldu, jintan, merica dan gula merah, diamkan hingga bumbu meresap dan airnya menyusut.\n" +
                "5. Koreksi rasa, angkat dan hidangkan.");


        namaMakanan.add("Rawon");
        fotoMakanan.add("https://dapurku.co.id/image/data/Blog/2017/reseprawon.jpeg");
        infoMakanan.add("Bahan :\n" +
                "- 1/2 kg daging ayam\n" +
                "- 3 buah kluwak (rendam air panas/blender dgn air panas)\n" +
                "- 1 batang sereh (memarkan)\n" +
                "- 3 cm jahe (memarkan)\n" +
                "- 5 cm kayu manis\n" +
                "- 10 butir cengkeh\n" +
                "- 5 butir kapulaga\n" +
                "- 1/2 butir pala\n" +
                "- 2 lembar daun salam\n" +
                "- 5 lembar daun jeruk\n" +
                "- Penyedap rasa (secukupnya)\n" +
                "- Garam (secukupnya)\n" +
                "- 1/2 sdt gula pasir\n" +
                "- Air\n" +
                "- Minyak untuk menumis\n" +
                "- Toge mentah yang sudah di cuci bersih\n" +
                "- Daun seledri (jika ada)\n\n" +
                "Bumbu Halus:\n" +
                "- 6 siung bawang merah\n" +
                "- 4 siung bawang putih\n" +
                "- 2 butir kemiri\n" +
                "- 4 cm lengkuas\n" +
                "- 1 sdt jinten\n" +
                "- 1 ruas kunyit\n" +
                "- 1,5 sdt ketumbar\n" +
                "- 1,5 sdt merica\n" +
                "\n" +
                "Cara Memasak :\n" +
                "1. Panaskan sedikit air ke dalam panci, setelah mendidih rebus sebentar daging ayam yang sudah di cuci bersih. Angkat, tiriskan\n" +

                "2. Panaskan minyak, masukkan bumbu halus. Tumis sebentar tambahkan daun salam, daun jeruk, sereh, jahe, kayu manis, pala, cengkeh, kapulaga dan kluwak. Tumis sampai harum\n" +

                "3. Masukkan ayam yang sudah di rebus, campur bumbu yang sudah di tumis sampai merata. Tambahkan air sesuai selera\n" +

                "4. Tambahkan penyedap rasa, gula dan garam sesuai. Tunggu hingga mendidih. Koreksi rasa\n" +

                "5. Jika rasa sudah pas, hidangkan dengan bahan pelengkap lainnya");


        namaMakanan.add("Ayam Panggang Bumbu Merah");
        fotoMakanan.add("https://img-global.cpcdn.com/recipes/40e6bfeb33543fe3/640x640sq70/photo.jpg");
        infoMakanan.add("Bahan : \n" +
                "- 300 gr ayam (setengah dada)\n" +
                "- Mentimun untuk lalapan\n" +
                "\n" +
                "Bumbu Halus :\n" +
                "- 5 siung bawang putih\n" +
                "- 6 butir utuh kemiri\n" +
                "- 5 bh cabe rawit\n" +
                "- 10 bh cabe keriting\n" +
                "- 4 bh Tomat ukuran sedang\n" +
                "\n" +
                "Cara Memasak : \n" +
                "1. Tumis bumbu yang telah dihaluskan sampai harum.Tambahkan air kira-kira 600 cc (3 gelas blimbing)\n" +
                "2. Masukkan ayam kedalam tumisan bumbu. Masak sampai mndidih meresap. Tambahkan gula merah atau gula pasir secukupnya,garam secukupnya dan kecap manis sesuai selera.\n" +
                "3.Masak sampai a sat..ambil ayamnya kemudian panggang.\n" +
                "4. Masukkan lagi ke dalam bumbu masak sampai bumbu asat kental.\n" +
                "5. Siap sajikan lebih lezat lagi ditemani urap-urapan (resep uda pernah saya posting)");


        namaMakanan.add("Gado - Gado");
        fotoMakanan.add("https://cdn.idntimes.com/content-images/community/2018/04/big-slider-gado-gado-enak-dan-lezat-d15989179c334422677c80293a7b51c0_600x400.jpg");
        infoMakanan.add("Bahan :\n" +
                "- 1 buah Wortel\n" +
                "- 1 butir telur\n" +
                "- 1 buah tahu\n" +
                "- 1 buah kentang\n" +
                "- 50 gram tauge\n" +
                "- secukupnya Kubis\n" +
                "- 1 ikat salada\n" +
                "- 1 buah timun\n" +
                "\n" +
                "Bumbu Kacang :\n" +
                "- 2 biji cabe/secukupnya\n" +
                "- 1 biji bawang putih\n" +
                "- 1 ons kacang tanah\n" +
                "- 100 gram gula merah\n" +
                "- 1 sdt garam\n" +
                "- secukupnya Penyedap rasa\n" +
                "- secukupnya Kecap \n" +
                "\n" +
                "Cara Memasak : \n" +
                "1. Sangrai kacang terlebih dahulu, kemudian ublender/ulek cabe, bawang putih dan tuangkan kacang sedikit demi sedikit sampe lembut. Kasih air jika bumbu trlalu penuh agar lembut saat di ulek\n" +

                "2. Kemudian jika sudah lembut, di masak dengan api kecil agar matangnya merata. Tuangkan penyedap rasa, gula merah, dan kecap. Tunggu sampe wanginya tercium\n" +

                "3. Kemudian kukus semua sayuran, karena sayuran lebih bagus di kukus dibandingkan di rebus. Biasanya saya lebih suka sayuran di kukus setengah matang\n" +

                "4. Goreng tahu sesuai selera, sambil menunggu matang rebus telur 5-7 menit\n" +

                "5. Jika sudah matang sajikan sayuran, lalu potong tahu dan telur, diatasnya lumuri dengan bumbu kacang yang sudah di masak tadi dan taburi dengan sedikit bawang goreng\n" +

                "6. Gado gado siap di sajikan");


        prosesRecyclerViewAdapter();

    }
}
