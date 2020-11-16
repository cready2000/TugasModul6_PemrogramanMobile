package com.example.tugasmodul6
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail_jajan.*
class JajanDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_jajan)
        var intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var imgJajan = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
            var nameJajan =
                intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var descJajan =
                intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            var descJajan2 =
                intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SUBJECT)
            image_detail.setImageResource(imgJajan)
            tv_name_detail.text = nameJajan
            tv_desc_detail.text = descJajan
            tv_desc2_detail.text = descJajan2
        }
    }
}