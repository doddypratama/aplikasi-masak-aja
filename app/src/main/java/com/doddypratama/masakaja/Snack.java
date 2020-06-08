package com.doddypratama.masakaja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Snack extends AppCompatActivity {

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);

        getDataFromInternet();

    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan, infoMakanan, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void getDataFromInternet() {

        namaMakanan.add("Kentang Goreng");
        fotoMakanan.add("https://cdn-brilio-net.akamaized.net/news/2019/10/11/172102/1110064-1000xauto-cara-membuat-kentang-goreng.jpg");
        infoMakanan.add("Bahan:\n" +
                "- 200 gram beef tallow atau lemak daging sapi beku\n" +
                "- 1/4 cangkir sirup jagung\n" +
                "- 2 sendok teh garam\n" +
                "- 2 buah kentang ukuran besar\n" +
                "- 1 1/2 gelas air\n" +
                "- 1/4 sendok teh kaldu sapi blok (opsional)\n" +
                "\n" +
                "Cara membuat:\n" +
                "1. Kupas dan iris kentang bentuk stik setebal 0,5 cm sampai 1 cm. Rendam ke dalam air. Sisihkan.\n" +
                "2. Campurkan sirup jagung dan air, masukkan kentang ke dalamnya. Dinginkan 30 menit. Tiriskan.\n" +
                "3. Goreng kentang selama 1 sampai 2 menit. Tiriskan minyak, kemudian dinginkan kentang ke lemari es selama 15 menit.\n" +
                "4. Panaskan lagi minyak goreng dan tambahkan lemak daging sapi. Goreng kentang selama 5 menit atau sampai kuning keemasan. Tiriskan minyak.");



        namaMakanan.add("Kue Cubit");
        fotoMakanan.add("https://selerasa.com/wp-content/uploads/2016/11/images_Kue_cubit_Resep-kue-cubit-enak.jpg");
        infoMakanan.add("Bahan :\n" +
                "- 130 gr tepung terigu\n" +
                "- 100 gr gula pasir\n" +
                "- 100 gr mentega, cairkan\n" +
                "- 3 buah telur\n" +
                "- 150 ml susu cair putih\n" +
                "- 1/2 sdt baking powder\n" +
                "- 1/4 sdt baking soda\n" +
                "- 1/2 sdt vanili bubuk\n" +
                "- 1/4 sdt garam\n" +
                "\n" +
                "Cara Memasak :\n" +
                "1. Siapkan bahan.\n" +

                "2. Kocok telur dan gula hingga mengembang. Boleh pake mixer atau whisk, optional.\n" +

                "3. Campur tepung terigu, baking powder, baking soda, vanili dan garam. Ayak. Lalu masukan ke dalam kocokan telur sedikit demi sedikit bergantian dengan susu. Tepung, susu, tepung, susu. Hingga tak ada yang bergerindil.\n" +

                "4. Terakhir masukan mentega cair lalu aduk dengan spatula. Setelah rata, tutup adonan dengan serbet dan diamkan selama 30 menit.\n" +

                "5. Kemudian panaskan cetakan yang sudah diberi olesan mentega atau margarin. Tuang adonan hingga setengah cetakan. Jangan penuh penuh, nanti mengembang. Beri topping mesis atau selera. Tutup sebentar sambil sesekali diintip. Lalu angkat dan sajikan." );


        namaMakanan.add("Takoyaki");
        fotoMakanan.add("https://cdns.klimg.com/merdeka.com/i/w/news/2018/05/01/970755/540x270/cara-membuat-takoyaki-yang-enak-mudah-sederhana-yang-bisa-dibuat-sendiri-di-rumah.jpg");
        infoMakanan.add("Bahan Adonan :\n" +
                "- 150 gr Tepung terigu protein sedang \n" +
                "- 470 ml Air\n" +
                "- 2 butir Telur\n" +
                "- 1 sachet Susu kental manis\n" +
                "- 1 sdt Kaldu bubuk\n" +
                "- 1 sdt Baking powder\n" +
                "- 4 sdm Kecap ikan\n" +
                "- 1/4 sdt garam dan lada\n\n" +
                "Bahan Isian :\n" +
                "- Secukupnya Sosis\n" +
                "- Secukupnya Keju\n" +
                "- Secukupnya Ayam rebus\n" +
                "- Daun bawang (iris tipis)\n\n" +
                "- Bahan Pelengkap\n" +
                "- Secukupnya Mayonnaise\n" +
                "- Secukupnya Saus tomat\n" +
                "- Aokinori (optional)\n" +
                "- Katsuobushi (optional)\n" +
                "\n" +
                "Cara Memasak : \n" +
                "1. Untuk membuat adonan, larutkan kaldu bubuk, SKM, kecap ikan, dan air. Lalu campurkan dengan tepung terigu, telur utuh, garam dan lada\n" +

                "2. Aduk secara merata dengan baloon whisk (kocokan telur) setelah itu masukkan baking powder nya dan diaduk lagi (bentuk adonannya sedikit kental ya)\n" +

                "3. Siapkan cetakan Takoyaki, tambahkan minyak goreng sedikit saja di setiap lubang. Panaskan dengan api sedang\n" +

                "5. Setelah cetakan panas, tuang kan adonan sampai setinggi 3/4 lubang, tambahkan irisan daun bawang dan isiannya (per lubang diberi satu jenis isian saja) lalu tutup sebentar\n" +

                "6. Setelah itu balik takoyaki dengan sumpit / tusuk sate, tambahkan lagi adonannya (sedikit saja, supaya bentuk bisa bulat sempurna) lalu tutup lagi untuk pematangan terakhir\n" +

                "7. Kalau sudah coklat keemasan segera diangkat ya, beri hiasan diatasnya dengan saus tomat dan mayonaise, bisa juga ditambah dengan nori dan katsuobushi.");

        namaMakanan.add("Churrobites");
        fotoMakanan.add("https://fave-production-main.myfave.gdn/attachments/18096fc29054ec9ecfb507b87a0ba05fd5c80383/store/fill/400/250/626a9de04f04f6c9d73b19694fa0ea24791084cb4c38d47b8f25788dac9a/activity_image.jpg");
        infoMakanan.add("Bahan :\n" +
                "- 1 gelas air\n" +
                "- 8 sdm mentega\n" +
                "- 1/4 sdt garam\n" +
                "- 3/4 sdt bubuk kayu manis\n" +
                "- 1 1/4 cup tepung terigu serbaguna\n" +
                "- 3 buah telur\n" +
                "- 1.5 cangkir minyak sayur\n" +
                "- 1/2 cup gula bubuk\n" +
                "\n" +
                "Cara Memasak : \n" +
                "1. Campur air, mentega, garam, dan 1/4 sdt kayu manis dalam panci. Panaskan dengan api sedang sampai mendidih. kecilkan api\n" +
                "2. Masukkan tepung ke dalamnya dan aduk sampai tercampur rata. Angkat dan diamkan selama 5-7 menit.\n" +
                "3. Masukkan telur satu per satu dan aduk rata. Sisihkan.\n" +
                "4. Panaskan minyak dalam wajan. Gunakan api sedang.\n" +
                "5. Masukkan adonan ke dalam piping bag atau plastik semprot dengan spuit bintang.\n" +
                "6. Tekan piping bag sampai adonan keluar ke dalam minyak panas di wajan. Potong adonan sepanjang 1 inchi. Ulangi sampai wajan penuh.\n" +
                "7. Goreng sampai matang. Tiriskan\n" +
                "8. Pelengkap: Campur gula dan 1/2 sdt kayumanis dalam mangkuk. Taburkan ke atas churro.");


        namaMakanan.add("Hokkaido Cheese Tart");
        fotoMakanan.add("https://i.pinimg.com/736x/c7/e4/d3/c7e4d36edfe01dae541f4d49db5fce42.jpg");
        infoMakanan.add("Bahan Kulit atau Crust :\n" +
                "- 60 g salted butter (dingin)\n" +
                "- 20 g gula halus\n" +
                "- 100 g terigu protein rendah\n" +
                "- 1 kuning telur\n" +
                "- 1/4 sdt garam\n" +
                "- 1/4 sdt vanilla bubuk\n\n" +
                "Bahan Custard : \n" +
                "- 125 g cream cheese\n" +
                "- 20 g butter\n" +
                "- 20 ml susu cair\n" +
                "- 60 g plain yoghurt\n" +
                "- 2 sdm gula halus\n" +
                "- 1 sdm air lemon (boleh skip)\n" +
                "- 1 butir putih telur\n\n" +
                "Bahan Olesan :\n" +
                "- 1 kuning telur\n\n" +
                "Cara Memasak : \n"+
                "1. Campurkan butter dingin, terigu, dan gula halus hingga membentuk butiran. Kemudian masukkan kuning telur. Beri sedikit garam dan vanila. Aduk merata dengan spatula.\n" +

                "2. Bentuk bulat adonan crust yg sudah tercampur rata. Masukkan ke kulkas minimal 30 menit hingga set.\n" +

                "3. Masak bahan custard dengan api yg sangat kecil (kecuali putih telur). Aduk dengan merata menggunakan whisk. Jika seluruh bahan sudah mengental dan halus matikkan api. Kemudian campur dengan putih telur sambil diaduk dg whisk secara cepat. Masak lagi hingga mencapai kekentalan custard yg diinginkan.\n" +

                "4. Bungkus custard dg plastik kemudian dinginkan dalam kulkas hingga set. (Minimal sejam).\n" +

                "5. Ambil adonan crust, kemudia pipihkan dan bentuk dalam cetakan cheese tart. Tusuk2 dengan garpu. (Kerja cepat agar adonan tidak meleleh krn butter rentan meleleh)\n" +

                "6. Panggang pada suhu 180 C selama 20 menit (masing2 oven beda).\n" +

                "7. Angkat crust dan tunggu adem. Kemudian masukkan custard dingin ke dalam crust menggunakan piping bag.\n" +

                "8. Olesi atasnya dengan kuning telur\n" +

                "9. Panggang di rak oven paling atas utk mendapatkan efek karamelisasi. Panggang di suhu 230 C selama 15 menit (masing2 oven beda)\n" +

                "10. Hokkaido baked cheese tart siap dinikmati.");


        namaMakanan.add("Tahu Isi");
        fotoMakanan.add("https://asset-a.grid.id/crop/0x0:0x0/360x240/photo/2019/04/15/2416860291.jpg");
        infoMakanan.add("Bahan:\n" +
                "- 7 tahu kepong kuning\n" +
                "- 1 buah wortel\n" +
                "- 2 lembar kol\n" +
                "- Daun bawang\n" +
                "- Seledri (skip)\n" +
                "- 1 cabe rawit\n" +
                "- bumbu halus\n" +
                "- 2 bawang merah\n" +
                "- 2 bawang putih\n" +
                "- Garam\n" +
                "- Merica\n" +
                "- Penyedap rasa\n" +
                "- bahan adonan\n" +
                "- 5 sdm tepung terigu\n" +
                "- 2 sdm tepung beras\n" +
                "- ketumbar bubuk\n" +
                "- minyak goreng\n\n" +
                "Cara Memasak :\n" +
                "1. Siapkan tahu kepong bahan2 cuci bersih\n" +

                "2. Iris2 semua bahan masukan dlm mangkuk\n" +

                "3. Ulek bumbu pisahkan menjadi 2 bagian buat isian tahu sma adonan tepung\n" +

                "4. Siapkan tepung terigu,tepung beras masukan bumbu halus ditambah ketumbar bubuk ksh air sedikit2 smpai mnjdi adonan\n" +

                "5. Tumis bahan isian tahu smpai matang\n" +

                "6. Belah tahu kepong, isi dgn sayur an siap untuk digoreng\n" +

                "7. Panaskan minyak goreng,goreng dgn api sedang,angkat warna udh keemasan.sajikan");


        namaMakanan.add("Dorayaki");
        fotoMakanan.add("https://selerasa.com/wp-content/uploads/2016/11/images_dorayaki-original.jpg");
        infoMakanan.add("Bahan Adonan :\n" +
                "- 3 btr Telur\n" +
                "- 140 gr Gula Pasir\n" +
                "- 150 gr Tepung Terigu\n" +
                "- 1 sdt Baking Powder\n" +
                "- 2 sdm Madu\n" +
                "- 2 sdm Air\n\n" +
                "Bahan Isi :\n" +
                "- Nutella Cokelat (Secukupnya) \n\n" +
                "Cara Memasak :\n" +
                "1. Campur semua bahan, Aduk hingga tercampur rata. Lalu diamkan selama 1 jam..\n" +

                "2. Panaskan teflon, kalo sudah panas lalu kecilkan api nya.\n" +

                "3. Dadar adonan sedikit demi sedikit, hingga adonan abis.\n" +

                "4. Biarkan hingga matang (jangan terlalu lama) kurleb 3 menit sekali dadar\n" +

                "5. Angkat, biarkan dingin, lalu olesin dengan selai Nutella. kemudian tumpukan jadi satu.\n" +

                "6. Dorayaki Choco siap dihidangkan.");


        prosesRecyclerViewAdapter();

    }
}
