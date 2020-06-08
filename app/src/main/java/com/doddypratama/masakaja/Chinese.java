package com.doddypratama.masakaja;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Chinese extends AppCompatActivity {

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese);

        getDataFromInternet();

    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(fotoMakanan, namaMakanan, infoMakanan, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void getDataFromInternet(){

        namaMakanan.add("Bakcang");
        fotoMakanan.add("https://cdn1-production-images-kly.akamaized.net/yPNklyVg-eL5wefHn-A0GFP2-to=/1280x720/smart/filters:quality(75):strip_icc():format(webp)/kly-media-production/medias/1495067/original/082497700_1486023784-bacang-fsui_wodpress.jpg");
        infoMakanan.add("Bahan nasi :\n" +
                "- 6 cup beras, cuci bersih tiga kali.\n" +
                "- 3 siung bawang putih halus\n" +
                "- 2 sendok teh garam\n" +
                "- 4 sendok makan minyak goreng\n" +
                "- 1 sendok makan kecap asin\n" +
                "- 800 ml air\n" +
                "\n" +
                "Bahan isian daging sapi :\n" +
                "- 750 gram daging sapi cincang\n" +
                "- 2 buah bawang bombay, iris\n" +
                "- 2 sendok makan kecap asin\n" +
                "- 6 sendok makan kecap manis, atau sesuai selera\n" +
                "- 2 sendok teh minyak wijen\n" +
                "- 1 sendok makan garam\n" +
                "- 4 sendok makan gula\n" +
                "- Gula merah secukupnya\n" +
                "- 1 sendok teh merica bubuk\n" +
                "- 5 butir bawang merah halus\n" +
                "- 4 siung bawang putih halus\n" +
                "- 5 sendok makan minyak goreng untuk menumis\n" +
                "- 1 blok kaldu rasa sapi\n" +
                "- 1 sendok makan tepung maizena larutkan dengan 2 sendok makan air, sisihkan\n" +
                "\n" +
                "Cara membuatnya:\n" +
                "1. Campur beras bersih dengan bawang putih, garam, minyak goreng, kecap asin, dan air. Setelah diaduk sempurna, tanak nasi hingga matang, sisihkan.\n" +

                "2. Panaskan wajan yang sudah diisi minyak goreng, masukkan bawang bombay dan aduk hingga layu. Masukkan semua bumbu halus seperti merica, bawang merah dan bawang putih, serta blok kaldu rasa sapi. Masukkan pula garam, gula, dan gula merah, tambah air bersih agar bumbu tidak kering.\n" +

                "3. Masukkan daging sapi cincang dalam wajan, aduk sambil rata. Tambahkan kecap manis sesuai selera, kecap asin, minyak wijen dan penyedap rasa. Kentalkan isian daging dengan tepung maizena yang sudah dicairkan, aduk hingga rata.\n" +
                "Isian bacang yang terdiri dari dua bahan sudah selesai dibuat. Saatnya bacang dibungkus dengan daun bambu, sehingga memiliki bentuk segitiga yang khas. Untuk itu, siapkan tali dan daun bambu yang sudah bersih dan direbus agar lentur.\n" +

                "Untuk membungkusnya sendiri tidak terlalu sulit, bentuk daun bambu seperti bentuk kerucut dengan dua ujung menghadap ke atas sama panjang. Isi bagian bawah kerucut dengan nasi, lalu tambah dengan daging, dan tutup kembali dengan nasi.\n" +

                "Gunakan bagian daun yang tersisa untuk menutup bagian atas nasi, rapikan hingga membentuk prisma segitiga. Jangan lupa ikat dengan tali secukupnya di keempat sisi Bakcang, agar kuat. Kelompokkan 6 buah Bacang dalam satu ikatan, dan rebus selama satu jam dengan api sedang, angkat.");


        namaMakanan.add("Fuyung Hai");
        fotoMakanan.add("https://www.masakapahariini.com/wp-content/uploads/2019/03/fuyunghai-asam-manis-780x440.jpg");
        infoMakanan.add("Bahan :\n" +
                "- 6 btr Telur ayam kocok lepas\n" +
                "- 100 gr Ayam cincang\n" +
                "- 100 gr Kol, iris alus\n" +
                "- 100 gr Wortel, diserut kasar (potong korek api)\n" +
                "- 100 gr Buncis, iris miring\n" +
                "- 2 batang Daun bawang, iris halus\n" +
                "- 2 siung bawang putih, cincang halus\n" +
                "- 3 sdm terigu\n" +
                "- secukupnya Garam, gula, merica\n\n" +
                "Saus : \n" +
                "- 7 sdm saus tomat\n" +
                "- 5 sdm saus sambal\n" +
                "- 1-2 siung bawang cincang halus\n" +
                "- 1 sdm saus tiram\n" +
                "- iris Bawang Bombay,\n" +
                "- Kacang polong\n" +
                "- 1 sdm Gula\n" +
                "- secukupnya Garam\n" +
                "- 300 ml Air\n" +
                "- 1 sdm maizena\n\n" +
                "Cara Memasak :\n" +
                "1. Tumis bawang putih, ayam sampai berubah warna, masukan semua sayur dan masak sebentar lalu angkat masukan ke adonan telur tambah terigu, garam, gula, merica\n" +

                "2. Goreng adonan telur hingga kedua sisi matang.\n" +

                "3. Saus, tumis bawang putih dan bawang bombai hingga harum, masukan saus tomat, saus sambal, saus tiram, garam, gula, merica, air dan larutan maizena hingga mengental lalu masukan kacang polong. Koreksi rasa, angkat.\n" +

                "4. Siram saus diatas telur.\n" +

                "5. Tata yg rapih siap disajikan");

        namaMakanan.add("Kwetiau");
        fotoMakanan.add("https://cdn2.tstatic.net/belitung/foto/bank/images2/kwetiau-goreng-enak.jpg");
        infoMakanan.add("Bahan :\n" +
                "- 1 bungkus mie kwetiaw kering\n" +
                "- 1 batang wortel\n" +
                "- 5 butir bakso iris tipis\n" +
                "- 4 ekor udang galah iris kecil2\n" +
                "- 2 siung baput\n" +
                "- 1/2 buah bawang bombai (bisa ganti bamer 2 siung)\n" +
                "- 1 butir kemiri\n" +
                "- 1/2 sdt merica bubuk\n" +
                "- 1 sdm saori saus tiram\n" +
                "- 1 sdm kecap manis\n" +
                "- 1 sdm kecap asin\n" +
                "- secukupnya Garam\n\n" +
                "Cara Memasak :\n" +
                "1. Rebus mie kering, kasih 1sdm minyak goreng ke air rebusan biar mi-nya nggak lengket\n" +

                "2. Haluskan bumbu baput, bamer (kalo pake), kemiri, garam, campur merica.\n" +

                "3. Tumis bumbu, masukkan bawang bombai yang udah diiris halus, tunggu harum.\n" +

                "4. Masukkan udang, bakso, dan wortel ke dalam tumisan bumbu. Tambahkan air dua sendok sayur, tunggu sampai udang berubah warna.\n" +

                "5. Tambahkan saus tiram, kecap manis dan asin, aduk.\n" +

                "6. Terakhir masukkan mi kwetiaw, aduk rata, tunggu mi empuk dan bumbu meresap. Jangan lupa koreksi rasa.\n" +

                "7. Sajikan penuh cinta dengan taburan daun sledri dan bawang goreng");


        namaMakanan.add("Capcay");
        fotoMakanan.add("https://cdns.klimg.com/merdeka.com/i/w/news/2017/11/02/904853/540x270/4-resep-cara-membuat-capcay-sederhana-yang-enak.jpg");
        infoMakanan.add("Bahan :\n" +
                "- Kol\n" +
                "- Wortel\n" +
                "- Sawi\n" +
                "- Telur\n" +
                "- Sosis\n" +
                "- Bawang putih\n" +
                "- Gula, garam, merica, kaldu bubuk, saos tiram, minyak wijen\n" +
                "- Larutan kanji\n\n" +
                "Cara Memasak :\n" +
                "1. Tumis bawang putih sampai wangi, orak arik telur dan masukan sosis serta wortel tumis sebentar\n" +

                "2. Tambahkan air, masukan Gula, garam, merica, kaldu bubuk, saos tiram, tutup wajan biarkan sampai mendidih\n" +

                "3. Masukan sawi, kol, masak sebentar, koreksi rasa, masukan minyak wijen dan larutan kanji secukupnya sampai kekentalan yang diinginkan, siap dihidangkan");


        namaMakanan.add("Sanbeiji");
        fotoMakanan.add("https://www.gotravelly.com/blog/wp-content/uploads/2018/03/sanbeiji.jpg");
        infoMakanan.add("Bahan :\n" +
                "- 1 ekor ayam\n" +
                "- 1 jeruk nipis\n" +
                "- Secukupnya garam\n" +
                "- 5 siung bawang putih\n" +
                "- 1 buah bawang bombay\n" +
                "- 3 cm jahe\n" +
                "- 1 buh cabe merah besar\n" +
                "- 2 sdm minyak wijen\n" +
                "- 2 sdm kecap asin\n" +
                "- 2 sdm angciu\n" +
                "- 1 sdm gula\n" +
                "- 1/2 sdt garam\n" +
                "- 1/2 sdt kaldu bubuk\n" +
                "- 2 batang daun bawang\n" +
                "- Secukupnya \n\n" +
                "Cara Memasak :\n" +
                "1. Lumuri ayam dengan perasan jeruk nipis dan garam. Diamkan sebentar, cuci bersih dengan air mengalir.\n" +

                "2. Cincang bawang putih, bawang bombay, iris jahe dan cabe buang biji.\n" +

                "3. Panaskan minyak wijen, tumis bawang putih dan jahe sampai harum.\n" +

                "4. Masukkan ayam aduk, masak sampai berubah warna dan tambah air sedikit.\n" +

                "5. Tambahkan bumbu-bumbu.\n" +

                "6. Bila air sudah agak menyusut masukkan cabe dan bawang bombay.\n" +

                "7. Aduk rata, tes rasa. Matikan kompor.\n" +

                "8. Taiwanese Chicken siap disajikan.");


        namaMakanan.add("Tapo Mapo");
        fotoMakanan.add("https://www.makanajib.com/wp-content/uploads/2017/05/Resep-Cara-Membuat-Mapo-Tahu-Sederhana-Enak.jpg");
        infoMakanan.add("Bahan :\n" +
                "- 4 buah tahu, potong dadu\n" +
                "- 4 siung bawang putih, cincang kasar\n" +
                "- 2 sdm minyak wijen\n" +
                "- 2 sdm saus tiram\n" +
                "- 2 sdm royco ayam\n" +
                "- 2 sdm saus sambal\n" +
                "- 1 sdm kecap inggris (boleh skip)\n" +
                "- 2 sdm kecap manis\n" +
                "- 1 btr telur\n" +
                "- 1/2 sdt gula pasir\n" +
                "- 1 gelas air\n" +
                "- secukupnya Sawi putih\n" +
                "- secukupnya Bawang goreng\n" +
                "- Biji wijen\n\n" +
                "Cara Memasak :\n" +
                "1. Siapkan bahan. Maaf maizena nya ga dipake \n" +

                "2. Potong dan cincang bawang dan tahu\n" +

                "3. Siapkan wajan dan minyak. Tumis bawang putih hingga wangi\n" +

                "4. Masukkan telur lalu diorak arik\n" +

                "5. Masukkan tahu lalu tumis sebentar agar kulitnya lebih keras jadi kalo diaduk2 tidak mudah hancur\n" +

                "6. Tambahkan 1 gelas air dan bumbu penyedap lainnya\n" +

                "7. Masak hingga agak mengental. Koreksi rasa. Jika sudah pas rasanya masukkan sawi putih. Aduk sebentar. Sajikan");
        prosesRecyclerViewAdapter();

    }
}
