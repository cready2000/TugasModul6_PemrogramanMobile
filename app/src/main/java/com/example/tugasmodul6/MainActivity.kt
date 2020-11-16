package com.example.tugasmodul6
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createJajan()
        rv_list_main.layoutManager = LinearLayoutManager(this)
        rv_list_main.setHasFixedSize(true)
        rv_list_main.adapter = JajanAdapter(data, { onItem: JajanData ->
            onItemClicked(onItem) })
    }
    private fun onItemClicked(onItem: JajanData) {
        val showDetailActivityIntent = Intent(this, JajanDetail::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.imgJajan)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.nameJajan)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.descJajan)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.descJajan2)
        startActivity(showDetailActivityIntent)
    }
    private fun createJajan(): List<JajanData> {
        val rvList = ArrayList<JajanData>()
        rvList.add(
            JajanData(
                R.drawable.bu_rudi,
                "SAMBAL BU RUDI",
                "Salah satu oleh-oleh khas Surabaya yang paling banyak dicari oleh wisatawan lokal adalah sambalnya, terutama yang bermerek Sambal Bu Rudy. Sambal ini sudah melegenda banget sih. Bahkan kini kamu juga bisa membelinya lewat berbagai online shop besar. Namun sensasinya tentu berbeda kalau dibandingkan dengan datang, mencoba, dan memilih sambal-sambal itu sendiri di depotnya. Kamu bisa mencoba sambal petis, sambal teri, sambal bawang, sambal bajak (terasi), dan sambal ijo. \n\n"+
                        "Namanya sambal, tentu rasanya yang dominan adalah pedas. Tapi yang membuat Sambal Bu Rudy unik dibanding semua sambal lainnya adalah karena aroma dan gurih udang dalam di setiap sambalnya. Rasa khas ini yang membuat sambal ini disukai masyarakat. Saat ini Sambal Bu Rudy sudah mengembangkan bisnisnya sehingga kamu bisa membeli, bukan hanya sambal, tetapi juga produk makanan lainnya. \n",
                "Lokasi :\n"+
                        "Jl. Dharmahusada No.140, Surabaya \n\n"+
                        "Harga :\n"+
                        "Mulai dari Rp 20.000 per botol"
            )
        )
        rvList.add(
            JajanData(
                R.drawable.spikoe_resep_kuno,
                "SPIKOE RESEP KUNO",
                "Ejaan lawas yang dipakai di merek makanan ini bukan sekadar pajangan, lho! Spikoe Resep Kuno memproduksi kue spiku (kue lapis khas Eropa) berdasarkan resep peninggalan zaman Belanda. Kue ini sebenarnya tidak sepenuhnya mencontek resep Eropa, tapi disesuaikan dengan bahan yang ada di Indonesia kala itu. Karena itu, rasanya juga enak dan unik, lembut dan manis seperti bolu. \n\n"+
                        "Keistimewaan lain dari kue lapis khas Surabaya ini adalah semuanya dibuat dengan bahan-bahan berkualitas tinggi. Meski memakai resep tradisional, tapi semua bahan dan peralatan sudah modern. Dijamin aman dan halal! Kamu bisa memilih rasa atau isian di dalam kue. Ada yang original, memakai kismis, buah prem kering, dan juga varian speculaas. \n",
                "Lokasi :\n"+
                        "Jl. Rungkut Madya 41, Surabaya \n\n"+
                        "Harga :\n"+
                        "Mulai dari Rp 80.000"
            )
        )
        rvList.add(
            JajanData(
                R.drawable.suoklat,
                "SUOKLAT SUROBOYO",
                "Orang Jawa kerap menyebut cokelat dengan soklat. Nah, Souklat adalah permainan kata yang menggabungkan dua kata ‘Suroboyo’ dan ‘Coklat’. Awalnya Souklat adalah usaha kecil untuk memasarkan produk cokelat dengan sentuhan lingkungan. Kemasannya bukan terbuat dari kertas, tetapi dari kulit jagung, serbuk bambu, dan eceng gondok. Produk ini laris manis di pasaran, bahkan sampai menembus pasar luar daerah. \n\n"+
                        "Produk Souklat juga enak banget, kok! Produk awal Souklat adalah cokelat yang berisi kurma atau kacang mete. Kemudian Souklat menambahkan banyak produk baru seperti Dark Kurma Mete, Dark Cocholate Cookies Mete, Cokelat Jahe, dll. Kamu bisa mencoba semuanya di Kafe Souklat 3.0. Ada banyak pilihan cokelat lezat yang bisa kamu bawa pulang sebagai oleh-oleh untuk yang di rumah. \n",
                "Lokasi :\n "+
                        "Jl. Genteng Besar No.83D, Genteng, Kec. Genteng, Surabaya \n\n"+
                        "Harga :\n"+
                        "Mulai dari Rp 7.000"
            )
        )
        rvList.add(
            JajanData(
                R.drawable.almond,
                "ALMOND CRISPY CHEESE",
                "Gurih, renyah, dan citarasa kejunya sangat terasa. Buat kamu yang suka ngemil makanan ringan, Almond Crispy Cheese bisa jadi pilihan tepat. Cemilan ini hits banget di Surabaya dan telah menjadi salah satu oleh-oleh wajib. Biskuitnya sendiri sangat tipis dan crunchy banget, terbuat dari telur, gula, tepung, dan susu bubuk. \n\n"+
                        "Yang akan membedakan adalah warna serta rasa biskuitnya. Awalnya ada rasa original (warna kuning), green tea (hijau), dan cokelat (coklat). Kemudian variannya berkembang dengan ditambah strawberry, blueberry, dan durian. Semuanya ditaburi topping gurih kacang almond dan parutan keju, sesuai namanya. Wadahnya terlihat berkelas, sehingga buah tangan ini akan mampu membuat penerimanya terkesan. \n",
                "Lokasi :\n "+
                        "Pasar Atum, Jl. Bunguran No.21, Bongkaran, Kecamatan Pabean Cantian, Surabaya \n\n"+
                        "Harga :\n"+
                        "Mulai dari Rp 45.000"
            )
        )
        rvList.add(
            JajanData(
                R.drawable.kerupuk_ikan,
                "KERUPUK IKAN KENJERAN",
                "Surabaya dan area sekitarnya memiliki kekayaan hasil laut yang melimpah. Kamu pun bisa memilih banyak sekali olahan hasil laut di sini. Salah satu yang paling terkenal di Surabaya adalah kerupuk ikan Kenjeran. Warga sekitar Pantai Kenjeran memiliki keahlian mengolah hasil laut menjadi kerupuk yang gurih dan nikmat. Bukan cuma ikan, kamu juga bisa menemukan kerupuk cumi, udang, kerang, dan bahkan kerupuk rumput laut. \n\n"+
                        "Di Kenjeran, kamu bisa membeli kerupuk mentah atau yang sudah digoreng dan siap masak. Biasanya produk kerupuk ini sudah dikemas dengan baik dengan berat tertentu. Di beberapa tempat, kamu bisa menemui penjual kerupuk mentah curah alias belum dikemas. Rasa kerupuk dari Kenjeran ini gurih dan lezat. Warna yang disajikan juga beragam. \n",
                "Lokasi :\n"+
                        "Jl. Raya Pantai Lama, Kenjeran, Bulak, Surabaya \n\n"+
                        "Harga :\n"+
                        "Bervariasi"
            )
        )
        rvList.add(
            JajanData(
                R.drawable.guna_guna,
                "GUNAGUNA SNACK",
                "Kalau kamu lagi diet, sebaiknya jangan dekat-dekat dengan GunaGuna snack karena di sini banyak banget makanan enak. Ada segudang pilihan camilan yang bakal memanjakan lidahmu. Mau yang manis atau yang gurih, semuanya juga ada di sini. \n\n"+
                        "Semua pilihan produk di GunaGuna terinspirasi oleh resep kuno yang sudah ada sejak zaman kolonial. Bahkan nama yang dipakai pun masih sama seperti zaman Belanda. Di sini kamu bisa beli Macaroni Schotel berbagai rasa dan ukuran, Blackpepper Chicken Puff, Almond Crispy Cookies, Schuimpjes, Basreng, dan Samosa. Semuanya dijamin higienis dan lezat. \n",
                "Lokasi :\n"+
                        "Perum Darmo Sentosa Raya, Jl Jajartunggal Utara VII J-19 kav 308, Jajar Tunggal, Kecamatan Wiyung, Surabaya \n\n"+
                        "Harga :\n"+
                        "Mulai dari Rp 7.000"
            )
        )
        return rvList
    }
}
