package com.example.lab3

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TipAdapter(private val tips: List<Tip>) :
    RecyclerView.Adapter<TipAdapter.TipViewHolder>() {

    class TipViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textDay: TextView = itemView.findViewById(R.id.textDay)
        val textTitle: TextView = itemView.findViewById(R.id.textTitle)
        val textDescription: TextView = itemView.findViewById(R.id.textDescription)
        val imageTip: ImageView = itemView.findViewById(R.id.imageTip)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_tip, parent, false)
        return TipViewHolder(view)
    }

    override fun onBindViewHolder(holder: TipViewHolder, position: Int) {
        val tip = tips[position]

        holder.textDay.text = holder.itemView.context.getString(R.string.day, tip.day)
        holder.textTitle.setText(tip.title)
        holder.textDescription.setText(tip.description)
        holder.imageTip.setImageResource(tip.image)

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra("title", tip.title)
            intent.putExtra("text", tip.full)
            intent.putExtra("image", tip.image)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return tips.size
    }
}
