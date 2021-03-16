package com.hackathon.garame.data.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hackathon.garame.databinding.ListInvoiceBinding

class InvoiceAdapter : RecyclerView.Adapter<InvoiceAdapter.InvoiceViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InvoiceViewHolder {
        val binding = ListInvoiceBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return InvoiceViewHolder(binding)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: InvoiceViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    inner class InvoiceViewHolder(private val binding: ListInvoiceBinding) : RecyclerView.ViewHolder(binding.root){

    }
}