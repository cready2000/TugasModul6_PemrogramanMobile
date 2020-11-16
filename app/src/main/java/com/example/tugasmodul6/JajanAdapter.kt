package com.example.tugasmodul6
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_jajan.view.*
class JajanAdapter (val itemJajan: List<JajanData>, val clickListener: (JajanData) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_jajan, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(itemJajan[position], clickListener)
    }

    override fun getItemCount() = itemJajan.size
    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(data: JajanData, clickListener: (JajanData) -> Unit) {
            itemView.image_jajan.setImageResource(data.imgJajan)
            itemView.tv_list_jajan.text = data.nameJajan
            itemView.setOnClickListener { clickListener(data) }
        }
    }
}