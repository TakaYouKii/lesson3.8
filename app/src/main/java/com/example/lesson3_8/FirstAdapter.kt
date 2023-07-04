package com.example.lesson3_8

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson3_8.databinding.CharacterItemsBinding
import kotlin.reflect.KFunction1

class FirstAdapter(val CharacterList: ArrayList<Character>, val onClick: (character: Character)->Unit): RecyclerView.Adapter<FirstAdapter.ViewHolder>(){
    inner class ViewHolder(private val binding: CharacterItemsBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(){
            val item = CharacterList[adapterPosition]
            binding.apply {
                tvName.text = item.name
                tvIsAlive.text = item.isAlive
                tvId.text = (adapterPosition + 1).toString()
                item.image?.let { imgItem.loadImage(it) }

                itemView.setOnClickListener{
                    onClick.invoke(item)
                }
            }


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(CharacterItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return CharacterList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }
}